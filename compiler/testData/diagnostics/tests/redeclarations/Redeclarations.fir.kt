// FILE: a.kt
package redeclarations
  object <!CLASSIFIER_REDECLARATION!>A<!> {
    val x : Int = 0

    val A = 1
  }

  class <!CLASSIFIER_REDECLARATION!>A<!> {}

  val <!REDECLARATION!>A<!> = 1

// FILE: b.kt
  package redeclarations.A
    class A {}
