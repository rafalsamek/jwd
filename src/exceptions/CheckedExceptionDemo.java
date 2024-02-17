package exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionDemo ced = new CheckedExceptionDemo();
        ced.urlTesterByTryCatch("htttp://wszib.edu.pl");
        ced.urlTesterByThrows("htttp://wszib.edu.pl");
    }

    public void urlTesterByTryCatch(String urlStr) {
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("Błąd, szczegóły: " + e.getMessage());
        }
    }

    public void urlTesterByThrows(String urlStr) throws MalformedURLException {
        URL url = new URL(urlStr);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }
}
