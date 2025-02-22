#!/bin/bash
#
# To pass arguments to the JVM, not from the mvn, but to execute them directly
#
# export APPLICATIONINSIGHTS_CONNECTION_STRING=<<you  connection string>>
java -javaagent:./applicationinsights-agent-3.7.0.jar -jar target/plane.sample-1.0-SNAPSHOT.jar 