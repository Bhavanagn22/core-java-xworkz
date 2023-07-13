class FaceBookTester{
public static void main(String Facebook[]){
String loginId = "bhavanagn22@gmail.com";
int password = FaceBook.search(loginId);
System.out.println("the password is "+ password);
long passwordWithNumber = FaceBook.search("bhavanagn22@gmail.com" , 9108687592L);
System.out.println("password with phone number is "+ passwordWithNumber);


}

}