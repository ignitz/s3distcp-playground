
scalaVersion := "2.11.12"

name := "s3-playground"
organization := "com.datasprints"
version := "1.0"

// https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk-emr
// libraryDependencies += "com.amazon" % "aws-java-sdk-emr" % "1.9.0"
// libraryDependencies += "com.amazon" .external.elasticmapreduce.s3distcp


libraryDependencies += "net.sourceforge.findbugs" % "jsr305" % "1.3.2"
libraryDependencies += "org.apache.hadoop" % "hadoop-core" % "1.0.3"
libraryDependencies += "log4j" % "log4j" % "1.2.17"
libraryDependencies += "commons-logging" % "commons-logging" % "1.1.3"
libraryDependencies += "com.google.guava" % "guava" % "14.0.1"
libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.6.2"
libraryDependencies += "com.google.code.gson" % "gson" % "2.2.4"
