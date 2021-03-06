package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.AudioListenerComponent
  * @extends pc.Component
  * @classdesc Represents the audio listener in the 3D world, so that 3D positioned audio sources are heard correctly.
  * @description Create new AudioListenerComponent
  * @param {pc.AudioListenerComponentSystem} system The ComponentSystem that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  */
@JSImport("playcanvas", "AudioListenerComponent")
@js.native
class AudioListenerComponent protected ()
  extends typings.playcanvas.pc.AudioListenerComponent {
  def this(system: typings.playcanvas.pc.AudioListenerComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

