package nl.hodc.rdwlivesync.tools;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")

public class AppProperties {
    private String esserverip;

    public AppProperties() {
    }

    public String getEsserverip() {
        return esserverip;
    }

    public void setEsserverip(String esserverip) {
        this.esserverip = esserverip;
    }

}
