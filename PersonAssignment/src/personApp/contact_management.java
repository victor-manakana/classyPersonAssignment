/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package personApp;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import java.util.regex.*;

	/**
	 *
	 * @author SIHLE
	 */
	public class contact_management
	{

	    /**
	     * @param args the command line arguments
	     */
	    static String FirstName;
	    static String MiddelName;
	    static String LastName;
	    static String Gender;
	    static String DateOfBirth;
	    static String Country;
	    static String City;
	    static String StreetAddress;
	    static String MobileNo;
	    static String HomeNo;
	    static String OfficeNo;
	    static String PersonalEmail;
	    static String WorkEmail;
	    static int counter = 0;

	    static Scanner in = new Scanner(System.in);

	    static List<String[]> contacts = new ArrayList();
	    static String[] person = new String[13];
	    
	    public static void main(String[] args)
	    {
	    	 System.out.println("Please enter contact name");
	         FirstName = in.nextLine();
	         
	         //display
	         String[] person = {""};
	         for (int i = 0; i < person.length; i++) {
	         System.out.println(person[i]); 

	         }
		      }   
	        
	    public static void ContactQuestions()
	    {
	        try
	        {
	            System.out.println("Please enter contact first name");
	            FirstName = in.nextLine();
	            boolean hasName = false;

	            do
	            {
	                while (hasName);
	                for (String[] contact : contacts)
	                {
	                    if (FirstName.toLowerCase() != person[0].toLowerCase())
	                    {
	                        hasName = true;
	                        break;

	                    }
	                }

	                if (hasName == false)
	                {
	                    System.out.println("Contact does not exist, do you want to create new contact ?(y/n)");
	                    String CreateNewContact = in.nextLine();

	                    if (CreateNewContact.toLowerCase().contains("y"))
	                    {
	                        CreateContactQuestions();
	                        hasName= true;
	                    }
	                }
	                else
	                {
	                    counter++;
	                    System.err.println(counter + "/3 tries remaining");
	                    System.out.println("Please re-enter contact first name");
	                    FirstName = in.nextLine();
	                }

	            }
	            while (hasName != true && counter < 3);

	            //display();
	        }
	        catch (Exception e)
	        {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static void CreateContactQuestions()
	    {
	        String regexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
	        String regexNum = "^[0-9]{10}$";
	        String regexName = "^[A-Za-z]{3,25}$";
	        Pattern patternEmail = Pattern.compile(regexEmail);
	        Pattern patternNum = Pattern.compile(regexNum);
	        Pattern patternName = Pattern.compile(regexName);
	        Matcher matcher;

	        matcher = patternNum.matcher(FirstName);
	        while (!matcher.matches())
	        {
	            System.err.println("Only alphabet valid for first name and name must have more than 3 charcaters.\n"+"Please re-enter first name.");
	            FirstName = in.nextLine();
	            matcher = patternName.matcher(FirstName);
	        }
	        person[0] = FirstName;
	        
	        System.out.println("\n Please enter remaining details for the contact \n");

	        System.out.println("Please enter middle name");
	        MiddelName = in.nextLine();
	        person[1] = MiddelName;

	        System.out.println("Please enter last name");
	        LastName = in.nextLine();
	        matcher = patternName.matcher(LastName);
	        while (!matcher.matches())
	        {
	            System.err.println("Only alphabet valid for last name and name must have more than 3 charcaters.\n"+"Please re-enter last name.");
	            LastName = in.nextLine();
	            matcher = patternName.matcher(LastName);
	        }
	        person[2] = LastName;

	        System.out.println("Please enter gender");
	        Gender = in.nextLine();
	        person[3] = Gender;

	        System.out.println("Please enter date of birth");
	        DateOfBirth = in.nextLine();
	        person[4] = DateOfBirth;

	        System.out.println("Please enter the country");
	        Country = in.nextLine();
	        person[5] = Country;

	        System.out.println("Please enter the city");
	        City = in.nextLine();
	        person[6] = City;

	        System.out.println("Please enter the street address");
	        StreetAddress = in.nextLine();
	        person[7] = StreetAddress;

	        System.out.println("Please enter mobile number");
	        MobileNo = in.nextLine();
	        matcher = patternNum.matcher(MobileNo);
	        while (!matcher.matches())
	        {
	            System.err.println("Please enter valid mobile number");
	            MobileNo = in.nextLine();
	            matcher = patternNum.matcher(MobileNo);
	        }
	        person[8] = MobileNo;
	        

	        System.out.println("Please enter home number");
	        HomeNo = in.nextLine();
	        matcher = patternNum.matcher(HomeNo);
	        while (!matcher.matches())
	        {
	            System.err.println("Please enter valid home number");
	            HomeNo = in.nextLine();
	            matcher = patternNum.matcher(HomeNo);
	        }
	        person[9] = HomeNo;

	        System.out.println("Please enter office number");
	        OfficeNo = in.nextLine();
	        matcher = patternNum.matcher(MobileNo);
	        while (!matcher.matches())
	        {
	            System.err.println("Please enter valid office number");
	            OfficeNo = in.nextLine();
	            matcher = patternNum.matcher(MobileNo);
	        }
	        person[10] = OfficeNo;

	        System.out.println("Please enter the personal email");
	        PersonalEmail = in.nextLine();
	        matcher = patternEmail.matcher(PersonalEmail);
	        while (!matcher.matches())
	        {
	            System.err.println("Please enter valid personal email"+"\n"+"eg:john78@gmail.com");
	            PersonalEmail = in.nextLine();
	            matcher = patternEmail.matcher(PersonalEmail);
	        }
	        person[11] = PersonalEmail;

	        System.out.println("Please enter the work email");
	        WorkEmail = in.nextLine();
	        matcher = patternEmail.matcher(WorkEmail);
	        while (!matcher.matches())
	        {
	            System.err.println("Please enter valid work email"+"\n"+"eg:johntalentcentric01@gmail.com");
	            WorkEmail = in.nextLine();
	            matcher = patternEmail.matcher(WorkEmail);
	        }
	        person[12] = WorkEmail;

	        contacts.add(person);
	        //send person to be written to csv
	        

	        for (int i = 0; i < person.length; i++)
	        {
	            if (person[i] == "")
	            {
	                person[i] = "N/a";
	            }
	        }

	    }

	    public static void contactsToArray(String FirstName, String MiddleName, String LastName,
	            String Gender, String DOB, String Country,
	            String City, String StreetAddress, String Mobile,
	            String Home, String Office, String PersonalEmail,
	            String WorkEmail)
	    {
	        for (int i = 0; i < person.length; i++)
	        {
            
        }
	        person[0] = FirstName;
	        person[1] = MiddleName;
	        person[2] = LastName;
	        person[3] = Gender;
	        person[4] = DOB;
	        person[5] = Country;
	        person[6] = City;
	        person[7] = StreetAddress;
	        person[8] = Mobile;
	        person[9] = Home;
	        person[10] = Office;
	        person[11] = PersonalEmail;
	        person[12] = WorkEmail;

	        contacts.add(person);
	    }
	
	
	}


