package calculator;

import model.calculator.Operation;
import model.calculator.Operator;
import model.stack.LinkedList;
import model.stack.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OperatorTest
{
  private Operator operator;
  private Operator operator2;

  @BeforeEach
  void setUp()
  {
    operator = new Operator(null);
    operator2 = new Operator(Operation.minus);
  }
  @Test
  void getOperationZero(){
    assertNull(operator.getOperation());
  }
  @Test
  void getOperationOne(){
    assertEquals(Operation.minus,operator2.getOperation());
  }
}
