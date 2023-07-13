class GardenTester{
public static void main(String garden[]){
   Garden.addFlower("Rose");
    Garden.addFlower("Iris");
    Garden.addFlower("Lotus");
    Garden.addFlower("Jasmine");

   Garden.fetchflowerNames();

    boolean isUpdated = Garden.updateFlowerName("Iris","Sunflower");
   System.out.println("Is Flower name updated "+ isUpdated);
   Garden.fetchflowerNames();
   
   int newLength = Garden.deleteFlowerName("Lotus");
   System.out.println("Calling getAllFlowerNamesPostDeletion");
   Garden.getAllFlowerNamesPostDeletion(newLength);
   
   
   
   
   
}



}