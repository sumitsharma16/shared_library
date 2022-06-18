def scm(Map parameter){
  def name = "${parameter.name}"
  stage('Wish'){
    try {
      echo "${name}"
    }
    catch (e)
      echo "Fail"
    }
  }
}
def 
