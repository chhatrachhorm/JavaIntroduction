# Functional Programming in Java 8

## Lamda, Lists and Looping
```Java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
```
#### Looping with for each in the outdated way
```Java
// tradetional
// normal foreach
// new foreach
numbers.forEach(new Consumer<Integer>(){
  public void accept(Integer e){
    System.out.println(e);
  }
}
```

### Lambda expression

```Java
Thread t1 = new Thread(()->System.out.println("Hello from Lambda"));
t1. start();
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
### Stream
##### Stream in java 8
```Java
// No final if it's immutable
int factor = 2;
Stream<Integer> strm = numbers.stream()
          .map(e -> e * factor);
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
// answer will be all 0, because line 24 will execute after line 26 is executed


// Stream is the internal iterator
System.lout.println(
  numbers.stream()
          .filter(e->e%2 == 0)
          .mapToInt(e -> e *2)
          .sum());
);
//lamdas are stateless
numbers.stream()
        .map(e-> e*2)
        .forEach(System.out::println);

```

###### Credits to [DEVOX](http://www.agiledeveloper.com/downloads.html)

# Major Features in Java 9

