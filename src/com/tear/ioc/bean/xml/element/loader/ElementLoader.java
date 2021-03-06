package com.tear.ioc.bean.xml.element.loader;

import org.dom4j.Document;
import org.dom4j.Element;

import java.util.Collection;

/**
 * Created by wanglei on 2014/11/26.
 */
public interface ElementLoader {
    /*
     * 加入一个Document对象的所有Element
     *
     * @param document
     */
    public void addBeanElements(Document document);

    /*
     * 根据元素的id获得Element对象
     *
     * @param id
     * @return
     */
    public Element getBeanElement(String id);


    /*
     * 返回全部的Element
     *
     * @return
     */
    public Collection<Element> getBeanElements();

}
