/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact_management_talent_centric_team1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    static Scanner in;
    
    static List<String> contacts = new ArrayList();
    static String [] person = new String[12];

    public static void main(String[] args)
    {
        // TODO code application logic here
    }

    public void ContactQuestions()
    {
        try
        {
            System.out.println("Please enter contact name");
            FirstName = in.nextLine();
        }
        catch(Exception e)
        {
            
        }
    }
}
