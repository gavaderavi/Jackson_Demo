import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class TestClass {

	public static void main(String[] args) {
		String inputJson = "{ \"employee\":{ \"name\": \"sonoo\", \"salary\":56000}}";

		ObjectMapper mapper = new ObjectMapper();

		try {
			MainParser parser = mapper.readValue(inputJson, MainParser.class);

			System.out.println(parser.getEmployee().getName() + " " + parser.getEmployee().getSalary());

			String jsonStr = mapper.writeValueAsString(parser);
			System.out.println(jsonStr);

		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
