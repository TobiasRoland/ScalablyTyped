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

@JSImport("@ionic/angular/dist/directives/proxies", "IonSlides")
@js.native
class IonSlides protected ()
  extends typings.ionicCore.componentsMod.Components.IonSlides {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionSlideDidChange: EventEmitter[CustomEvent[_]] = js.native
  var ionSlideDoubleTap: EventEmitter[CustomEvent[_]] = js.native
  var ionSlideDrag: EventEmitter[CustomEvent[_]] = js.native
  var ionSlideNextEnd: EventEmitter[CustomEvent[_]] = js.native
  var ionSlideNextStart: EventEmitter[CustomEvent[_]] = js.native
  var ionSlidePrevEnd: EventEmitter[CustomEvent[_]] = js.native
  var ionSlidePrevStart: EventEmitter[CustomEvent[_]] = js.native
  var ionSlideReachEnd: EventEmitter[CustomEvent[_]] = js.native
  var ionSlideReachStart: EventEmitter[CustomEvent[_]] = js.native
  var ionSlideTap: EventEmitter[CustomEvent[_]] = js.native
  var ionSlideTouchEnd: EventEmitter[CustomEvent[_]] = js.native
  var ionSlideTouchStart: EventEmitter[CustomEvent[_]] = js.native
  var ionSlideTransitionEnd: EventEmitter[CustomEvent[_]] = js.native
  var ionSlideTransitionStart: EventEmitter[CustomEvent[_]] = js.native
  var ionSlideWillChange: EventEmitter[CustomEvent[_]] = js.native
  var ionSlidesDidLoad: EventEmitter[CustomEvent[_]] = js.native
  var z: NgZone = js.native
}

