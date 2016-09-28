package Threads;

public class ThreadRun2 {
	   public static void main(String args[]) {
		  String data;
		  
	      SharedData sd = new SharedData();
	      
		  SimpleThread2 T1 = new SimpleThread2( "Thread-1");
	      T1.start();
	      
	      SimpleThread2 T2 = new SimpleThread2( "Thread-2");
	      T2.start();
	      
	      T1.setData(sd);
	      System.out.println("Thread 1 set data value to 4");
	      data = T2.getData(sd);
	      System.out.println("Thread 2 print data value : " + data);
	   }   
	}