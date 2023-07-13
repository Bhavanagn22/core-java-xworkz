class TelevisionA{
 static String name="JBL";
 static  int lowVolume;
 static int currentVolume;
 static  int highVolume=7;
 static boolean isConnected;
    
  //method
   public static boolean onOrOff(){
    System.out.println("Invoking onOrOff()");
	 System.out.println("Parameter" + 0);
	 if(isConnected=false){
	   isConnected = true;
	     System.out.println("Television is turned onn..Enjoyy");
	 }else if(isConnected==true){
		 isConnected=false;
		 System.out.println("Television is turned off..");
	 }
	 return isConnected;
	}
        		//increaseVolume
		public static void increaseVolume(){
			if(isConnected=true){
				if(currentVolume<highVolume){
				currentVolume= currentVolume+1;
				System.out.println("The current Volume is "+ currentVolume);
			}
			else {
				System.out.println("High Volume reached");
			}
		}else{
				System.out.println("Gubee.....Television Connect madu");
				
			}
			   System.out.println("End of increase volume");	
			}
			
		//decreaseVolume
		public static void decreaseVolume(){
			//logic
			if(isConnected=true){
				if(currentVolume>lowVolume){
					currentVolume= currentVolume-1;
					System.out.println("The current Volume is "+ currentVolume);
				}
			else{
					System.out.println("Low Volume reached");
				}
			}else{
					System.out.println("Gubee.....Television decrease madu");
				}
				System.out.println("End of decrease volume");
			}
		}
