package walmart;

import java.io.FileInputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class HttpClientExample {
    public static void main(String[] args) throws Exception {
        // Load SSL certificates
        Path certificatePath = Paths.get("C:/Users/vn537tm/Downloads/payment_token_migration_public.pem");
        Path keyPath = Paths.get("C:/Users/vn537tm/Downloads/payment_token_migration_private.key");
        String keyPassword="WalmartAsda12#";
        X509Certificate certificate = loadCertificate(certificatePath);

        // Load private key (assuming it's in PKCS8 format)
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        try (FileInputStream keyStream = new FileInputStream(keyPath.toFile())) {
            keyStore.load(keyStream, null);
        }
        keyStore.setCertificateEntry("certificate", certificate);

        // Create HttpClient with SSL context
        HttpClient httpClient = HttpClient.newBuilder()
                .sslContext(SSLUtils.createSSLContext(keyStore, keyPassword))
                .build();

        // Prepare the request
        String url = "https://partner.preprod.services.ingenico.com/tokenserver/merchants/AXIS/12321/bulk/tokenize";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .header("Accept", "application/octet-stream")
                .header("ing-Key-Id", "1E08A9")
                .header("ing-iv", "0ezXGkNHk3kAvVTrjCo6UQ==")
                .header("ing-plain-content-length", "42")
                .POST(HttpRequest.BodyPublishers.ofString("[\"f22e47011120e23b1b7325063a003841d2a515547912b81de5da6412620d668876a356ab0325da37dbd186ddbf618f29\"]"))
                .build();

        // Send the request and handle the response
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // Print the response
        System.out.println("Response Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());
    }

    private static X509Certificate loadCertificate(Path certificatePath) throws Exception {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        try (FileInputStream fis = new FileInputStream(certificatePath.toFile())) {
            return (X509Certificate) certificateFactory.generateCertificate(fis);
        }
    }
}

