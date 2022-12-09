package macy_stores;

import java.util.*;

public class create_store {

	public static String[] storeName = { "", "", "", "", "", "", "" };
	public static int[] storeNumber = { 0, 0, 0, 0, 0, 0, 0 };

	public static int i;
	public static int set;
	public static int number = 1, niks, edit, edits, lucban, adds, add;
	public static int slot2;
	String slot1, slot3, slot4, slot5, slot6, slot7;
	public static int eraser, eraserheads;
	public static int storeUpdate, storeAdd, storeDelete, option;

	public void display() {
		
		create_store s1 = new create_store();
		Scanner scan = new Scanner(System.in);
		
				
				System.out.println("------------------Macy's Store Log----------------------");
				System.out.println("--------------------------------------------------------");
				
				Options o1 = new Options();
				o1.main();
	}
	
	public void storeInfo() {
		
		System.out.println("Store Name \t\t Store Number\n");
		
		for (i= 0; i < 2; i++) {
			
			set = i -0;
			System.out.println("("+i+")"+ storeName[set]+"\t\t" + storeNumber[set] + "\n");
		}
	}

}
