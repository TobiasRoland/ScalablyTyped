organization := "org.scalablytyped"
name := "gulp-responsive-images"
version := "0.0-dt-20180411Z-d47eed"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gm" % "1.18-dt-20191226Z-a09794",
  "org.scalablytyped" %%% "gulp-rename" % "0.0-unknown-dt-20190322Z-ebeaf6",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        