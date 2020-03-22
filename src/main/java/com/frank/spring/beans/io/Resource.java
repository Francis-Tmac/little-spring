package com.frank.spring.beans.io;

import java.io.InputStream;

/**
 * @program: little-spring
 * @description:
 * @author: Francis-Tmac
 * @create: 2020-03-17 08:12
 **/

public interface Resource {

    InputStream getInputStream() throws Exception;
}
