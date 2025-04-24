pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                bat ('mvn clean package -DskipTests=true')
            }
        }
        stage('Test'){
            steps{
                bat ('mvn test')
            }
        }
        stage('Deploy'){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'TomcatExternal', path: '', url: 'http://172.16.31.7:9000')], contextPath: 'te', war: 'ExampleJenkins.war
            }
        }
    }
}