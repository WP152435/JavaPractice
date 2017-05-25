/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IDBManager
 * 
 * 1. 개요: 
 * 2. 작성일: 2017. 5. 25.
 * </pre> 
 *
 * @author : user
 * @version : 1.0
 */
public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	public abstract void insert();
	public abstract void search();
	public abstract void update();
	public abstract void delete();
	
	public static IDBManager getDBObject(String database)
	{
		IDBManager instance = null;
		if(ORACLE_DATABASE.equals(database))
		{
			instance = new OracleDB();
		}
		else if(SYBASE_DATABASE.equals(database))
		{
			instance = new SybaseDB();
		}
		return instance;
	}
}
