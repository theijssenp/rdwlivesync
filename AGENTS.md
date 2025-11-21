# AGENTS.md

This file provides guidance to agents when working with code in this repository.

## Build & Run

- Build: `./gradlew build`
- Run: `./gradlew bootRun`
- Tests are commented out in build.gradle (lines 27-29)
- Server runs on port 443 (not standard 8080)

## Application Behavior

- **Infinite loop architecture**: Main method runs Spring app in infinite loop with 24-hour sleep between iterations (RdwlivesyncApplication.java:40-51)
- **Date range processing**: Fetches RDW data for last N days (configurable via `app.dagen`, defaults to 3)
- **Date format transformation**: getDatumEersteToelating() reformats YYYYMMDD to DD/MM/YYYY (RdwResponse.java:810-812)
- **String comparison bug**: Uses `==` instead of `.equals()` for string comparison in getEersteKleur() and getTweedeKleur() (RdwResponse.java:741, 756) - **FIXED**
- **Missing Jackson dependency**: Jackson databind dependency missing in build.gradle but used for RDW API deserialization - **FIXED**

## API Integration

- RDW API query uses `datum_tenaamstelling` field (not `datum_eerste_afgifte_nederland` as variable name suggests)
- API limit hardcoded to 100,000 records per request (RdwRequestData.java:20)
- Elasticsearch index name is hardcoded as "rdw" (IndexPost.java:43)

## Configuration

- Elasticsearch server URL configured via `app.esserverip` property (e.g., `https://api.hodc.nl`)
- Days lookback configured via `app.dagen` property

## Dependencies

- Uses old org.json:json:20141113 (not Jackson) for Elasticsearch JSON construction
- Jackson used only for RDW API response deserialization via custom Converter class
- Jackson databind dependency now added to build.gradle

## Critical Improvements Implemented

1. **Fixed string comparison bugs** in RdwResponse.java lines 741 and 756 (now uses `.equals()` instead of `==`)
2. **Added Jackson databind dependency** to build.gradle for proper JSON deserialization
3. **Improved error handling** in IndexPost.java for Elasticsearch connection failures
4. **Added null checks** in date transformation methods to prevent NullPointerException

## Additional Recommendations

1. **Consider adding retry logic** for RDW API calls and Elasticsearch indexing
2. **Add logging framework** instead of System.out.println for better observability
3. **Consider using Spring Boot's RestTemplate configuration** for connection pooling
4. **Add health check endpoints** for monitoring application status
5. **Consider using Elasticsearch bulk API** for better performance with large datasets