package Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4JUtility {
	
	protected static Logger log=null;
	protected static Log4JUtility ob=null;
	
	
	private Log4JUtility() {
		
	}
	
	public static Log4JUtility getInstance() {
		if(ob==null) {
			ob=new Log4JUtility();
		}
		return ob;
	}
	
	public Logger getLogger() {
		if(log==null)
		log=LogManager.getLogger(Log4JUtility.class);
		
		return log;
	}
	

}
