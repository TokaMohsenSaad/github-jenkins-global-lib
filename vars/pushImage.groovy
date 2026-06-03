def call (String imageName, String tag, String registry) {
    sh """ echo "Pushing Image"
    docker push ${registry}/${imageName}:${tag}
"""
}
