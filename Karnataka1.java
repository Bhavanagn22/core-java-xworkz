class Karnataka1{

static String cityNames[]= {null, null, null,null, null, null, null, null, null, null};
static int index;



public static boolean addCityName(String cityName){
    boolean isAdded=false;
	if(cityNames.length>index){
	if(cityName!= null && cityName.length()>=0){
		cityNames[index]=cityName;
		index++;
		isAdded=true;
	System.out.println("City added "+ isAdded);
	
	
	}else{
	System.out.println("cityName can not be null ");
	
	}
	}else{
		
		System.out.println("Size is full, can not add anymore ");
	}
  return isAdded;


}


  public static void getAllCityNames(){
    System.out.println("Invoking getAllCityNames ");
	System.out.println("List of cityNames available ");
    for(String cityName:cityNames){
	  System.out.println(cityName);
	}
  System.out.println("end of getAllCityNames ");
  }










}