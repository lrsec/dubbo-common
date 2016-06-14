#!/bin/bash
mvn clean package -Dmaven.test.skip
cd target
mvn deploy:deploy-file -DgroupId=com.immomo.live -DartifactId=live-dubbo-common -Dversion=1.1.0-SNAPSHOT -Dpackaging=jar -Dfile=live-dubbo-common-1.1.0-SNAPSHOT.jar  -DrepositoryId=snapshots -DpomFile=../pom.xml -Durl=http://maven.wemomo.com:18081/nexus/content/repositories/snapshots/
