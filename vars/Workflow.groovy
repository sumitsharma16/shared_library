def call(Map parameter) {
    
     bitbucket.scm(
        stageName: "checkout SCM",
        GIT_URL:   "${config.GIT_URL}",
        BRANCH:    "${config.BRANCH}"
    )
}
