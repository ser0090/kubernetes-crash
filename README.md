# kubernetes-crash
Kubernetes and Docker with Google Kubernetes Engine deploying Spring Boot Microservices Course

## Strapi Project
### Microk8s in Ubuntu
1 - install [microk8s](https://microk8s.io/docs/)
2 - config helm
```
microk8s.enable helm
```

`kubectl delete deployment tiller-deploy`

or 

`kubectl delete deployment tiller-deploy --namespace kube-system`

```
microk8s.helm init
```
3 - install heml strapi template
```
kubectl get pods --namespace kube-system
microk8s.helm install ./strapi/
```
