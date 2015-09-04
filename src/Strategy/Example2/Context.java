package Strategy.Example2;

public class Context {

	public Stretagy stretagy;
	
	public Context(Stretagy stretagy){
		this.stretagy = stretagy;
	}

	public int executestretagy(int value1, int value2)
	{
		return stretagy.doOperation(value1, value2);
		
	}
}
