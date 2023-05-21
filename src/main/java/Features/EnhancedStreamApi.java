package Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EnhancedStreamApi {
    public static void main(String[] args) {
        /*
            With Java 9, new methods has been added to Stream API. These are:
            - takeWhile()
            - dropWhile()
            - ofNullable()
            - iterate()

            1- takeWhile()
                If calling stream is ordered, then this method returns a stream containing first n elements of the calling stream which satisfy the given predicate.
                It immediately terminates the operation as soon as it sees an element which doesn’t satisfy the predicate and it doesn’t evaluate remaining elements
                even though there may be elements which satisfy the given predicate.

                If the calling stream is unordered then this method returns all or some elements which satisfy the given predicate. In such conditions, behavior of
                this method becomes non-deterministic.

            2- dropWhile()
                Opposite of takeWhile()

            3- ofNullable()
               ofNullable() method of stream takes an object as an argument. If the provided object is non-null, returns a sequential Stream containing that single
               object, if the value passed to ofNullable() method is null then  it returns an empty Stream.

            4- iterate()
               iterates given variable
        */

        List<String> people = List.of("Enes", "Ahmet", "Emir", "Ali", "İbrahim", "Mücahit", "İrem", "İlknur", "Burak" );
        Predicate<String> lengthPredicate = name -> name.length() <= 5;
        List<String> filteredPeople = people.stream().dropWhile(lengthPredicate).collect(Collectors.toList()); //Weird?
        List<String> filteredPeople2 = people.stream().takeWhile(lengthPredicate).collect(Collectors.toList());


        System.out.println(filteredPeople); // Output [İbrahim, Mücahit, İrem, İlknur, Burak]
        System.out.println(filteredPeople2); // Output [Enes, Ahmet, Emir, Ali]

        List<String> languages = Arrays.asList("C#", "Java", null, "Python", null, "C++", "C", "Go");
        List<String> upperCase = languages.stream().flatMap(lang -> Stream.ofNullable(lang)).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase); // Output [C#, JAVA, PYTHON, C++, C, GO]

        Stream.iterate(1, i-> i < 3, i-> i+1).forEach(System.out::println);
    }
}
