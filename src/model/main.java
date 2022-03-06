package model;

import model.calculator.*;

import java.util.ArrayList;

public class main
{
  public static void main(String[] args)
  {
    test1();
    test2();
    test3();
  }
  private static void test1()
  {
    Client client = new Client();
    ArrayList<Token> tokens = new ArrayList<>();
    tokens.add(new Operand(20));
    tokens.add(new Operand(5));
    tokens.add(new Operator(Operation.minus));
    System.out.println(client.evaluateExpression(tokens));
  }
  private static void test2()
  {
    Client client = new Client();
    ArrayList<Token> tokens = new ArrayList<>();
    tokens.add(new Operand(5));
    tokens.add(new Operand(6));
    tokens.add(new Operand(1));
    tokens.add(new Operator(Operation.multiply));
    tokens.add(new Operand(3));
    tokens.add(new Operator(Operation.divide));
    tokens.add(new Operator(Operation.plus));
    System.out.println(client.evaluateExpression(tokens));

  }

  private static void test3()
  {
    Client client = new Client();
    ArrayList<Token> tokens = new ArrayList<>();
    tokens.add(new Operand(6));
    tokens.add(new Operand(1));
    tokens.add(new Operator(Operation.multiply));
    tokens.add(new Operand(2));
    tokens.add(new Operator(Operation.divide));
    System.out.println(client.evaluateExpression(tokens));

  }

}
