organization := "org.scalablytyped"
name := "knockout_dot_rx"
version := "1.0-dt-20190322Z-bc45de"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190819Z-f91bf5",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-6379b0",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-a36982",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        