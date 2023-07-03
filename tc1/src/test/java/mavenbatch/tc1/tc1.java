package mavenbatch.tc1;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

/// using jsonobject i.e ( { *object notation* } ) class with simple format in org.json way

public class tc1 
{
	public static void main(String[] args) 
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("  http://localhost:3000/Bbastudents");
		
		System.out.println("status code is:"+res.statusCode());
		System.out.println("response data is:");
		System.out.println(res.asPrettyString());
	}
}
