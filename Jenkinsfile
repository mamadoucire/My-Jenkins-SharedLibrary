pipeline{
    agent any

    stages{
        stage("deploy to remote"){
            steps{
                sh "scp -r $WORKSPACE/m root@192.168.221.130:/var/www/html/nbaquateck/"
            }
        }
    }
}
