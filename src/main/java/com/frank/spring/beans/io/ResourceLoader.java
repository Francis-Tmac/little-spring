package com.frank.spring.beans.io;

import java.net.URL;

/**
 * @program: little-spring
 * @description:
 * @author: Francis-Tmac
 * @create: 2020-03-17 08:12
 **/

public class ResourceLoader {
    public Resource getResource(String location){
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new URLResource(resource);
    }
}
