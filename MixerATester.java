class MixerATester{

public static void main(String test[]){
System.out.println("Main Started");
MixerA.name="";

boolean connected= AC.onOrOff();
System.out.println("Is AC connected"+ connected);
 MixerA.increaseSpeed();
 MixerA.increaseSpeed();
 MixerA.increaseSpeed();
 MixerA.increaseSpeed();
  
 
 boolean connected1= AC.onOrOff();
System.out.println("Is AC connected  "+ connected);
MixerA.decreaseSpeed();
MixerA.decreaseSpeed();
MixerA.decreaseSpeed();
MixerA.decreaseSpeed();
 
    
System.out.println("Main ended");
}
}