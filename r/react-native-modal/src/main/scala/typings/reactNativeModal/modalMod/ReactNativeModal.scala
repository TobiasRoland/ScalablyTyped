package typings.reactNativeModal.modalMod

import typings.react.mod.Component
import typings.reactNative.mod.PanResponderGestureState
import typings.reactNative.mod.PanResponderInstance
import typings.reactNativeModal.AnonAnimationIn
import typings.reactNativeModal.AnonAnimationInAnimationInTiming
import typings.reactNativeModal.AnonIsVisible
import typings.reactNativeModal.reactNativeModalStrings.down
import typings.reactNativeModal.reactNativeModalStrings.left
import typings.reactNativeModal.reactNativeModalStrings.right
import typings.reactNativeModal.reactNativeModalStrings.up
import typings.reactNativeModal.typesMod.Direction
import typings.reactNativeModal.typesMod.OrNull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-modal/dist/modal", "ReactNativeModal")
@js.native
class ReactNativeModal protected ()
  extends Component[ModalProps, State, js.Any] {
  def this(props: ModalProps) = this()
  var animationIn: String = js.native
  var animationOut: String = js.native
  var backdropRef: js.Any = js.native
  var contentRef: js.Any = js.native
  var currentSwipingDirection: OrNull[Direction] = js.native
  var inSwipeClosingState: Boolean = js.native
  var isTransitioning: Boolean = js.native
  var panResponder: OrNull[PanResponderInstance] = js.native
  def buildPanResponder(): Unit = js.native
  def calcDistancePercentage(gestureState: PanResponderGestureState): Double = js.native
  def close(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactNativeModal(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactNativeModal(prevProps: ModalProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactNativeModal(): Unit = js.native
  def createAnimationEventForSwipe(): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def getAccDistancePerDirection(gestureState: PanResponderGestureState): Double = js.native
  def getSwipingDirection(gestureState: PanResponderGestureState): left | right | up | down = js.native
  def handleDimensionsUpdate(): Unit = js.native
  def isDirectionIncluded(direction: Direction): Boolean = js.native
  def isSwipeDirectionAllowed(hasDyDx: PanResponderGestureState): Boolean = js.native
  def open(): Unit = js.native
}

/* static members */
@JSImport("react-native-modal/dist/modal", "ReactNativeModal")
@js.native
object ReactNativeModal extends js.Object {
  var defaultProps: AnonAnimationInAnimationInTiming = js.native
  var propTypes: AnonAnimationIn = js.native
  def getDerivedStateFromProps(nextProps: ModalProps, state: State): AnonIsVisible | Null = js.native
}

