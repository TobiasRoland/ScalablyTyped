package typings.angularCommon.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.KeyValueDiffers
import typings.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "\u0275angular_packages_common_common_j")
@js.native
object ɵangularPackagesCommonCommonJ extends js.Object {
  @js.native
  class provide () extends ɵNgStyleImpl
  
  @js.native
  class useClass protected () extends ɵNgStyleR2Impl {
    def this(_ngEl: ElementRef[_], _differs: KeyValueDiffers, _renderer: Renderer2) = this()
  }
  
  @js.native
  object provide extends TopLevel[Instantiable0[ɵNgStyleImpl]]
  
  @js.native
  object useClass
    extends TopLevel[
          Instantiable3[
            /* _ngEl */ ElementRef[js.Any], 
            /* _differs */ KeyValueDiffers, 
            /* _renderer */ Renderer2, 
            ɵNgStyleR2Impl
          ]
        ]
  
}

