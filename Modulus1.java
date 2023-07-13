class Modulus1{
public static void main(String mod[]){
mod(45 , 78 , 3);
mod(23 , 56 , 34);
mod(56 , 12 , 26);
mod(21 , 89 , 45);
mod(43 , 98 , 56);
mod(12 , 67 , 24);
mod(13 , 45 , 33);
mod(32 , 19 , 56);
mod(56 , 67 , 62);
mod(39 , 90 , 49);
}
public static void mod(float a, float b){
System.out.println(a%b);
}
   public static void mod(float a, float b , float c){
   System.out.println(a%b%c);
}
}