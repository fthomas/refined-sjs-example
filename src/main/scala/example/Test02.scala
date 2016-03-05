package example

import eu.timepit.refined._
import eu.timepit.refined.collection.NonEmpty
import eu.timepit.refined.string.StartsWith
import scala.scalajs.js.annotation.JSExport

@JSExport
object Test02 {
  val x01 = refineMV[NonEmpty]("js")
  val x02 = refineMT[StartsWith[W.`"abc"`.T]]("abcdef")
}
