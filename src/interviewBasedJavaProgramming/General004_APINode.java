package interviewBasedJavaProgramming;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class General004_APINode {
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String jsonData = "{\r\n" + "  \"name\": \"xyz\",\r\n" + "  \"age\": 23,\r\n" + "  \"address\": {\r\n"
				+ "    \"city\": \"Bangalore\",\r\n" + "    \"state\": \"Karnataka\",\r\n" + "    \"company\": {\r\n"
				+ "      \"name\": \"TCS\",\r\n" + "      \"location\": {\r\n" + "        \"floor\": 5,\r\n"
				+ "        \"building\": \"A Block\"\r\n" + "      }\r\n" + "    }\r\n" + "  }\r\n" + "}";
		ObjectMapper om = new ObjectMapper();
		JsonNode jsonNode = om.readTree(jsonData);
		JsonNode company = jsonNode.get("address").get("city");
		System.out.println(company);
		
	}
}
