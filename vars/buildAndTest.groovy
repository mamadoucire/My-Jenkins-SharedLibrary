def call() {
    stage('Build and Test') {
        // Build dans un conteneur Docker
        sh 'docker build -t java1 .'
        sh 'docker run java1 mvn clean test'
    }
}
