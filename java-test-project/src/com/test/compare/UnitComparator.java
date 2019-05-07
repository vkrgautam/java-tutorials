package com.test.compare;

import java.util.Comparator;

public class UnitComparator implements Comparator<EmployeeV2> {

	@Override
	public int compare(EmployeeV2 e1, EmployeeV2 e2) {
		return e1.getUnit().compareTo(e2.getUnit());
	}
}
