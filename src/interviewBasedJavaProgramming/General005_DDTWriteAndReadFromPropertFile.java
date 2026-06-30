package interviewBasedJavaProgramming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class General005_DDTWriteAndReadFromPropertFile {

	public static void main(String[] args) throws IOException {
		File file = new File("./TestData/propertyFile.properties");
		file.createNewFile();
		
		Properties p = new Properties();
		p.put("BrowserName", "Chrome");
		p.put("Environment", "prodQA");
		
		FileOutputStream fos = new FileOutputStream(file);//file hold tha path no need to re write path again
		p.store(fos, "BrowserData");
		
//---------------------------ReadData---------------------------------------------
		FileInputStream fis = new FileInputStream(file);//file hold tha path no need to re write path again
		p.load(fis);
		System.out.println(p.getProperty("BrowserName"));
		System.out.println(p.getProperty("Environment"));
		
	}
}
