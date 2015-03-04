name := """sonar-scala-vroman"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.codehaus.sonar" % "sonar-plugin-api" % "5.0.1", 
  "org.codehaus.sonar" % "sonar-testing-harness" % "5.0.1",
  "org.scalariform" % "scalariform-maven-plugin" % "0.1.4",
  "org.scalatest" % "scalatest_2.11" % "2.1.7",
  "org.scala-lang" % "scala-compiler" % scalaVersion.value
)