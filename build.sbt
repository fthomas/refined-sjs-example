enablePlugins(ScalaJSPlugin)

name := "refined-sjs-example"

scalaVersion := "2.12.9"

libraryDependencies += "eu.timepit" %%% "refined" % "0.9.10"

libraryDependencies += "org.http4s" %% "http4s-core" % "0.20.15"

libraryDependencies += "org.typelevel" %% "cats-effect" % "1.4.0"

libraryDependencies += "org.typelevel" %% "cats-free" % "1.6.1"

libraryDependencies += "io.monix" %% "monix" % "3.1.0"

libraryDependencies += "com.nimbusds" % "nimbus-jose-jwt" % "8.3"

libraryDependencies += "org.spire-math" %% "kind-projector" % "0.9.10"

scalaJSUseMainModuleInitializer := true
