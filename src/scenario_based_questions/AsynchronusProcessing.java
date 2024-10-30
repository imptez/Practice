package scenario_based_questions;

public class AsynchronusProcessing {
}
/**
 * Q02. Scenario: If you have a requirement to generate online reports or feed files by pulling out millions of historical records from a database,
 * what questions will you ask, and how will you go about designing it?
 *
 * A02. Designing a system is all about asking the right questions to gather requirements.
 *
 * — Online Vs Offline? Should we restrict the online reports for only last 12 months of data to minimise the report size and to get better performance,
 * and provide reports/feeds for the data older than 12 months via offline processing?
 * For example, Bank statements for last 12 months via online & for transactions older than 12 months via offline asynchronous processing without blocking
 * the customer from browsing rest of the website. Reports can be generated asynchronously and once ready can be emailed or downloaded via a URL at a later time.
 *
 * — What report generation framework to use like Jasper Reports, Open CSV, XSL-FO with Apache FOP, etc depending on the required output formats?
 *
 * — How to handle exceptional scenarios? send an error email, use a monitoring system like Tivoli or Nagios to raise production support tickets on failures, etc?
 *
 * — Security requirements. Are we sending feed/report with PII (i.e. Personally Identifiable Information) data via email?
 * Do we need proper access control to restrict who can generate which online reports? Should we password protect the email attachments?
 * Are there any compliance or regulatory requirements like PCI (i.e. Payment Card Industry), GDPR (i.e. General Data Protection Regulation),
 * ACCC (i.e. Australian Competition and Consumer Commission), etc depending on the jurisdictions served by the application?
 *
 * — Should we schedule the offline reports to run during off peak time? For example, enter all the requests for a report into a “Request” table and
 * then schedule a process to run at say midnight to refer to all pending requests in the “Request” table to generate and store the relevant reports
 * in an outbox for the customers to download. An email can be sent to clients with the report URL to download the report.
 *
 * — Archival and purging straggles of the historical reports.
 * What is the report retention period for the requirements relating to auditing and compliance purpose? How big are the files?
 *
 * Solution: An online application with a requirement to produce time consuming reports or a business process
 * (e.g. re-balancing accounts, aggregating hierarchical information, etc)
 * could benefit from making these long running operations asynchronous.
 * Once the reports or the long running business process is completed,
 * the outcome can be communicated to the user via emails or asynchronously refreshing the web page via techniques known as “
 * server push (JEE Async Servlet)” or “client pull (Refresh meta tag)”. A typical example would be
 *
 * a) A user makes an online request for an aggregate report or a business process like re-balancing his/her portfolios.
 *
 * b) The user request will be saved to a database table for a separate process to periodically pick it up and process it asynchronously.
 *
 * c) The user could now continue to perform other functionality of the website without being blocked.
 *
 * d) A separate process running on the same machine or different machine can periodically scan the table for any entries and
 * produce the necessary reports or execute the relevant business process. This could be a scheduled job that runs once during off-peak or every 10 minutes.
 * This depends on the business requirement.
 *
 * e) Once the report or the process is completed, notify the user via emails or making the report available online to be downloaded.
 */
