package com.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1 = n->n%2==0;
		Predicate<Integer> p2 = n->n<5;
		List<Integer> list= Arrays.asList(1,3,4,5,8,7);
		Predicate<String> p3 = n->n.startsWith("A");
		Predicate<String> p4 = n->n.length()<3;
		 List<String> list2 = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
		System.out.println(list.stream().allMatch(n->n%2==0));
		System.out.println(list.stream().anyMatch(n->n%2==0 ));
		List<Integer> list1= list.stream().filter(p1.and (p2)).collect(Collectors.toList());
		
		System.out.println(list1);
		System.out.println(list1.stream().allMatch(n->n%2==0));
		System.out.println(list.stream().count());
		System.out.println(list1.stream().allMatch(n->n%2==0));
		System.out.println(list2.stream().filter(p3.or(p4)).collect(Collectors.toList()));
		
		
		 // Optional<Integer> li= list.stream().findAny();

	}

}
