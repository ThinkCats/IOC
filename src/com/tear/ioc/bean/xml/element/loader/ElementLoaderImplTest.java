package com.tear.ioc.bean.xml.element.loader;

import com.tear.ioc.bean.xml.document.XmlDocumentHolder;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by wanglei on 2014/11/27.
 */
public class ElementLoaderImplTest {
    XmlDocumentHolder xmlHolder;
    ElementLoader elementLoader;
    @Before
    public void setUp() throws Exception {
        xmlHolder = new XmlDocumentHolder();
        elementLoader = new ElementLoaderImpl();

    }

    @After
    public void tearDown() throws Exception {
        xmlHolder = null;
        elementLoader = null;
    }

    @Test
    public void testAddElements() {
        String filePath = "test/resources/element/ElementLoaderImpl.xml";
        Document document = xmlHolder.getDocument(filePath);
        if (document==null){
            System.out.println("document is not exists");
        }
        elementLoader.addBeanElements(document);
        Element e = elementLoader.getBeanElement("test1");
        if (e == null){
            System.out.println("test1 is not exists");
        }
        for(Iterator iter = elementLoader.getBeanElements().iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
