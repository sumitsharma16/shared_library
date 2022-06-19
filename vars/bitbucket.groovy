def scm(Map parameter){
  def bitbucket_URL = "${parameter.bitbucket_URL}"
  def TAG = "${parameter.TAG}"
  stage('Wish'){
    try {
      echo "$bitbucket_URL"
      echo "$TAG"
    }
    catch (e)
      echo "Fail"
    }
  }
}

