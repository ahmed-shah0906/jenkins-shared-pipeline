package com.local.Helpers
import spock.lang.Specification

class PipelineTestBase extends Specification {

   @Delegate PipelineTestHelper pipelineTestHelper

   /**
    * Do the common setup
    */
   def setup() {
      pipelineTestHelper = new PipelineTestHelper()
      pipelineTestHelper.setUp()
   }
}
