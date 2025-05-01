pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                bat 'mvn clean package -DskipTests=true'
            }
        }
        stage('Test'){
            steps{
                bat 'mvn test'
            }
        }
        stage('Deploy'){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'TomcatExternal', path: '', url: 'http://172.16.30.233:9000')], contextPath: 'te', war: 'target/ExampleJenkins.war'
            }
        }
    }
}