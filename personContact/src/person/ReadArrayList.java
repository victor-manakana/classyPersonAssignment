/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Pitsi
 */
public class ReadArrayList {
    
    public static void main(String[] args)
    {
        //necessary variables for reading from array list
        String fileName = "personContact.txt";
        String oneLine;
        ArrayList contactList = new ArrayList();
        
        //read the lines of the text into ArrayList
        
        try 
        {
            BufferedReader input = new BufferedReader(new FileReader(fileName));
            if(!input.ready()) //check the file if it can be read NB check this
            {
                throw new IOException();
            }
            
            while((oneLine = input.readLine()) != null)
            {
                contactList.add(oneLine);
            }
            
            input.close(); //after usiong a file close it bro
            
            
        } 
        catch (Exception e) //catch any error or problem
        {
            System.out.println(e);
        }
        
        int aSize = contactList.size();
        for (int i = 0; i < aSize; i++) 
        {
           System.out.println(contactList.get(i).toString()); 
        }
    }
}
