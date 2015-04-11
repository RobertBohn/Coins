package com.springapp.mvc.configuration;

import com.springapp.mvc.data.CoinDao;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:application_context.xml"})
@Import({ CoinDao.class })
public class AppConfig {
}
