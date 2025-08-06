# Strategy Pattern

## Description
The Strategy pattern is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

## Purpose
- Define a family of algorithms, encapsulate each one, and make them interchangeable
- Let the algorithm vary independently from clients that use it
- Provide a way to configure a class with one of many behaviors

## When to Use
- When you have multiple ways to perform a task and want to switch between them at runtime
- When you want to avoid conditional statements for selecting desired behavior
- When you have a lot of similar classes that only differ in how they execute some behavior

## Structure
- **Strategy**: Interface common to all concrete strategies
- **ConcreteStrategy**: Implements the algorithm using the Strategy interface
- **Context**: Maintains a reference to a Strategy object and delegates algorithm execution to it

## Real-world Example
Consider a navigation app that can calculate routes using different algorithms: fastest route, shortest route, or most scenic route.

Please add code implementation for this pattern here.