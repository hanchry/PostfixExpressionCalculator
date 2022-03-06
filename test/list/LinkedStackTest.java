package list;

import model.stack.LinkedStack;
import model.stack.Node;
import model.stack.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedStackTest
{
  private Stack<String> linkedStack;

  @BeforeEach
  void setUp()
  {
    linkedStack = new LinkedStack<>();
  }
  @Test
  void isEmptyZero(){
    assertTrue(linkedStack.isEmpty());
  }
  @Test
  void isEmptyOne(){
    linkedStack.push("a");
    assertFalse(linkedStack.isEmpty());
  }
  @Test
  void isEmptyMany(){
    linkedStack.push("a");
    linkedStack.push("b");
    linkedStack.push("c");
    assertFalse(linkedStack.isEmpty());
  }
  @Test
  void pushZero(){
    linkedStack.push(null);
    assertNull(linkedStack.pop());
  }
  @Test
  void pushOne(){
    linkedStack.push("a");
    assertFalse(linkedStack.isEmpty());
    assertEquals("a",linkedStack.pop());
  }
  @Test
  void pushMany(){
    linkedStack.push("a");
    linkedStack.push("b");
    linkedStack.push("c");
    assertFalse(linkedStack.isEmpty());
    assertEquals("c",linkedStack.pop());
    assertEquals("b",linkedStack.pop());
    assertEquals("a",linkedStack.pop());
  }
  @Test
  void popZero(){
    linkedStack.push(null);
    assertNull(linkedStack.pop());
  }
  @Test
  void popOne(){
    linkedStack.push("a");
    assertFalse(linkedStack.isEmpty());
    assertEquals("a",linkedStack.pop());
  }
  @Test
  void popMany(){
    linkedStack.push("a");
    linkedStack.push("b");
    linkedStack.push("c");
    assertFalse(linkedStack.isEmpty());
    assertEquals("c",linkedStack.pop());
    assertEquals("b",linkedStack.pop());
    assertEquals("a",linkedStack.pop());
  }
  @Test
  void popException(){
    assertThrows(EmptyStackException.class,() -> linkedStack.pop());
  }
}
