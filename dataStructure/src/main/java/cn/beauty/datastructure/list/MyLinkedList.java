package cn.beauty.datastructure.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

/**
 *                            Array                                             LinkList
 *     Size            Defined When Declaration                No need to specify, grow and shrink during execution
 * Order of element       Stored consecutively                           Stored randomly
 * Access element            direct access                          Traverse start from the first node
 * Insertion and Deletion     Slow,as shifting is required, o(n)               fast and efficent o(1)
 * Search                       fast, o(1)                                       Slow, o(n)
 * Memory Required                  less                                           more
 * Momory Utilization               Ineffective                                  Efficent
 */

public class MyLinkedList<E> implements List<E>{
    private int mSize;
    private int mModCount;
    private transient Node<E> mLast;
    private transient Node<E> mFirst;

    private class Node<E> {
        Node<E> mPrevious;
        E mData;
        Node<E> mNext;

        private Node(Node<E> previous, E element, Node<E> next) {
            this.mPrevious = previous;
            this.mData = element;
            this.mNext = next;
        }
    }

    @Override
    public int size() {
        return mSize;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {


        } else {


        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public E set(int i, E e) {
        return null;
    }

    @Override
    public void add(int i, E e) {

    }

    @Override
    public E remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int i) {
        return null;
    }

    @Override
    public List<E> subList(int i, int i1) {
        return null;
    }

    void linkLast(E e) {
        final Node<E> last = mLast;
        final Node<E> newNode = new Node<>(last, e, null);
        mLast = newNode;

        // there are two situations, the list is empty or not
        if (last == null) {
            mFirst = newNode;
        } else {
            mLast.mNext = newNode;
        }
        mSize++;
        mModCount++;
    }

}
