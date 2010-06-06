package com.jarodl.scala_ci

import org.specs.Specification
import org.specs.mock.{ClassMocker, JMocker}


object SampleSpec extends Specification with JMocker with ClassMocker {
  "Sample" should {
    "run a test" in {
      23 mustEqual 23
    }
  }
}
