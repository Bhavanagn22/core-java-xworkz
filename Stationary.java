 class Stationary{
 static String stationaryItems[] ={null , null , null , null , null , null , null , null};
 static int index;
 public static boolean addStationary(String itemName){
 System.out.println("Invoking addStationaryItems ");
 System.out.println("No of [arameters :1 , type of parameter:String ");
 boolean isAdded = false;
 if(itemName != null){
 if(index < stationaryItems.length){
 
 stationaryItems[index++] = itemName;
 isAdded = true;
 }else{
	 
	 System.out.println("ohh.. elli jaga kaali agide ");
	 
 }
 
 
 }else{
	 
	 System.out.println("Item name can no be null ");
 }
 return isAdded;
 
 }
 
 public static void getAllStationaryItems(){
	 for(String itemName : stationaryItems){
		 System.out.println(itemName);
	 }
 }
  
  public static boolean editStationaryItemName(String updatedItemName , String existingItemName ){
	  System.out.println("Invoking editStationaryItemName ");
	  System.out.println("No pf parameter :1 , tpe of parameter : String , String ");
	  boolean isEdited =false;
	  for(int itemIndex =0; itemIndex < stationaryItems.length; itemIndex++){
		  if(stationaryItems[itemIndex].equals(existingItemName)){
			  stationaryItems[itemIndex] = updatedItemName;
			  isEdited = true;
		  }
	  }
	  return isEdited;
  }
  
  
  public static int deleteStationaryItemName(String deleteItemName ){
	  System.out.println("Invoking editStationaryItemName ");
	  System.out.println("No pf parameter :1 , tpe of parameter : String ");
	  boolean isDeleted =false;
	  int itemIndex;
	  int noOfElements=stationaryItems.length;
	  for(itemIndex =0; itemIndex < stationaryItems.length; itemIndex++){
		  if(stationaryItems[itemIndex].equals(deleteItemName)){
			 break;
		  }

	  }
	  
	  if(itemIndex < noOfElements){
		  noOfElements = noOfElements-1;
   for( int newItemIndex = itemIndex ; newItemIndex < noOfElements ; newItemIndex++){
	    stationaryItems[newItemIndex] = stationaryItems[newItemIndex+1];
		
   }
	  }
	  
	  return noOfElements;
  }

   public static void getAllStationaryItemsPostDeletion(int newLength){
	   for(int itemIndex =0;itemIndex < newLength ; itemIndex++){
		   System.out.println(stationaryItems[itemIndex]);
		   
	   }
   }
 }