# Class Diagrams

## UML Class Notations

### Class Representation
1. Class Name (TOP)
2. Attributes (MIDDLE)
3. Operations (BOTTOM)

### Visibility Markers
1. public (+)
2. private (-)
3. protected (#)
4. package (~)


**Attributes and Method syntax**
1. Attributes : visibility name : type = default value `(+ amount: double = 0.0)`
2. Methods : visibility name(parameter list,...): return type `(- sum(a:int,b:int): int)`

### Interfaces
1. Interface name (TOP) : represented using `<<interface>> name`
2. Rest remains same as class representation

### Abstract Class
1. Abstract class (TOP) : represented using `<<abstract>> name in italics`
2. Rest remains same as class representation.

### Enumerations
1. Enum name : represented using `<<enumeration>> name`.
2. It has no middle compartment.


## Perspectives of Class Diagram

**Business Analysts** : Conceptual Perspective (represents the concepts in the domain).  
**Architects** : Specification perspective (focus is on the interfaces of the abstract data types of software).  
**Developers** : Implementation perspective (describes how classes will implement their interfaces)

## Relationship between Classes
1. Association
2. Aggregation
3. Composition
4. Inheritance
5. Realization(Implementation)
6. Dependency

### Association
**Notation** : A solid line between two classes.  
This represents "uses-a" relationship between classes where one class uses or interacts with the other.  
Eg: A teacher can teach multiple students, and a student can be taught by multiple teachers(many-to-many association)

### Aggregation
**Notation** : A hollow diamond at the container (whole) class.  
This represents a "whole-part" relationship where a class is made up of one or more classes, but those parts can exist independently.  
Eg: A department has multiple Professors. If the department is removed, the professors still exist.

### Composition
**Notation** : A filled diamond at the whole side.  
This represents a stronger form of aggregation where the part cannot exist without the whole. It is a "whole-part" relationship where the part is dependent on the whole.  
Eg: A house has rooms. If the house is destroyed, so are the rooms.

### Inheritance
**Notation** : A solid line with a filled triangle pointing to the parent class.  
Inheritance defines "is-a" relationship where a subclass inherits properties and behavior from a superclass. The subclass can extend or override the superclass's attributes and methods.  
Eg: A Dog is an Animal.

### Realization(Implementation)
**Notation** : A dotted line with a filled triangle pointing to the interface.  
Relationship between a class and an interface.  
Eg: A circle class implements a Shape interface.

### Dependency
**Notation** : A dotted line with an open arrow pointing to the class being used.  
Indicates that a class uses another class temporarily. Changes to the used class may affect the dependent class.  
Eg: OrderService depends on PaymentService to process payments.  






















