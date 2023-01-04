package com.owen.processors;

import com.owen.entity.Teacher;
import com.owen.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.util.MultiValueMap;

/**
 * @author OwenHuang
 * @since 2022/12/29 22:20
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("Bean definition count:" + registry.getBeanDefinitionCount());
		System.out.println("All bean definition:" + registry.getBeanDefinitionNames());
		// getBean方法先查找，如果查找不到会进行创建，所以此处主动调用getBean获取对象时能够 “获取”到指定bean，实际上是没有获取到时进行创建的
		User user = (User) ((ListableBeanFactory) registry).getBean("user");
		System.out.println(user);

		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Teacher.class);
		beanDefinitionBuilder.addPropertyValue("name", "JavaOwen");
		beanDefinitionBuilder.addPropertyValue("id", 10001);
		beanDefinitionBuilder.addPropertyValue("age", 39);
		registry.registerBeanDefinition("teacher", beanDefinitionBuilder.getBeanDefinition());
		RootBeanDefinition teacherBeanDefinition = new RootBeanDefinition(Teacher.class);
		MutablePropertyValues propertyValues = new MutablePropertyValues();
		propertyValues.add("name", "Owen2");
		propertyValues.add( "id", 10002);
		propertyValues.add("age", 100);
		teacherBeanDefinition.setPropertyValues(propertyValues);
		registry.registerBeanDefinition("teacher", teacherBeanDefinition);
	}
}
