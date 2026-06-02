def call(String imageName, String tag) {
    sh "trivy image --exit-code 0 --severrity HIGH, CRITICAL ${imageName}:${tag}"
}