package edu.escuelaing.arep;

import static spark.Spark.*;
import static edu.escuelaing.arep.URLReader.*;

public class HelloWorld {
    public static void main(String[] args) {
        // API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,
        // truststorePassword);
        secure(getKeyStore(), getPdwKeyStore(), null, null);
        port(getPort());
        get("/hello", (req, res) -> "Hello World");
        get("remote", (req, res) -> readURL(getLink()));
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

    static String getLink() {
        if (System.getenv("LINK") != null) {
            return System.getenv("LINK");
        }
        return "https://ec2-3-83-80-54.compute-1.amazonaws.com:5000/hello";
    }
}
