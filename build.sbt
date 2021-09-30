name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.13.1"

lazy val AkkaVersion = "2.6.8"
lazy val AkkaHttpVersion = "10.2.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test,
  "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttpVersion,
  "com.github.daddykotex" %% "courier" % "3.0.1",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.scalatest" %% "scalatest" % "3.1.0" % Test
)
