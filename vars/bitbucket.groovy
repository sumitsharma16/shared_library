def scms(Map parameter){
  def GIT_URL = "${parameter.GIT_URL}"
  def TAG = "${parameter.TAG}"
  stage('Wish'){
    try {
      echo "$GIT_URL"
      echo "$TAG"
    }
    catch (e)
      echo "Fail"
    }
  }
}

