package mysql;

import java.sql.SQLException;
import java.util.Scanner;


public class Orders {
	public static void main(String[] args) throws SQLException {
		String p="y";
		String s="y";
		String username,password;
		outer:while(p.equals("y")) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("............Welcome to Online Shopping...........");
		System.out.println("please Enter the Login Details");
		System.out.println("Enter Admin name : ");
		username=sc1.nextLine();
		System.out.println("Enter Admin password:");
		password=sc1.nextLine();
		if(username.equals("Jeevitha")&&password.equals("Jeevi@123"))
		{
		System.out.println("Your authentication is successfull");
		Onlineshop od=new Onlineshop();
		od.user_details();
		while(s.equals("y")) {
		System.out.println("Products available are here: Please click any of the number to select what you need");
		System.out.println("Press 1 to Dress ");
		System.out.println("Press 2 to Footwear ");
		System.out.println("Press 3 to Grocery ");
		System.out.println("Press 4 to exit");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 1:
	    od.Dress();
		break;
		case 2:
		od.Footwear();
        break;
		case 3:
		od.Grocery();
        break;
		case 4:
		System.exit(0);
        break;
	}
        System.out.println("If you want to continue then press y otherwise press n");
        s=sc.next();
		if(s.equals("n")) {
		System.out.println("*********placed order***********");
         break outer;
		}
		}
       }
		else {
		System.out.println("Invalid please place the order correctly");
		Scanner sc2=new Scanner(System.in);
		p=sc2.next();
		}
	}
	}
}

	

	
