package JavaSummary._2023_09_15.jsonParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

public class JSON {
    public static <JSONObject> void main(String[] args) throws Exception {
        try {
            InputStream inputStream = JSON.class.getResourceAsStream("/ex.json");
            assert inputStream != null;
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }

          //  JSONObject json = new JSONObject(stringBuilder.toString());

           // Map<String, Object> map = json.toMap();

           // for (String key : map.keySet()) {
           //     System.out.println(key + ": " + map.get(key));
           // }

        } catch (Exception e) {
            System.out.println("Error reading or parsing JSON: " + e.getMessage());
        }
    }
}
// todo добавить джейсон и выполнить

//import org.json.JSONObject;
// добавить это в помник
//<dependency>
//            <groupId>org.json</groupId>
//            <artifactId>json</artifactId>
//            <version>20230227</version>
//        </dependency>