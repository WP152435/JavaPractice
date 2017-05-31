/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ AgeCheckException
 * 
 * 1. 개요: 
 * 2. 작성일: 2017. 5. 31.
 * </pre> 
 *
 * @author : user
 * @version : 1.0
 */
public class AgeCheckException extends Exception {

	AgeCheckException() { }
	AgeCheckException(Movie movie)
	{
		super(movie.getTitle()+"은/는 "+movie.getLimitAge()+"세 이상 관람가입니다.");
	}
}
