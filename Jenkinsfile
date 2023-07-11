pipeline{
    agent any

    stages{
        stage("deploy to remote"){
            steps{
                sh "scp -r $WORKSPACE/m diane@192.168.221.130:/var/www/html/nbaquateck/"
            }
        }
    }
}
