🎮 Java Game App (Spring Boot + Docker + Kubernetes)

A simple Java-based game backend application built with Spring Boot, containerized using Docker, and deployed on Kubernetes using Helm.

📌 Features

RESTful backend built with Spring Boot

Health and root endpoints

Dockerized for easy deployment

Kubernetes-ready with Helm charts

Supports port-forwarding and NodePort access

🛠️ Tech Stack

Java 17

Spring Boot

Maven

Docker

Kubernetes

Helm + argo 


This is a simple Java Spring Boot application containerized using Docker and deployed on Kubernetes. The project uses GitHub Actions to automatically build the application and push the Docker image to Docker Hub on every push to the main branch.

The application exposes REST APIs and supports port-forwarding or NodePort access in Kubernetes.
