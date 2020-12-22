package nl.hodc.rdwlivesync.rdw;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RdwRequestData {
    public static ResponseEntity<String> getData(String datumEersteAfgifte) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        // request op basis van datum_eerste_afgifte_nederland bv 20201218
        String resourceURL = "https://opendata.rdw.nl/resource/m9d7-ebf2.json?$select=*&$limit=100000&$where=datum_eerste_afgifte_nederland+=+'"+ datumEersteAfgifte + "'";

        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, String.class);
        if (response.getStatusCode() != HttpStatus.OK) {
            System.out.println("Status request niet OK bij " + datumEersteAfgifte);
        }
        return response;
    }
}
