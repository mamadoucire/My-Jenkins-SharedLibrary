pipepline{
    agent any 

    stages{
        stage("deply to remote"){
            steps{
                sh "scp $(WORKSPACE)/m diane@192.168.221.130:/var/www/html/nbaquateck/"
            }
        }
    }
}