/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;
/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요: 
 * 2. 작성일: 2017. 3. 31.
 * </pre> 
 *
 * @author : user
 * @version : 1.0
 */
public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] questions = {"가장 좋아하는 프로그래밍 언어는?", "가장 좋아하는 단편 애니메이션은?", "가장 좋아하는 음식은?"};
		String[] answers = {"파이썬", "떳다 그녀!!", "부대찌개"};
		
		for(int i=0; i<3; i++)
		{
			System.out.println((i + 1) + "." + questions[i]);
			System.out.println(answers[i].equals(scanner.nextLine()) ? "정답입니다!" : "틀렸습니다!");
		}
		
		System.out.println("<< 결과 출력 >>");
		for(int i=0; i<3; i++)
		{
			StringBuilder sb = new StringBuilder(questions[i]).append(' ').append(answers[i]).append("입니다.");
			System.out.println(sb);
		}
		scanner.close();
	}

}
