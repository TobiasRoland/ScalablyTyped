organization := "org.scalablytyped"
name := "evernote"
version := "1.25.8-dt-20190322Z-7187cd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "node-int64" % "v0.4.0-dt-20190322Z-55ea77",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-890e43",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "thrift" % "0.10-dt-20191223Z-31f563")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        