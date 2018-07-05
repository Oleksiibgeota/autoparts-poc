package com.enifsoft.autoParts.poc.controler;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class URLConnectionReader {

    public URLConnectionReader() throws IOException, XMLStreamException, URISyntaxException {
        URI uri = new URI("https://tehnomir.com.ua/ws/xml.php?act=GetCurrencies&usr_login=Autounion&usr_passwd=Tvy188&Number=0986479606");
        URL getPrice = new URL(uri.toString());
        InputStream input = getPrice.openStream();
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader r = factory.createXMLStreamReader(uri.toString(), input);


    }
}
