package model.calculator;

public abstract class Token
{
  private CalculatorVisitor visitor;

  public void accept(CalculatorVisitor visitor){
    this.visitor = visitor;
  }
}
