/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 * 
 * 1. 개요: 
 * 2. 작성일: 2017. 3. 23.
 * </pre> 
 *
 * @author : user
 * @version : 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 c1 = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car3 c2 = new Car3("기아자동차", "K7", "흰색", 246);
		Car3 c3 = new Car3("삼성자동차", "SM7", "회색");

		System.out.printf("제조사명: %s\n", c1.getCompany());
		System.out.printf("모델명: %s\n", c1.getModel());
		System.out.printf("색상: %s\n", c1.getColor());
		System.out.printf("최대속도: %dkm\n", c1.getMaxSpeed());
		System.out.printf("가격: %,d원\n", c1.getPrice());
		System.out.println();
		
		System.out.printf("제조사명: %s\n", c2.getCompany());
		System.out.printf("모델명: %s\n", c2.getModel());
		System.out.printf("색상: %s\n", c2.getColor());
		System.out.printf("최대속도: %dkm\n", c2.getMaxSpeed());
		System.out.printf("가격: %,d원\n", c2.getPrice());
		System.out.println();
		
		System.out.printf("제조사명: %s\n", c3.getCompany());
		System.out.printf("모델명: %s\n", c3.getModel());
		System.out.printf("색상: %s\n", c3.getColor());
		System.out.printf("최대속도: %dkm\n", c3.getMaxSpeed());
		System.out.printf("가격: %,d원\n", c3.getPrice());		
	}

}
