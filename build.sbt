enablePlugins(ScalaJSPlugin)

name := "refined-sjs-example"

scalaVersion := "2.12.9"

libraryDependencies += "eu.timepit" %%% "refined" % "0.9.9"

libraryDependencies += "org.http4s" %% "http4s-core" % "0.20.15"

libraryDependencies += "org.typelevel" %% "cats-effect" % "1.3.0"

libraryDependencies += "org.typelevel" %% "cats-free" % "1.6.0"

libraryDependencies += "io.monix" %% "monix" % "3.1.0"

libraryDependencies += "com.nimbusds" % "nimbus-jose-jwt" % "8.2"

libraryDependencies += "org.spire-math" % "kind-projector" % "0.9.7"

scalaJSUseMainModuleInitializer := true
