def call(String project, String ImageTag, String dockerHubuser){
  withCredentials([usernamePassword('credentialsId':"dockerHubCredential",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
      sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "docker Push ${dockerHubUser}/${Project}:${ImageTag}"
}
