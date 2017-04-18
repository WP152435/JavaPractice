/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBank
 * 
 * 1. 개요: 
 * 2. 작성일: 2017. 4. 18.
 * </pre> 
 *
 * @author : user
 * @version : 1.0
 */
public class PiggyBank {

	private static int balance = 0;
	
	public static void putMoney(FamilyMember member, int amount)
	{
		balance += amount;
		System.out.printf("%s: %d원 넣음\n", member.getMemberName(), amount);
	}
	
	public static void printBalance()
	{
		System.out.printf("돼지저금통 총 금액: %d원\n", balance);
	}
}
