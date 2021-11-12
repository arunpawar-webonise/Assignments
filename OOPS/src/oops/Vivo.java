package oops;

import java.util.Scanner;

public class Vivo extends CellPhone {
	Scanner sc=new Scanner(System.in);
	public void menu() {
		System.out.println();
		System.out.println("1.mms\n2.sms\n3.Phone Dial\n4.About");
		System.out.println();
		System.out.print("enter your choice[1-4]:");
		int choice=sc.nextInt();
	
		Vivo vivo = new Vivo();
		switch(choice) {
		case 1:
			vivo.mms();
			break;
		case 2:
			vivo.sms();
			break;
		case 3:
			vivo.phoneDial();
			break;
		case 4:
			vivo.about();
			break;
		
		default:
			System.out.println("You have entered wrong choice,"
					+ "Plsease enter valid choice");
		}


	}
	public void about() {
		System.out.println("Device: Vivo Y20G\nScreen Size: 6.5 inches\n"
				+ "Storage Capacity: 64 GB\nOperating System: Android\n"
				+ "Front Camera Resolution: 8 MP\nBroadband Generation: "
				+ "GSM Network\nLens Quality: Triple lense\nRAM: 4 GB\n"
				+ "Security Scanner: FingerPrint Scanner\nSIM Card Size: Nano"
				+ "\nSIM Slots: Dual SIM");
	}


}
