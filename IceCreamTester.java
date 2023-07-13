class IceCreamTester{

 public static void main(String ice[]){
       IceCream.saveFlavors("venilla");
       IceCream.saveFlavors("chocolate");
       IceCream.saveFlavors("straberry");
       IceCream.saveFlavors("butterscotch");
       IceCream.saveFlavors("Teaberry");
       IceCream.saveFlavors("Butter pecan");
       IceCream.saveFlavors("eggno");
	   
	   
       IceCream.fetchFlavors();

   boolean isUpdated = IceCream.updateFlavor("eggno","Black Cherry");
   System.out.println("Is flavor name updated "+ isUpdated);
   IceCream.fetchFlavors();
   
   int newLength = IceCream.deleteFlavor("straberry");
   System.out.println("Calling getAllFlavorsPostDeletion");
   IceCream.getAllFlavorsPostDeletion(newLength);
   
}

}