package typings.yandexMaps.mod.behavior

import typings.yandexMaps.mod.IBehavior
import typings.yandexMaps.mod.IControlParent
import typings.yandexMaps.mod.IEventManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.Ruler")
@js.native
class Ruler () extends IBehavior {
  def this(options: IRulerOptions) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  def close(): Boolean = js.native
  def getState(): String = js.native
  def setParent(parent: IControlParent): this.type = js.native
  def setState(): Unit = js.native
  def setState(state: String): Unit = js.native
}

