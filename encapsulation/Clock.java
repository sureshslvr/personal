class Clock 
{
	private int hr;
	private int min;
	private int sec;
	//setter for hr
	public void setHr(int hr){
		if(hr>=1&&hr<=12)
			this.hr=hr;
		else
			System.out.println("idiot please enter the proper time");
	}
	//getter for hr
	public int getHr(){
		return this.hr;
	}
	//setter for min
	public void setMin(int min){
		if(min>=0&&min<=59)
			this.min=min;
		else
			System.out.println("idiot please enter the proper time");
	}
	//getter for min
	public int getMin(){
		return this.min;
	}
	//setter for sec
	public void setSec(int sec){
		if(sec>=0&&sec<=59)
			this.sec=sec;
		else
			System.out.println("idiot please enter the proper time");
	}
	//getter for sec
	public int getSec(){
		return this.sec;
	}

	Clock(int hr,int min,int sec){
		if ((hr>=1&&hr<=12)&&(min>=0&&min<=59)&&(sec>=0&&sec<=59)){
			this.hr=hr;
			this.min=min;
			this.sec=sec;
		}
		else{
			System.out.println("idiot please enter the proper time");
		}
	}
	public void showTime(){
		System.out.println("hour is: "+this.hr+"\nmin is: "+this.min+"\nsec is: "+this.sec);
	}
}
