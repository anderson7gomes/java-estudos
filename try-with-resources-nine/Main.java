import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Main {

	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader(new File("file.txt"));
		BufferedReader br = new BufferedReader(fr);
		
		try (fr; br) {
			
			System.out.println(br.readLine());	
			
		}
	
	}

}
