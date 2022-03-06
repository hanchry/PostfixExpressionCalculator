package list;

import model.stack.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class NodeTest
{
  private Node<String> node;

  @BeforeEach
  void setUp()
  {
    node = new Node<>();
  }

  @Test
  void setDataZero(){
    node.setData(null);
    assertNull(node.getData());
  }
  @Test
  void setDataOne(){
    node.setData("a");
    assertEquals("a",node.getData());
  }
  @Test
  void getDataZero(){
    node.setData(null);
    assertNull(node.getData());
  }
  @Test
  void getDataOne(){
    node.setData("a");
    assertEquals("a",node.getData());
  }
  @Test
  void setNextZero(){
    node.setNext(null);
    assertNull(node.getNext());
  }
  @Test
  void setNextOne(){
    node.setData("a");
    node.setNext(node);
    assertEquals("a",node.getNext().getData());
  }
  @Test
  void getNextZero(){
    node.setNext(null);
    assertNull(node.getNext());
  }
  @Test
  void getNextOne(){
    node.setData("a");
    node.setNext(node);
    assertEquals("a",node.getNext().getData());
  }

}
