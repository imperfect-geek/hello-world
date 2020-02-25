class demo 
{
	static void se(int hr,int min)
	{

		for(int s=0;s<5;s++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(hr+":"+min+":"+s);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	static void mi(int hr)
	{
		try
		{
			for(int m=0;m<5;m++)
			{
			
				for(int s=0;s<5;s++)
				{
					Thread.sleep(1000);
				System.out.println(hr+":"+m+":"+s);
			
				}
				//Thread.sleep(1000);
				//System.out.println(hr+":"+m+":"+s);
			
			
			}
		}	
		catch(Exception e)
			{
				e.printStackTrace();
			}
	}

	public static void run()
	{	int hr=0,min=0;
		for(int sec=0;sec<=5;sec++)
		try
			{
							if(sec==5)
							{
								sec=0;
								for(min=1;min<=5;min++)
								{	
									if(min==5)
									{
										min=0;sec=0;
										for(hr=1;hr<5;hr++)
											{
												//Thread.sleep(1000);
                          						//System.out.println(hr+":"+min+":"+sec); 
                          						if(hr==5)
                          							break;
                          						demo.mi(hr);

											}
									}
									//Thread.sleep(1000);
                         			//System.out.println(hr+":"+min+":"+sec); 
                         			 demo.se(hr,min);

								}	
							}
                 Thread.sleep(1000);
                 System.out.println(hr+":"+min+":"+sec);                        
			}
                 catch(Exception e)
                        {
                           e.printStackTrace();
                        }
	}
public static void main(String g[])
	{
		
		demo.run();
	}
}