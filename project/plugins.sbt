// Comment to get more information during initialization
logLevel := Level.Warn

resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.0.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")