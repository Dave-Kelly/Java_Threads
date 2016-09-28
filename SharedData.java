package Threads;

//Simple class to act as a shared data structure between Threads	
public class SharedData 
{
	int sharedInt;

	public SharedData(){
		this(0);
	}
	public SharedData(int inValue){
		sharedInt = inValue;
	}

	public void  setSharedInt(int inInt){
		sharedInt = inInt;
	}
	public int getSharedInt(){
		return sharedInt;
	}

	public String toString(){
		return ""+sharedInt;
	}
}

