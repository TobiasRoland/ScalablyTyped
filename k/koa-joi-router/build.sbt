organization := "org.scalablytyped"
name := "koa-joi-router"
version := "5.2-dt-20191107Z-24cda7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-6c767c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-1b4f69",
  "org.scalablytyped" %%% "co-body" % "0.0-unknown-dt-20190322Z-3875e5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-b60015",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-4aabca",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-56f2e3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-8b81e3",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-fa0830",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-98d69d",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-f05fe3",
  "org.scalablytyped" %%% "koa-router" % "7.4-dt-20200109Z-940d4f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-03061a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20191107Z-1b702c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b58a9e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-314389",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        