class ChatAngadi{
 
 
 
 
 public static void main(String chat[]){
   String chatNames[]={"Pani Puri","Samosa Masala","Bhel prri"};
 getChatNames(chatNames);
 
 }
  public static void getChatNames(String chatNames[]){
	  System.out.println("Inside getChatNames");
    for(String chatName:chatNames ){
	System.out.println(chatName);
	}
  }
}