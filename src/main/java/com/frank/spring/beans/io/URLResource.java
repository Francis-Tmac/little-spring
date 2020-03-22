package com.frank.spring.beans.io;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @program: little-spring
 * @description:
 * @author: Francis-Tmac
 * @create: 2020-03-17 08:15
 **/

public class URLResource implements Resource{
    private URL url;

    public URLResource(URL url){
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws Exception {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
