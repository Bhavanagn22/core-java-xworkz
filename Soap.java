class Soap{

   // static
  static String soapName= "Santoor";
  static String type = "Body Wash";
  static int price = 30;
  static String mfgDate = "Jan-26";
  static  String expDate = "Dec-21";
   

// The type is Body Wash


  public static void main(String soap[]){
	  //  local
  
   System.out.println("Main started");
   System.out.println("The soap name is " + soapName);
   System.out.println("The soap Type is "+ type);
   System.out.println("The soap Price is " + price);
   System.out.println("The Soap manufacturing Date is "+ mfgDate);
   System.out.println("The Soap expiry Date "+ expDate);
   System.out.println("Main ended");   
  }


}