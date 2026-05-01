package LAB_6.src;

import LAB_5.src.Sweet;
import java.util.*;

/**
 * Custom implementation of a Set for Sweet objects using a Singly Linked List.
 * This class demonstrates generic collection implementation and linked structures.
 *
 * @param <T> Type of elements in the set, must extend Sweet class.
 */
public class SweetSet<T extends Sweet> implements Set<T> {

    /**
     * Internal node structure for the singly linked list.
     */
    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private int size = 0;

    // --- Constructors (Requirement: minimum 3) ---

    /**
     * Constructor 1: Creates an empty SweetSet.
     */
    public SweetSet() {
        this.head = null;
    }

    /**
     * Constructor 2: Creates a set containing one initial element.
     * @param initialElement The first element to add.
     */
    public SweetSet(T initialElement) {
        add(initialElement);
    }

    /**
     * Constructor 3: Creates a set from an existing collection.
     * @param collection Standard Java collection of elements.
     */
    public SweetSet(Collection<? extends T> collection) {
        addAll(collection);
    }

    // --- Core Set Methods Implementation ---

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> current = head;
        while (current != null) {
            if (Objects.equals(current.data, o)) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean add(T t) {
        if (contains(t)) return false; // Set uniqueness requirement

        Node<T> newNode = new Node<>(t);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (head == null) return false;

        if (Objects.equals(head.data, o)) {
            head = head.next;
            size--;
            return true;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (Objects.equals(current.next.data, o)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    // --- Standard Boilerplate Methods (Required for Set interface) ---

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        for (T element : this) array[i++] = element;
        return array;
    }

    @Override public <E> E[] toArray(E[] a) { return null; } // Optional for lab
    @Override public boolean containsAll(Collection<?> c) {
        for (Object item : c) if (!contains(item)) return false;
        return true;
    }
    @Override public boolean addAll(Collection<? extends T> c) {
        boolean modified = false;
        for (T item : c) if (add(item)) modified = true;
        return modified;
    }
    @Override public boolean retainAll(Collection<?> c) { return false; }
    @Override public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object item : c) if (remove(item)) modified = true;
        return modified;
    }
}
