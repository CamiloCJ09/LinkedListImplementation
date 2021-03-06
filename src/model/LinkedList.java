package model;

import java.util.ArrayList;

public class LinkedList<E extends Comparable<E>> {

    private Node<E> head;
    private Node<E> tail;
    private int size;


    public LinkedList() {
        head = null;
        size = 0;
        tail = null;
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public boolean isEmpty() {
        return (head == null)? true: false;
    }

    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(E e) {

        if (head == null) {
            head = new Node<E>(e);
            tail = head;

        }else{
            Boolean added = false;
            Node<E> node = new Node<>(e);
            for(int i = 0; i < size && !added; i++){
                if(get(i).compareTo(e) >= 0){
                    if(getNode(i) == head){
                        head.setPrevious(node);
                        node.setNext(head);
                        head = node;
                    }else{
                        node.setNext(getNode(i));
                        node.setPrevious(getNode(i).getPrevious());
                        getNode(i).getPrevious().setNext(node);
                        getNode(i).setPrevious(node);
                    }
                    added = true;
                }
            }
            if(added == false){
                tail.setNext(node);
                node.setPrevious(tail);
                tail = node;
            }
        }

        size += 1;
    }

    public int indexOf(E e){
        return indexOf(e, head, 0);
    }

    private int indexOf(E e, Node<E> temp, int contador){
        if(e.equals(temp.getItem())){
            return contador;

        }else{
            return indexOf(e, temp.getNext(), contador + 1);

        }
    }

    public E get(int index){

        return get(index, head);

    }

    private E get(int index, Node<E> temp){

        if(index == 0){
            return temp.getItem();

        }else{
            return get(index - 1, temp.getNext());

        }

    }

    public Node<E> getNode(int index){

        return getNode(index, head);

    }

    private Node<E> getNode(int index, Node<E> temp){

        if(index == 0){
            return temp;

        }else{
            return getNode(index - 1, temp.getNext());

        }

    }

    public void remove(int index){
        if(index == 0){
            head = head.getNext();

        }else{
            getNode(index).getPrevious().setNext(getNode(index).getNext());
            getNode(index).getNext().setPrevious(getNode(index).getPrevious());
        }

        size -= 1;
    }







}
