package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonGrid")
@js.native
class IonGrid protected ()
  extends typings.ionicCore.componentsMod.Components.IonGrid {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * If `true`, the grid will have a fixed width based on the screen size.
    */
  /* CompleteClass */
  override var fixed: Boolean = js.native
  var z: NgZone = js.native
}

