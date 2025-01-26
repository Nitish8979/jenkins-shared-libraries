def call(String project, String imageTag, String dockerHubUser) {
    echo "DockerHub user: ${dockerHubUser}"
    echo "Project: ${project}"
    echo "ImageTag: ${imageTag}"

    withCredentials([usernamePassword(credentialsId: "dockerHubCredential", passwordVariable: "dockerHubPass", usernameVariable: "dockerHubUser")]) {
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    }

    sh "docker push ${dockerHubUser}/${project}:${imageTag}"
}

