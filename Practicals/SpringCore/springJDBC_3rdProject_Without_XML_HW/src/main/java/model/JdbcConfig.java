package model;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import studentService.DAO.StudentService_Impl;

@Configuration
public class JdbcConfig {

	@Bean
	public DataSource getDataSourse() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/company", "root", "usman@dbms@sql");
	}

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSourse());
	}

	@Bean
	public StudentService_Impl studentService() {
		return new StudentService_Impl(getJdbcTemplate());
	}
}