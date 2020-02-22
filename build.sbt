name := "tapir-tagging-problem"

version := "0.1"

scalaVersion := "2.13.1"

val tapirVersion              = "0.12.21"
val taggingVersion            = "2.2.1"

lazy val tapir = Seq(
  "com.softwaremill.sttp.tapir" %% "tapir-core" % tapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-akka-http-server" % tapirVersion excludeAll ExclusionRule(organization = "com.typesafe.akka"),
  "com.softwaremill.sttp.tapir" %% "tapir-openapi-docs" % tapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-openapi-circe-yaml" % tapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-swagger-ui-akka-http" % tapirVersion excludeAll ExclusionRule(organization = "com.typesafe.akka"),
  "com.softwaremill.sttp.tapir" %% "tapir-enumeratum" % tapirVersion
)

lazy val tagging = Seq(
  "com.softwaremill.common" %% "tagging" % taggingVersion
)

libraryDependencies ++= (tapir ++ tagging)

scalacOptions ++= Seq(
  "-Ymacro-debug-lite"
)