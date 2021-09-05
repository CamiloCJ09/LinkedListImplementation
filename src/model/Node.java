package model;

public class Node<E> {


    private E item;
    private Node<E> next;
    private Node<E> previous;

    public Node(E element) {
        this.item = element;
        this.next = null;
        this.previous = null;

    }


    public void setItem(E item) {
        this.item = item;
    }

    public E getItem() {
        return item;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }
}
