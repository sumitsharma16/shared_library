def call(Map parameter) {
    
    bitbucket.scms()
    config = pipelineConfig.readPropFiles(
        configFile: "${parameter.configFile}"
    )
     bitbucket.scms(
        stageName: "checkout SCM",
        GIT_URL:   "${config.GIT_URL}",
        TAG:    "${config.TAG}"
    )
}
