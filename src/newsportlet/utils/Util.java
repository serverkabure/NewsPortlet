package newsportlet.utils;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Util {
	public static void main(String[] args) throws Exception {
		Resource resource = new ClassPathResource(
				"/jsf11portlet/utils/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		//
		Integer integer = (Integer) factory.getBean("integer");
		System.out.println(integer);
	}

}
