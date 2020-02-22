package tagging

import sttp.tapir.Schema
import sttp.tapir.SchemaType.SInteger
import tagging.IntField.IntField

case class Foo(optionalIntField: Option[IntField])

object Foo {
  implicit val schema: Schema[Foo] = Schema.derivedSchema[Foo] // doesn't compile
}

case class Bar(optionalIntField: IntField)
object Bar {
  implicit val schema: Schema[Bar] = Schema.derivedSchema[Bar]
}

object IntField extends TaggedInt {
  type IntField = Type

  implicit val schema: Schema[IntField] = Schema(SInteger)
}
