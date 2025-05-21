package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Liam", "Reynolds", 34));
        people.add(new Person("Olivia", "Parker", 28));
        people.add(new Person("Noah", "Robinson", 22));
        people.add(new Person("Emma", "Campbell", 44));
        people.add(new Person("Ava", "Mitchell", 19));
        people.add(new Person("Sophia", "Turner", 31));
        people.add(new Person("Mason", "Collins", 25));
        people.add(new Person("Isabella", "Bennett", 41));
        people.add(new Person("Lucas", "Bailey", 30));
        people.add(new Person("Mia", "Griffin", 38));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search (first or last): ");
        String search = scanner.nextLine().toLowerCase();

        // Step 2: Filter matching names
        List<Person> matches = new ArrayList<>();
        for (Person p : people) {
            if (p.getFirstName().toLowerCase().equals(search) ||
                    p.getLastName().toLowerCase().equals(search)) {
                matches.add(p);
            }
        }

        System.out.println("\nMatching people:");
        for (Person p : matches) {
            System.out.println(p);
        }

        // Step 3: Age stats
        if (!people.isEmpty()) {
            int totalAge = 0;
            int minAge = Integer.MAX_VALUE;
            int maxAge = Integer.MIN_VALUE;

            for (Person p : people) {
                int age = p.getAge();
                totalAge += age;
                if (age < minAge) minAge = age;
                if (age > maxAge) maxAge = age;
            }

            double averageAge = (double) totalAge / people.size();
            System.out.printf("\nAverage Age: %.2f\n", averageAge);
            System.out.println("Oldest Age: " + maxAge);
            System.out.println("Youngest Age: " + minAge);
        }
    }
}