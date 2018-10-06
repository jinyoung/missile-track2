# missile-track

## Usage
```
$ http 35.193.131.103:8080/missile
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Date: Fri, 28 Sep 2018 13:38:50 GMT
Transfer-Encoding: chunked
{
    "outOfRange": false,
    "xLocation": 0.0,
    "yLocation": 0.0,
    "zLocation": 0.0
}

$ http POST 35.193.131.103:8080/missile outOfRange=true
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Date: Fri, 28 Sep 2018 13:38:50 GMT
Transfer-Encoding: chunked
{
    "outOfRange": true,
    "xLocation": 0.0,
    "yLocation": 0.0,
    "zLocation": 0.0
}
```

## Deploying to GKE
```
 mvn package -B
 docker build -t gcr.io/my-project-1531888882785/missile:v1 .
 docker push gcr.io/my-project-1531888882785/missile:v1
 kubectl run missile --image=gcr.io/my-project-1531888882785/missile:v1
 kubectl expose deploy/missile --type=LoadBalancer --port=8080
 kubectl get svc -w
```

## Rolling update to GKE
```
 git pull
 mvn package -B
 docker build -t gcr.io/my-project-1531888882785/missile:v2 .
 docker push gcr.io/my-project-1531888882785/missile:v2
 kubectl set image deploy/missile missile=gcr.io/my-project-1531888882785/missile:v2
```
