lazy val akkaHttpVersion = "10.2.7"
lazy val akkaVersion = "2.6.17"

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "com.example",
      scalaVersion := "2.13.4"
    )
  ),
  name := "akka-http",
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
    "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.7",
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "org.scalatest" %% "scalatest" % "3.1.4" % Test
  )
)
