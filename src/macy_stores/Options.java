package macy_stores;

import java.util.*;

public class Options extends create_store {

	public void main() {
	
		try {
		Scanner scan = new Scanner(System.in);
		create_store s1 = new create_store();
		
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("(1) View\n(2) Add\n(3)Update\n(4)Delete\n");
		System.out.println("Enter your selection:");
		option = scan.nextInt();
		
		do {
			
			switch(option)
			{
			case 1:System.out.println("\n");
			System.out.println("-------------------------------------------------");
			s1.storeInfo();
			this.main();
			System.out.println("-------------------------------------------------");
			break;
			
			case 2:System.out.println("\n");
			System.out.println("-------------------------------------------------");
			Store_Add add1 = new Store_Add();
			s1.storeInfo();
			add1.Store_Add();
			System.out.println("-------------------------------------------------");
			this.main();
			break;
			
			case 3: System.out.println("\n");
			System.out.println("-------------------------------------------------");
			Store_Update upd1 = new Store_Update();
			s1.storeInfo();
			upd1.Store_Update();
			System.out.println("-------------------------------------------------");
			this.main();
			break;
			
			case 4: System.out.println("\n"); 
			System.out.println("-------------------------------------------------");
			Store_Delete sd1 = new Store_Delete();
			s1.storeInfo();
			sd1.Store_Delete();
			System.out.println("-------------------------------------------------");
			this.main();
			break;
			
			case 5: System.out.println("Invalid Input!");
			this.main();
			System.out.println("Enter One of the Given Selections:");
			System.out.println("-------------------------------------------------");
			default:
			}
			
		} while (option != 7);
		
	}
	catch(InputMismatchException err) {
	System.out.print("Invalid Input");
	
	}
}

}
