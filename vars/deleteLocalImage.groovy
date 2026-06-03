def call(String imageName, String tag, String registry) {
    sh """
        echo 'Cleaning up local images...'
        docker rmi ${imageName}:${tag} --force
        docker rmi ${registry}/${imageName}:${tag} --force
    """
}