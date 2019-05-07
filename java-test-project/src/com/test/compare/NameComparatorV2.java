package com.test.compare;

import java.util.Comparator;

public class NameComparatorV2 implements Comparator<EmployeeV2> {

	@Override
	public int compare(EmployeeV2 e1, EmployeeV2 e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
