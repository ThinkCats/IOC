package com.tear.ioc.bean.create;

import java.util.List;

/**
 * Created by wanglei on 2014/11/30.
 */
public class BeanCreatorImpl implements BeanCreator {
    @Override
    public Object createBeanUseDefaultConstruct(String className) {

        return null;
    }

    @Override
    public Object createBeanUseDefineConstruct(String className, List<Object> args) {
        return null;
    }
}
