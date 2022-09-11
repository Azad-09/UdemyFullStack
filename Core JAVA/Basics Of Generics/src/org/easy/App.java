package org.easy;

class Data {
	private Object object;

	public Data(Object object) {
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	@Override
	public String toString() {
		return "Data [object=" + object + "]";
	}

}

//generic class is good inorder to avoid casting which need more processing time and make the run time slow
class Generics<T> {
	private T data;
	
	public Generics(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Generics [data=" + data + "]";
	}
	
	
}

public class App {

	public static void main(String[] args) {
//		Data class is in the form of object and it is the mother of all class so we can store any type of data inside it
		Data data = new Data("Some String to write");

//		here we cant convert Object to String and for that we need Casting  
		String variable = (String) data.getObject();

		System.out.println(variable);
		
		////////////////////////////////////
		
		
//		Generic class avoid casting and make the process faster and take care of the "Type Casting"
		Generics<String> genericData = new Generics<String>("Radhe Shyam");
		
//		we dont have to do the casting here as we have use the generic class 
		String dataVar = genericData.getData();
		
		System.out.println(dataVar);
	}

}
