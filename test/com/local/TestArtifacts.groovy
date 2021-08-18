package com.local

import com.local.Helpers.PipelineTestBase
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*

class TestArtifacts extends PipelineTestBase {

   def "getArtifactPath generate correct fie path"() {
      given:
         def script = loadScript('vars/artifacts.groovy')

      when:
         String result = script.getArtifactPath('CI/BusinessService/','feature/pdf')

      then:
         assertJobStatusSuccess()
         assertThat result, equalTo('CI/BusinessService/feature%2Fpdf')
   }

   def "getArtifactPath throw assertion error"() {
      given:
         def script = loadScript('vars/artifacts.groovy')

      when:
         String result = script.getArtifactPath(null,null)

      then:
         assertJobStatusSuccess()
         thrown AssertionError
   }
}
