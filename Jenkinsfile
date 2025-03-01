pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "dhaval543/eateasybackend"
        AWS_REGION = "us-east-1"
        EKS_CLUSTER = "EatsEasyCluster"
    }

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/dhaval543/EatEasyBackend'
            }
        }

        stage('Build & Test Microservices') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Docker Build & Push') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE:latest .'
                sh 'docker login -u dhaval543 -p Gandhinagar@123'
                sh 'docker push $DOCKER_IMAGE:latest'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'aws eks update-kubeconfig --region $AWS_REGION --name $EKS_CLUSTER'
                sh 'kubectl apply -f kubernetes/deployment.yaml'
            }
        }
    }

    post {
        success {
            echo "Deployment Successful!"
        }
        failure {
            echo "Deployment Failed!"
        }
    }
}
