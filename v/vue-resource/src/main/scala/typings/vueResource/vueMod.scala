package typings.vueResource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$http")
    var $http_Original: AnonDelete = js.native
    @JSName("$resource")
    var $resource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $resource */ js.Any = js.native
    @JSName("$http")
    def $http(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ js.Any
    ): js.Thenable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpResponse */ _
      ] = js.native
  }
  
}

