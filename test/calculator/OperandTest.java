package calculator;

import model.calculator.CalculatorVisitor;
import model.calculator.Operand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OperandTest
{
  private Operand operand;

  @BeforeEach
  void setUp()
  {
    operand = new Operand(1);
  }
  @Test
  void getOperationZero(){
    assertEquals(1,operand.getValue());
  }

}
