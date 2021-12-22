package singletonExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

	public static void main(String arg[]) throws CloneNotSupportedException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		SingletonExp singletonExp = SingletonExp.getInstance();
//		System.out.println("hashcode singletonExp : "+singletonExp.hashCode());
//		
//		SingletonExp singletonExp1 = SingletonExp.getInstance();
//		
//		System.out.println("hashcode singletonExp1 : "+singletonExp1.hashCode());
		
		//clone example
		SingletonExp singletonExp = SingletonExp.getInstance();
		System.out.println("hashcode singletonExp : "+singletonExp.hashCode());
		
		SingletonExp singletonExp1 = (SingletonExp)singletonExp.clone();
		
		System.out.println("hashcode singletonExp1 : "+singletonExp1.hashCode());
		
		//serializable
		
//		String fileName = "singletonExample.ser";
//		SingletonExp singletonExp = SingletonExp.getInstance();
//		FileOutputStream file = new FileOutputStream(fileName);
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
//		objectOutputStream.writeObject(singletonExp);
//		objectOutputStream.close();
//		file.close();
//		
//		
//		FileInputStream fileInputStream = new FileInputStream(fileName);
//		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//		SingletonExp singletonExp1 = (SingletonExp)objectInputStream.readObject();
//		objectInputStream.close();
//		fileInputStream.close();
//		
//		
// 		System.out.println("hashcode singletonExp : " + singletonExp.hashCode());
//
//		System.out.println("hashcode singletonExp1 : "+singletonExp1.hashCode());
		
		//reflection
//		SingletonExp singletonExp = SingletonExp.getInstance();
//		System.out.println("hashcode singletonExp : " + singletonExp.hashCode());
//		
//		
//		SingletonExp singletonExp2 = null;
//		Constructor[] singletonExp1 = SingletonExp.class.getDeclaredConstructors();
//		for(Constructor sgl:singletonExp1) {
//			sgl.setAccessible(true);
//			singletonExp2 = (SingletonExp)sgl.newInstance();
//		}
//		System.out.println("hashcode singletonExp2 : "+singletonExp2.hashCode());
		
		
	}
	
}
