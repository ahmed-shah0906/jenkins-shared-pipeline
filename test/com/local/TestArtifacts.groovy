package com.local

import com.local.Helpers.PipelineTestBase
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*

class TestArtifacts extends PipelineTestBase {

   def "getArtifactPath generate correct fie path"() {
      given:
         def script = loadScript('vars/artifacts.groovy')

      when:
         Map inputParam = [repo: 'Path_To_Repo_Test/' , branchName: 'feature/pdf']
         String result = script.getArtifactPath(inputParam)

      then:
         assertJobStatusSuccess()
         assertThat result, equalTo('Path_To_Repo_Test/feature%2Fpdf')
   }

   def "getArtifactPath throw assertion error"() {
      given:
         def script = loadScript('vars/artifacts.groovy')

      when:
         String result = script.getArtifactPath(null)

      then:
         assertJobStatusSuccess()
         thrown AssertionError
   }
}
