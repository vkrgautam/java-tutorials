package com.demo.compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeChainedComparator implements Comparator<EmployeeV2> {

	private List<Comparator<EmployeeV2>> listComparators;

	@SafeVarargs
	public EmployeeChainedComparator(Comparator<EmployeeV2>... comparators) {
		this.listComparators = Arrays.asList(comparators);
	}

	@Override
	public int compare(EmployeeV2 emp1, EmployeeV2 emp2) {
		for (Comparator<EmployeeV2> comparator : listComparators) {
			int result = comparator.compare(emp1, emp2);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}
}
