class ACTester{

public static void main(String test[]){
System.out.println("Main Started");
AC.name="";

boolean connected= AC.onOrOff();
System.out.println("Is AC connected"+ connected);
 AC.increaseTemp();
 AC.increaseTemp();
 AC.increaseTemp();
 AC.increaseTemp();
  
 
 boolean connected1= AC.onOrOff();
System.out.println("Is AC connected  "+ connected);
AC.decreaseTemp();
AC.decreaseTemp();
AC.decreaseTemp();
AC.decreaseTemp();
 
    
System.out.println("Main ended");
}
}