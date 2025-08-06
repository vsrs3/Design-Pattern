# Chain of Responsibility Pattern

## Description
The Chain of Responsibility pattern is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

## Purpose
- Avoid coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request
- Chain receiving objects and pass the request along the chain until an object handles it
- Allow dynamic configuration of the chain

## When to Use
- When more than one object may handle a request, and the handler isn't known a priori
- When you want to issue a request to one of several objects without specifying the receiver explicitly
- When the set of objects that can handle a request should be specified dynamically

## Structure
- **Handler**: Interface that defines a method for handling requests and optionally implementing the successor link
- **ConcreteHandler**: Handles requests it is responsible for; can access its successor
- **Client**: Initiates the request to a ConcreteHandler object on the chain

## Real-world Example
Consider an approval process where different levels of management can approve different amounts of expenses.

Please add code implementation for this pattern here.