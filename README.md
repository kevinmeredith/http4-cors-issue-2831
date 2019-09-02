### Run the App


### Curl it

```
$curl -i localhost:8080/welcome --header 'authorization:hello_world'
HTTP/1.1 200 OK
Content-Type: text/plain; charset=UTF-8
Date: Fri, 10 May 2019 03:12:51 GMT
Content-Length: 36

Header is authorization: hello_world$
$
$curl -i localhost:8080/organizations --header 'authorization:hello_world'
HTTP/1.1 404 Not Found
Content-Type: text/plain; charset=UTF-8
Date: Fri, 10 May 2019 03:13:05 GMT
Content-Length: 9

Not found

$curl -i localhost:8080/organizations
HTTP/1.1 401 Unauthorized
Date: Fri, 10 May 2019 03:15:21 GMT
Content-Length: 0
```