package typings.eslint

import typings.eslint.eslintStrings.ImportBinding
import typings.eslint.mod.Scope.DefinitionType
import typings.estree.mod.ImportDeclaration
import typings.estree.mod.ImportDefaultSpecifier
import typings.estree.mod.ImportNamespaceSpecifier
import typings.estree.mod.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImportBinding extends DefinitionType {
  var node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier
  var parent: ImportDeclaration
  var `type`: ImportBinding
}

object AnonImportBinding {
  @scala.inline
  def apply(
    node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier,
    parent: ImportDeclaration,
    `type`: ImportBinding
  ): AnonImportBinding = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImportBinding]
  }
}

