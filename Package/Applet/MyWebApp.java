import java.applet.*;	

public class MyWebApp extends Applet
{
	@Override
      public void destroy()
	{
	System.out.println("destroy");
	}
	@Override
      public void start()
	{
	System.out.println("Start");
	}
	@Override
      public void init()
	{
	System.out.println("Init");
	}
		@Override
      public void stop()
	{
	System.out.println("Stop");
	}



}