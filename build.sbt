enablePlugins(ScalaJSPlugin)

name := "refined-sjs-example"

scalaVersion := "2.12.6"

libraryDependencies += "eu.timepit" %%% "refined" % "0.9.5"

scalaJSUseMainModuleInitializer := true
