def scms(Map parameter){
  def GIT_URL = "${parameter.GIT_URL}"
  def BRANCH = "${parameter.BRANCH}"
  stage('Wish'){
    try {
      echo "$GIT_URL"
      echo "$BRANCH"
    }
    catch (e)
      echo "Fail"
    }
  }
}

