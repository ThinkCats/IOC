package com.tear.ioc.bean.xml.element;

/**
 * Created by wanglei on 2014/11/27.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 这里我们使用的是组合模式，一个集合元素本身包含了多个叶子元素ref或者value
 * 本身可以不用实现LeafElement但是这里我们为了使CollectionElement和LeafElement
 * 以同样的方式被处理所以我们实现了LeafElement
 * @author rongdi
 */
public class CollectionElement implements LeafElement {

    private String type;
    private List<LeafElement> list;

    public CollectionElement(String type) {
        this.type = type;
    }

    public void add(LeafElement leafElement){
        this.list.add(leafElement);
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public Object getValue() {
        List<Object> value=new ArrayList<Object>();
        for (LeafElement leafElement:list){
            value.add(leafElement.getValue());
        }
        return value.toArray();
    }

    public List<LeafElement> getList() {
        return list;
    }

    public void setList(List<LeafElement> list) {
        this.list = list;
    }
}
