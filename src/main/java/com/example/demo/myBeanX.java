package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class myBeanX implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
			if(bean.getClass().getPackageName().contains("com.example.demo")) {
				System.out.println("mi B E A N S: "+ beanName);
			}
			return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(!bean.getClass().getPackageName().contains("com.example.demo")) {
			System.out.println("Spring B E A N S: "+ beanName);
		}
		return bean;
	}
	
	
	
}
