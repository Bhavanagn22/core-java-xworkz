class SuperMarketC{

static String vegetables[] = {"Potato" , "Carrot" , "Beans" , "Brinjal" , "Onion"};
     static String biscuits[] = {"Orio","ParleG","HideAndSick","Gimjam","Fab","Tiger","Burbon","Bounce","GoodDay","Mary"};
	 static String perfumes[] = {"Fogg","Yardly","Engage","Max","Signature","Wattagirl","ParkAvenue","Bellavita","Villain","Beardo"};
	 static String groceries[] = {"Salt","Sugar","CookingOil","Chees","Butter","Yogurt","RedMeat","Hairoil","Pulses","Egg"};
	 static String cosmetics[] = {"Facecapsule","Skintoner","Facialkit","BleachCream","MakeupBrush","Comb","CurlingTong","FacePack", "FacePuff","FaceWash","HairStraightner","Waxsheet","Trimmer","Haircaps","HairGel","LactoOil","LorialSeries","Lotion","LotusHerbal","MassageCream","Scrub","MacBrush","Waterspray","Shampoo"};
	 
	 
	   public static void main(String market[]){
	    System.out.println("Main started");
		System.out.println("=======");
		
		System.out.println("List of vegetables are:");
		getvegetables();
		System.out.println("List of biscuits are:");
		getbiscuits();
		System.out.println("List of perfumes are:");
		getperfumes();
		System.out.println("List of groceries are:");
		getgroceries();
		System.out.println("List of cosmetics are:");
		getcosmetics();
		
		
		System.out.println("Main ended");
		}
		
		  //for
		     public static void getvegetables(){
			 System.out.println("Inside getvegetables");
			   for(String vegetable:vegetables ){
				   System.out.println(vegetable);
			   }
			 }
			  public static void getbiscuits(){
				  System.out.println("Inside getbiscuits");
			   for(String biscuit: biscuits ){
				   System.out.println(biscuit);
			   }
			  }
			  
			 public static void getperfumes(){
				  System.out.println("Inside getperfumes");
			   for(String perfume: perfumes ){
				   System.out.println(perfume);
			   }
			  }
			  
			 public static void getgroceries(){
				  System.out.println("Inside getgroceries");
			   for(String grocery: groceries){
				   System.out.println(grocery);
			   }
			  }
			  
			 public static void getcosmetics(){
				  System.out.println("Inside getcosmetics");
			   for(String cosmetic: cosmetics){
				   System.out.println(cosmetic);
			   }
			  }
			  }
			  