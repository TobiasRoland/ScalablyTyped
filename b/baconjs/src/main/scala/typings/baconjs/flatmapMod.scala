package typings.baconjs

import typings.baconjs.typesFlatmapMod.SpawnerOrObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmap", JSImport.Namespace)
@js.native
object flatmapMod extends js.Object {
  def default[V, V2](src: typings.baconjs.observableMod.default[V], f: SpawnerOrObservable[V, V2]): typings.baconjs.observableMod.default[V2] = js.native
}

