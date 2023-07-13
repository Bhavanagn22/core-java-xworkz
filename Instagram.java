class Instagram{
  static String logIn;
  
  public static String singUp(String email , String password){
  logIn = email;
  logIn=password;
	System.out.println("enter e-mail");
	
	System.out.println("enter password");
	System.out.println("logIn successfully");
	return logIn;
  }
  public static String signIn(long phoneNo , String password){
     logIn = 9108687592L; ;
logIn =	 password;
   System.out.println("enter phoneNo");
   
   System.out.println("enter password");
   System.out.println("signIn successfully");
   return logIn;
  }
  public static String getSuccessful(){
	  return logIn;
  }
}