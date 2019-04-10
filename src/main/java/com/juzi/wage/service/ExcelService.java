package com.juzi.wage.service;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Excel相关操作
 *
 * @author Juzi
 * @date 2019/4/9 20:55
 * Blog https://juzibiji.top
 */
public interface ExcelService {

    /**
     * 读取excel中的数据
     * @param inputStream  BufferedInputStream输入流
     * @throws IOException
     */
    void read(InputStream inputStream) throws IOException;

}
