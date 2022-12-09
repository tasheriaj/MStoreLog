package macy_stores;

import java.util.*;

public class Store_Update extends create_store {

	public void Store_Update() {
		
		Scanner scan = new Scanner(System.in);
		create_store s1 = new create_store();
		
		
		try {
			
			System.out.println("\nEnter the column you would like to update:");
			edit = scan.nextInt();
			System.out.println("\n");
			lucban = 1;
			edits = edit-1;
		}
		catch(Exception error) {
			System.out.println("Invalid Input");
			Store_Update();
		}
		
		
		try {
			
			if(storeNumber[edits] !=0&& edit > 0) {
				
				do {
					
					{
						System.out.println("Enter new store name:");
					slot1 = scan.next();
					System.out.println("Enter new store number:");
					slot2 = scan.nextInt();
					
					if(slot2 < 1) {
						System.out.println("Invalid Input!");
						Store_Update();
						
					}
				}
					if(slot2>0);
					{
						storeName[edits]= slot1;
						storeNumber[edits]= slot2;
						
						System.out.println("Store has been Updated!");
						lucban++;
					}
			}while (lucban<2);
		}
			else {
				System.out.println("Try again!");
			}
		}
			catch(Exception oops) {
				Options oo = new Options();
				System.out.println("Invalid Input!");
				oo.main();
			}
	}
	}


