package typings.googleGax.grpcMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.TypeofClassCallCredentials
import typings.googleGax.TypeofClassChannelCredentials
import typings.googleGax.TypeofClassMetadata
import typings.googleGax.TypeofClassServerCredentials
import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.clientMod.Client
import typings.grpcGrpcJs.constantsMod.LogVerbosity
import typings.grpcGrpcJs.makeClientMod.GrpcObject
import typings.grpcGrpcJs.makeClientMod.PackageDefinition
import typings.grpcGrpcJs.makeClientMod.ServiceClientConstructor
import typings.grpcGrpcJs.makeClientMod.ServiceDefinition
import typings.std.Console_
import typings.std.Date
import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcModule extends js.Object {
  var CallCredentials: TypeofClassCallCredentials = js.native
  var Channel: Instantiable3[
    /* target */ String, 
    /* credentials */ ChannelCredentials, 
    /* options */ ChannelOptions, 
    typings.grpcGrpcJs.mod.Channel
  ] = js.native
  var ChannelCredentials: TypeofClassChannelCredentials = js.native
  var Client: Instantiable2[
    /* address */ String, 
    /* credentials */ ChannelCredentials, 
    typings.grpcGrpcJs.mod.Client
  ] = js.native
  var Metadata: TypeofClassMetadata = js.native
  var Server: Instantiable0[typings.grpcGrpcJs.mod.Server] = js.native
  var ServerCredentials: TypeofClassServerCredentials = js.native
  var StatusBuilder: Instantiable0[typings.grpcGrpcJs.mod.StatusBuilder] = js.native
  val credentials: StringDictionary[js.Function] = js.native
  def InterceptingCall(): scala.Nothing = js.native
  def InterceptorBuilder(): scala.Nothing = js.native
  def ListenerBuilder(): scala.Nothing = js.native
  def closeClient(client: Client): Unit = js.native
  def getClientChannel(client: Client): Channel = js.native
  def load(filename: js.Any, format: js.Any, options: js.Any): scala.Nothing = js.native
  def loadObject(value: js.Any, options: js.Any): scala.Nothing = js.native
  def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
  def makeClientConstructor(methods: ServiceDefinition, serviceName: String): ServiceClientConstructor = js.native
  def makeClientConstructor(methods: ServiceDefinition, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  def makeGenericClientConstructor(methods: ServiceDefinition, serviceName: String): ServiceClientConstructor = js.native
  def makeGenericClientConstructor(methods: ServiceDefinition, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  def setLogVerbosity(verbosity: LogVerbosity): Unit = js.native
  def setLogger(logger: Partial[Console_]): Unit = js.native
  def waitForClientReady(client: Client, deadline: Double, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def waitForClientReady(client: Client, deadline: Date, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
}

