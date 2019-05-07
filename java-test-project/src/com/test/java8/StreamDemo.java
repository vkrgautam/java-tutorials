package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Stream takes Collections, Arrays, or I/O resources as input source. Stream
 * supports aggregate operations like filter, map, limit, reduce, find, match,
 * and so on. Each intermediate operation is lazily executed and returns a
 * stream as a result, hence various intermediate operations can be pipelined.
 * Terminal operations mark the end of the stream and return the result.
 * collect() method is a terminal operation which is normally present at the end
 * of the pipelining operation to mark the end of the stream.
 * 
 * Intermediate Operations: map, filter, sorted Terminal Operations: collect,
 * forEach, reduce
 * 
 * @author GautamV
 *
 */
public class StreamDemo {

	public static void main(String[] args) {

		// Stream has provided a new method 'forEach' to iterate each element of the
		// stream.
		List<String> strings = Arrays.asList("str1", "", "str3", "str4", "str5", "", "str7");
		// filter empty strings
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		filtered.forEach(System.out::println);

		// The 'map' method is used to map each element to its corresponding result.
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// get list of unique squares
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		squaresList.forEach(System.out::println);
	}

}
