def call(String git_credentials, String repoUrl) {
    withCredentials([usernamePassword(credentialsId: git_credentials, usernameVariable: 'GIT_USER', passwordVariable: 'GIT_PASS')]) {
        sh """
            git config user.email "jenkins@clouddevops.com"
            git config user.name "Jenkins CI"
            git add kubernetes/deployment.yml
            git commit -m "ci: update image tag via Jenkins" || true
            git push https://${GIT_USER}:${GIT_PASS}@${repoUrl} HEAD:master
        """
    }
}