package CallAPI;
import java.io.PrintWriter;
import java.util.Scanner;

public class CallbackAPI 
{
	private static void SaveToFile(String[] parameters, ICallback callback)
	{
		PrintWriter zapis = null;
		try
		{
			zapis = new PrintWriter(parameters[0]);
			zapis.println("Hello world");
			zapis.close();
		}
		catch(Exception e)
		{
			System.out.println(parameters[2]);
			callback.setFlag(false);
		}
		
		System.out.println(parameters[1]);
		
		callback.setFlag(true);
	}
	
	public static void RunCallback(ICallback callback)
	{
		String[] parameters = new String[3];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Prosze podac nazwe pliku");
		parameters[0] = input.next();
		System.out.println("Prosze podac tresc 'poprawnego' ciagu znakow");
		parameters[1] = input.next();
		System.out.println("Prosze podac tresc 'niepoprawnego' ciagu znakow");
		parameters[2] = input.next();
		
		SaveToFile(parameters, callback);
		
		if(callback.getPath())
		{
			System.out.println("Prosze podac inna nazwe pliku");
			parameters[0] = input.next();
			
			SaveToFile(parameters, callback);
		}
		input.close();
	}
}
