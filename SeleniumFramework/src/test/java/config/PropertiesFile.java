package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.test1_GoogleSearch_TestNG;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties() {
		try {
			FileInputStream input = new FileInputStream(projectPath +"/src/test/java/config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			test1_GoogleSearch_TestNG.browserName = browser;
		}

		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream(projectPath +"/src/test/java/config/config.properties\\"); 
			prop.setProperty("result", "pass");
			prop.store(output, null);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

}
