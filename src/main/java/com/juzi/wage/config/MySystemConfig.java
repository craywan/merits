package com.juzi.wage.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.system.ApplicationHome;

import java.io.File;

/**
 * 配置
 *
 * @author Juzi
 * @date 2019/4/10 17:46
 * Blog https://juzibiji.top
 */
@Data
@ConfigurationProperties(prefix = "juzi.system")
public class MySystemConfig {

    /**
     * jar文件目录
     */
    private String applicationHomePath;

    public MySystemConfig() {
        ApplicationHome h = new ApplicationHome(getClass());
        File jarFile = h.getSource();
        this.applicationHomePath = jarFile.getParentFile().toString();
    }
}
