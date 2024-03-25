package walmart;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.security.KeyStore;

public class SSLUtils {
    public static SSLContext createSSLContext(KeyStore keyStore, String keyPassword) throws Exception {
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
       //keyManagerFactory.init(keyStore,  keyPassword.toCharArray());
       keyManagerFactory.init(keyStore,  null);

        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(keyManagerFactory.getKeyManagers(), null, null);

        return sslContext;
    }

    public static SSLContext createSSLContext(Path keyPath, String keyPassword) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("Windows-MY");
        try (FileInputStream keyStream = new FileInputStream(keyPath.toFile())) {
            keyStore.load(keyStream, keyPassword.toCharArray());
        }

        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, keyPassword.toCharArray());

        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(keyManagerFactory.getKeyManagers(), null, null);

        return sslContext;
    }
}

