package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readproperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader fr= new FileReader("D:\\Automationtesting\\framework of Demo-QA\\DemoQA\\src\\test\\resources\\configfiles\\ webdriver.properties");
	Properties p= new Properties();
	p.load(fr);
	
	}

}
