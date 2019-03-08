package io.indream.configuration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
//@ConfigurationProperties(prefix = "customerdatasource")
public class DataSourceConfiguration {

	@Value("${customer.register.username}")
	private String USERNAME;
	@Value("${customer.register.password}")
	private String PASSWORD;
	@Value("${customer.register.url}")
	private String URL;
	@Value("${customer.register.driver}")
	private String DRIVERCLASS;


	@Bean
	public BasicDataSource getDataSource() {

		BasicDataSource dataSource = new BasicDataSource();

		dataSource.setUsername(USERNAME);
		dataSource.setPassword(PASSWORD);
		dataSource.setDriverClassName(DRIVERCLASS);
		dataSource.setUrl(URL);
		return dataSource;
	}

}
