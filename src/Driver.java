
public class Driver {

	
	
	public static void main(String[] args)
	{
		printSystemInfo();
		
		
		
		
	}
	
	
	public static void printSystemInfo()
	{
		/* Total number of processors or cores available to the JVM */
	    System.out.println("Available processors (cores): " + 
	        Runtime.getRuntime().availableProcessors());

	    /* Total amount of free memory available to the JVM */
	    System.out.println("Free memory (bytes): " + 
	        Runtime.getRuntime().freeMemory());

	    /* This will return Long.MAX_VALUE if there is no preset limit */
	    long maxMemory = Runtime.getRuntime().maxMemory();
	    /* Maximum amount of memory the JVM will attempt to use */
	    System.out.println("Maximum memory (bytes): " + 
	        (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

	    /* Total memory currently available to the JVM */
	    System.out.println("Total memory available to JVM (bytes): " + 
	        Runtime.getRuntime().totalMemory());
	    
	    /* Current running version of java */
	    System.out.println("Java Version: " + 
	        System.getProperty("java.version"));
	    
	    /* Current os name */
	    System.out.println("Operating System: " + 
	        System.getProperty("os.name"));
	    
	    /* Current os version */
	    System.out.println("Operating Version: " + 
	        System.getProperty("os.version"));
	}
}
