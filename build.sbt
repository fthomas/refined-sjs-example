enablePlugins(ScalaJSPlugin)

name := "refined-sjs-example"

scalaVersion := "2.12.9"

libraryDependencies += "eu.timepit" %%% "refined" % "0.9.9"

libraryDependencies += "org.http4s" %% "http4s-core" % "0.20.13"

libraryDependencies += "org.typelevel" %% "cats-effect" % "1.3.0"

libraryDependencies += "org.typelevel" %% "cats-free" % "1.6.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.6"

scalaJSUseMainModuleInitializer := true
