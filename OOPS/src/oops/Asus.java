package oops;

import java.util.Scanner;

public class Asus extends CellPhone{
	Scanner sc=new Scanner(System.in);
	public void menu() {
		System.out.println();
		System.out.println("1.mms\n2.sms\n3.Phone Dial\n4.About");
		System.out.println();
		System.out.print("enter your choice[1-4]:");
		int choice=sc.nextInt();
	
	
		Asus asus = new Asus();
		switch(choice) {
		case 1:
			asus.mms();
			break;
		case 2:
			asus.sms();
			break;
		case 3:
			asus.phoneDial();
			break;
		
		case 4:
			asus.about();
			break;
		
		default:
			System.out.println("You have entered wrong choice,"
					+ "Plsease enter valid choice");
		}


	}
	public void about() {
		System.out.println("Device: ASUS ROG Phone 5\nScreen Size: 6.5 inches\n"
				+ "Display Resolution: 1920 X 1080\nOperating System: Android\n"
				+ "Storage Capacity: 16GB, 128 GB, 256 GB\nFront Camera Resolution: 24 MP"
				+ "\nBattery Capacity: 6000 mAh\nBody Material: Glass\nBroadband Generation:5G\n"
				+ "Sim Card Size: Nano\nSIM slot: Dual\nRear Camera Resolution: 64 Mp");
	}


}
