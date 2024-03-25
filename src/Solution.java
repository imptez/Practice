// Java program to show the
// use of the function getHost()

import java.net.*;
import java.util.Arrays;

class Solution {
    public static void main(String args[])
    {
        // URI object
        URI uri = null;

        try {
            // create a URI
            uri = new URI("http://sso-profile-az-pqa.walmart.net/profile/api/v1/decrypt?full=y");

            // get the Host
            String host = uri.getHost();

            boolean profile = Arrays.asList(uri.getPath().split("/")).contains("decrypt");

            // display the URI
            System.out.println("URI = " + uri);

            // display the Host
            System.out.println("Host = " + host);

            System.out.println("getFragment = " + profile);
        }
        // if any error occurs
        catch (URISyntaxException e) {
            // display the error
            System.out.println("URI Exception =" + e.getMessage());
        }
    }
}
