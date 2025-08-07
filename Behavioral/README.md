# Behavioral Design Patterns

This folder contains implementations of all 11 behavioral design patterns from the Gang of Four (GoF) design patterns catalog. Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects. They describe not just patterns of objects or classes but also the patterns of communication between them.

## Included Patterns

### 1. Chain of Responsibility
**Purpose**: Lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

**Use Case**: Approval workflows, event handling systems, logging frameworks.

**Implementation**: `ChainOfResponsibility/` - Expense approval system with different authorization levels.

### 2. Command
**Purpose**: Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

**Use Case**: GUI buttons and menu items, macro recording, undo/redo functionality.

**Implementation**: `Command/` - Text editor with copy, cut, paste commands and undo functionality.

### 3. Interpreter
**Purpose**: Defines a representation for a language's grammar along with an interpreter that uses the representation to interpret sentences in the language.

**Use Case**: Configuration file parsing, mathematical expression evaluation, scripting languages.

**Implementation**: `Interpreter/` - Simple mathematical expression evaluator with variables and basic operations.

### 4. Iterator
**Purpose**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

**Use Case**: Collection traversal, database result sets, tree/graph traversal.

**Implementation**: `Iterator/` - Book collection with custom iterator for sequential access.

### 5. Mediator
**Purpose**: Defines how a set of objects interact with each other. Instead of objects communicating directly, they communicate through the mediator.

**Use Case**: UI component coordination, chat rooms, workflow orchestration.

**Implementation**: `Mediator/` - Dialog form with coordinated button, text field, and checkbox interactions.

### 6. Memento
**Purpose**: Captures and externalizes an object's internal state so that the object can be restored to this state later without violating encapsulation.

**Use Case**: Undo/redo functionality, checkpoints, state persistence.

**Implementation**: `Memento/` - Text editor with save/restore functionality and history management.

### 7. Observer
**Purpose**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

**Use Case**: Model-View architectures, event handling, publish-subscribe systems.

**Implementation**: `Observer/` - File editor with email and logging notifications for open/save events.

### 8. State
**Purpose**: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

**Use Case**: State machines, game character behavior, protocol implementations.

**Implementation**: `State/` - Media player with different states (locked, ready, playing) and state-specific behavior.

### 9. Strategy
**Purpose**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

**Use Case**: Payment processing, sorting algorithms, route calculation.

**Implementation**: `Strategy/` - Navigation system with different route calculation strategies (road, public transport, walking).

### 10. Template Method
**Purpose**: Defines the skeleton of an algorithm in a base class, letting subclasses override specific steps of the algorithm without changing its structure.

**Use Case**: Data processing pipelines, framework hooks, code generation.

**Implementation**: `TemplateMethod/` - Data processing framework with different file format processors (CSV, XML, JSON).

### 11. Visitor
**Purpose**: Lets you define a new operation without changing the classes of the elements on which it operates.

**Use Case**: Compiler operations on AST nodes, file system operations, object structure traversal.

**Implementation**: `Visitor/` - Geometric shapes with different calculation visitors (area, perimeter).

## Running the Examples

Each pattern implementation includes a `Demo.java` class that demonstrates the pattern in action. To run any demo:

```bash
# From the Behavioral directory
cd [PatternName]
javac *.java
cd ..
java [PatternName].Demo
```

For example, to run the Strategy pattern demo:

```bash
cd Strategy
javac *.java
cd ..
java Strategy.Demo
```

## Package Structure

Each pattern is implemented in its own package matching the folder name (e.g., `package Strategy;`). This allows for:
- Clear separation of concerns
- Independent compilation
- Easy identification and navigation
- Consistent naming conventions

## Design Principles

All implementations follow these principles:
- **Single Responsibility**: Each class has one reason to change
- **Open/Closed**: Open for extension, closed for modification
- **Liskov Substitution**: Derived classes are substitutable for their base classes
- **Interface Segregation**: Clients depend only on methods they use
- **Dependency Inversion**: Depend on abstractions, not concretions

## Code Style

The implementations follow standard Java conventions:
- Camel case naming
- Clear and descriptive variable/method names
- Proper encapsulation with appropriate access modifiers
- Comprehensive demonstrations in Demo classes
- Comments where needed for clarity

## Further Reading

- **Design Patterns: Elements of Reusable Object-Oriented Software** by Gang of Four
- **Head First Design Patterns** by Freeman & Robson
- **Effective Java** by Joshua Bloch