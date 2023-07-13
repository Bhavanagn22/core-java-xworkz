class MixerA{
 static String name="Prestige";
 static  int minSpeed;
 static int currentSpeed;
 static  int maxSpeed=4;
 static boolean isConnected;
    
  //method
   public static boolean onOrOff(){
    System.out.println("Invoking onOrOff()");
	 System.out.println("Parameter" + 0);
	 if(isConnected==false){
	   isConnected = true;
	     System.out.println("Mixer is turned onn..Enjoyy");
	 }else if(isConnected==true){
		 isConnected=false;
		 System.out.println("Mixer is turned off..");
	 }
	 return isConnected;
	}
        		//increaseSpeed
		public static void increaseSpeed(){
			if(isConnected==true){
				if(currentSpeed<maxSpeed){
				currentSpeed= currentSpeed+1;
				System.out.println("The current speed is "+ currentSpeed);
			}
			else {
				System.out.println("Max Speed reached");
			}
		}else{
				System.out.println("Gubee.....Mixer Connect madu");
				
			}
			   System.out.println("End of increase Speed");	
			}
			
		//decreaseSpeed
		public static void decreaseSpeed(){
			//logic
			if(isConnected==true){
				if(currentSpeed>minSpeed){
					currentSpeed= currentSpeed-1;
					System.out.println("The current Speed is "+ currentSpeed);
				}
			else{
					System.out.println("Min Speed reached");
				}
			}else{
					System.out.println("Gubee.....Mixer decrease madu");
				}
				System.out.println("End of decrease Speed");
			}
		}