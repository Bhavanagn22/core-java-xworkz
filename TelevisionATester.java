class TelevisionATester{

public static void main(String test[]){
System.out.println("Main Statrted");
TelevisionA.name="";

boolean connected= TelevisionA.onOrOff();
System.out.println("Is Television connected"+ connected);
 TelevisionA.increaseVolume();
 TelevisionA.increaseVolume();
 TelevisionA.increaseVolume();
 TelevisionA.increaseVolume();
  
 
 boolean connected1= TelevisionA.onOrOff();
System.out.println("Is Television connected  "+ connected);
TelevisionA.decreaseVolume();
TelevisionA.decreaseVolume();
TelevisionA.decreaseVolume();
TelevisionA.decreaseVolume();
 
    
System.out.println("Main ended");
}
}