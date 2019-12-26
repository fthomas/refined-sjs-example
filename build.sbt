enablePlugins(ScalaJSPlugin)

name := "refined-sjs-example"

scalaVersion := "2.12.9"

libraryDependencies += "eu.timepit" %%% "refined" % "0.9.10"

libraryDependencies += "org.http4s" %% "http4s-core" % "0.20.15"

libraryDependencies += "org.typelevel" %% "cats-effect" % "2.0.0"

libraryDependencies += "org.typelevel" %% "cats-free" % "2.0.0"

libraryDependencies += "io.monix" %% "monix" % "3.1.0"

libraryDependencies += "com.nimbusds" % "nimbus-jose-jwt" % "8.4"

libraryDependencies += "org.spire-math" %% "kind-projector" % "0.9.10"

scalaJSUseMainModuleInitializer := true
