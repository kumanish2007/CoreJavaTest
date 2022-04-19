package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {
	public static void main(String[] args) {
	Course cou1 = new Course(101, "Micros services", 5000l); 
	Student stu = new Student(1, "Manish", 9739787045l, cou1);
    String filename = "file.ser";
      
    // Serialization 
    try
    {   
        //Saving of object in a file
        FileOutputStream file = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(file);
          
        // Method for serialization of object
        out.writeObject(stu);
        out.close();
        file.close();
        System.out.println("Object has been serialized");
    }
    catch(IOException ex)
    {
        System.out.println("IOException is caught :"+ ex);
    }
}
}