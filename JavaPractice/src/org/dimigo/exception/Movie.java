/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ Movie
 * 
 * 1. 개요: 
 * 2. 작성일: 2017. 5. 31.
 * </pre> 
 *
 * @author : user
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	
	Movie(String title, int limitAge)
	{
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}
	
	public void buyTicket(int age) throws AgeCheckException
	{
		if(age < limitAge)
		{
			throw new AgeCheckException(this);
		}
	}
}
