package com.tear.ioc.bean.xml.element.loader;

import org.dom4j.Document;
import org.dom4j.Element;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2014/11/26.
 */
public class ElementLoaderImpl implements ElementLoader {

    /*
     * 定义一个Map来保存一个Document对象中根节点（beans）下所有Element对象
     * Map的key对应bean元素的id属性，而Map的value对应bean元素
     */
    Map<String,Element> beanElements=new HashMap<String, Element>();

    @Override
    public void addBeanElements(Document document) {
        List<Element> elementList=document.getRootElement().elements();
        /*
         * 将id属性和该元素一起添加到Map中
         */
        for (Element e:elementList){
            String id=e.attributeValue("id");
            this.beanElements.put(id,e);
        }
    }

    @Override
    public Element getBeanElement(String id) {
        /*
         * 根据id从保存所有元素的Map中取出对应的元素
         */
        return beanElements.get(id);
    }

    @Override
    public Collection<Element> getBeanElements() {
        /*
         * 得到保存所有元素的Map中的所有value的集合，也就是所有的元素的集合
         */
        return beanElements.values();
    }
}
