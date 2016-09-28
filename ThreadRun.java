package Threads;

public class ThreadRun {
	   public static void main(String args[]) {
	   
	      SimpleThread T1 = new SimpleThread( "Thread-1");
	      T1.start();
	      
	      SimpleThread T2 = new SimpleThread( "Thread-2");
	      T2.start();
	   }   
	}