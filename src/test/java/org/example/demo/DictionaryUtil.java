package org.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @ClassName DictionaryUtil
 * @Description TODO
 * @Author Cloud
 * @Date 2021/7/9 10:30
 * @Version 1.0
 **/
@Component
public class DictionaryUtil {
    @Autowired
    private CommonService commonServiceImpl;

    private static DictionaryUtil dicitionaryUtil;

    @PostConstruct
    public void init(){
        dicitionaryUtil = this;
        dicitionaryUtil.commonServiceImpl = this.commonServiceImpl;
    }

    public static void findXx(){
        dicitionaryUtil.commonServiceImpl.find();
    }


}
