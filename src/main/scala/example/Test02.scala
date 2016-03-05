package example

import eu.timepit.refined._
import eu.timepit.refined.collection.NonEmpty
import eu.timepit.refined.string.{ EndsWith, StartsWith, Xml }
import scala.scalajs.js.annotation.JSExport

@JSExport
object Test02 {
  val x01 = refineMV[NonEmpty]("js")
  val x02 = refineMT[StartsWith[W.`"abc"`.T]]("abcdef")
  val x03 = refineMV[Xml]("<elem>Hallo</elem>")
  val x04 = refineMT[EndsWith[W.`"123456789"`.T]]("0123456789")
}