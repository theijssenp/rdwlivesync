package nl.hodc.rdwlivesync.es;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import nl.hodc.rdwlivesync.rdw.RdwResponse;

public class IndexPost {

    public static void postRdwEntry(RdwResponse voertuig, String kenteken , String esserverip) {
        HttpHeaders indexHeader = new HttpHeaders();
        RestTemplate restTemplate = new RestTemplate();
        indexHeader.add("Content-Type", "application/json");

        String jsonString = new JSONObject()
        .put("Kenteken", voertuig.getKenteken())
        .put("Merk", voertuig.getMerk())
        .put("Handelsbenaming",
                voertuig.getHandelsbenaming())
        .put("EersteKleur", voertuig.getEersteKleur())
        .put("TweedeKleur", voertuig.getTweedeKleur())
        .put("DatumEersteToelating",
                voertuig.getDatumEersteToelating())
        .put("Voertuigsoort", voertuig.getVoertuigsoort())
        .put("Inrichting", voertuig.getInrichting())
        .put("message", voertuig.getKenteken() + " "
                + voertuig.getMerk() + " "
                + voertuig.getHandelsbenaming() + " "
                + voertuig.getEersteKleur() + " "
                + voertuig.getTweedeKleur() + " "
                + voertuig.getDatumEersteToelating() + " "
                + voertuig.getVoertuigsoort() + " "
                + voertuig.getInrichting())
        .toString();

        // System.out.println("INFO - Voorbereid index bijwerken " + kenteken);
        HttpEntity<String> entityIndex = new HttpEntity<String>(jsonString, indexHeader);
        String indexURL = esserverip + "/rdw/_doc/" + kenteken;
        ResponseEntity<String> responseIndex = restTemplate.exchange(indexURL, HttpMethod.POST, entityIndex,
                String.class);
        if (responseIndex.getStatusCode() != HttpStatus.CREATED ) {
           // System.out.println("INFO - Status request niet CREATED bij index bijwerken " + kenteken);
        }
    }

}
