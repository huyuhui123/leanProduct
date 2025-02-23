package com.huyuhui.leanproduct.framework.spring.base;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Base {
    public static void main(String[] args) {
        
        Resource resource = new ClassPathResource("beans.xml");//xml文件的加载
        BeanFactory factory = new XmlBeanFactory(resource);//
        
        MyBean myBean = (MyBean) factory.getBean("myBean");
        myBean.sayHello();
    }
}