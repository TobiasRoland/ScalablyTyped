organization := "org.scalablytyped"
name := "react-native-dialog"
version := "5.6-dt-20191108Z-af91a5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200117Z-abf5f4",
  "org.scalablytyped" %%% "react-native-animatable" % "1.3.3-41756c",
  "org.scalablytyped" %%% "react-native-modal" % "11.5.3-1dce21",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        