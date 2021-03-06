organization := "org.scalablytyped"
name := "phosphor__datagrid"
version := "0.1.11-9db3bf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-0c3ac5",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.2-a97230",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-559af0",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-4489da",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-d1b800",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-e44366",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-edd744",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.3-98ef91",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        