class Odd implements Runnable
//Run method must be override


{
public void run()
{  
for(int i=0;i<=10;i++)
{
if(i%2!=0)
{
System.out.println(i);
}
try{
Thread.sleep(2000);
}
catch(InterruptedException e)
{

System.out.println(e);
}
}
}
}

class Even implements Runnable
{
public void run()
{  
for(int i=0;i<=10;i++)
{
if(i%2==0)
{
System.out.println(i);
}
try{
Thread.sleep(2000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}

class ThreadTest
{
public static void main(String arg[])
{
Odd o= new Odd();
Even ev= new Even();

Thread t1= new Thread(o);
Thread t2= new Thread(ev);
t1.setName("thread1");
t2.setName("thread2");


 t1.start();
 t2.start();
 }
}
