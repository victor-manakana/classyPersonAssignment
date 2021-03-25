package personApp;

import java.util.ArrayList;
import java.util.Arrays;
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
    //Prompt user to input name to search
	Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter Name");
    
    //List of names available
    ArrayList<String> arr = new ArrayList<String>();
    
    System.out.println("First element of the ArrayList: "+arr.get(0));

    String Name = myObj.nextLine();  // Read user input 
    
    //ArrayList <String> arr = new ArrayList<String>();
    System.out.println("Contacts Of Person are ");
    for (String element : arr){
       if (element.contains("Name")){
             System.out.println(element);
       }// Output user input
    }
	}
}
 