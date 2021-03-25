/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import javafx.beans.binding.Bindings;
import javax.swing.JOptionPane;

public class WriteArrayList {
    //variables needed

public static void main(String[] args)
{
    File fileName = new File("personContact.txt"); //file name
    ArrayList contactList = new ArrayList();
    String FirstName = " ";
    String MiddleName = " ";
    String LastName = " ";
    String Gender = " ";
    String DateOfBirth = " ";
    String Country = " ";
    String City = " ";
    String StreetAddress = " ";
    String MobileNo = " ";
    String HomeNo = " ";
    String OfficeNo = " ";
    String PersonalEmail = " ";
    String WorkEmail = " ";
    
    
    //user enter the details
    while (!FirstName.isEmpty())
    {
       FirstName = JOptionPane.showInputDialog("Enter First Name");
       if (!FirstName.isEmpty()) contactList.add(FirstName);
    }
    
    while (!MiddleName.isEmpty())
    {
       MiddleName = JOptionPane.showInputDialog("Enter Middle Name");
       if (!MiddleName.isEmpty()) contactList.add(MiddleName);
    }
    
    while (!LastName.isEmpty())
    {
       LastName = JOptionPane.showInputDialog("Enter Last Name");
       if (!LastName.isEmpty()) contactList.add(LastName);
    }
    
    while (!Gender.isEmpty())
    {
       Gender = JOptionPane.showInputDialog("Enter Gender");
       if (!Gender.isEmpty()) contactList.add(Gender);
    }
    
    while (!DateOfBirth.isEmpty())
    {
       DateOfBirth = JOptionPane.showInputDialog("Enter Date of Birth (eg 01/12/2021)");
       if (!DateOfBirth.isEmpty()) contactList.add(DateOfBirth);
    }
    
    while (!Country.isEmpty())
    {
       Country = JOptionPane.showInputDialog("Enter Country");
       if (!Country.isEmpty()) contactList.add(Country);
    }
    
    while (!City.isEmpty())
    {
       City = JOptionPane.showInputDialog("Enter City");
       if (!City.isEmpty()) contactList.add(City);
    }
    
    while (!StreetAddress.isEmpty())
    {
       StreetAddress = JOptionPane.showInputDialog("Enter Street Address");
       if (!StreetAddress.isEmpty()) contactList.add(StreetAddress);
    }
    
    while (!MobileNo.isEmpty())
    {
       MobileNo = JOptionPane.showInputDialog("Enter Mobile Number");
       if (!MobileNo.isEmpty()) contactList.add(MobileNo);
    }
    
    while (!HomeNo.isEmpty())
    {
       HomeNo = JOptionPane.showInputDialog("Enter Home Number");
       if (!HomeNo.isEmpty()) contactList.add(HomeNo);
    }
    
    while (!OfficeNo.isEmpty())
    {
       OfficeNo = JOptionPane.showInputDialog("Enter Office Number");
       if (!OfficeNo.isEmpty()) contactList.add(OfficeNo);
    }
    
    while (!PersonalEmail.isEmpty())
    {
       PersonalEmail = JOptionPane.showInputDialog("Enter Person Email");
       if (!PersonalEmail.isEmpty()) contactList.add(PersonalEmail);
    }
    
    while (!WorkEmail.isEmpty())
    {
       WorkEmail = JOptionPane.showInputDialog("Enter Work Email");
       if (!WorkEmail.isEmpty()) contactList.add(WorkEmail);
    }
    
    
    //write the details of a person to a file
    try
    {
      FileWriter fw = new FileWriter(fileName);
      Writer output = new BufferedWriter(fw);
      int aSize = contactList.size();
      
      for(int i=0; i<aSize; i++)
      {
          output.write(contactList.get(i).toString() + "\n");    
      }
      
      output.close();
            
    }catch(Exception e)
    {
      JOptionPane.showInputDialog(null, "File could not be created.");
    }
    
    
}}
