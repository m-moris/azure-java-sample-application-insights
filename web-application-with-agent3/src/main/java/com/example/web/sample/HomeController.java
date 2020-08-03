
package com.example.web.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private Logger log = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    public String home() {
        log.info("home start");
        String now = jdbcTemplate.queryForObject("SELECT NOW()", String.class);
        return "Hello Application Insights World = " + now;
    }

    // https://github.com/Microsoft/ApplicationInsights-Java/blob/master/azure-application-insights-spring-boot-starter/README.md
}