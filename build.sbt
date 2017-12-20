
name := "MANAGER"

version := "0.1"

scalaVersion := "2.12.4"

lazy val root = (project in file(".")).enablePlugins(PlayScala).disablePlugins(PlayFilters)


libraryDependencies += guice

libraryDependencies += ws

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.0" % Test



