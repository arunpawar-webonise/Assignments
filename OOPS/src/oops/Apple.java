package oops;

import java.util.Scanner;

public class Apple extends CellPhone {
	Scanner sc=new Scanner(System.in);
	public void menu() {
		System.out.println();
		System.out.println("1.mms\n2.sms\n3.Phone Dial\n4.About");
		System.out.println();
		System.out.print("enter your choice[1-4]:");
		int choice=sc.nextInt();
	
		
		Apple apple=new Apple();
		switch(choice) {
		case 1:
			apple.mms();
			break;
		case 2:
			apple.sms();
			break;
		case 3:
			apple.phoneDial();
			break;
		case 4:
			apple.about();
			break;
		
		default:
			System.out.println("You have entered wrong choice,"
					+ "Plsease enter valid choice");
		}


	}
	public void about() {
		System.out.println("Device: Apple iphone 11 Pro Max\nScreen size: 6.5 inches\n"
				+ "Display Resolution: 2688 X 1242\nStorage Capacity: 64 GB, 256 GB,512 GB\n"
				+ "Sim Slot: Dual Sim\nFront Camera Resolution: 12 MP\n"
				+ "Operating System: iOS\nBody Material: Glass, Stainless Steel\n"
				+ "Battery Capacity: 3969 mAh");
	}


}
