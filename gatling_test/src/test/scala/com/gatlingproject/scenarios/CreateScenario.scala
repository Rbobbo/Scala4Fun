package com.gatlingproject.scenarios

import com.gatlingproject.requests.{CreateRequest}
import io.gatling.core.Predef.scenario

object CreateScenario {
  val createScenario = scenario("Create Scenario")
    .exec(CreateRequest.create_)
}