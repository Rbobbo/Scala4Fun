package com.gatlingproject.simulations

import com.gatlingproject.scenarios.CreateScenario
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._
import com.gatlingproject.config.Config._

class CreateSimulation extends Simulation {
  
  private val createExec = CreateScenario.createScenario
  
  setUp(createExec.inject(atOnceUsers(150)))
  
}