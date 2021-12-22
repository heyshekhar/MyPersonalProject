package singletonExample;

import java.io.Serializable;

public class SingletonExp extends MyClone implements Serializable{
//public class SingletonExp implements Cloneable{

		private static volatile SingletonExp singletonObj;
		
//		private final static Object obj = new Object();
		
		private SingletonExp() {
			if(singletonObj != null) {
				throw new IllegalStateException("Object can not be created using reflectioin");
			}
		}
			
		
		//this method is used to handle cloning
//		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return singletonObj;
		}

//		@Override
//		protected Object clone() throws CloneNotSupportedException {
//			// TODO Auto-generated method stub
//			return super.clone();
//		}

	//this method is used to solve the serialization issue
	protected Object readResolve() {
		return singletonObj;
	}


	public static SingletonExp getInstance() {
		if(singletonObj==null) {
			synchronized (SingletonExp.class) {
//			synchronized (obj) {
				if(singletonObj == null) {
					singletonObj = new SingletonExp();
				}
			}
		}
		return singletonObj;
	}
}
