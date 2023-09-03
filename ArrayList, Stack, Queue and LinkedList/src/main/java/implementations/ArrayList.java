package implementations;

import interfaces.List;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> implements List<E> {
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 4;
    private int size;

    public ArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(E element) {
        if (this.size == this.elements.length) {
            this.elements = grow();
        }

        this.elements[this.size++] = element;

        return true;
    }

    @Override
    public boolean add(int index, E element) {
        ensureIndex(index);

        if (this.size == this.elements.length) {
            this.elements = grow();
        }

        E lastElement = getElement(this.size - 1);

        for (int i = this.size - 1; i > index; i--) {
            this.elements[i] =  this.elements[i - 1];
        }

        this.elements[this.size] = lastElement;
        this.elements[index] = element;
        this.size++;

        return true;
    }

    @Override
    public E get(int index) {
        ensureIndex(index);
        return getElement(index);
    }

    @Override
    public E set(int index, E element) {
        ensureIndex(index);

        this.elements[index] = element;
        return element;
    }

    @Override
    public E remove(int index) {
        ensureIndex(index);
        E elementForRemoving = getElement(index);

        this.elements[index] = null;
        this.size--;

        shiftTo(index);

        ensureCapacity();

        return elementForRemoving;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int indexOf(E element) {

        for (int i = 0; i < this.size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int index;

            @Override
            public boolean hasNext() {
                return index < size();
            }

            @Override
            public E next() {
                return get(index++);
            }
        };
    }

    private Object[] grow() {
        return Arrays.copyOf(this.elements, this.elements.length * 2);
    }

    private void shiftTo(int index) {
        for (int i = index; i < this.size; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        this.elements[this.size] = null;
    }

    private Object[] shrink() {
        return Arrays.copyOf(this.elements, this.elements.length / 2);
    }

    private void ensureCapacity() {
        if (this.size < this.elements.length / 3) {
            this.elements = shrink();
        }
    }

    @SuppressWarnings("checked")
    private E getElement(int index) {
        return (E) this.elements[index];
    }

    private void ensureIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(String.format("Your index is out of bounds. Please, enter an index between 0 and %d", this.size - 1));
        }
    }
}
