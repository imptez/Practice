package Job;


import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Practice2 {
    public static void main(String[] args) {
    List<Person> persons = Arrays.asList(
            new Person(1, "Alex", 100d, new Department(1, "HR")),
            new Person(2, "Brian", 200d, new Department(1, "HR")),
            new Person(3, "Charles", 900d, new Department(2, "Finance")),
            new Person(4, "David", 200d, new Department(2, "Finance")),
            new Person(5, "Edward", 200d, new Department(2, "Finance")),
            new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
            new Person(7, "George", 900d, new Department(3, "ADMIN")));
        getFrequency(persons);
}

public static void getFrequency(List<Person> persons){
    Map<Department, Long> map = persons.stream()
            .collect(groupingBy(Person::getDepartment, counting()));

    persons.stream()
                    .forEach(person -> {
                        persons.add(new Person(7, "Imptez", 900d, new Department(3, "ADMIN")));
                        System.out.println(person.toString());
                    });


   // System.out.println(map);
}




}