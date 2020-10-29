package trycatch;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ResourceEx {

	public static void main(String[] args) {
		try( FileReader file = new FileReader("test.txt")){
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}