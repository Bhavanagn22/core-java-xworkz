class WashingMachineBTester{

public static void main(String test[]){
System.out.println("Main Statrted");
WashingMachineB.name="";

boolean connected= WashingMachineB.onOrOff();
System.out.println("Is WashingMachineB connected"+ connected);
 WashingMachineB.increaseRotationSpeed();
 WashingMachineB.increaseRotationSpeed();
 WashingMachineB.increaseRotationSpeed();
 WashingMachineB.increaseRotationSpeed();
 
  
 
 boolean connected1= WashingMachineB.onOrOff();
System.out.println("Is WashingMachineB connected  "+ connected);
 WashingMachineB.decreaseRotationSpeed();
 WashingMachineB.decreaseRotationSpeed();
   WashingMachineB.decreaseRotationSpeed();
    WashingMachineB.decreaseRotationSpeed();
  
    
System.out.println("Main ended");
}
}