organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-742597"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-74608a",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-24c308",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-de42bd",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        