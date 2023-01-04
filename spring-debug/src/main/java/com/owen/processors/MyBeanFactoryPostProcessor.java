package com.owen.processors;
/**
 * @Author：Owen
 * @Package：com.owen.processors
 * @Project：spring
 * @name：UserBeanFactoryPostProcessor
 * @Date：2023/1/2 12:42
 * @Filename：UserBeanFactoryPostProcessor
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @since 2023/1/2 12:42
 * @author OwenHuang
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// 获取bean definition
		BeanDefinition userBeanDefinition = beanFactory.getBeanDefinition("teacher");
	}
}
