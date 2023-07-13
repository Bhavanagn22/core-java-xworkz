class OvenTester{

public static void main(String test[]){
System.out.println("Main Started");
Oven.name="";

boolean connected= Oven.onOrOff();
System.out.println("Is Oven connected"+ connected);
 Oven.increaseDegree();
 Oven.increaseDegree();
 Oven.increaseDegree();
 Oven.increaseDegree();
 Oven.increaseDegree();
 
  
 
 boolean connected1= Oven.onOrOff();
System.out.println("Is Oven connected  "+ connected);
Oven.decreaseDegree();
Oven.decreaseDegree();
Oven.decreaseDegree();
Oven.decreaseDegree();
Oven.decreaseDegree();
    
System.out.println("Main ended");
}
}