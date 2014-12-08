package com.tear.ioc.bean.xml.document;

import org.dom4j.Document;

/**
 * Created by wanglei on 2014/11/26.
 */
public interface DocumentHolder {
	/**
	 * 根据xml文件的路径得到dom4j里面的Document对象
	 * @param filePath
	 * @return
	 */
	public Document getDocument(String filePath);
}
