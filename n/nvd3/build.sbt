organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20200116Z-db9b20"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-6bba57",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-03e63d",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-8f8294",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        