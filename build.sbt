enablePlugins(ScalaJSPlugin)

name := "refined-sjs-example"

scalaVersion := "2.12.8"

libraryDependencies += "eu.timepit" %%% "refined" % "0.9.8"

libraryDependencies += "org.typelevel" %%% "cats-core" % "0.9.0"

scalaJSUseMainModuleInitializer := true
