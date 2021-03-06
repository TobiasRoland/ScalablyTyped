package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonItemSliding")
@js.native
class IonItemSliding protected ()
  extends typings.ionicCore.componentsMod.Components.IonItemSliding {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionDrag: EventEmitter[CustomEvent[_]] = js.native
  var z: NgZone = js.native
}

