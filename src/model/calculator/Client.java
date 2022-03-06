package model.calculator;

import java.util.ArrayList;

public class Client
{
  private Token token;
  private Visitor visitor;
  private Calculator calculator;

  public Client(){
    CalculatorVisitor calculatorVisitor = new CalculatorVisitor();
    visitor = calculatorVisitor;
    calculator = calculatorVisitor;
  }

  public int evaluateExpression(ArrayList<Token> tokenList){
    for (Token token : tokenList)
    {
      token.accept((CalculatorVisitor)visitor);
    }
    return calculator.getResult();
  }
}
