def call(String project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword('credentialsId':"dockerHubCredential",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker Push ${dockerhubuser}/${Project}:${ImageTag}"
}
