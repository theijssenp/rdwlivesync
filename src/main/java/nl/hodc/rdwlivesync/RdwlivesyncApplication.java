package nl.hodc.rdwlivesync;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import nl.hodc.rdwlivesync.es.IndexPost;
import nl.hodc.rdwlivesync.rdw.RdwRequestData;
import nl.hodc.rdwlivesync.rdw.RdwResponse;
import nl.hodc.rdwlivesync.tools.Converter;
import nl.hodc.rdwlivesync.tools.AppProperties;

@SpringBootApplication
@RequestMapping("app")
public class RdwlivesyncApplication implements CommandLineRunner {

	@Autowired
	AppProperties myAppProperties;

	@GetMapping("/esserverip")
	public String getEsserverip() {
		return myAppProperties.getEsserverip();
	}

	public static void main(String[] args) {
		while (true) {
			try {
				SpringApplication.run(RdwlivesyncApplication.class, args).close();
			} catch (Exception e) {
				System.out.println("ERROR: " + e);
			}
			try {
				System.out.println("Start sleep for : " + 1000 * 60 * 60 * 24 + " milliseconds");
				Thread.sleep(1000 * 60 * 60 * 24);
			} catch (InterruptedException ex) {
			}
		}
	}

	@Override
	public void run(String... args) throws Exception {

		String esserverip = this.getEsserverip();
		System.out.println(esserverip);
		SimpleDateFormat formatlogger = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date logdate = new Date(System.currentTimeMillis());
		System.out.println("Start " + formatlogger.format(logdate));

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(System.currentTimeMillis());
		LocalDate start = LocalDate.parse(formatter.format(date).toString());
		start = start.minusDays(3);
		LocalDate end = LocalDate.parse(formatter.format(date).toString());

		System.out.println("Start date " + start.toString().replace("-", ""));
		System.out.println("End date " + end.toString().replace("-", ""));

		LocalDate next = start.minusDays(1);
		while ((next = next.plusDays(1)).isBefore(end.plusDays(1))) {
			int i = 0;
			String datumEersteAfgifte = next.toString().replace("-", "");
			System.out.println("Start met : " + datumEersteAfgifte);
			ResponseEntity<String> response = RdwRequestData.getData(datumEersteAfgifte);
			if (response.getStatusCode() == HttpStatus.OK) {
				RdwResponse[] voertuigen = Converter.fromJsonString(response.getBody());
				System.out.println("Aantal gevonden: " + voertuigen.length + " met zoekvraag: " + datumEersteAfgifte);
				for (final RdwResponse voertuig : voertuigen) {
					i++;
					try {
						IndexPost.postRdwEntry(voertuig, voertuig.getKenteken(), esserverip);
						if (mod(i, 250)) {
							System.out.println("Info: " + voertuig.getKenteken() + " overgezet. teller op: " + i);
						}
					} catch (Exception e2) {
						System.out.println("ERROR: " + voertuig.getKenteken() + " Kenteken niet overgezet");
					}
				}
			}
		}
		System.out.println("Done!");
	}

	public static boolean mod(int a, int b) {
		if (a < 0) {
			return false;
		} else if (a == b) {
			return true;
		} else {
			return mod(a - b, b);
		}
	}
}
