/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 * 
 * 1. 개요: 
 * 2. 작성일: 2017. 3. 14.
 * </pre> 
 *
 * @author : user
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<< 디미베네 연간 인건비 >>");
		int monthSalary = 1700000;
		int employeePerStore = 3;
		int storeNum = 1500;
		
		System.out.printf("월 평균 급여: %,d원 \n", monthSalary);
		System.out.printf("점포 내 직원수: %,d명 \n", employeePerStore);
		System.out.printf("점포 수: %,d개 \n\n", storeNum);
		
		System.out.printf("연간 인건비: %,d원", monthSalary * 12L * employeePerStore * storeNum);
		
		

	}

}
