package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protocolMod {
  type ClientCapabilities = typings.vscodeLanguageserverProtocol.protocolMod._ClientCapabilities with typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationClientCapabilities with typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionClientCapabilities with typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersClientCapabilities with typings.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationClientCapabilities with typings.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorClientCapabilities with typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeClientCapabilities with typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationClientCapabilities
  type DocumentSelector = js.Array[
    java.lang.String | typings.vscodeLanguageserverProtocol.protocolMod.DocumentFilter
  ]
  type ExecuteCommandRegistrationOptions = typings.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandOptions
  type InitializeParams = typings.vscodeLanguageserverProtocol.protocolMod._InitializeParams with typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersInitializeParams
  type ServerCapabilities = typings.vscodeLanguageserverProtocol.protocolMod._ServerCapabilities with typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationServerCapabilities with typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionServerCapabilities with typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersServerCapabilities with typings.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorServerCapabilities with typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeServerCapabilities with typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationServerCapabilities
}
