organization := "org.scalablytyped"
name := "aws-sdk__service-model"
version := "0.1.0-preview.2-781dd6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk__build-types" % "0.1.0-preview.1-f59343",
  "org.scalablytyped" %%% "aws-sdk__types" % "0.1.0-preview.1-eba9fc",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        