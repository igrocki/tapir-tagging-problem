package tagging

import com.softwaremill.tagging._

trait TaggedType[V]  {
  type U = this.type
  type T = V

  type Type = T @@ U

  def apply(t: T): Type = t.taggedWith[U]
}

trait TaggedInt extends TaggedType[Int]
