package L6_Comparators.E2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        System.out.println("Filter ___");
        filter();
        System.out.println("Map method ___");
        mapMethod();

        System.out.println("Collect ___");
        collect();

        System.out.println("TO MAP ___");
        toMap();
        System.out.println("GroupingBy ___");
        groupingBy();
        System.out.println("Optional ___");
        optionalTest();
    }


    public static void filter(){
        List<Integer> integers = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);

        Stream<Integer> stream = integers.stream();

        List<Integer> integers1 = stream.filter(x -> x % 2 == 0).toList();

        System.out.println(integers1);
    }


    public static void mapMethod(){
        List<Integer> integers = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
        List<Integer> mapped = integers.stream().distinct().filter(x -> x % 2 == 0).map(x -> x * 2).toList();
        System.out.println(mapped);
    }

    public static void collect(){
        // Collect to string

        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "a=2", "b=3", "c=4", "d==3");
        String result = list.stream().collect( Collectors.joining(", ") );

        System.out.println(result);
    }


    public static void streamOf(){
        // Stream of

        Stream<String> randomWord = Stream.of("cheap", "yet", "bone", "guard", "message", "message");

        randomWord
                .distinct()
                .filter(x -> x.length() > 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }


    public static void generate(){

        Stream.generate(() -> new Random().nextInt(10)).limit(3)
                .forEach(e -> System.out.println(e));

        Stream.generate(() -> new Random().nextBoolean()).limit(3)
                .forEach(e -> System.out.println(e));

        Stream.generate(() -> "Hello World!").limit(3)
                .forEach(e -> System.out.println(e));
    }

    public static void concat(){
        // CONCAT

        Stream<String> stringStream1 = Stream.of("Hello", "World");
        Stream<String> stringStream2 = Stream.of("foo", "bar");

        Stream.concat(stringStream1, stringStream2).forEach(System.out::println);
    }


    public static void peek(){
        // PEEK
        Stream<String> peekStringStream1 = Stream.of("Hello", "World");
        Stream<String> peekStringStream2 = Stream.of("foo", "bar");
        List<String> peekStrings = new ArrayList<>();

        Stream.concat(peekStringStream1, peekStringStream2).peek(x -> peekStrings.add(x)).forEach(System.out::println);

        System.out.println(peekStrings);
    }

    public static void toMap(){
        // To map
        List<String> list = Arrays.asList("round", "commerce", "shelter", "flour", "heap");

        Map<String, Integer> tstMap = list.stream()
                .map(String::toUpperCase)
//                .collect(Collectors.toMap(s -> s, String::length));
                .collect(Collectors.toMap(s -> s, s -> s.length()));

        for (String s : tstMap.keySet()) {
            System.out.println(s);
            System.out.println(tstMap.get(s));
        }
    }


    public static void flatMap(){
        // MAP vs FlatMap

        List<List<String>> listMap = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"));

        System.out.println(listMap);

        listMap.stream()
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void groupingBy(){
        // To map
        List<Person> people = new ArrayList<>();
        people.add(new Person("Person1", 20));
        people.add(new Person("Person2", 20));
        people.add(new Person("Person3", 20));
        people.add(new Person("Person4", 20));

        people.add(new Person("Person5", 25));
        people.add(new Person("Person6", 25));
        people.add(new Person("Person7", 25));
        people.add(new Person("Person8", 25));



        Map<Integer, List<Person>> tstMap = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        for (Integer age : tstMap.keySet()) {
            System.out.println("Age : " + age);
            System.out.println(tstMap.get(age));
        }


        System.out.println("mapping");
        List<String> names = people.stream().collect(Collectors.mapping(Person::getName, Collectors.toList()));
        List<String> names1 = people.stream().map(Person::getName).toList();
    }


    public static void optionalTest(){
        List<Integer> integers = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);


        Optional<Integer> optional = integers.stream()
                .filter(x -> x > 50)
                        .findFirst();

        Optional<Integer> optional1 = integers.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .filter(x -> x > 5)
                .findFirst();

        System.out.println(optional.isPresent());
        System.out.println(optional1.isPresent());



        // Optional of
        String randomWord = "morning";

        Optional<String> stringOptional = Optional.of(randomWord);
        Optional<String> stringOptionalNull = Optional.ofNullable(null);

        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptionalNull.isPresent());

        stringOptional.ifPresent(name -> System.out.println(name));

        stringOptionalNull.ifPresent(word -> System.out.println(word));



        // Of nullable


        String stHello = "Hello";
        String stNull = null;


        String res = Optional.ofNullable(stHello).orElse("Nothing to show");
        System.out.println(res);
    }

}
