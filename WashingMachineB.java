class WashingMachineB{
 static String name="JBL";
 static  int lowRotationSpeed;
 static int mediumRotationSpeed;
 static  int highRotationSpeed=5;
 static boolean isConnected;
    
  //method
   public static boolean onOrOff(){
    System.out.println("Invoking onOrOff()");
	 System.out.println("Parameter" + 0);
	 if(isConnected==false){
	   isConnected = true;
	     System.out.println("WashingMachineB is turned onn..Enjoyy");
	 }else if(isConnected==true){
		 isConnected=false;
		 System.out.println("WashingMachineB is turned off..");
	 }
	 return isConnected;
	}
        		//increaseRotationSpeed
		public static void increaseRotationSpeed(){
			if(isConnected=true){
				if(mediumRotationSpeed<highRotationSpeed){
				mediumRotationSpeed= mediumRotationSpeed+1;
				System.out.println("The Medium Rotation Speed is "+ mediumRotationSpeed );
			}
			else {
				System.out.println("High Rotation Speed is reached");
			}
		}else{
				System.out.println("Hoy..........  WashingMachineB wire Connect madu");
				
			}
			   System.out.println("End of increase Rotation Speed");	
			}
			
		//decreaseRotationSpeed
		public static void decreaseRotationSpeed(){
			//logic
			if(isConnected=true){
				if(mediumRotationSpeed>lowRotationSpeed){
					mediumRotationSpeed= mediumRotationSpeed-1;
					System.out.println("The medium Rotation Speed is "+ mediumRotationSpeed);
				}
			else{
					System.out.println("Low Rotation Speed is reached");
				}
			}else{
					System.out.println("Manga........... WashingMachine decrease madu");
				}
				System.out.println("End of decrease Rotation Speed");
			}
		}