package typings.aureliaTemplating.mod

import typings.aureliaBinding.mod.bindingMode
import typings.aureliaTemplating.aureliaTemplatingStrings.attribute
import typings.aureliaTemplating.aureliaTemplatingStrings.bindingBehavior
import typings.aureliaTemplating.aureliaTemplatingStrings.element
import typings.aureliaTemplating.aureliaTemplatingStrings.fromView
import typings.aureliaTemplating.aureliaTemplatingStrings.oneTime
import typings.aureliaTemplating.aureliaTemplatingStrings.oneWay
import typings.aureliaTemplating.aureliaTemplatingStrings.toView
import typings.aureliaTemplating.aureliaTemplatingStrings.twoWay
import typings.aureliaTemplating.aureliaTemplatingStrings.valueConverter
import typings.std.Element
import typings.std.NamedNodeMap
import typings.std.ShadowRootInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStaticResourceConfig extends js.Object {
  /**
    * List of bindable properties of this custom element / custom attribute, by name or full config object
    */
  var bindables: js.UndefOr[String | js.Array[IBindablePropertyConfig]] = js.undefined
  /**
    * Flag a custom element as containerless. Which will remove their render target
    */
  var containerless: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to set default binding mode of default custom attribute view model "value" property
    */
  var defaultBindingMode: js.UndefOr[bindingMode | oneTime | oneWay | twoWay | fromView | toView] = js.undefined
  /**
    * Flags a custom attribute has dynamic options
    */
  var hasDynamicOptions: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of this resource. Reccommended to explicitly set to works better with minifier
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Custom processing of the attributes on an element before the framework inspects them.
    */
  var processAttributes: js.UndefOr[
    js.Function5[
      /* viewCompiler */ ViewCompiler, 
      /* resources */ ViewResources_, 
      /* node */ Element, 
      /* attributes */ NamedNodeMap, 
      /* elementInstruction */ BehaviorInstruction, 
      Unit
    ]
  ] = js.undefined
  /**
    * Enables custom processing of the content that is places inside the custom element by its consumer.
    * Pass a boolean to direct the template compiler to not process
    * the content placed inside this element. Alternatively, pass a function which
    * can provide custom processing of the content. This function should then return
    * a boolean indicating whether the compiler should also process the content.
    */
  var processContent: js.UndefOr[
    js.Function4[
      /* viewCompiler */ ViewCompiler, 
      /* resources */ ViewResources_, 
      /* node */ Element, 
      /* instruction */ BehaviorInstruction, 
      Boolean
    ]
  ] = js.undefined
  /**
    * Options that will be used if the element is flagged with usesShadowDOM
    */
  var shadowDOMOptions: js.UndefOr[ShadowRootInit] = js.undefined
  /**
    * Used to tell if a custom attribute is a template controller
    */
  var templateController: js.UndefOr[Boolean] = js.undefined
  /**
    * Resource type of this class, omit equals to custom element
    */
  var `type`: js.UndefOr[
    element | attribute | valueConverter | bindingBehavior | typings.aureliaTemplating.aureliaTemplatingStrings.viewEngineHooks
  ] = js.undefined
  /**
    * Flag if this custom element uses native shadow dom instead of emulation
    */
  var usesShadowDOM: js.UndefOr[Boolean] = js.undefined
}

object IStaticResourceConfig {
  @scala.inline
  def apply(
    bindables: String | js.Array[IBindablePropertyConfig] = null,
    containerless: js.UndefOr[Boolean] = js.undefined,
    defaultBindingMode: bindingMode | oneTime | oneWay | twoWay | fromView | toView = null,
    hasDynamicOptions: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    processAttributes: (/* viewCompiler */ ViewCompiler, /* resources */ ViewResources_, /* node */ Element, /* attributes */ NamedNodeMap, /* elementInstruction */ BehaviorInstruction) => Unit = null,
    processContent: (/* viewCompiler */ ViewCompiler, /* resources */ ViewResources_, /* node */ Element, /* instruction */ BehaviorInstruction) => Boolean = null,
    shadowDOMOptions: ShadowRootInit = null,
    templateController: js.UndefOr[Boolean] = js.undefined,
    `type`: element | attribute | valueConverter | bindingBehavior | typings.aureliaTemplating.aureliaTemplatingStrings.viewEngineHooks = null,
    usesShadowDOM: js.UndefOr[Boolean] = js.undefined
  ): IStaticResourceConfig = {
    val __obj = js.Dynamic.literal()
    if (bindables != null) __obj.updateDynamic("bindables")(bindables.asInstanceOf[js.Any])
    if (!js.isUndefined(containerless)) __obj.updateDynamic("containerless")(containerless.asInstanceOf[js.Any])
    if (defaultBindingMode != null) __obj.updateDynamic("defaultBindingMode")(defaultBindingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDynamicOptions)) __obj.updateDynamic("hasDynamicOptions")(hasDynamicOptions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (processAttributes != null) __obj.updateDynamic("processAttributes")(js.Any.fromFunction5(processAttributes))
    if (processContent != null) __obj.updateDynamic("processContent")(js.Any.fromFunction4(processContent))
    if (shadowDOMOptions != null) __obj.updateDynamic("shadowDOMOptions")(shadowDOMOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(templateController)) __obj.updateDynamic("templateController")(templateController.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(usesShadowDOM)) __obj.updateDynamic("usesShadowDOM")(usesShadowDOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticResourceConfig]
  }
}

