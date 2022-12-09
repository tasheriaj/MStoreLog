package macy_stores;

import java.util.Scanner;

public class Store_Delete extends create_store {

	public void Store_Delete() {
		create_store s1 = new create_store();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the column you would like to delete:");
		eraser = scan.nextInt();
		eraserheads = eraser-1;
		
		
		if(eraser > 0&& storeNumber[eraserheads] != 0){
		
			storeName[eraserheads] = "Empty";
			storeNumber[eraserheads] = 0 ;
			
			System.out.println("Store has been deleted Successfully!");
		}
		else {
			System.out.println("Try Again");
		}
		}
	
	
	
	
	
	
}
