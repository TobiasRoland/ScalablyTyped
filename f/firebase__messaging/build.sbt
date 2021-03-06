organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.6.2-7e3a47"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.0-cf5c8a",
  "org.scalablytyped" %%% "firebase__component" % "0.1.2-e5feb3",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.3.0-920db9",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.4.1-3f41d3",
  "org.scalablytyped" %%% "firebase__util" % "0.2.37-3b40cf",
  "org.scalablytyped" %%% "sinon" % "7.5-dt-20191120Z-513128",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        