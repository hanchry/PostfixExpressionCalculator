package model.calculator;

import model.stack.LinkedStack;

import java.lang.reflect.MalformedParametersException;

public class CalculatorVisitor implements Visitor,Calculator
{
  private LinkedStack<Token> tokenStack;

  public CalculatorVisitor()
  {
    this.tokenStack = new LinkedStack<>();
  }

  private void pushOperand(Operand operand){
    tokenStack.push(operand);
  }
  private void performOperation(Operator operator){
    int result = 0;
    switch(operator.getOperation()){
      case plus:
        result = ((Operand) tokenStack.pop()).getValue() + ((Operand) tokenStack.pop()).getValue();
        break;
      case minus:
        result = ((Operand) tokenStack.pop()).getValue() - ((Operand) tokenStack.pop()).getValue();
        break;
      case multiply:
        result = ((Operand) tokenStack.pop()).getValue() * ((Operand) tokenStack.pop()).getValue();
        break;
      case divide:
        result = ((Operand) tokenStack.pop()).getValue() / ((Operand) tokenStack.pop()).getValue();
        break;
    }
    tokenStack.push(new Operand(result));
  }
  @Override public int getResult() throws MalformedParametersException
  {
    return ((Operand) tokenStack.pop()).getValue();
  }

  @Override public void visit(Operand operand)
  {
    pushOperand(operand);
  }

  @Override public void visit(Operator operator)
  {
    performOperation(operator);
  }
}
