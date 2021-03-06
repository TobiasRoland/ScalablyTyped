package typings.firebaseFirestore

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.persistenceMod.Persistence
import typings.firebaseFirestore.remoteDocumentChangeBufferMod.RemoteDocumentChangeBuffer
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/local/test_remote_document_change_buffer", JSImport.Namespace)
@js.native
object testRemoteDocumentChangeBufferMod extends js.Object {
  @js.native
  class TestRemoteDocumentChangeBuffer protected () extends js.Object {
    def this(persistence: Persistence, buffer: RemoteDocumentChangeBuffer) = this()
    var buffer: RemoteDocumentChangeBuffer = js.native
    var persistence: Persistence = js.native
    def addEntry(maybeDocument: MaybeDocument, readTime: SnapshotVersion): Unit = js.native
    @JSName("apply")
    def apply(): js.Promise[Unit] = js.native
    def getEntry(documentKey: DocumentKey): js.Promise[MaybeDocument | Null] = js.native
    def removeEntry(key: DocumentKey): Unit = js.native
  }
  
}

