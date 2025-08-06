# Interpreter Pattern

## Description
The Interpreter pattern is a behavioral design pattern that defines a representation for a language's grammar and provides an interpreter to deal with this grammar.

## Purpose
- Define a representation for a grammar of a given language
- Use that representation to interpret sentences in the language
- Provide a way to evaluate language grammar or expression

## When to Use
- When you have a language to interpret and can represent statements as abstract syntax trees
- When the grammar is simple (complex grammars are better handled by parser generators)
- When efficiency is not a critical concern

## Structure
- **AbstractExpression**: Interface for executing an operation
- **TerminalExpression**: Implements an interpret operation for terminal symbols in the grammar
- **NonterminalExpression**: Implements an interpret operation for non-terminal symbols
- **Context**: Contains information that's global to the interpreter
- **Client**: Builds the abstract syntax tree and invokes the interpret operation

## Real-world Example
Consider a simple mathematical expression evaluator that can parse and evaluate expressions like "2 + 3 * 4".

Please add code implementation for this pattern here.