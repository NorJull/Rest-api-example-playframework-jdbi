name := """jdbi-example-proyect"""
organization := "com.vamosaprogramar"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies +=  javaJdbc
libraryDependencies += "org.jdbi" % "jdbi" % "2.78"
libraryDependencies += "postgresql" % "postgresql" % "9.1-901.jdbc4"
