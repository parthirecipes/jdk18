package com.parthirecipes.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEx1 {

	public static void main(String[] args) {

		// for each
		String separator = ",  ";
		Arrays.asList("cliff", "atchuta", "sreeni", "vijay", "kalyan").forEach(e -> System.out.print(e + separator));

		// sorting
		List<String> strings = Arrays.asList("cliff", "cliff", "atchuta", "sreeni", "vijay", "kalyan");
		strings.sort((e1, e2) -> e1.compareTo(e2));
		System.out.println("\n\n");
		strings.forEach(e -> System.out.print(e + separator));

		// consumer
		Consumer<String> stringConsumer = (String s) -> System.out.println("Hello consumer : " + s);
		strings.forEach(stringConsumer);

		// filter -- intermediate operations
		System.out.println("\n\n Filtered results ");
		strings.stream().filter(e -> e.startsWith("c")).forEach(e -> System.out.println(e));

		// distinct -- intermediate operations
		System.out.println("\n\n Distinct Results : ");
		strings.stream().distinct().forEach(e -> System.out.println(e));

		// sorted -- intermediate operations
		System.out.println("\n\n Sorted Results : ");
		strings.stream().sorted().forEach(e -> System.out.println(e));

		// map -- intermediate operations
		System.out.println("\n\n Mapped Results : ");
		strings.stream().map((String e) -> {
			if (e.length() < 6) {
				return e.toUpperCase();
			} else {
				return "sorry : " + e.toLowerCase();
			}
		}).forEach(e -> System.out.println(e));

	}
}
