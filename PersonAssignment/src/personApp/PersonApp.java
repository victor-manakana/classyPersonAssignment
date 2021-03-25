package personApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PersonApp {

	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String Gender;
	private Date DOB;
	private String Country;
	private String City;
	private String StreetAddress;
	private int Mobile;
	private int Home;
	private int Office;
	private String PersonalEmail;
	private String WorkEmail;

	public static void main(String[] args) {
	//prompt user to input the name they are looking for 
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Name");

    String Name = myObj.nextLine();  // Read user input
    System.out.println("Available Names are: " + Name);  // Output user input
    
    
   
    ArrayList<String> NameList = new ArrayList<String>();
    System.out.println("First element of the ArrayList: "+NameList.get(0));
    
    System.out.println(NameList);
  } 
	
	}	
 