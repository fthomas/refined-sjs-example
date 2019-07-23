enablePlugins(ScalaJSPlugin)

name := "refined-sjs-example"

scalaVersion := "2.12.8"

libraryDependencies += "eu.timepit" %%% "refined" % "0.9.8"

libraryDependencies += "org.typelevel" %% "cats-effect" % "1.0.0" // conflict?

scalaJSUseMainModuleInitializer := true
