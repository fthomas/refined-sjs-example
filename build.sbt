enablePlugins(ScalaJSPlugin)

name := "refined-sjs-example"

scalaVersion := "2.12.9"

libraryDependencies += "eu.timepit" %%% "refined" % "0.9.9"

libraryDependencies += "org.http4s" %% "http4s-core" % "0.20.8"

scalaJSUseMainModuleInitializer := true
