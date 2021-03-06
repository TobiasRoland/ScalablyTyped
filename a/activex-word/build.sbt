organization := "org.scalablytyped"
name := "activex-word"
version := "14.0-dt-20190213Z-3cd930"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-f6b340",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-d9f541",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-8d2820",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-256a17",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        