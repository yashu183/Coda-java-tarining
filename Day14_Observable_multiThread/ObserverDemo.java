package day14;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObserverDemo {
	public static void main(String[] args) {
		FireAlarm fa = new FireAlarm();
		ExecutorService es  = Executors.newFixedThreadPool(2);
		Student s = new Student();
		Teacher t = new Teacher();
		es.execute(()->{
			fa.addObserver(t);
		});
		es.execute(()->{
			fa.addObserver(s);
			fa.setFire();
		});
		//fa.setFire();
		es.shutdown();
	}
}

//class ThreadObservable extends Observable
//{
//
//	@Override
//	public synchronized void addObserver(Observer o) {
//		// TODO Auto-generated method stub
//		super.addObserver(o);
//	}
//
//	@Override
//	public void notifyObservers(Object arg) {
//		// TODO Auto-generated method stub
//		super.notifyObservers((String)arg);
//	}
//	
//}

class FireAlarm extends Observable
{
	public void setFire()
	{
		setChanged();
		notifyObservers("Fire is out... save yourselves.....");
	}
}

class Teacher implements Observer
{
	public void runAway(String s)
	{
		System.out.println("Teacher is thinking.......");
		try {
			Thread.sleep(10000);
		}catch(Exception e) {}
		System.out.println("Teacher starts running....."+" "+s);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		runAway((String)arg);
	}
}

class Student implements Observer
{
	public void runAway(String s)
	{
		System.out.println("Students are running......"+" "+s);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		runAway((String)arg);
	}
}