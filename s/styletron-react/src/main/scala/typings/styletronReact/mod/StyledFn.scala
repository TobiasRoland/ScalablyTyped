package typings.styletronReact.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.std.Exclude
import typings.std.Pick
import typings.styletronReact.AnonClassName
import typings.styletronReact.styletronReactStrings.`object`
import typings.styletronReact.styletronReactStrings.`var`
import typings.styletronReact.styletronReactStrings.a
import typings.styletronReact.styletronReactStrings.abbr
import typings.styletronReact.styletronReactStrings.address
import typings.styletronReact.styletronReactStrings.animate
import typings.styletronReact.styletronReactStrings.animateMotion
import typings.styletronReact.styletronReactStrings.animateTransform
import typings.styletronReact.styletronReactStrings.area
import typings.styletronReact.styletronReactStrings.article
import typings.styletronReact.styletronReactStrings.aside
import typings.styletronReact.styletronReactStrings.audio
import typings.styletronReact.styletronReactStrings.b
import typings.styletronReact.styletronReactStrings.base
import typings.styletronReact.styletronReactStrings.bdi
import typings.styletronReact.styletronReactStrings.bdo
import typings.styletronReact.styletronReactStrings.big
import typings.styletronReact.styletronReactStrings.blockquote
import typings.styletronReact.styletronReactStrings.body
import typings.styletronReact.styletronReactStrings.br
import typings.styletronReact.styletronReactStrings.button
import typings.styletronReact.styletronReactStrings.canvas
import typings.styletronReact.styletronReactStrings.caption
import typings.styletronReact.styletronReactStrings.circle
import typings.styletronReact.styletronReactStrings.cite
import typings.styletronReact.styletronReactStrings.clipPath
import typings.styletronReact.styletronReactStrings.code
import typings.styletronReact.styletronReactStrings.col
import typings.styletronReact.styletronReactStrings.colgroup
import typings.styletronReact.styletronReactStrings.data
import typings.styletronReact.styletronReactStrings.datalist
import typings.styletronReact.styletronReactStrings.dd
import typings.styletronReact.styletronReactStrings.defs
import typings.styletronReact.styletronReactStrings.del
import typings.styletronReact.styletronReactStrings.desc
import typings.styletronReact.styletronReactStrings.details
import typings.styletronReact.styletronReactStrings.dfn
import typings.styletronReact.styletronReactStrings.dialog
import typings.styletronReact.styletronReactStrings.div
import typings.styletronReact.styletronReactStrings.dl
import typings.styletronReact.styletronReactStrings.dt
import typings.styletronReact.styletronReactStrings.ellipse
import typings.styletronReact.styletronReactStrings.em
import typings.styletronReact.styletronReactStrings.embed
import typings.styletronReact.styletronReactStrings.feBlend
import typings.styletronReact.styletronReactStrings.feColorMatrix
import typings.styletronReact.styletronReactStrings.feComponentTransfer
import typings.styletronReact.styletronReactStrings.feComposite
import typings.styletronReact.styletronReactStrings.feConvolveMatrix
import typings.styletronReact.styletronReactStrings.feDiffuseLighting
import typings.styletronReact.styletronReactStrings.feDisplacementMap
import typings.styletronReact.styletronReactStrings.feDistantLight
import typings.styletronReact.styletronReactStrings.feDropShadow
import typings.styletronReact.styletronReactStrings.feFlood
import typings.styletronReact.styletronReactStrings.feFuncA
import typings.styletronReact.styletronReactStrings.feFuncB
import typings.styletronReact.styletronReactStrings.feFuncG
import typings.styletronReact.styletronReactStrings.feFuncR
import typings.styletronReact.styletronReactStrings.feGaussianBlur
import typings.styletronReact.styletronReactStrings.feImage
import typings.styletronReact.styletronReactStrings.feMerge
import typings.styletronReact.styletronReactStrings.feMergeNode
import typings.styletronReact.styletronReactStrings.feMorphology
import typings.styletronReact.styletronReactStrings.feOffset
import typings.styletronReact.styletronReactStrings.fePointLight
import typings.styletronReact.styletronReactStrings.feSpecularLighting
import typings.styletronReact.styletronReactStrings.feSpotLight
import typings.styletronReact.styletronReactStrings.feTile
import typings.styletronReact.styletronReactStrings.feTurbulence
import typings.styletronReact.styletronReactStrings.fieldset
import typings.styletronReact.styletronReactStrings.figcaption
import typings.styletronReact.styletronReactStrings.figure
import typings.styletronReact.styletronReactStrings.filter
import typings.styletronReact.styletronReactStrings.footer
import typings.styletronReact.styletronReactStrings.foreignObject
import typings.styletronReact.styletronReactStrings.form
import typings.styletronReact.styletronReactStrings.g
import typings.styletronReact.styletronReactStrings.h1
import typings.styletronReact.styletronReactStrings.h2
import typings.styletronReact.styletronReactStrings.h3
import typings.styletronReact.styletronReactStrings.h4
import typings.styletronReact.styletronReactStrings.h5
import typings.styletronReact.styletronReactStrings.h6
import typings.styletronReact.styletronReactStrings.head
import typings.styletronReact.styletronReactStrings.header
import typings.styletronReact.styletronReactStrings.hgroup
import typings.styletronReact.styletronReactStrings.hr
import typings.styletronReact.styletronReactStrings.html
import typings.styletronReact.styletronReactStrings.i
import typings.styletronReact.styletronReactStrings.iframe
import typings.styletronReact.styletronReactStrings.image
import typings.styletronReact.styletronReactStrings.img
import typings.styletronReact.styletronReactStrings.input
import typings.styletronReact.styletronReactStrings.ins
import typings.styletronReact.styletronReactStrings.kbd
import typings.styletronReact.styletronReactStrings.keygen
import typings.styletronReact.styletronReactStrings.label
import typings.styletronReact.styletronReactStrings.legend
import typings.styletronReact.styletronReactStrings.li
import typings.styletronReact.styletronReactStrings.line
import typings.styletronReact.styletronReactStrings.linearGradient
import typings.styletronReact.styletronReactStrings.link
import typings.styletronReact.styletronReactStrings.main
import typings.styletronReact.styletronReactStrings.map
import typings.styletronReact.styletronReactStrings.mark
import typings.styletronReact.styletronReactStrings.marker
import typings.styletronReact.styletronReactStrings.mask
import typings.styletronReact.styletronReactStrings.menu
import typings.styletronReact.styletronReactStrings.menuitem
import typings.styletronReact.styletronReactStrings.meta
import typings.styletronReact.styletronReactStrings.metadata
import typings.styletronReact.styletronReactStrings.meter
import typings.styletronReact.styletronReactStrings.mpath
import typings.styletronReact.styletronReactStrings.nav
import typings.styletronReact.styletronReactStrings.noindex
import typings.styletronReact.styletronReactStrings.noscript
import typings.styletronReact.styletronReactStrings.ol
import typings.styletronReact.styletronReactStrings.optgroup
import typings.styletronReact.styletronReactStrings.option
import typings.styletronReact.styletronReactStrings.output
import typings.styletronReact.styletronReactStrings.p
import typings.styletronReact.styletronReactStrings.param
import typings.styletronReact.styletronReactStrings.path
import typings.styletronReact.styletronReactStrings.pattern
import typings.styletronReact.styletronReactStrings.picture
import typings.styletronReact.styletronReactStrings.polygon
import typings.styletronReact.styletronReactStrings.polyline
import typings.styletronReact.styletronReactStrings.pre
import typings.styletronReact.styletronReactStrings.progress
import typings.styletronReact.styletronReactStrings.q
import typings.styletronReact.styletronReactStrings.radialGradient
import typings.styletronReact.styletronReactStrings.rect
import typings.styletronReact.styletronReactStrings.rp
import typings.styletronReact.styletronReactStrings.rt
import typings.styletronReact.styletronReactStrings.ruby
import typings.styletronReact.styletronReactStrings.s
import typings.styletronReact.styletronReactStrings.samp
import typings.styletronReact.styletronReactStrings.script
import typings.styletronReact.styletronReactStrings.section
import typings.styletronReact.styletronReactStrings.select
import typings.styletronReact.styletronReactStrings.small
import typings.styletronReact.styletronReactStrings.source
import typings.styletronReact.styletronReactStrings.span
import typings.styletronReact.styletronReactStrings.stop
import typings.styletronReact.styletronReactStrings.strong
import typings.styletronReact.styletronReactStrings.style
import typings.styletronReact.styletronReactStrings.sub
import typings.styletronReact.styletronReactStrings.summary
import typings.styletronReact.styletronReactStrings.sup
import typings.styletronReact.styletronReactStrings.svg
import typings.styletronReact.styletronReactStrings.switch
import typings.styletronReact.styletronReactStrings.symbol
import typings.styletronReact.styletronReactStrings.table
import typings.styletronReact.styletronReactStrings.tbody
import typings.styletronReact.styletronReactStrings.td
import typings.styletronReact.styletronReactStrings.template
import typings.styletronReact.styletronReactStrings.text
import typings.styletronReact.styletronReactStrings.textPath
import typings.styletronReact.styletronReactStrings.textarea
import typings.styletronReact.styletronReactStrings.tfoot
import typings.styletronReact.styletronReactStrings.th
import typings.styletronReact.styletronReactStrings.thead
import typings.styletronReact.styletronReactStrings.time
import typings.styletronReact.styletronReactStrings.title
import typings.styletronReact.styletronReactStrings.tr
import typings.styletronReact.styletronReactStrings.track
import typings.styletronReact.styletronReactStrings.tspan
import typings.styletronReact.styletronReactStrings.u
import typings.styletronReact.styletronReactStrings.ul
import typings.styletronReact.styletronReactStrings.use
import typings.styletronReact.styletronReactStrings.video
import typings.styletronReact.styletronReactStrings.view
import typings.styletronReact.styletronReactStrings.wbr
import typings.styletronReact.styletronReactStrings.webview
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledFn extends js.Object {
  def apply(component: `object`, style: StyleObject): StyletronComponent[Pick[ComponentProps[`object`], Exclude[String, AnonClassName]]] = js.native
  def apply(component: `var`, style: StyleObject): StyletronComponent[Pick[ComponentProps[`var`], Exclude[String, AnonClassName]]] = js.native
  def apply(component: abbr, style: StyleObject): StyletronComponent[Pick[ComponentProps[abbr], Exclude[String, AnonClassName]]] = js.native
  def apply(component: address, style: StyleObject): StyletronComponent[Pick[ComponentProps[address], Exclude[String, AnonClassName]]] = js.native
  def apply(component: animateMotion, style: StyleObject): StyletronComponent[Pick[ComponentProps[animateMotion], Exclude[String, AnonClassName]]] = js.native
  def apply(component: animateTransform, style: StyleObject): StyletronComponent[Pick[ComponentProps[animateTransform], Exclude[String, AnonClassName]]] = js.native
  def apply(component: animate, style: StyleObject): StyletronComponent[Pick[ComponentProps[animate], Exclude[String, AnonClassName]]] = js.native
  def apply(component: area, style: StyleObject): StyletronComponent[Pick[ComponentProps[area], Exclude[String, AnonClassName]]] = js.native
  def apply(component: article, style: StyleObject): StyletronComponent[Pick[ComponentProps[article], Exclude[String, AnonClassName]]] = js.native
  def apply(component: aside, style: StyleObject): StyletronComponent[Pick[ComponentProps[aside], Exclude[String, AnonClassName]]] = js.native
  def apply(component: a, style: StyleObject): StyletronComponent[Pick[ComponentProps[a], Exclude[String, AnonClassName]]] = js.native
  def apply(component: audio, style: StyleObject): StyletronComponent[Pick[ComponentProps[audio], Exclude[String, AnonClassName]]] = js.native
  def apply(component: base, style: StyleObject): StyletronComponent[Pick[ComponentProps[base], Exclude[String, AnonClassName]]] = js.native
  def apply(component: bdi, style: StyleObject): StyletronComponent[Pick[ComponentProps[bdi], Exclude[String, AnonClassName]]] = js.native
  def apply(component: bdo, style: StyleObject): StyletronComponent[Pick[ComponentProps[bdo], Exclude[String, AnonClassName]]] = js.native
  def apply(component: big, style: StyleObject): StyletronComponent[Pick[ComponentProps[big], Exclude[String, AnonClassName]]] = js.native
  def apply(component: blockquote, style: StyleObject): StyletronComponent[Pick[ComponentProps[blockquote], Exclude[String, AnonClassName]]] = js.native
  def apply(component: body, style: StyleObject): StyletronComponent[Pick[ComponentProps[body], Exclude[String, AnonClassName]]] = js.native
  def apply(component: br, style: StyleObject): StyletronComponent[Pick[ComponentProps[br], Exclude[String, AnonClassName]]] = js.native
  def apply(component: b, style: StyleObject): StyletronComponent[Pick[ComponentProps[b], Exclude[String, AnonClassName]]] = js.native
  def apply(component: button, style: StyleObject): StyletronComponent[Pick[ComponentProps[button], Exclude[String, AnonClassName]]] = js.native
  def apply(component: canvas, style: StyleObject): StyletronComponent[Pick[ComponentProps[canvas], Exclude[String, AnonClassName]]] = js.native
  def apply(component: caption, style: StyleObject): StyletronComponent[Pick[ComponentProps[caption], Exclude[String, AnonClassName]]] = js.native
  def apply(component: circle, style: StyleObject): StyletronComponent[Pick[ComponentProps[circle], Exclude[String, AnonClassName]]] = js.native
  def apply(component: cite, style: StyleObject): StyletronComponent[Pick[ComponentProps[cite], Exclude[String, AnonClassName]]] = js.native
  def apply(component: clipPath, style: StyleObject): StyletronComponent[Pick[ComponentProps[clipPath], Exclude[String, AnonClassName]]] = js.native
  def apply(component: code, style: StyleObject): StyletronComponent[Pick[ComponentProps[code], Exclude[String, AnonClassName]]] = js.native
  def apply(component: colgroup, style: StyleObject): StyletronComponent[Pick[ComponentProps[colgroup], Exclude[String, AnonClassName]]] = js.native
  def apply(component: col, style: StyleObject): StyletronComponent[Pick[ComponentProps[col], Exclude[String, AnonClassName]]] = js.native
  def apply(component: datalist, style: StyleObject): StyletronComponent[Pick[ComponentProps[datalist], Exclude[String, AnonClassName]]] = js.native
  def apply(component: data, style: StyleObject): StyletronComponent[Pick[ComponentProps[data], Exclude[String, AnonClassName]]] = js.native
  def apply(component: dd, style: StyleObject): StyletronComponent[Pick[ComponentProps[dd], Exclude[String, AnonClassName]]] = js.native
  def apply(component: defs, style: StyleObject): StyletronComponent[Pick[ComponentProps[defs], Exclude[String, AnonClassName]]] = js.native
  def apply(component: del, style: StyleObject): StyletronComponent[Pick[ComponentProps[del], Exclude[String, AnonClassName]]] = js.native
  def apply(component: desc, style: StyleObject): StyletronComponent[Pick[ComponentProps[desc], Exclude[String, AnonClassName]]] = js.native
  def apply(component: details, style: StyleObject): StyletronComponent[Pick[ComponentProps[details], Exclude[String, AnonClassName]]] = js.native
  def apply(component: dfn, style: StyleObject): StyletronComponent[Pick[ComponentProps[dfn], Exclude[String, AnonClassName]]] = js.native
  def apply(component: dialog, style: StyleObject): StyletronComponent[Pick[ComponentProps[dialog], Exclude[String, AnonClassName]]] = js.native
  def apply(component: div, style: StyleObject): StyletronComponent[Pick[ComponentProps[div], Exclude[String, AnonClassName]]] = js.native
  def apply(component: dl, style: StyleObject): StyletronComponent[Pick[ComponentProps[dl], Exclude[String, AnonClassName]]] = js.native
  def apply(component: dt, style: StyleObject): StyletronComponent[Pick[ComponentProps[dt], Exclude[String, AnonClassName]]] = js.native
  def apply(component: ellipse, style: StyleObject): StyletronComponent[Pick[ComponentProps[ellipse], Exclude[String, AnonClassName]]] = js.native
  def apply(component: embed, style: StyleObject): StyletronComponent[Pick[ComponentProps[embed], Exclude[String, AnonClassName]]] = js.native
  def apply(component: em, style: StyleObject): StyletronComponent[Pick[ComponentProps[em], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feBlend, style: StyleObject): StyletronComponent[Pick[ComponentProps[feBlend], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feColorMatrix, style: StyleObject): StyletronComponent[Pick[ComponentProps[feColorMatrix], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feComponentTransfer, style: StyleObject): StyletronComponent[Pick[ComponentProps[feComponentTransfer], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feComposite, style: StyleObject): StyletronComponent[Pick[ComponentProps[feComposite], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feConvolveMatrix, style: StyleObject): StyletronComponent[Pick[ComponentProps[feConvolveMatrix], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feDiffuseLighting, style: StyleObject): StyletronComponent[Pick[ComponentProps[feDiffuseLighting], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feDisplacementMap, style: StyleObject): StyletronComponent[Pick[ComponentProps[feDisplacementMap], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feDistantLight, style: StyleObject): StyletronComponent[Pick[ComponentProps[feDistantLight], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feDropShadow, style: StyleObject): StyletronComponent[Pick[ComponentProps[feDropShadow], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feFlood, style: StyleObject): StyletronComponent[Pick[ComponentProps[feFlood], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feFuncA, style: StyleObject): StyletronComponent[Pick[ComponentProps[feFuncA], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feFuncB, style: StyleObject): StyletronComponent[Pick[ComponentProps[feFuncB], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feFuncG, style: StyleObject): StyletronComponent[Pick[ComponentProps[feFuncG], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feFuncR, style: StyleObject): StyletronComponent[Pick[ComponentProps[feFuncR], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feGaussianBlur, style: StyleObject): StyletronComponent[Pick[ComponentProps[feGaussianBlur], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feImage, style: StyleObject): StyletronComponent[Pick[ComponentProps[feImage], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feMergeNode, style: StyleObject): StyletronComponent[Pick[ComponentProps[feMergeNode], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feMerge, style: StyleObject): StyletronComponent[Pick[ComponentProps[feMerge], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feMorphology, style: StyleObject): StyletronComponent[Pick[ComponentProps[feMorphology], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feOffset, style: StyleObject): StyletronComponent[Pick[ComponentProps[feOffset], Exclude[String, AnonClassName]]] = js.native
  def apply(component: fePointLight, style: StyleObject): StyletronComponent[Pick[ComponentProps[fePointLight], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feSpecularLighting, style: StyleObject): StyletronComponent[Pick[ComponentProps[feSpecularLighting], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feSpotLight, style: StyleObject): StyletronComponent[Pick[ComponentProps[feSpotLight], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feTile, style: StyleObject): StyletronComponent[Pick[ComponentProps[feTile], Exclude[String, AnonClassName]]] = js.native
  def apply(component: feTurbulence, style: StyleObject): StyletronComponent[Pick[ComponentProps[feTurbulence], Exclude[String, AnonClassName]]] = js.native
  def apply(component: fieldset, style: StyleObject): StyletronComponent[Pick[ComponentProps[fieldset], Exclude[String, AnonClassName]]] = js.native
  def apply(component: figcaption, style: StyleObject): StyletronComponent[Pick[ComponentProps[figcaption], Exclude[String, AnonClassName]]] = js.native
  def apply(component: figure, style: StyleObject): StyletronComponent[Pick[ComponentProps[figure], Exclude[String, AnonClassName]]] = js.native
  def apply(component: filter, style: StyleObject): StyletronComponent[Pick[ComponentProps[filter], Exclude[String, AnonClassName]]] = js.native
  def apply(component: footer, style: StyleObject): StyletronComponent[Pick[ComponentProps[footer], Exclude[String, AnonClassName]]] = js.native
  def apply(component: foreignObject, style: StyleObject): StyletronComponent[Pick[ComponentProps[foreignObject], Exclude[String, AnonClassName]]] = js.native
  def apply(component: form, style: StyleObject): StyletronComponent[Pick[ComponentProps[form], Exclude[String, AnonClassName]]] = js.native
  def apply(component: g, style: StyleObject): StyletronComponent[Pick[ComponentProps[g], Exclude[String, AnonClassName]]] = js.native
  def apply(component: h1, style: StyleObject): StyletronComponent[Pick[ComponentProps[h1], Exclude[String, AnonClassName]]] = js.native
  def apply(component: h2, style: StyleObject): StyletronComponent[Pick[ComponentProps[h2], Exclude[String, AnonClassName]]] = js.native
  def apply(component: h3, style: StyleObject): StyletronComponent[Pick[ComponentProps[h3], Exclude[String, AnonClassName]]] = js.native
  def apply(component: h4, style: StyleObject): StyletronComponent[Pick[ComponentProps[h4], Exclude[String, AnonClassName]]] = js.native
  def apply(component: h5, style: StyleObject): StyletronComponent[Pick[ComponentProps[h5], Exclude[String, AnonClassName]]] = js.native
  def apply(component: h6, style: StyleObject): StyletronComponent[Pick[ComponentProps[h6], Exclude[String, AnonClassName]]] = js.native
  def apply(component: header, style: StyleObject): StyletronComponent[Pick[ComponentProps[header], Exclude[String, AnonClassName]]] = js.native
  def apply(component: head, style: StyleObject): StyletronComponent[Pick[ComponentProps[head], Exclude[String, AnonClassName]]] = js.native
  def apply(component: hgroup, style: StyleObject): StyletronComponent[Pick[ComponentProps[hgroup], Exclude[String, AnonClassName]]] = js.native
  def apply(component: hr, style: StyleObject): StyletronComponent[Pick[ComponentProps[hr], Exclude[String, AnonClassName]]] = js.native
  def apply(component: html, style: StyleObject): StyletronComponent[Pick[ComponentProps[html], Exclude[String, AnonClassName]]] = js.native
  def apply(component: iframe, style: StyleObject): StyletronComponent[Pick[ComponentProps[iframe], Exclude[String, AnonClassName]]] = js.native
  def apply(component: image, style: StyleObject): StyletronComponent[Pick[ComponentProps[image], Exclude[String, AnonClassName]]] = js.native
  def apply(component: img, style: StyleObject): StyletronComponent[Pick[ComponentProps[img], Exclude[String, AnonClassName]]] = js.native
  def apply(component: input, style: StyleObject): StyletronComponent[Pick[ComponentProps[input], Exclude[String, AnonClassName]]] = js.native
  def apply(component: ins, style: StyleObject): StyletronComponent[Pick[ComponentProps[ins], Exclude[String, AnonClassName]]] = js.native
  def apply(component: i, style: StyleObject): StyletronComponent[Pick[ComponentProps[i], Exclude[String, AnonClassName]]] = js.native
  def apply(component: kbd, style: StyleObject): StyletronComponent[Pick[ComponentProps[kbd], Exclude[String, AnonClassName]]] = js.native
  def apply(component: keygen, style: StyleObject): StyletronComponent[Pick[ComponentProps[keygen], Exclude[String, AnonClassName]]] = js.native
  def apply(component: label, style: StyleObject): StyletronComponent[Pick[ComponentProps[label], Exclude[String, AnonClassName]]] = js.native
  def apply(component: legend, style: StyleObject): StyletronComponent[Pick[ComponentProps[legend], Exclude[String, AnonClassName]]] = js.native
  def apply(component: linearGradient, style: StyleObject): StyletronComponent[Pick[ComponentProps[linearGradient], Exclude[String, AnonClassName]]] = js.native
  def apply(component: line, style: StyleObject): StyletronComponent[Pick[ComponentProps[line], Exclude[String, AnonClassName]]] = js.native
  def apply(component: link, style: StyleObject): StyletronComponent[Pick[ComponentProps[link], Exclude[String, AnonClassName]]] = js.native
  def apply(component: li, style: StyleObject): StyletronComponent[Pick[ComponentProps[li], Exclude[String, AnonClassName]]] = js.native
  def apply(component: main, style: StyleObject): StyletronComponent[Pick[ComponentProps[main], Exclude[String, AnonClassName]]] = js.native
  def apply(component: map, style: StyleObject): StyletronComponent[Pick[ComponentProps[map], Exclude[String, AnonClassName]]] = js.native
  def apply(component: marker, style: StyleObject): StyletronComponent[Pick[ComponentProps[marker], Exclude[String, AnonClassName]]] = js.native
  def apply(component: mark, style: StyleObject): StyletronComponent[Pick[ComponentProps[mark], Exclude[String, AnonClassName]]] = js.native
  def apply(component: mask, style: StyleObject): StyletronComponent[Pick[ComponentProps[mask], Exclude[String, AnonClassName]]] = js.native
  def apply(component: menuitem, style: StyleObject): StyletronComponent[Pick[ComponentProps[menuitem], Exclude[String, AnonClassName]]] = js.native
  def apply(component: menu, style: StyleObject): StyletronComponent[Pick[ComponentProps[menu], Exclude[String, AnonClassName]]] = js.native
  def apply(component: metadata, style: StyleObject): StyletronComponent[Pick[ComponentProps[metadata], Exclude[String, AnonClassName]]] = js.native
  def apply(component: meta, style: StyleObject): StyletronComponent[Pick[ComponentProps[meta], Exclude[String, AnonClassName]]] = js.native
  def apply(component: meter, style: StyleObject): StyletronComponent[Pick[ComponentProps[meter], Exclude[String, AnonClassName]]] = js.native
  def apply(component: mpath, style: StyleObject): StyletronComponent[Pick[ComponentProps[mpath], Exclude[String, AnonClassName]]] = js.native
  def apply(component: nav, style: StyleObject): StyletronComponent[Pick[ComponentProps[nav], Exclude[String, AnonClassName]]] = js.native
  def apply(component: noindex, style: StyleObject): StyletronComponent[Pick[ComponentProps[noindex], Exclude[String, AnonClassName]]] = js.native
  def apply(component: noscript, style: StyleObject): StyletronComponent[Pick[ComponentProps[noscript], Exclude[String, AnonClassName]]] = js.native
  def apply(component: ol, style: StyleObject): StyletronComponent[Pick[ComponentProps[ol], Exclude[String, AnonClassName]]] = js.native
  def apply(component: optgroup, style: StyleObject): StyletronComponent[Pick[ComponentProps[optgroup], Exclude[String, AnonClassName]]] = js.native
  def apply(component: option, style: StyleObject): StyletronComponent[Pick[ComponentProps[option], Exclude[String, AnonClassName]]] = js.native
  def apply(component: output, style: StyleObject): StyletronComponent[Pick[ComponentProps[output], Exclude[String, AnonClassName]]] = js.native
  def apply(component: param, style: StyleObject): StyletronComponent[Pick[ComponentProps[param], Exclude[String, AnonClassName]]] = js.native
  def apply(component: path, style: StyleObject): StyletronComponent[Pick[ComponentProps[path], Exclude[String, AnonClassName]]] = js.native
  def apply(component: pattern, style: StyleObject): StyletronComponent[Pick[ComponentProps[pattern], Exclude[String, AnonClassName]]] = js.native
  def apply(component: picture, style: StyleObject): StyletronComponent[Pick[ComponentProps[picture], Exclude[String, AnonClassName]]] = js.native
  def apply(component: polygon, style: StyleObject): StyletronComponent[Pick[ComponentProps[polygon], Exclude[String, AnonClassName]]] = js.native
  def apply(component: polyline, style: StyleObject): StyletronComponent[Pick[ComponentProps[polyline], Exclude[String, AnonClassName]]] = js.native
  def apply(component: pre, style: StyleObject): StyletronComponent[Pick[ComponentProps[pre], Exclude[String, AnonClassName]]] = js.native
  def apply(component: progress, style: StyleObject): StyletronComponent[Pick[ComponentProps[progress], Exclude[String, AnonClassName]]] = js.native
  def apply(component: p, style: StyleObject): StyletronComponent[Pick[ComponentProps[p], Exclude[String, AnonClassName]]] = js.native
  def apply(component: q, style: StyleObject): StyletronComponent[Pick[ComponentProps[q], Exclude[String, AnonClassName]]] = js.native
  def apply(component: radialGradient, style: StyleObject): StyletronComponent[Pick[ComponentProps[radialGradient], Exclude[String, AnonClassName]]] = js.native
  def apply(component: rect, style: StyleObject): StyletronComponent[Pick[ComponentProps[rect], Exclude[String, AnonClassName]]] = js.native
  def apply(component: rp, style: StyleObject): StyletronComponent[Pick[ComponentProps[rp], Exclude[String, AnonClassName]]] = js.native
  def apply(component: rt, style: StyleObject): StyletronComponent[Pick[ComponentProps[rt], Exclude[String, AnonClassName]]] = js.native
  def apply(component: ruby, style: StyleObject): StyletronComponent[Pick[ComponentProps[ruby], Exclude[String, AnonClassName]]] = js.native
  def apply(component: samp, style: StyleObject): StyletronComponent[Pick[ComponentProps[samp], Exclude[String, AnonClassName]]] = js.native
  def apply(component: script, style: StyleObject): StyletronComponent[Pick[ComponentProps[script], Exclude[String, AnonClassName]]] = js.native
  def apply(component: section, style: StyleObject): StyletronComponent[Pick[ComponentProps[section], Exclude[String, AnonClassName]]] = js.native
  def apply(component: select, style: StyleObject): StyletronComponent[Pick[ComponentProps[select], Exclude[String, AnonClassName]]] = js.native
  def apply(component: small, style: StyleObject): StyletronComponent[Pick[ComponentProps[small], Exclude[String, AnonClassName]]] = js.native
  def apply(component: source, style: StyleObject): StyletronComponent[Pick[ComponentProps[source], Exclude[String, AnonClassName]]] = js.native
  def apply(component: span, style: StyleObject): StyletronComponent[Pick[ComponentProps[span], Exclude[String, AnonClassName]]] = js.native
  def apply(component: s, style: StyleObject): StyletronComponent[Pick[ComponentProps[s], Exclude[String, AnonClassName]]] = js.native
  def apply(component: stop, style: StyleObject): StyletronComponent[Pick[ComponentProps[stop], Exclude[String, AnonClassName]]] = js.native
  def apply(component: strong, style: StyleObject): StyletronComponent[Pick[ComponentProps[strong], Exclude[String, AnonClassName]]] = js.native
  def apply(component: style, style: StyleObject): StyletronComponent[Pick[ComponentProps[style], Exclude[String, AnonClassName]]] = js.native
  def apply(component: sub, style: StyleObject): StyletronComponent[Pick[ComponentProps[sub], Exclude[String, AnonClassName]]] = js.native
  def apply(component: summary, style: StyleObject): StyletronComponent[Pick[ComponentProps[summary], Exclude[String, AnonClassName]]] = js.native
  def apply(component: sup, style: StyleObject): StyletronComponent[Pick[ComponentProps[sup], Exclude[String, AnonClassName]]] = js.native
  def apply(component: svg, style: StyleObject): StyletronComponent[Pick[ComponentProps[svg], Exclude[String, AnonClassName]]] = js.native
  def apply(component: switch, style: StyleObject): StyletronComponent[Pick[ComponentProps[switch], Exclude[String, AnonClassName]]] = js.native
  def apply(component: symbol, style: StyleObject): StyletronComponent[Pick[ComponentProps[symbol], Exclude[String, AnonClassName]]] = js.native
  def apply(component: table, style: StyleObject): StyletronComponent[Pick[ComponentProps[table], Exclude[String, AnonClassName]]] = js.native
  def apply(component: tbody, style: StyleObject): StyletronComponent[Pick[ComponentProps[tbody], Exclude[String, AnonClassName]]] = js.native
  def apply(component: td, style: StyleObject): StyletronComponent[Pick[ComponentProps[td], Exclude[String, AnonClassName]]] = js.native
  def apply(component: template, style: StyleObject): StyletronComponent[Pick[ComponentProps[template], Exclude[String, AnonClassName]]] = js.native
  def apply(component: textPath, style: StyleObject): StyletronComponent[Pick[ComponentProps[textPath], Exclude[String, AnonClassName]]] = js.native
  def apply(component: textarea, style: StyleObject): StyletronComponent[Pick[ComponentProps[textarea], Exclude[String, AnonClassName]]] = js.native
  def apply(component: text, style: StyleObject): StyletronComponent[Pick[ComponentProps[text], Exclude[String, AnonClassName]]] = js.native
  def apply(component: tfoot, style: StyleObject): StyletronComponent[Pick[ComponentProps[tfoot], Exclude[String, AnonClassName]]] = js.native
  def apply(component: thead, style: StyleObject): StyletronComponent[Pick[ComponentProps[thead], Exclude[String, AnonClassName]]] = js.native
  def apply(component: th, style: StyleObject): StyletronComponent[Pick[ComponentProps[th], Exclude[String, AnonClassName]]] = js.native
  def apply(component: time, style: StyleObject): StyletronComponent[Pick[ComponentProps[time], Exclude[String, AnonClassName]]] = js.native
  def apply(component: title, style: StyleObject): StyletronComponent[Pick[ComponentProps[title], Exclude[String, AnonClassName]]] = js.native
  def apply(component: track, style: StyleObject): StyletronComponent[Pick[ComponentProps[track], Exclude[String, AnonClassName]]] = js.native
  def apply(component: tr, style: StyleObject): StyletronComponent[Pick[ComponentProps[tr], Exclude[String, AnonClassName]]] = js.native
  def apply(component: tspan, style: StyleObject): StyletronComponent[Pick[ComponentProps[tspan], Exclude[String, AnonClassName]]] = js.native
  def apply(component: ul, style: StyleObject): StyletronComponent[Pick[ComponentProps[ul], Exclude[String, AnonClassName]]] = js.native
  def apply(component: use, style: StyleObject): StyletronComponent[Pick[ComponentProps[use], Exclude[String, AnonClassName]]] = js.native
  def apply(component: u, style: StyleObject): StyletronComponent[Pick[ComponentProps[u], Exclude[String, AnonClassName]]] = js.native
  def apply(component: video, style: StyleObject): StyletronComponent[Pick[ComponentProps[video], Exclude[String, AnonClassName]]] = js.native
  def apply(component: view, style: StyleObject): StyletronComponent[Pick[ComponentProps[view], Exclude[String, AnonClassName]]] = js.native
  def apply(component: wbr, style: StyleObject): StyletronComponent[Pick[ComponentProps[wbr], Exclude[String, AnonClassName]]] = js.native
  def apply(component: webview, style: StyleObject): StyletronComponent[Pick[ComponentProps[webview], Exclude[String, AnonClassName]]] = js.native
  def apply[C /* <: (ComponentClass[_, ComponentState]) | FunctionComponent[_] */](component: C, style: StyleObject): StyletronComponent[Pick[ComponentProps[C], Exclude[String, AnonClassName]]] = js.native
  def apply[P /* <: js.Object */](component: `object`, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[`object`], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: `var`, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[`var`], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: abbr, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[abbr], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: address, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[address], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: animateMotion, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[animateMotion], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: animateTransform, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[animateTransform], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: animate, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[animate], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: area, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[area], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: article, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[article], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: aside, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[aside], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: a, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[a], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: audio, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[audio], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: base, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[base], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: bdi, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[bdi], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: bdo, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[bdo], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: big, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[big], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: blockquote, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[blockquote], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: body, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[body], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: br, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[br], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: b, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[b], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: button, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[button], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: canvas, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[canvas], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: caption, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[caption], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: circle, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[circle], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: cite, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[cite], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: clipPath, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[clipPath], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: code, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[code], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: colgroup, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[colgroup], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: col, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[col], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: datalist, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[datalist], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: data, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[data], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: dd, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[dd], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: defs, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[defs], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: del, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[del], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: desc, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[desc], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: details, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[details], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: dfn, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[dfn], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: dialog, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[dialog], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: div, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[div], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: dl, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[dl], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: dt, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[dt], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: ellipse, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[ellipse], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: embed, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[embed], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: em, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[em], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feBlend, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feBlend], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feColorMatrix, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feColorMatrix], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feComponentTransfer, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[
    (Pick[ComponentProps[feComponentTransfer], Exclude[String, AnonClassName]]) with P
  ] = js.native
  def apply[P /* <: js.Object */](component: feComposite, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feComposite], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feConvolveMatrix, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feConvolveMatrix], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feDiffuseLighting, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feDiffuseLighting], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feDisplacementMap, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feDisplacementMap], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feDistantLight, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feDistantLight], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feDropShadow, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feDropShadow], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feFlood, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feFlood], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feFuncA, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feFuncA], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feFuncB, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feFuncB], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feFuncG, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feFuncG], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feFuncR, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feFuncR], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feGaussianBlur, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feGaussianBlur], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feImage, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feImage], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feMergeNode, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feMergeNode], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feMerge, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feMerge], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feMorphology, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feMorphology], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feOffset, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feOffset], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: fePointLight, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[fePointLight], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feSpecularLighting, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[
    (Pick[ComponentProps[feSpecularLighting], Exclude[String, AnonClassName]]) with P
  ] = js.native
  def apply[P /* <: js.Object */](component: feSpotLight, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feSpotLight], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feTile, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feTile], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: feTurbulence, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[feTurbulence], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: fieldset, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[fieldset], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: figcaption, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[figcaption], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: figure, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[figure], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: filter, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[filter], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: footer, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[footer], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: foreignObject, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[foreignObject], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: form, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[form], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: g, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[g], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: h1, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[h1], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: h2, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[h2], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: h3, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[h3], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: h4, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[h4], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: h5, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[h5], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: h6, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[h6], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: header, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[header], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: head, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[head], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: hgroup, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[hgroup], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: hr, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[hr], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: html, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[html], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: iframe, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[iframe], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: image, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[image], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: img, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[img], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: input, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[input], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: ins, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[ins], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: i, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[i], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: kbd, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[kbd], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: keygen, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[keygen], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: label, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[label], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: legend, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[legend], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: linearGradient, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[linearGradient], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: line, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[line], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: link, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[link], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: li, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[li], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: main, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[main], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: map, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[map], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: marker, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[marker], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: mark, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[mark], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: mask, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[mask], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: menuitem, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[menuitem], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: menu, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[menu], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: metadata, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[metadata], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: meta, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[meta], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: meter, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[meter], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: mpath, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[mpath], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: nav, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[nav], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: noindex, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[noindex], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: noscript, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[noscript], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: ol, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[ol], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: optgroup, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[optgroup], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: option, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[option], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: output, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[output], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: param, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[param], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: path, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[path], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: pattern, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[pattern], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: picture, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[picture], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: polygon, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[polygon], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: polyline, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[polyline], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: pre, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[pre], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: progress, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[progress], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: p, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[p], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: q, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[q], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: radialGradient, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[radialGradient], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: rect, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[rect], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: rp, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[rp], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: rt, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[rt], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: ruby, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[ruby], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: samp, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[samp], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: script, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[script], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: section, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[section], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: select, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[select], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: small, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[small], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: source, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[source], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: span, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[span], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: s, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[s], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: stop, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[stop], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: strong, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[strong], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: style, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[style], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: sub, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[sub], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: summary, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[summary], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: sup, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[sup], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: svg, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[svg], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: switch, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[switch], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: symbol, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[symbol], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: table, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[table], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: tbody, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[tbody], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: td, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[td], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: template, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[template], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: textPath, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[textPath], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: textarea, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[textarea], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: text, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[text], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: tfoot, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[tfoot], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: thead, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[thead], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: th, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[th], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: time, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[time], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: title, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[title], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: track, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[track], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: tr, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[tr], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: tspan, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[tspan], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: ul, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[ul], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: use, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[use], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: u, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[u], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: video, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[video], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: view, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[view], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: wbr, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[wbr], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */](component: webview, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[webview], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[C /* <: (ComponentClass[_, ComponentState]) | FunctionComponent[_] */, P /* <: js.Object */](component: C, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[(Pick[ComponentProps[C], Exclude[String, AnonClassName]]) with P] = js.native
}

