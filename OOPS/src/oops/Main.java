package oops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	private int choice;
	public void mainMenu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Samsung\n2.Nokia\n3.MI\n4.Apple\n5.OPPO\n6.Asus\n7.Vivo");
		System.out.println();
		System.out.print("enter your choice[1-7]:");
	    choice=sc.nextInt();

		switch(choice) {
		case 1:
			Samsung samsung = new Samsung();
			samsung.menu();
			break;
		case 2:
			Nokia nokia = new Nokia();
			nokia.menu();
			break;
		case 3:
			MI mi = new MI();
			mi.menu();
			break;
		case 4:
			Apple apple = new Apple();
			apple.menu();
			break;
		case 5:
			OPPO oppo = new OPPO();
			oppo.menu();
			break;
		case 6:
			Asus asus = new Asus();
			asus.menu();
			break;
		case 7:
			Vivo vivo = new Vivo();
			vivo.menu();
			break;
			
		default:
			System.out.println("You have entered wrong choice,\n"
					+ "Please enter valid choice");

		}
	}

	public static void main(String[] args) {
		Main m=new Main();
		m.mainMenu();
		
}
}
