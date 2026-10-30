# AGENTS.md

Spring Boot RDW sync service. Infinite loop, 24h sleep between iterations.

## Build & Run

- `./gradlew build`
- `./gradlew bootRun`
- Tests commented out in `build.gradle:27-29`
- Port 443 (not 8080)

## Behavior

- Infinite loop: `RdwlivesyncApplication.java:40-51`
- Fetches RDW data for last N days (`app.dagen`, default 3)
- `getDatumEersteToelating()` converts YYYYMMDD → DD/MM/YYYY (`RdwResponse.java:810-812`)
- String comparison `==` bug in `getEersteKleur()`/`getTweedeKleur()` (`RdwResponse.java:741,756`) — **FIXED**
- Jackson databind missing from `build.gradle` — **FIXED**

## API Integration

- RDW query uses `datum_tenaamstelling` (not `datum_eerste_afgifte_nederland` as var name suggests)
- API limit: 100k records/request (`RdwRequestData.java:20`)
- ES index hardcoded as `"rdw"` (`IndexPost.java:43`)

## Config

- `app.esserverip` — ES server URL (e.g. `https://api.hodc.nl`)
- `app.dagen` — days lookback

## Dependencies

- `org.json:json:20141113` for ES JSON construction (not Jackson)
- Jackson for RDW API deserialization via custom `Converter`
- Jackson databind now in `build.gradle`

## Fixes Done

1. `.equals()` instead of `==` for strings (`RdwResponse.java:741,756`)
2. Jackson databind added to `build.gradle`
3. Error handling in `IndexPost.java` for ES connection failures
4. Null checks in date transformation methods

## TODO

- Retry logic for RDW API + ES indexing
- Logging framework (replace `System.out.println`)
- Spring `RestTemplate` config for connection pooling
- Health check endpoints
- ES bulk API for large datasets