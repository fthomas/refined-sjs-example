enablePlugins(ScalaJSPlugin)

name := "refined-sjs-example"

scalaVersion := "2.12.8"

libraryDependencies += "eu.timepit" %%% "refined" % "0.9.8"

libraryDependencies += "co.fs2" %% "fs2-core" % "0.10.0"

scalaJSUseMainModuleInitializer := true
