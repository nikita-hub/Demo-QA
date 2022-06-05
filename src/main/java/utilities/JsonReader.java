package utilities;


import java.io.FileInputStream;
import java.net.URLDecoder;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader {
	protected ObjectMapper objectMapper = null;
	
	public <T> T readJsonAndGetObject(String fileName, Class<T> clazz) {
		try {
			T t = null;
			String path = getClass().getClassLoader().getResource("json/" + fileName).getFile();
			String decodedPath = URLDecoder.decode(path, "UTF-8");
			FileInputStream fis = new FileInputStream(decodedPath);
			objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			objectMapper.setSerializationInclusion(Include.NON_NULL);
			t = objectMapper.readValue(fis, clazz);
			fis.close();
			return t;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}



