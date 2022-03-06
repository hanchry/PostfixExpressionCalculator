package model.stack;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T>
{
  private LinkedList<T> list;

  public LinkedStack()
  {
    this.list = new LinkedList<>();
  }

  @Override public boolean isEmpty()
  {
    return list.isEmpty();
  }

  @Override public void push(T element)
  {
    list.addToFront(element);
  }

  @Override public T pop()
  {
    try
    {
      return list.removeFirst();
    }
    catch (Exception e){
    throw new EmptyStackException();
  }
  }
}
