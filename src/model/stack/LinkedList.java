package model.stack;

import java.util.EmptyStackException;

public class LinkedList<T> implements List<T>
{
  private int size;
  private Node<T> head;

  @Override public boolean isEmpty()
  {
    return size < 1;
  }

  @Override public int size()
  {
    return size;
  }

  @Override public void addToFront(T data)
  {
    Node<T> newNode = new Node<>();
    newNode.setData(data);
    newNode.setNext(head);
    head = newNode;
    size++;
  }

  @Override public T removeFirst() throws EmptyStackException
  {
    try
    {
      T result = head.getData();
      head = head.getNext();
      size--;
      return result;
    }
    catch (Exception e){
      throw new EmptyStackException();
    }
  }
}
