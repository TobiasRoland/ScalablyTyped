package typings.javascriptObfuscator

import typings.javascriptObfuscator.igeneratoroutputMod.IGeneratorOutput
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escodegen-wallaby", JSImport.Namespace)
@js.native
object escodegenWallabyMod extends js.Object {
  def generate(ast: Node): IGeneratorOutput = js.native
  def generate(
    ast: Node,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GenerateOptions */ js.Any
  ): IGeneratorOutput = js.native
}

