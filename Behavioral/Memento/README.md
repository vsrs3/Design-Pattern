# Memento Pattern

## Description
The Memento pattern is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

## Purpose
- Capture and externalize an object's internal state without violating encapsulation
- Allow the object to be restored to this state later
- Provide undo/redo functionality

## When to Use
- When you need to save and restore an object's state
- When you want to provide undo functionality
- When direct access to an object's state would expose implementation details and break encapsulation

## Structure
- **Originator**: The object whose state needs to be saved and restored
- **Memento**: Stores the internal state of the Originator object
- **Caretaker**: Manages the mementos but never operates on or examines their contents

## Real-world Example
Consider a text editor that allows you to undo and redo changes by saving snapshots of the document's state.

Please add code implementation for this pattern here.