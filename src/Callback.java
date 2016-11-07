import java.util.Scanner;

public class Callback implements ICallback
{

	private boolean flag;
	private boolean changePath;
	
	@Override
	public boolean getFlag() {
		return this.flag;
	}

	@Override
	public boolean getPath() {
		return this.changePath;
	}

	@Override
	public void setFlag(boolean flag) {
		Scanner input = new Scanner(System.in);
		this.flag = flag;
		
		if(flag == false)
		{
			System.out.println("Czy chcesz podac nowa sciezke zapisu pliku y/n");
			String thatIsAQuestion = input.next();
			
			if(thatIsAQuestion.toLowerCase().equals("y"))
			{
				this.changePath = true;
			}
			else
			{
				this.changePath = false;
			}
		}
		
	}

	@Override
	public void setPath(boolean path) {
		this.changePath = path;
		
	}

}
