package com.gatlingproject.requests

import com.testingexcellence.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import java.util.UUID

object CreateRequest {

  val reqPath = """C:\workspace_SOAPUI\gatling_test\src\test\resources\bodies\body_template.xml"""
  
  println("Template Request Path -> " + reqPath)
  
  val req = scala.
                  io.
                     Source.
                            fromFile(reqPath)
                                .getLines
                                .mkString
  
  println("Template Request -> " + req)
    
  /**
   * In Gatling, checks are usually used to check for status codes response bodies, 
   * whereas assertions are normally used to assert on timings of responses.
   * */
  
  val create_ = exec(http("Stress Test Inserimento Richiesta")
    .post(app_url + "/rest/realtime/request/")
    .header("Content-Type", "application/xml")
    .body(StringBody(req.toString()))
    .check(status is 200))

}