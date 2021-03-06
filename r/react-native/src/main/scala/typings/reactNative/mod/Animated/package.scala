package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Animated {
  type AnimatedValue = typings.reactNative.mod.Animated.Value
  type AnimatedValueXY = typings.reactNative.mod.Animated.ValueXY
  type Base = typings.reactNative.mod.Animated.Animated
  type EndCallback = js.Function1[/* result */ typings.reactNative.mod.Animated.EndResult, scala.Unit]
  type Mapping = (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native.react-native.Animated.Mapping */ js.Object
  ]) | typings.reactNative.mod.Animated.AnimatedValue
  type ValueListenerCallback = js.Function1[/* state */ typings.reactNative.AnonValue, scala.Unit]
  type ValueXYListenerCallback = js.Function1[/* value */ typings.reactNative.AnonX, scala.Unit]
}
