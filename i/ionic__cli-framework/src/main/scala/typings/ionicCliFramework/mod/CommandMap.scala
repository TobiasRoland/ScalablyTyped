package typings.ionicCliFramework.mod

import typings.ionicCliFramework.definitionsMod.CommandMapGetter
import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicUtilsObject.mod.AliasedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "CommandMap")
@js.native
class CommandMap ()
  extends AliasedMap[
      String, 
      CommandMapGetter[
        typings.ionicCliFramework.commandMod.Command, 
        typings.ionicCliFramework.commandMod.Namespace, 
        CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
        CommandMetadataInput, 
        CommandMetadataOption
      ]
    ]

