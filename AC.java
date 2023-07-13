class AC{
 static String name="Samsung";
 static  int minTemp;
 static int currentTemp;
 static  int maxTemp=7;
 static boolean isConnected;
    
  //method
   public static boolean onOrOff(){
    System.out.println("Invoking onOrOff()");
	 System.out.println("Parameter" + 0);
	 if(isConnected==false){
	   isConnected = true;
	     System.out.println("AC is turned onn..Enjoyy");
	 }else if(isConnected==true){
		 isConnected=false;
		 System.out.println("AC is turned off..");
	 }
	 return isConnected;
	}
        		//increaseTemp
		public static void increaseTemp(){
			if(isConnected==true){
				if(currentTemp<maxTemp){
				currentTemp= currentTemp+1;
				System.out.println("The current Temp is "+ currentTemp);
			}
			else {
				System.out.println("Max Temp reached");
			}
		}else{
				System.out.println("Gubee.....AC Connect madu");
				
			}
			   System.out.println("End of increase Temperature");	
			}
			
		//decreaseTemp
		public static void decreaseTemp(){
			//logic
			if(isConnected==true){
				if(currentTemp>minTemp){
					currentTemp= currentTemp-1;
					System.out.println("The current Temperature is "+ currentTemp);
				}
			else{
					System.out.println("Min Temperature reached");
				}
			}else{
					System.out.println("Gubee.....AC decrease madu");
				}
				System.out.println("End of decrease Temperature");
			}
		}