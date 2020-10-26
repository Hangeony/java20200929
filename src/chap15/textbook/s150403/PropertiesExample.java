package chap15.textbook.s150403;
import java.net.URLDecoder;
import java.util.Properties;
import java.io.FileReader;

public class PropertiesExample  {
	public static void main(String[] args) throws Exception{
//		Map<String, String> map; 
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8"); //한글로 변경하는 코드
		//파일을 읽어서 맵에 설정할 파일(.properties)의 정보를 저장하는것이 목적
		properties.load(new FileReader(path)); //설정명 값을 잘 알아서 읽음
		
		System.out.println(properties.size());
//		Object urlValue =properties.get("url");
		String urlValue=properties.getProperty("url");
		String driver = properties.getProperty("driver");
		String username = properties.getProperty("username");
		String password= properties.getProperty("password");
		
		System.out.println(urlValue);
		System.out.println(driver);
		System.out.println(username);
		System.out.println(password);
	}

}
