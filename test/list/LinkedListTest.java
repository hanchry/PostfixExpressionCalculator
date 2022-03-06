package list;

import model.stack.LinkedList;
import model.stack.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest
{
  private List<String> list;

  @BeforeEach
  void setUp()
  {
    list = new LinkedList<>();

  }

  @Test
  void addToFrontZero(){
    list.addToFront(null);
    assertEquals(1,list.size());
    assertNull(list.removeFirst());
  }
  @Test
  void addToFrontOne(){
    list.addToFront("a");
    assertEquals(1,list.size());
    assertEquals("a",list.removeFirst());
  }
  @Test
  void addToFrontMany(){
    list.addToFront("a");
    list.addToFront("b");
    list.addToFront("c");
    assertEquals(3,list.size());
    assertEquals("c",list.removeFirst());
    assertEquals("b",list.removeFirst());
    assertEquals("a",list.removeFirst());
  }
//////////////////////////////////////////////////////////////////////////////////////
  @Test
  void isEmptyZero(){
    assertTrue(list.isEmpty());
  }
  @Test
  void isEmptyOne(){
    list.addToFront("a");
    assertFalse(list.isEmpty());
  }
  @Test
  void isEmptyMany(){
    list.addToFront("a");
    list.addToFront("b");
    list.addToFront("c");
    assertFalse(list.isEmpty());
  }
/////////////////////////////////////////////////////////////////
  @Test
  void sizeZero(){
    assertEquals(0,list.size());
  }
  @Test
  void sizeOne(){
    list.addToFront("a");
    assertEquals(1,list.size());

  }
  @Test
  void sizeMany(){
    list.addToFront("a");
    list.addToFront("b");
    list.addToFront("c");
    assertEquals(3,list.size());
  }
////////////////////////////////////////////////////////////////////////////////
  @Test
  void removeFirstZero(){
    list.addToFront(null);
    assertNull(list.removeFirst());
  }
  @Test
  void removeFirstOne(){
    list.addToFront("a");
    assertEquals("a",list.removeFirst());
  }
  @Test
  void removeFirstMany(){
    list.addToFront("a");
    list.addToFront("b");
    list.addToFront("c");
    assertEquals("c",list.removeFirst());
    assertEquals("b",list.removeFirst());
    assertEquals("a",list.removeFirst());
  }
  @Test
  void removeFirstException(){
    assertThrows(EmptyStackException.class,() -> list.removeFirst());
  }



}
