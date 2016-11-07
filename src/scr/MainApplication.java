package scr;

import java.io.IOException;
import CallAPI.*;

public class MainApplication {

	public static void main(String[] args) {

		try {
			System.out.println("working");
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			public void run() {
				CallbackAPI.RunCallback((new Callback()));
			}
		}, "Shutdown-thread"));
	}

}
