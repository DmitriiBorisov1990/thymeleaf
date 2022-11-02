package by.borisov.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"by.borisov.controller"})
@Import({ThymeleafConfig.class, InternationalizationConfig.class})
public class WebConfig {
}
