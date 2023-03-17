package edu.escuelaing.arep;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        // API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,
        // truststorePassword);
        secure(getKeyStore(), getPdwKeyStore(), null, null);
        port(getPort());
        get("/hello", (req, res) -> "Hello Heroku");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; // returns default port if heroku-port isn't set (i.e. on localhost)
    }

    static String getKeyStore() {
        if (System.getenv("KEYSTORE") != null) {
            return System.getenv("KEYSTORE");
        }
        return "certificados/ecikeystore.p12";
    }

    static String getPdwKeyStore() {
        if (System.getenv("KEYSTOREPDW") != null) {
            return System.getenv("KEYSTOREPDW");
        }
        return "123456";
    }
}
