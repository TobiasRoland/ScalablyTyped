package typings.uirouterAngularjs.mod.core

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.stateRegistryMod.StateRegistryListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.StateQueueManager")
@js.native
class StateQueueManager protected ()
  extends typings.uirouterCore.mod.StateQueueManager {
  def this(
    router: typings.uirouterCore.routerMod.UIRouter,
    states: StringDictionary[typings.uirouterCore.stateObjectMod.StateObject],
    builder: typings.uirouterCore.stateBuilderMod.StateBuilder,
    listeners: js.Array[StateRegistryListener]
  ) = this()
}

