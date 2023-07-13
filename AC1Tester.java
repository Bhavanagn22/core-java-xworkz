class AC1Tester{

public static void main (String test[]){
	 System.out.println("///////////////////////////////////////////////////////////");
System.out.println("main Started");

boolean connected=AC1.onOrOff();
System.out.println("Is AC1 connected"+connected);

AC1.increaseTemperature();
AC1.increaseTemperature();
AC1.increaseTemperature();
AC1.increaseTemperature();
AC1.increaseTemperature();
AC1.increaseTemperature();
AC1.increaseTemperature();

System.out.println("///////////////////////////////////////////////////////////");
boolean connected1=AC1.onOrOff();
System.out.println("Is AC1 connected"+connected1);
AC1.decreaseTemperature();
AC1.decreaseTemperature();
AC1.decreaseTemperature();
AC1.decreaseTemperature();
AC1.decreaseTemperature();
AC1.decreaseTemperature();
AC1.decreaseTemperature();
System.out.println("main ended");

}
}