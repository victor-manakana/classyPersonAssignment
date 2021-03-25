/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact_management_talent_centric_team1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author SALMAN
 */
public class Contact
{

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

    static String currentLine;
    static String[] details;

    static Scanner read;

    static Contact_Management_Talent_Centric_Team1 main = new Contact_Management_Talent_Centric_Team1();

    public static void readContacts()
    {
        try
        {
            //FileWriter fileWriter = new FileWriter(new File("Contacts.txt"));
            read = new Scanner(new File("Contacts.txt"));
            while (read.hasNextLine())
            {
                currentLine = read.nextLine();
                details = currentLine.split(",");
                FirstName = details[0];
                MiddelName = details[1];
                LastName = details[2];
                Gender = details[3];
                City = details[4];
                Country = details[5];
                City = details[6];
                StreetAddress = details[7];
                MobileNo = details[8];
                HomeNo = details[9];
                OfficeNo = details[10];
                PersonalEmail = details[11];
                WorkEmail = details[12];
                
//                main.contactsToArray(FirstName, MiddelName, LastName, Gender, City, Country, City, StreetAddress, MobileNo, HomeNo, OfficeNo, PersonalEmail, WorkEmail);
            }
            read.close();
        }
        catch (Exception e)
        {

        }

    }

}
