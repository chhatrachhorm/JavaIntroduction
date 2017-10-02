# Functional Programming in Java 8
## Lamda, Lists and Looping
```Java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
```
#### Looping with for each in the outdated way
```Java
// traditional
for(int i = 0; i < numbers.size(); i++){
  System.out.println(numbers.get(i));
}
// normal foreach
for(int i : numbers){
  System.out.println(i);
}
// Internal Iterator
numbers.forEach(new Consumer<Integer>(){
  public void accept(Integer e){
    System.out.println(e);
  }
}
// In java 8
numbers.forEach(System.out::println)
```

### Lambda expression and Stream
#### Functional Programming
A normal function has to have :
  - Name
  - Return Type
  - Parameters
  - Body

Lambda are anonymous function whose type is inferred which has two things
  - Parameters
  - Body

In Normal Function, we can pass objects to functions, create objects within functions and return ojects from a function.
In higher order functions, we can pass functions to functions, create functions within functions and return functions from a functions.

Types of Programming
- Imperative: what and how.    
- Declarative: what not how
- Functional: Declarative + higher-order functions
##### Lambda
```Java
Thread t1 = new Thread(()->System.out.println("Hello from Lambda"));
t1.start();
```
``` Java
numbers.forEach((Integer e)-> System.out.println(e));
// leave the type
numbers.forEach((e)->System.out.println(e));
// No parentheisis for one parameter
numbers.forEach(e->System.out.println(e));
// Method references
numbers.forEach(System.out::println)
```
#### Stream
##### Stream in java 8
```Java
// No final if it's immutable
int factor = 2;
Stream<Integer> strm = numbers.stream()
          .map(e -> e * factor); // e is the parameter to the labda, much like args is the parameter to main
strm.forEach(System.out::println);
// Error will throws
int factor = 2;
Stream<Integer> strm = numbers.stream()
          .map(e -> e * factor);
factor = 4;
strm.forEach(System.out::println);
```
##### Lasy Evaluation
```Java
// Tricks by using Lasy Evaluation
int[] factor = new int[]{2};
Stream<Integer> strm = numbers.stream()
          .map(e -> e * factor[0]);
factor[0] = 0;
strm.forEach(System.out::println);
// answer will be all 0, because .map() will never be executed unless strm.forEach(System.out::println) is executed


// Stream is the internal iterator
System.out.println(
  numbers.stream()
          .filter(e->e%2 == 0)
          .mapToInt(e -> e *2)
          .sum()); // the filter and mapToInt won't be invoked unless .sum() is executed
);
//lamdas are stateless
numbers.stream()
        .map(e-> e*2)
        .forEach(System.out::println);

```

###### Credits to [DEVOX](http://www.agiledeveloper.com/downloads.html)
