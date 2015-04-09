package com.springapp.mvc.configuration;

import com.springapp.mvc.data.CoinDao;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ CoinDao.class })
public class AppConfig {
}
