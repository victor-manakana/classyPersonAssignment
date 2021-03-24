/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact_management_talent_centric_team1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author SALMAN
 */
public class Contact_Management_Talent_Centric_Team1
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
    static int counter =0;

    static Scanner in = new Scanner(System.in);

    static List<String[]> contacts = new ArrayList();
    static String[] person = new String[13];

    public static void main(String[] args)
    {
//        System.out.println("Please enter contact name");
//         FirstName = in.nextLine();
//        CreateContactQuestions();

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
                    }
                }
                else
                {
                    counter++;
                    System.err.println(counter +"/3 tries remaining");
                    System.out.println("Please re-enter contact first name");
                    FirstName = in.nextLine();
                }

            }while(hasName != true && counter <3 );
            
            //display();
            
        
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void CreateContactQuestions()
    {
        System.out.println("Please enter the following details for the contact");
        person[0] = FirstName;

        System.out.println("Please enter middle name");
        MiddelName = in.nextLine();
        person[1] = MiddelName;

        System.out.println("Please enter last name");
        LastName = in.nextLine();
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
        person[8] = MobileNo;

        System.out.println("Please enter home number");
        HomeNo = in.nextLine();
        person[9] = HomeNo;

        System.out.println("Please enter office number");
        OfficeNo = in.nextLine();
        person[10] = OfficeNo;

        System.out.println("Please enter the personal email");
        PersonalEmail = in.nextLine();
        person[11] = PersonalEmail;

        System.out.println("Please enter the work email");
        WorkEmail = in.nextLine();
        person[12] = WorkEmail;

        contacts.add(person);

        for (int i = 0; i < person.length; i++)
        {
            if (person[i] == "")
            {
                person[i] = "0";
            }
        }

    }
}
