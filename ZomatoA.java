class ZomatoA{

    public static double search(String foodName){
	  if("Pizza" == foodName){
	  System.out.println("Searched food name is "+ foodName);
	  return 99.0;
	  }
	  if("Veg Biryani"== foodName){
		  System.out.println("Searched food name is "+ foodName);
	   return 245.90;
	  }
	 
	if("Thali" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 170.00;
	}
     if("Burger" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 288.57;
	}
    if("Kfc chicken" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 500.00;
	}
    if("Rolls" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 360.00;
	}
    if("Samosa" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 50.10;
	}
	if("PavBajji" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 116.00;
	}
	if("Truffles" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 161.91;
	}
	if("Butter Paneer wrap" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 147.62;
	}
	if("Taco Bell" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 85.00;
	}
	if("Noodles" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 135.00;
	}
	if("Baby Corn Manchurian" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 190.00;
	}
	if("Manchow Soup" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 125.00;
	}
	if("Parata" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 75.50;
	}
	if("Dal Makhani" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 295.00;
	}
	if("Sandwich" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 148.00;
	}
	if("Veg Sandwich" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 90.60;
	}
	if("Thandoori" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 366.00;
	}
	if("Idli" == foodName){
		System.out.println("Searched food name is "+ foodName);
		return 60.00;
	}
	return 0.0;
	}
	
	
	public static double search(String foodName, int quantity){
	  if("Pizza" == foodName){
	  System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
	  return 99.0 * quantity;
	  }
	  if("Veg Biryani"== foodName){
		  System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
	   return 245.90 * quantity;
	  }
	 
	if("Thali" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 170.00 * quantity;
	}
     if("Burger" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 288.57 * quantity;
	}
    if("Kfc chicken" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 500.00 * quantity;
	}
    if("Rolls" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 360.00 * quantity;
	}
    if("Samosa" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 50.10 * quantity;
	}
	if("PavBajji" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 116.00 * quantity;
	}
	if("Truffles" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 161.91* quantity;
	}
	if("Butter Paneer wrap" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 147.62* quantity;
	}
	if("Taco Bell" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 85.00 * quantity;
	}
	if("Noodles" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 135.00 * quantity;
	}
	if("Baby Corn Manchurian" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 190.00 * quantity;
	}
	if("Manchow Soup" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 125.00 * quantity;
	}
	if("Parata" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 75.50 * quantity;
	}
	if("Dal Makhani" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 295.00 * quantity;
	}
	if("Sandwich" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 148.00 * quantity;
	}
	if("Veg Sandwich" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 90.60 * quantity;
	}
	if("Thandoori" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 366.00 * quantity;
	}
	if("Idli" == foodName){
		System.out.println("Searched food name is "+ foodName +" and the quantity is "+ quantity);
		return 60.00 * quantity;
	}
	return 0.0;
	}
}