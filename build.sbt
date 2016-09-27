enablePlugins(ScalaJSPlugin)

name := "refined-sjs-example"

scalaVersion := "2.11.8"
scalaOrganization := "org.typelevel"
scalacOptions += "-Yliteral-types"

libraryDependencies += "eu.timepit" %%% "refined" % "0.5.0"

persistLauncher := true
