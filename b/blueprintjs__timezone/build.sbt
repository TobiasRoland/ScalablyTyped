organization := "org.scalablytyped"
name := "blueprintjs__timezone"
version := "3.6.1-3b8a4c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.23.0-eb0097",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.13.0-bc6b11",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.0-23d6b9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "react-popper" % "1.3.7-6a94b8",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        