package oops;

import java.util.Scanner;

public class Samsung extends CellPhone {
	Scanner sc=new Scanner(System.in);
	public void menu() {
		System.out.println();
		System.out.println("1.mms\n2.sms\n3.Phone Dial\n4.Samsung Pay\n5.About");
		System.out.println();
		System.out.print("enter your choice[1-5]:");
		int choice=sc.nextInt();
		Samsung samsung = new Samsung();

		switch(choice) {
		case 1:
			samsung.mms();
			break;
		case 2:
			samsung.sms();
			break;
		case 3:
			samsung.phoneDial();
			break;
		case 4:
			samsung.samsungPay();
			break;
		case 5:
			samsung.about();
			break;
		default:
			System.out.println("You have entered wrong choice,"
					+ "Plsease enter valid choice");
		}


	}

	
	public void samsungPay() {
		     System.out.print("enter name to whome u want to pay:");
		     String name=sc.nextLine();
             System.out.print("enter amount:");
             double amout=sc.nextDouble();
             System.out.print("enter pin:");
             int pin=sc.nextInt();
             System.out.println("You successfully sent "+amout+" to "+ name);
	}

	public void about() {
		System.out.println("Device:Samsung Galaxy S20\nDisplay:6.2 inches"
         		+ "\nSim:Dual Sim\nProcessor:Exynos 990 (7 nm+)\nRam:8GB"
         		+ "\nStorage:128GB"
         		+ "\nFron Camera:12 MP + 64 MP + 12 MP Camera with LED"
         		+ "\nBattery:Non-removalable Li-ion 4000 mAh battery");

	}

}
