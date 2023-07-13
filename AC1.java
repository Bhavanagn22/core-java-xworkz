class AC1{

static String name ="Godrej";
static  int minTemperature;
static  int currentTemperature;
static  int maxTemperature=7;
static boolean isConnected;
//method

public static boolean onOrOff(){
System.out.println("Invoking onOrOff()");
System.out.println("Parameter"+0);

if(isConnected==false){
isConnected=true;
System.out.println("AC1 is Turned onn...enjoy");
}

else if(isConnected==true){
isConnected=false;
System.out.println("AC1is Turned off");
}
return isConnected;
}


//increase volume 

public static void increaseTemperature(){
	
	if(isConnected =true){
	if (currentTemperature<maxTemperature){
		currentTemperature=currentTemperature+1;
		System.out.println("The current temperature is"+currentTemperature);	
	}else {
		System.out.println("max Temperature reached");
	}
	}else{
	System.out.println("hey.... AC1 on madu firstu");
}

}

//decrease Temperature
public static void decreaseTemperature(){
	
if(isConnected = true){
	if (currentTemperature>minTemperature){
		currentTemperature=currentTemperature-1;
		System.out.println("The current temperatureis"+currentTemperature);
		
	}else {
		System.out.println("min Temperature reached");
	}
	}else{
	System.out.println("AC1 turned of...temperature cannot be decreased");
}

}

}
