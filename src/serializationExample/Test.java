package serializationExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String arg[]) {
		String fileName = "serializationExample.ser";
		//serializationMethod(fileName);
		deserializationMethod(fileName);
       
	}

	private static void serializationMethod(String fileName) {
		SerializableExample serializableExample = new SerializableExample(1, "shekhar",100,10);
		try
        {   
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            // Method for serialization of object
            out.writeObject(serializableExample);
              
            out.close();
            file.close();
              
            System.out.println("Object has been serialized");
            System.out.println("a = " + serializableExample.a);
            System.out.println("b = " + serializableExample.b);
            System.out.println("c = " + serializableExample.c);
            System.out.println("d = " + serializableExample.d);
            
            serializableExample.setD(30);
            serializableExample.setA(30);
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
		
		
		
	}

	private static void deserializationMethod(String fileName) {
		 // Deserialization
		SerializableExample serializableExample1 = null;
        try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);
              
            // Method for deserialization of object
            serializableExample1 = (SerializableExample)in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            System.out.println("a = " + serializableExample1.a);
            System.out.println("b = " + serializableExample1.b);
            System.out.println("c = " + serializableExample1.c);
            System.out.println("d = " + serializableExample1.d);
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
		
	}
}
