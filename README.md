# Application Insights Samples for Java.

## Prerequisites

Create an ApplicationInsight on Azure and get the instrumentation key.

## simple-logging

This sample logs information to Application Insight via logback.

1. Copy `logback.sample.xml` to `logback.xml`.
2. Set your insturumantation key.
3. Execute main program.
4. Check out your Application Insights.

## web-application

This sample using `applicationinsights-spring-boot-starter` library.

1. Copy `application.sample.yaml` to `application.yaml`
2. Set your instrumentation key.
3. Execute program. `maven clean package spring-boot:run`
4. Check out your Application Insights.

## web-application-agetnt3

This sample using java agent. `applicationinsights-agent-3.0.0-PREVIEW.5.jar` 

1. Copy `ApplicationInsights.sample.json` to `ApplicationInsights.json`.
2. Set your instrumentation key.
3. Execute program. `maven clean package spring-boot:run`
4. Check out your Application Insights.

## Related links

TODO


