package com.bch.scrrble;



final public class DescendingComp implements Comparable<DescendingComp> {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return value;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return ((DescendingComp)obj).value == value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(value);
	}
	
	private int value;
	public int getValue() {
		return value;
	}
	public DescendingComp(int value) {
		this.value = value;
	}
	@Override
	public int compareTo(DescendingComp o) {
		// TODO Auto-generated method stub
		return o.value - value;
	}

}
