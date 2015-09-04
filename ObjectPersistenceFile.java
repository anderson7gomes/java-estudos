import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class ObjectPersistenceFile implements Serializable {

	transient private int id;
	private String description;

	ObjectPersistenceFile(int id, String description) {
	
		this.id = id;
		this.description = description;		
	
	} // end constructor -- int, String
	
	int getId() {
	
		return id;
	
	} // end getId method

	String getDescription() {
	
		return description;
	
	} // end getDescription method

	public static void main(String[] args) {
	
		ObjectPersistenceFile obj;
	
		System.out.println("Trying persist object");
	
		try (FileOutputStream fOutput = new FileOutputStream("object_persisted.ser");
			 ObjectOutputStream objOutput = new ObjectOutputStream(fOutput)) {
	
			obj = new ObjectPersistenceFile(1, "Yo");
			
			objOutput.writeObject(obj);
			
			System.out.println("Object persisted");
				
		} catch (IOException e) {
		
			System.err.println(e);
			System.exit(1);
			
		}
		
		System.out.println("Trying read object");
		
		try (FileInputStream fInput = new FileInputStream("object_persisted.ser");
			 ObjectInputStream objInput = new ObjectInputStream(fInput)) {
			 
			 obj = (ObjectPersistenceFile) objInput.readObject();
			 
			 System.out.println("Object readed");
			 
			 System.out.printf("\nValue of id: %d\n", obj.getId());
			 System.out.printf("Value of description: %s\n", 
			 		obj.getDescription());

		} catch (ClassNotFoundException e) {
			System.err.println("Class not found: " + e.getMessage());			 
		} catch (IOException e) {
			System.err.println(e);
		}	  	
	
	
	} // end main method

} // end ObjectPersistenceFile class
