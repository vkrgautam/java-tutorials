package com.test.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * 
 * @author GautamV
 */
public class ChainedComparatorDemo {

	public static void main(String[] args) {

		List<EmployeeV2> empList = new ArrayList<>();
		empList.add(new EmployeeV2(619, "John", "DX"));
		empList.add(new EmployeeV2(612, "Don", "DX"));
		empList.add(new EmployeeV2(623, "James", "AI"));
		empList.add(new EmployeeV2(601, "Ryan", "AI"));
		empList.add(new EmployeeV2(602, "Chris", "IVS"));

		Collections.sort(empList, new EmployeeChainedComparator(new UnitComparator(), new NameComparatorV2()));

		// Collections.sort(empList, new UnitComparator().thenComparing(new
		// NameComparatorV2()));

		for (EmployeeV2 employee : empList) {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getUnit());
		}
	}
}
