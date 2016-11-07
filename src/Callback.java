
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPath(boolean path) {
		this.changePath = path;
		
	}

}
