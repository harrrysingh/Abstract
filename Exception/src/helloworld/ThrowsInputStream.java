package helloworld;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsInputStream {

		  
	  // declareing the type of exception
	 public static void findFile() throws IOException, FileNotFoundException {

			    // code that may generate IOException
			    File newFile = new File("test.txt");
			    @SuppressWarnings({ "resource", "unused" })
				FileInputStream stream = new FileInputStream(newFile);
			  }

	 public static void main(String[] args) throws FileNotFoundException {
			    try {
			      findFile();
			    }
			    catch (IOException e) {
			      System.out.println(e);
			    }
			  }
			}

