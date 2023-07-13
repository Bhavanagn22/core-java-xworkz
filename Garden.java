class Garden{
static String flowerNames[]={null,null,null,null};
static int index;
public static boolean addFlower(String flower){
boolean isAdded = false;
if(flower!=null){
flowerNames[index]=flower;
index++; 
isAdded = true;

}else{
System.out.println("cannot added flower,as it is a null value");

}
return isAdded;
}
public static void fetchflowerNames(){
System.out.println("Invoking fetchflowerNames ");

 for(int flower=0;flower<flowerNames.length;flower++){
String reference =flowerNames[flower];
System.out.println("Accessing flower " + reference +  " at " +  flower );



}
System.out.println("end of fetchflowerNames");
}

   public static boolean updateFlowerName(String existingFlowerName , String updateFlowerName){
	  boolean isUpdated=false;
	  for(int flowerNameIndex=0; flowerNameIndex < flowerNames.length; flowerNameIndex++){
		  if(flowerNames[flowerNameIndex].equals(existingFlowerName)){
			  flowerNames[flowerNameIndex] = updateFlowerName;
			  isUpdated= true;
		  }
	  }
	  return isUpdated;
  }

public static int deleteFlowerName(String  deleteFlowerName){
	  System.out.println("Invoking  deleteFlowerName");
	  System.out.println("No pf parameter :1 , tpe of parameter : String ");
	  boolean isDeleted =false;
	  int flowerNameIndex;
	  int noOfElements=flowerNames.length;
	  for(flowerNameIndex =0; flowerNameIndex < flowerNames.length; flowerNameIndex++){
		  if(flowerNames[flowerNameIndex].equals(deleteFlowerName)){
			 break;
		  }

	  }
	  
	  if(flowerNameIndex < noOfElements){
		  noOfElements = noOfElements-1;
   for( int newFlowerNameIndex = flowerNameIndex ; newFlowerNameIndex < noOfElements ; newFlowerNameIndex++){
	    flowerNames[newFlowerNameIndex] = flowerNames[newFlowerNameIndex+1];
		
   }
	  }
	  
	  return noOfElements;
  }

   public static void getAllFlowerNamesPostDeletion(int newLength){
	   for(int flowerNameIndex =0;flowerNameIndex < newLength ; flowerNameIndex++){
		   System.out.println(flowerNames[flowerNameIndex]);
		   
	   }
   }
}