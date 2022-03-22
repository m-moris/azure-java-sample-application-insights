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

This sample using java agent. `applicationinsights-agent-3.2.7.jar` 

1. Copy `applicationInsights.sample.json` to `applicationInsights.json`. (file name should be lowercase)
2. Set your instrumentation key.
3. Execute program. `maven clean package spring-boot:run`
4. Check out your Application Insights.

## Related links

[Configuration options - Azure Monitor Application Insights for Java - Azure Monitor | Microsoft Docs](https://docs.microsoft.com/en-us/azure/azure-monitor/app/java-standalone-config)

