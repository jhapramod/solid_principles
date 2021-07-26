package com.pramod.org.solid.ocp.better;

import java.util.List;

public interface Filter<T> {
	
	List<T> filter(List<T> items, Specification<T> spec);
}
