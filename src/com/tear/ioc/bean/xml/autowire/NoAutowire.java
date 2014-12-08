package com.tear.ioc.bean.xml.autowire;

/**
 * Created by wanglei on 2014/11/27.
 */
public class NoAutowire implements Autowire{

    private String type;

    public NoAutowire(String type) {
        this.type = type;
    }

    /*
     * 直接返回no，表示不需要自动装配
     */
    @Override
    public String getType() {
        return "no";
    }
}
