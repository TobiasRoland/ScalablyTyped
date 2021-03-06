package typings.meyda.mod

import typings.std.AudioNode
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meyda", "MeydaAnalyzer")
@js.native
class MeydaAnalyzer () extends js.Object {
  def get(features: js.Array[MeydaAudioFeature]): Partial[MeydaFeaturesObject] | Null = js.native
  def setSource(source: AudioNode): Unit = js.native
  def start(features: js.Array[MeydaAudioFeature]): Unit = js.native
  def stop(): Unit = js.native
}

