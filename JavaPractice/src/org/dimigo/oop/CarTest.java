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
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.setCompany("현대자동차");
		c1.setModel("제네시스");
		c1.setColor("검정색");
		c1.setMaxSpeed(225);
		c1.setPrice(50000000);
		
		c2.setCompany("기아자동차");
		c2.setModel("K7");
		c2.setColor("흰색");
		c2.setMaxSpeed(246);
		c2.setPrice(40000000);
		
		c3.setCompany("삼성자동차");
		c3.setModel("SM7");
		c3.setColor("회색");
		c3.setMaxSpeed(200);
		c3.setPrice(38000000);
		
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
