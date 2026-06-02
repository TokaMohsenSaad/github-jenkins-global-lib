def call(String imageName, String tag, String registry, String manifestPath = "kubernetes/deployment.yaml"){
    sh """ echo "Updating Manifest"
     sed -i 's|image: .*|image: ${registry}/${imageName}:${tag}|g' ${manifestPath}
     """
}