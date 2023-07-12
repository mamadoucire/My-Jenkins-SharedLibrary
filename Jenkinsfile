pipeline{
    agent any

    stages{
        stage("deploy to remote"){
            steps{
                sh "scp -r /var/lib/jenkins/workspace/php/m root@192.168.221.130:/var/www/html/nbaquateck/ -P 2222"
            }
        }
    }
}
