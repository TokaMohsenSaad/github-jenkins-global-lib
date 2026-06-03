def call (String imageName, String tag, String registry) {
    sh """
        echo 'Pushing Image'
        docker tag grad-pro:${tag} ${registry}/${imageName}:${tag}
        docker push ${registry}/${imageName}:${tag}
    """
}