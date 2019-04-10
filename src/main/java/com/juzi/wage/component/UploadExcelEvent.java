package com.juzi.wage.component;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * 上传Excel存库完成事件
 *
 * @author Juzi
 * @date 2019/4/10 13:39
 * Blog https://juzibiji.top
 */
@Data
public class UploadExcelEvent extends ApplicationEvent {

    private static final long serialVersionUID = 5300814425338944688L;

    /**
     * 读取到的数据
     */
    private List<Object> data;

    public UploadExcelEvent(Object source, List<Object> data) {
        super(source);
        this.data = data;
    }
}
