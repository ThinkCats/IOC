package com.tear.ioc.xml.document;

import com.tear.ioc.bean.xml.document.XmlDocumentHolder;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class XmlDocumentHolderTest {
	private XmlDocumentHolder xmlHolder;
	@Before
	public void setUp() throws Exception {
		xmlHolder = new XmlDocumentHolder();
	}

	@After
	public void tearDown() throws Exception {
		xmlHolder = null;
	}

	@Test
	public void testGetDocument1() {
		String filePath = "test/resources/document/xmlDocumentHolder.xml";
		Document doc1 = xmlHolder.getDocument(filePath);
		assertNotNull(doc1);
		Element root = doc1.getRootElement();
		assertEquals(root.getName(), "beans");
		Document doc2 = xmlHolder.getDocument(filePath);
		System.out.println(doc1);
		System.out.println(doc1);
		assertEquals(doc1, doc2);
	}

	@Test(expected = DocumentException.class)
	public void testGetDocument2(){
		String filePath = "test/resources/document/xmlDocumentHolder2.xml";
		Document doc = xmlHolder.getDocument(filePath);
	}

	@Test(expected = DocumentException.class)
	public void testGetDocument3() throws DocumentException{
		String filePath = "test/resources/document/xmlDocumentHolder3.xml";
		Document doc = xmlHolder.getDocument(filePath);
	}
}
