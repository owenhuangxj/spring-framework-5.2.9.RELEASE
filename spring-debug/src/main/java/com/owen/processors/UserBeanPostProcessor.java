package com.owen.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author OwenHuang
 * @since 2023/1/2 20:22
 */
public class UserBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
