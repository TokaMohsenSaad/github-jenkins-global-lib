def call(String imageName, String tag, String registry, String manifestPath = "kubernetes/deployment.yml"){
    sh """ echo "Updating Manifest"
     sed -i 's|image: .*|image: ${registry}/${imageName}:${tag}|g' ${manifestPath}
     """
}