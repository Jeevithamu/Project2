package mysql;
import java.util.Scanner;
import java.sql.*; 


public class Onlineshop {
	public Connection getconn(){ 
		Connection con=null; 
		try{
			String url="jdbc:mysql://localhost:3306/O_shopping"; 
			String username="root"; 
			String pass="root"; 
			con=DriverManager.getConnection(url,username,pass); 
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
		}
	Scanner sc1=new Scanner(System.in); 
	public void user_details() throws SQLException{
        System.out.println("***Please enter user details***");
        Connection con = getconn();
        String s1="insert into user_details(name,address,phone_no) values(?,?,?)";
        PreparedStatement stmt=con.prepareStatement(s1);
        System.out.println("Enter user name : ");
        String name=sc1.nextLine();
        System.out.println("Enter user address : ");
        String address=sc1.nextLine();
        System.out.println("Enter Phone number : ");
        String phone_no=sc1.nextLine();
        stmt.setString(1,name);
        stmt.setString(2, address);
        stmt.setString(3, phone_no);
        int a=stmt.executeUpdate();
        System.out.println("*****User Details entered successfully******");
    }
	
	public void Dress() throws SQLException{ 	
		Connection con = getconn(); 
	       Statement stmt= null; 
	       int flag=1;
	       while(flag==1) {  
	       System.out.println("*#*#*#*#*Search for Products*#*#*#*#*"); 
	      // String Type_of_Dress=sc1.nextLine();
		  // String s1="select * from dress where Name='%"+Type_of_Dress+"%'  ";

			/*String s1="select name from dress where name=?"; 
			PreparedStatement stmt=con.prepareStatement(s1);
			
			stmt.setString(1, Type_of_Dress);*/
	       
	       String s1="SELECT name FROM dress WHERE EXISTS(select name from dress where name = 'aaaa' )";
		   stmt=con.createStatement();
	                
			ResultSet a = stmt.executeQuery(s1);
			
			if (a.next() == false) {
				System.out.println("The Product you searched for is out of stock");
				System.out.println("Please search for any other product");
				System.out.println("If you want to continue searching press y otherwise press n");
				String s = sc1.next();
				if(s.equals("n")) {
							flag=0;
	                        System.out.println("********* THANK YOU , VISIT AGAIN ***********");
				}
			}else{
				System.out.println("The product is available");
				System.out.println("To confirm the order press ---> y");
				System.out.println("To exit press ----------------> n");
				String s = sc1.next();
				if(s.equals("n")) {
					System.out.println("********* THANK YOU , VISIT AGAIN ***********");
					flag=0;
				}else{
				System.out.println("*****ORDER PLACED*****");
				flag=0;
				}
			}
			}// end of while	 



			
		}

	public void Footwear() throws SQLException{ 
		Connection con = getconn(); 
	       Statement stmt= null; 
	       int flag=1;
	       while(flag==1) {  
	       System.out.println("*#*#*#*#*Search for Products*#*#*#*#*"); 
	      // String Type_of_Dress=sc1.nextLine();
		  // String s1="select * from dress where Name='%"+Type_of_Dress+"%'  ";

			/*String s1="select name from dress where name=?"; 
			PreparedStatement stmt=con.prepareStatement(s1);
			
			stmt.setString(1, Type_of_Dress);*/
	       
	       String s1="select name from dress where name = 'Cut_Shoe'" ;
		   stmt=con.createStatement();
	                
		    ResultSet a = stmt.executeQuery(s1);
			
			if (a.next() == false) {
				System.out.println("The Product you searched for is out of stock");
				System.out.println("Please search for any other product");
				System.out.println("If you want to continue searching press y otherwise press n");
				String s = sc1.next();
				if(s.equals("n")) {
							flag=0;
	                        System.out.println("********* THANK YOU , VISIT AGAIN ***********");
				}
			}else{
				System.out.println("The product is available");
				System.out.println("To confirm the order press ---> y");
				System.out.println("To exit press ----------------> n");
				String s = sc1.next();
				if(s.equals("n")) {
					System.out.println("********* THANK YOU , VISIT AGAIN ***********");
					flag=0;
				}else{
				System.out.println("*****ORDER PLACED*****");
				flag=0;
				}
			}
			}// end of while	 



	}
	public void Grocery() throws SQLException{ 
		   Connection con = getconn(); 
	       Statement stmt= null; 
	       int flag=1;
	       while(flag==1) {  
	       System.out.println("*#*#*#*#*Search for Products*#*#*#*#*"); 
	      // String Type_of_Dress=sc1.nextLine();
		  // String s1="select * from dress where Name='%"+Type_of_Dress+"%'  ";

			/*String s1="select name from dress where name=?"; 
			PreparedStatement stmt=con.prepareStatement(s1);
			
			stmt.setString(1, Type_of_Dress);*/
	       
	       String s1="select name from dress where name = 'Orange'" ;
		   stmt=con.createStatement();
	                
			
			ResultSet a = stmt.executeQuery(s1);
			
			if (a.next() == false) {
				System.out.println("The Product you searched for is out of stock");
				System.out.println("Please search for any other product");
				System.out.println("If you want to continue searching press y otherwise press n");
				String s = sc1.next();
				if(s.equals("n")) {
							flag=0;
	                        System.out.println("********* THANK YOU , VISIT AGAIN ***********");
				}
			}else{
				System.out.println("The product is available");
				System.out.println("To confirm the order press ---> y");
				System.out.println("To exit press ----------------> n");
				String s = sc1.next();
				if(s.equals("n")) {
					System.out.println("********* THANK YOU , VISIT AGAIN ***********");
					flag=0;
				}else{
				System.out.println("*****ORDER PLACED*****");
				flag=0;
				}
			}
			}// end of while	 


	}
	
	}
