scalaVersion := "2.12.6"

val http4sV = "0.20.9"

libraryDependencies += "org.http4s" %% "http4s-core" % http4sV
libraryDependencies += "org.http4s" %% "http4s-server" % http4sV
libraryDependencies += "org.http4s" %% "http4s-dsl" % http4sV
libraryDependencies += "org.http4s" %% "http4s-blaze-server" % http4sV

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.0")

