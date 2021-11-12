package oops;

import java.util.Scanner;

public class MI extends CellPhone {
	Scanner sc=new Scanner(System.in);
	public void menu() {
		System.out.println();
		System.out.println("1.mms\n2.sms\n3.Phone Dial\n4.About");
		System.out.println();
		System.out.print("enter your choice[1-4]:");
		int choice=sc.nextInt();
	
	
		MI mi=new MI();
		switch(choice) {
		case 1:
			mi.mms();
			break;
		case 2:
			mi.sms();
			break;
		case 3:
			mi.phoneDial();
			break;
		case 4:
			mi.about();
			break;
		
		default:
			System.out.println("You have entered wrong choice,"
					+ "Plsease enter valid choice");
		}


	}
	public void about() {
		System.out.println("Device: Xiomi Mi Ultra\nScreen: 6.80(1440 X 3200)"
				+ "\nCamera feature: Triple\nRear Camera: 50 + 48 + 48 MP\n"
				+ "Front Camera: 20 MP\nMemory: 256 GB \nRAM: 12 GB\n"
				+ "Battery: 5000mAh");
	}


}
