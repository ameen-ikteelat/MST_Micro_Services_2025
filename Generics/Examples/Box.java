package com.mst.generics.test1;

public class Box<t> {
	private t value;

	public Box(t val) {
		this.value = val;
	}
	
	@Override
	public String toString() {
		return "Box [value=" + value + "]";
	}
	
	public static void main(String[] args) {
		Box<Integer> a = new Box<>(3);
		System.out.println(a);
	}
}
