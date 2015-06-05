
class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing.");
		throw new Exception("oh no!");
	}
	
}

public class App {

	public static void main(String[] args) {
		
		
		
		// An example of try-with-resources
		//  AutoCloseable is a special interface that will
		//  automatically call its method if the implementing
		//  object is defined in a try-with-resources opener
		try(Temp temp = new Temp()) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
