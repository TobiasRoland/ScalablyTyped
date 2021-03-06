package typings.titanium.Titanium.Android.Calendar

import typings.std.Date
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An object that represents a single alert for an event in an Android calendar.
			 */
trait Alert extends Proxy {
  /**
  				 * Date/time at which this alert alarm is set to trigger.
  				 */
  val alarmTime: Date
  /**
  				 * Start date/time for the corresponding event.
  				 */
  val begin: Date
  /**
  				 * End date/time for the corresponding event.
  				 */
  val end: Date
  /**
  				 * Identifier of the event for which this alert is set.
  				 */
  val eventId: Double
  /**
  				 * Identifier of this alert.
  				 */
  val id: String
  /**
  				 * Reminder notice period in minutes, that determines how long prior to the event this alert
  				 * should trigger.
  				 */
  val minutes: Double
  /**
  				 * The current state of the alert.
  				 */
  val state: Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.alarmTime> property.
  				 */
  def getAlarmTime(): Date
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.begin> property.
  				 */
  def getBegin(): Date
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.end> property.
  				 */
  def getEnd(): Date
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.eventId> property.
  				 */
  def getEventId(): Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.id> property.
  				 */
  def getId(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.minutes> property.
  				 */
  def getMinutes(): Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Alert.state> property.
  				 */
  def getState(): Double
}

object Alert {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    alarmTime: Date,
    apiName: String,
    applyProperties: js.Any => Unit,
    begin: Date,
    bubbleParent: Boolean,
    end: Date,
    eventId: Double,
    fireEvent: (String, js.Any) => Unit,
    getAlarmTime: () => Date,
    getApiName: () => String,
    getBegin: () => Date,
    getBubbleParent: () => Boolean,
    getEnd: () => Date,
    getEventId: () => Double,
    getId: () => String,
    getMinutes: () => Double,
    getState: () => Double,
    id: String,
    minutes: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    state: Double,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Alert = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), alarmTime = alarmTime.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), begin = begin.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getAlarmTime = js.Any.fromFunction0(getAlarmTime), getApiName = js.Any.fromFunction0(getApiName), getBegin = js.Any.fromFunction0(getBegin), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getEnd = js.Any.fromFunction0(getEnd), getEventId = js.Any.fromFunction0(getEventId), getId = js.Any.fromFunction0(getId), getMinutes = js.Any.fromFunction0(getMinutes), getState = js.Any.fromFunction0(getState), id = id.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), state = state.asInstanceOf[js.Any])
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
}

