class HeadPhone{

  // price,isWireLess, brandName, frequency, batteryLife, colour
   
   static int price;
   static String brandName;
   static String frequency;
   static String batteryLife;
   static boolean isWireLess;
   static String colour;
   
     public static void main(String Headphone[]){
		 price=750;
		 brandName="Oneplus";
		 frequency="100Hz";
		 batteryLife="3hours";
		 isWireLess= false;
		 colour= "Red";
		 
	    System.out.println("Head phone Price is "+ price);
		System.out.println("Head phone BrandName is "+ brandName);
        System.out.println("Head phone Frenquency is "+ frequency);
        System.out.println("Head phone BatteryLife is "+ batteryLife);
        System.out.println(" Is Head phone a wireless "+ isWireLess);		
	    System.out.println("Head phone Colour is "+ colour);
	 }
 
 
}