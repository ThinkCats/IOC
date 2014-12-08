package com.tear.ioc.bean.xml.autowire;

/**
 * Created by wanglei on 2014/11/27.
 */
public class ByNameAutoWire implements Autowire {

    private String type;

    /*
     * 用一个构造方法保存传入的自动装配的类型值
     */
    public ByNameAutoWire(String type) {
        this.type = type;
    }

    /*
     * 返回传入的需要自动装配的value值
     */
    @Override
    public String getType() {
        return type;
    }
}
