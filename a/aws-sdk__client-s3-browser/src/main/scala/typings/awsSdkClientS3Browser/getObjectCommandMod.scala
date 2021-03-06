package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesGetObjectInputMod.GetObjectInput
import typings.awsSdkClientS3Browser.typesGetObjectOutputMod.GetObjectOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/GetObjectCommand", JSImport.Namespace)
@js.native
object getObjectCommandMod extends js.Object {
  @js.native
  class GetObjectCommand protected () extends Command[
          InputTypesUnion, 
          GetObjectInput, 
          OutputTypesUnion, 
          GetObjectOutput[Blob], 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetObjectInput) = this()
    /* CompleteClass */
    override val input: GetObjectInput = js.native
    val middlewareStack: MiddlewareStack[GetObjectInput, GetObjectOutput[Blob], Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectInput, GetObjectOutput[Blob]] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectInput, GetObjectOutput[Blob]] = js.native
  }
  
}

