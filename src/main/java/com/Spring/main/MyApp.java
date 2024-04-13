package com.Spring.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.beans.MassageGenerator;

public class MyApp {

	public static void main(String[] args) {
					
			//bean factory object
					
//				ApplicationContext	apctxt=new ClassPathXmlApplicationContext("com/Spring/cfg/MassageGen.xml");
//			    MassageGenerator msgn=apctxt.getBean("msgen",MassageGenerator.class);
		
		         DefaultListableBeanFactory dfb=new DefaultListableBeanFactory();
		         XmlBeanDefinitionReader bdr=new XmlBeanDefinitionReader(dfb);
		         int i=bdr.loadBeanDefinitions("com/Spring/cfg/MassageGen.xml");
		         
		         System.out.println(i);
		         
		         MassageGenerator msgn= dfb.getBean("msgen",MassageGenerator.class);
			
			       String msg=msgn.grtMassage("Akash");
			      System.out.println(msg);
					
				
	}

}
