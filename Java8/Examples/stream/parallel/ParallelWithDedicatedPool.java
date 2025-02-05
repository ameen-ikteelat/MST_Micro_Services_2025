package com.mst.java8;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelWithDedicatedPool {
	public static void main(String[] args) throws Exception {
		// List<String> list=new ArrayList<>();
		Stream<String> data = Stream.generate(() -> "" + ((int) (Math.random() * 100000))).limit(100);
		List<String> list = data.collect(Collectors.toList());
		Stream<Integer> stream = list.parallelStream().map(String::length);
		Callable<List<Integer>> task = () -> stream.collect(Collectors.toList());
		// now, we create a NEW thread pool and assign the task to it
		ForkJoinPool forkJoinPool = new ForkJoinPool(4);
		List<Integer> lengths = forkJoinPool.submit(task).get();
		System.out.println(list);
		System.out.println(lengths);
	}
}