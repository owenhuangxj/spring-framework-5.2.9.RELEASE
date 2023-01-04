package com.owen.entity;

import java.util.Set;

/**
 * @author OwenHuang
 * @since 2023/1/2 21:01
 */
public class Teacher {
	private Long id;
	private String name;
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
