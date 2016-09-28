package Threads;

class SimpleThread extends Thread {
	private Thread t;
	private String threadName;

	SimpleThread(String name){
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
	
}

