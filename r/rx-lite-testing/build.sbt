organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20180214Z-2f9f31"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-6379b0",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-146946",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-7a17dd",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        