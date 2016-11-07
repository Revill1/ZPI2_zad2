import java.io.File;
import java.io.PrintWriter;

public class CallbackAPI 
{
	private static void SaveToFile(String[] parameters, ICallback callback)
	{
		File file = new File(parameters[0]);
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
}
