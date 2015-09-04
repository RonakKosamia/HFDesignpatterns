# HFDesignpatterns

Design patterns represent the best practices used by experienced object-oriented software developers.
Design patterns are solutions to general problems that software developers faced during software development. 
These solutions were obtained by trial and error by numerous software developers over quite a substantial period of time.

#Singleton pattern: 
Singleton pattern is one of the simplest design patterns in Java.
This pattern involves a single class which is responsible to create an object while making sure that only single object gets
created. This classprovides a way to access its only object which can be accessed directly without need to instantiate the 
object of the class.

#Factory pattern:
FP is one of most used design pattern in Java. This type of design pattern comes under creational pattern as 
this pattern provides one of the best ways to create an object.
In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object 
using a common interface.

#Strategy pattern:
Strategy pattern, a class behavior or its algorithm can be changed at run time.
This type of design pattern comes under behavior pattern.
In Strategy pattern, we create objects which represent various strategies and a context object
whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of 
the context object.

#Observer Pattern:
Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, 
its depenedent objects are to be notified automatically. Observer pattern falls under behavioral pattern category.


#Decorator Pattern:
Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

This pattern creates a decorator class which wraps the original class and provides additional functionality keeping
class methods signature intact.
