package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IClass
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.data.Types")
@js.native
class Types () extends js.Object

/* static members */
@JSGlobal("Ext.data.Types")
@js.native
object Types extends js.Object {
  /** [Property] (Object) */
  var AUTO: js.Any = js.native
  /** [Property] (Object) */
  var BOOL: js.Any = js.native
  /** [Property] (Object) */
  var BOOLEAN: js.Any = js.native
  /** [Property] (Object) */
  var DATE: js.Any = js.native
  /** [Property] (Object) */
  var FLOAT: js.Any = js.native
  /** [Property] (Object) */
  var INT: js.Any = js.native
  /** [Property] (Object) */
  var INTEGER: js.Any = js.native
  /** [Property] (Object) */
  var NUMBER: js.Any = js.native
  /** [Property] (Object) */
  var STRING: js.Any = js.native
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Property] (RegExp) */
  var stripRe: RegExp = js.native
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method]  */
  def destroy(): Unit = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
}

