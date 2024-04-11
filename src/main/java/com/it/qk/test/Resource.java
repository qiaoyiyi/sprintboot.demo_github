package com.it.qk.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 使用Spring Boot 的注解将配置文件中的属性与bean中的属性一一对应，类的名称要与配置文件中的对应
 * @author Administrator
 *
 */
@Configuration
@ConfigurationProperties(prefix="com.sinosoft.opensource")
@PropertySource(value="classpath:resource.properties")
public class Resource {

	private String name;
	private String website;
	private String language;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
