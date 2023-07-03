package mavenbatch.tc1;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


//// post http method using jsonobject class & simple format with the help of json.org
public class tc2
{
	public static void main(String[] args) 
	{
		JSONObject js=new JSONObject();
		///js.put("id","09899" );
		js.put("Name","Anupam Raj" );
		js.put("id","09899" );
		js.put("Branch","Sales" );
		js.put("MobileNumber","989932407" );
		js.put("JoiningYear","2017" );
		js.put("PassingYear","2021" );
		
		System.out.println(js);
	
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(js.toString())
		.when()
		.post("http://localhost:3000/Bbastudents");
		System.out.println(res.statusCode());
	}
}
