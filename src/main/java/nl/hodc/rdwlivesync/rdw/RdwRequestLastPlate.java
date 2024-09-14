package nl.hodc.rdwlivesync.rdw;

import java.util.Collections;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RdwRequestLastPlate {

    public static void main(String[] args) throws Exception {

        String out = getLastPlate();
        System.out.println(out);
    }

    public static String getLastPlate() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        String resourceURL = "https://www.rdw.nl/restapi/lukapi/get?vehicle=1";

        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, String.class);
        if (response.getStatusCode() != HttpStatus.OK) {
            System.out.println("Status request niet OK");
        }
        String jsonshit = response.getBody();
        if (jsonshit != null) {
            jsonshit = jsonshit.replace("[{\"vehicle\":\"1\",\"code\":", "");
            jsonshit = jsonshit.replace("}]", "");
            jsonshit = jsonshit.replace("\"", "");
            jsonshit = jsonshit.replace("-", "");
        }
        return jsonshit;
    }
}