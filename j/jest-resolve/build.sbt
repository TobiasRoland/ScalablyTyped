organization := "org.scalablytyped"
name := "jest-resolve"
version := "24.9.0-653224"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-68f85b",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-de6979",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-38e05f",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-558047",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200108Z-73eb79",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-62354a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        