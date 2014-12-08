package com.tear.ioc.bean.xml.element;

/**
 * Created by wanglei on 2014/11/27.
 */
public class ValueElement implements LeafElement {

    private Object value;

    public ValueElement(Object value) {
        this.value = value;
    }

    @Override
    public String getType() {
        return "value";
    }

    @Override
    public Object getValue() {
        return this.value;
    }
}
