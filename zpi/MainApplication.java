package zpi;

import java.io.IOException;

public class MainApplication {

	public static void main(String[] args) {
	
	  
	  try {
		  System.out.println("working");
		System.in.read();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
	        public void run() {
	            System.out.println("In shutdown hook");
	        }
	    }, "Shutdown-thread"));
	}

}
