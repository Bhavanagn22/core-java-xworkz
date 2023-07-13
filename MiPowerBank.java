class MiPowerBank{
   static String connectorType;
    static String brandName;
   static String batteryLife;
   static String frequency;
   static int price;
   static boolean isWireLess;
   

      public static void main(String MiPowerBank[]){
		  
		  connectorType="USB,MicroUSB";
		  brandName="Oneplus";
		  batteryLife="4hours";
	      frequency="100Hz";
		  price=1600;
		  isWireLess= true;
		  
	    System.out.println(" The MiPowerBank Price is "+ price);
		System.out.println(" The MiPowerBank BrandName is "+ brandName);
        System.out.println(" The MiPowerBank Frenquency is "+ frequency);
        System.out.println(" The MiPowerBank BatteryLife is "+ batteryLife);
        System.out.println(" Is MiPowerBank a wireless "+ isWireLess);		
	    System.out.println("The MiPowerBank Connector type is "+ connectorType);
	 }
	  
	  
	  
	 


}