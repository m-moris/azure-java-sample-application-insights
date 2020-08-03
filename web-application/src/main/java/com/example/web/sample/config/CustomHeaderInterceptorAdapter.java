package com.example.web.sample.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.microsoft.applicationinsights.web.internal.RequestTelemetryContext;
import com.microsoft.applicationinsights.web.internal.ThreadContext;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CustomHeaderInterceptorAdapter extends HandlerInterceptorAdapter {

    private static String HEADER = "X-MyHeader";

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) throws Exception {

        try {

            // Get current request telemetry in current context and set some custom
            // properties.

            RequestTelemetryContext context = ThreadContext.getRequestTelemetryContext();

            if (context == null) {
                return true;
            }

            // Set my custom property
            context.getHttpRequestTelemetry().getProperties().put("MyCustomProperty1", "In interceptor");

            String value = request.getHeader(HEADER);

            if (value == null) {
                return true;
            }

            // Set some request header
            context.getHttpRequestTelemetry().getProperties().put(HEADER, value);

        } catch (Exception e) {
        }

        return true;
    }
}