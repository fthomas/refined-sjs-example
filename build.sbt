enablePlugins(ScalaJSPlugin)

name := "refined-sjs-example"

scalaVersion := "2.12.8"

libraryDependencies += "eu.timepit" %%% "refined" % "0.9.8"

libraryDependencies += "com.lihaoyi" %%% "fastparse" % "2.1.0"

scalaJSUseMainModuleInitializer := true
