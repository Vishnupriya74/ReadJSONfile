package jsonproject.jsonproject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReaddatafromJSON {

	public static void main(String[] args) throws IOException, ParseException{
		// TODO Auto-generated method stub
JSONParser jsonparser=new JSONParser();
FileReader reader = new FileReader ("jsonfile\\employee.json");
Object obj=jsonparser.parse(reader);
JSONObject empjsonobj=(JSONObject)obj;
String Fname=(String) empjsonobj.get("firstname");
String lname=(String) empjsonobj.get("lastname");
System.out.println("Firstname:"+Fname);
System.out.println("Lastname:"+lname);
JSONArray array=(JSONArray)empjsonobj.get("address");
for(int i=0;i<array.size();i++) {
	JSONObject address=(JSONObject) array.get(i);
	String street=(String)address.get("street");
	String city=(String)address.get("city");
	String state=(String)address.get("state");
	System.out.println("Address of "+i+"is....");
	System.out.println("Street:"+street);
	System.out.println("City:"+city);
	System.out.println("State:"+state);
}
	}

}
