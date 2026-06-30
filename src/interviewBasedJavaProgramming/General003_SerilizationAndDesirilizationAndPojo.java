package interviewBasedJavaProgramming;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class General003_SerilizationAndDesirilizationAndPojo {
	
	private String name;
	private int age;
	
	public General003_SerilizationAndDesirilizationAndPojo(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public General003_SerilizationAndDesirilizationAndPojo() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	//--------------------------------------------serilizaton-------------------------------
	public static String serilization() throws JsonProcessingException {
		General003_SerilizationAndDesirilizationAndPojo pojo= new General003_SerilizationAndDesirilizationAndPojo("name",30);
		ObjectMapper om = new ObjectMapper();
		String jsonData = om.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
		return jsonData;//convert java to jsondata
	}
	
	//----------------------------------Deserilization----------------------------------------
	public static General003_SerilizationAndDesirilizationAndPojo deserilization() throws JsonMappingException, JsonProcessingException {
		String jsondata="{\n" +
	              "  \"name\" : \"name\",\n" +
	              "  \"age\" : 30\n" +
	              "}";
		ObjectMapper  om = new ObjectMapper();
		General003_SerilizationAndDesirilizationAndPojo javaData = om.readValue(jsondata, General003_SerilizationAndDesirilizationAndPojo.class);
		return javaData;//convert jsonString to java Data
	}
	
	//-------------------------------------Execution
	public static void main(String[] args) throws JsonProcessingException {
		System.out.println(serilization());
		System.out.println(deserilization().getAge());
	}
	
	
}
