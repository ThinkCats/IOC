package com.tear.ioc.bean.xml.document;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanglei on 2014/11/26.
 */
public class XmlDocumentHolder implements DocumentHolder {

	/**
	 * 由于可能配置多个配置文件所以定义一个Map类型的成员变量用配置文件的路径关联他们的Document对象
	 * Map的实际类型定义成了HashMap
	 */
	private Map<String,Document> documents=new HashMap<String, Document>();


	/**
	 * 根据文件的路径读取出Document对象，该方法是准备被下面的getDocument方法调用的
	 * 所以定义成了private
	 * @param path
	 * @return
	 */
	private Document readDocument(String path){
        /*
         * new一个带dtd验证的SaxReader对象
         */
		SAXReader reader=new SAXReader(true);
        /*
         * 设置用来验证的dtd的输入源
         */
		reader.setEntityResolver(new XmlEntityResolver());
        /*
         * 根据xml的路径读取出Document对象
         */
		File xmlFile=new File(path);
		try {
			Document document=reader.read(xmlFile);
			return document;
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Document getDocument(String filePath) {
		System.out.println("path:"+filePath);
		Document doc=this.documents.get(filePath);
		if (doc==null){
			//使用SAXReader来读取xml文件
			this.documents.put(filePath,this.readDocument(filePath));
		}
        /*
         * 返回Map中该xml文档路径所对应的Document对象
         */
		return this.documents.get(filePath);
	}
}
