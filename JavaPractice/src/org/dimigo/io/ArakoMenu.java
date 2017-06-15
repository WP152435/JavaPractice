/**
 * 
 */
package org.dimigo.io;

/**
 * <pre>
 * org.dimigo.io
 *   |_ ArakoMenu
 * 
 * 1. 개요: 
 * 2. 작성일: 2017. 6. 15.
 * </pre> 
 *
 * @author : user
 * @version : 1.0
 */
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.Writer;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class ArakoMenu 
{
	public static void main(String[] args) 
	{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
		BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))) 
		{
			String menu;
			while((menu = br.readLine()) != null)
			{
				writer.write(menu + "\n");
			}
			writer.flush();
			
			System.out.println("<< 메뉴 출력 >>");
			while((menu = reader.readLine()) != null)
			{
				System.out.println(menu);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
