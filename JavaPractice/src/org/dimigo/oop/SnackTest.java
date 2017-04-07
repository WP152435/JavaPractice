/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ SnackTest
 * 
 * 1. 개요: 
 * 2. 작성일: 2017. 4. 7.
 * </pre> 
 *
 * @author : user
 * @version : 1.0
 */
public class SnackTest {

	public static void main(String[] args) {
		
		Snack[] snacks = new Snack[3];
		snacks[0] = new Snack("새우깡", "농심", 1100, 2);
		snacks[1] = new Snack("콘칲", "크라운", 1200, 1);
		snacks[2] = new Snack("허니버터칩", "해태", 1500, 4);
		int sum = 0;
			
		for( Snack snack : snacks )
		{
			System.out.println(snack);
			sum += snack.calcPrice();
		}
		System.out.printf("총 구매 금액: %,d원", sum);
	}

}
