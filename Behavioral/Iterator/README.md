# Iterator Pattern

## Description
The Iterator pattern is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

## Purpose
- Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation
- Support multiple traversals of aggregate objects
- Provide a uniform interface for traversing different aggregate structures

## When to Use
- When you want to access an aggregate object's contents without exposing its internal structure
- When you want to support multiple traversals of aggregate objects
- When you want to provide a uniform interface for traversing different aggregate structures

## Structure
- **Iterator**: Interface that defines methods for accessing and traversing elements
- **ConcreteIterator**: Implements the Iterator interface and keeps track of the current position
- **Aggregate**: Interface that defines a method for creating an Iterator object
- **ConcreteAggregate**: Implements the Iterator creation interface to return an instance of the proper ConcreteIterator

## Real-world Example
Consider iterating through a collection of books in a library without knowing whether they're stored in an array, linked list, or tree structure.

Please add code implementation for this pattern here.