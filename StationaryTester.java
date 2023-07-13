class StationaryTester{

 public static void main(String tester[]){
   Stationary.addStationary("Books");
   Stationary.addStationary("Pencil");
   Stationary.addStationary("Pen");
   Stationary.addStationary("Eraser");
   Stationary.addStationary("Sketch Pen");
   Stationary.addStationary("Ink Pen");
   Stationary.addStationary("Safety Pin");
   Stationary.addStationary("Calculator");
   
   Stationary.getAllStationaryItems();
   Stationary.editStationaryItemName("Carboard sheet" , "Eraser");
   Stationary.getAllStationaryItems();
   
   int newLength = Stationary.deleteStationaryItemName("Ink Pen");
   System.out.println("Calling getAllStationaryItemsPostDeletion");
   Stationary.getAllStationaryItemsPostDeletion(newLength);
   
   
 
 
 
 }





}