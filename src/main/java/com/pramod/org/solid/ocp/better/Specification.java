package com.pramod.org.solid.ocp.better;

public interface Specification<T> {
	
	boolean isSatified(T item);
}
