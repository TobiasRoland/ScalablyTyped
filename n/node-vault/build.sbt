organization := "org.scalablytyped"
name := "node-vault"
version := "0.9-dt-20190723Z-82aba8"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-c0ff92",
  "org.scalablytyped" %%% "form-data" % "2.5.1-60834f",
  "org.scalablytyped" %%% "mustache" % "0.8.4-dt-20190322Z-393cec",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190909Z-5ac137",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-011dc6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        