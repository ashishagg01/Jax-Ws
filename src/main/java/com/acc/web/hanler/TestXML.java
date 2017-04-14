package com.acc.web.hanler;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class TestXML {

    private static Document loadTestDocument(String url) throws Exception {
    	// Create a new trust manager that trust all certificates
    	TrustManager[] trustAllCerts = new TrustManager[]{
    	    new X509TrustManager() {
    	        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
    	            return null;
    	        }
    	        public void checkClientTrusted(
    	            java.security.cert.X509Certificate[] certs, String authType) {
    	        }
    	        public void checkServerTrusted(
    	            java.security.cert.X509Certificate[] certs, String authType) {
    	        }
    	    }
    	};

    	// Activate the new trust manager
    	try {
    	    SSLContext sc = SSLContext.getInstance("SSL");
    	    sc.init(null, trustAllCerts, new java.security.SecureRandom());
    	    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    	} catch (Exception e) {
    	}

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        return factory.newDocumentBuilder().parse(new URL(url).openStream());
    }

    public static void main(String[] args) throws Exception {
        Document doc = loadTestDocument("Users\\ashish.g.agarwal\\Desktop\\Java Dev Assignment\\test2.xml");
        System.out.println(doc);
    }
}