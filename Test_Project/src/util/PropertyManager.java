package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
	
	public String NameField = "";
	public String mNameValue = "";
	public String fNameValue = "";
	public String EmailField = "";
	public String fEmailValue = "";
	public String mEmailValue = "";
	public String CheckValue_m = "";
	public String CheckValue_f = "";
	
	public void generateProperty() {
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
			input = new FileInputStream("src/parameters.properties");
			prop.load(input);
			
			NameField = prop.get("name_field").toString();
			mNameValue = prop.get("name_value_m").toString();
			fNameValue = prop.get("name_value_f").toString();
			EmailField = prop.get("email_field").toString();
			fEmailValue = prop.get("email_value_f").toString();
			mEmailValue = prop.get("email_value_m").toString();
			CheckValue_m = prop.get("check_value_m").toString();
			CheckValue_f = prop.get("check_value_f").toString();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
