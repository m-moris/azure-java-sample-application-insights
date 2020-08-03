
package com.example.web.sample;

import com.microsoft.applicationinsights.web.internal.ThreadContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final Logger log = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String home() {

        try {
            log.info("Home start");

            var telemetory = ThreadContext.getRequestTelemetryContext().getHttpRequestTelemetry();
            if (telemetory != null) {
                telemetory.getProperties().put("MyCustomProperty2", "In controller");
            }
            return "Hello Application Insights World";
        } finally {
            log.info("Home finished");
        }
    }
}