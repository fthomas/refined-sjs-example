enablePlugins(ScalaJSPlugin)

name := "refined-sjs-example"

scalaVersion := "2.12.9"

libraryDependencies += "eu.timepit" %%% "refined" % "0.9.9"

libraryDependencies += "com.lihaoyi" %%% "fastparse" % "2.1.3"

scalaJSUseMainModuleInitializer := true
