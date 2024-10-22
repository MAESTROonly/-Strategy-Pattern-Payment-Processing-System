Payment Processing System - Strategy Pattern
Description
This project implements a flexible and scalable payment processing system for an e-commerce platform using the Strategy Pattern. The system supports multiple payment methods, including Credit Card, PayPal, and Cryptocurrency, and allows for dynamic switching between these methods at runtime.

Key Features
Supports Credit Card, PayPal, and Cryptocurrency payments.
The payment method can be changed dynamically during checkout.
Simple and extendable architecture for adding new payment methods without altering existing code.
Design Pattern Used
The Strategy Pattern is used to encapsulate different payment algorithms (payment methods) and make them interchangeable. This allows the system to support multiple payment strategies that can be changed at runtime without modifying the client code.

Project Structure
graphql
Копировать код
src/
├── PaymentStrategy.java        # Payment strategy interface
├── CreditCardPayment.java      # Strategy for credit card payments
├── PayPalPayment.java          # Strategy for PayPal payments
├── CryptoPayment.java          # Strategy for cryptocurrency payments
├── ShoppingCart.java           # Shopping cart that uses the strategy
└── Main.java   