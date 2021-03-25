/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact_management_talent_centric_team1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

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
    static int counter = 0;

    static Scanner in = new Scanner(System.in);

    static List<String[]> contacts = new ArrayList();
    static String[] person = new String[13];

    public static void main(String[] args)
    {
        readContacts();
        ContactQuestions();
//        for(int i=0;i<contacts.size();i++)
//        {
//            System.out.println("===============New Contact===================");
//            String [] arr = contacts.get(i);
//            for(int j=0;j<arr.length;j++)
//            {
//                System.out.println(arr[j]);
//            } 
//            System.out.println("==================================");
//        }  

//        person[0] = "a";
//        person[1] = "b";
//        person[2] = "c";
//        person[3] = "d";
//        person[4] = "e";
//        writeToContacts(person);
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
               
                for (int i = 0; i < contacts.size(); i++)
                {
                    String[] arrPerson = contacts.get(i);
                    if (FirstName.toLowerCase() != arrPerson[0].toLowerCase())
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
                        hasName = true;
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
            System.err.println("Only alphabet valid for first name and name must have more than 3 charcaters.\n" + "Please re-enter first name.");
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
            System.err.println("Only alphabet valid for last name and name must have more than 3 charcaters.\n" + "Please re-enter last name.");
            LastName = in.nextLine();
            matcher = patternName.matcher(LastName);
        }
        person[2] = LastName;

        System.out.println("Please enter gender \n male,female or other");
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
            System.err.println("Please enter valid personal email" + "\n" + "eg:john78@gmail.com");
            PersonalEmail = in.nextLine();
            matcher = patternEmail.matcher(PersonalEmail);
        }
        person[11] = PersonalEmail;

        System.out.println("Please enter the work email");
        WorkEmail = in.nextLine();
        matcher = patternEmail.matcher(WorkEmail);
        while (!matcher.matches())
        {
            System.err.println("Please enter valid work email" + "\n" + "eg:johntalentcentric01@gmail.com");
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

        writeToContacts(person);

    }

    public static void readContacts()
    {
        try
        {
            File file = new File("Contacts.txt");
            Scanner filesc = new Scanner(file);

            String[] details;
            while (filesc.hasNextLine())
            {
                String currentLine = filesc.nextLine();
                details = currentLine.split(",");

                contacts.add(details);
            }
            filesc.close();
        }
        catch (Exception e)
        {
            System.out.println("Exception:\n" + e);
        }

    }

    public static void writeToContacts(String[] arrPerson)
    {
        try
        {
            FileWriter write = new FileWriter(new File("Contacts.txt"), true);
//            write.append("\n" + arrPerson[0]);
//            write.append(arrPerson[0]);
            String line = "\n" + arrPerson[0];
            for (int i = 1; i < arrPerson.length; i++)
            {
//                write.append(","+arrPerson[i]);
                line += "," + arrPerson[i];
            }
            write.append(line);
            write.close();
        }
        catch (Exception e)
        {
        }

    }

}
