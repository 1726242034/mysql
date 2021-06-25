package com.xu.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

	@Bean
	public User user(){
		return new User(){{
			setName("小怜");
			setAge(18);
			setEx("test");
		}};
	}

/*
	@Bean
	public JdbcTemplate jdbcTemplate(){
		DruidDataSource dds = new DruidDataSource();
		dds.setUsername("root");
		dds.setPassword("love500");
		dds.setUrl("jdbc:mysql://localhost:3306/dd?useSSL=false&amp;useUnicode=true&amp;characterEncoding=utf8");
		dds.setDriverClassName("com.mysql.cj.jdbc.Driver");

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dds);

		return jdbcTemplate;

	}
*/

}
