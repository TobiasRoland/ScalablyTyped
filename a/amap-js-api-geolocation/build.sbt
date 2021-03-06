organization := "org.scalablytyped"
name := "amap-js-api-geolocation"
version := "1.4-dt-20190409Z-a77c7a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "amap-js-api" % "1.4-dt-20191126Z-fea97c",
  "org.scalablytyped" %%% "amap-js-api-geocoder" % "1.4-dt-20190331Z-cd4d65",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        