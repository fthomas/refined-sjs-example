enablePlugins(ScalaJSPlugin)

// comment

name := "refined-sjs-example"

scalaVersion := "2.12.8"

libraryDependencies += "eu.timepit" %%% "refined" % "0.9.8"

// comment
libraryDependencies += "org.typelevel" %%% "cats-core" % "1.0.0"

scalaJSUseMainModuleInitializer := true
