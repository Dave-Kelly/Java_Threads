package Threads;

class SimpleThread2 extends Thread {
	private Thread t;
	private String threadName;

	SimpleThread2(String name){
		threadName = name;
		System.out.println(threadName + " - CREATED NEW THREAD" );
	}
	public void run() {
		System.out.println(threadName + " - EXECUTING"  );
		System.out.println(threadName + " - FINISHED");
	}

	public void start ()
	{
		System.out.println(threadName + " - ALIVE" );
		if (t == null)
		{
			t = new Thread (this, threadName);
			t.start ();
		}
	}
	public void setData(SharedData sd) {
		sd.setSharedInt(4);
		
	}
	public String getData(SharedData sd) {
		return sd.toString();
		
	}

}

