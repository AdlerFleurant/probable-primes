# Probable Primes Example Application

This example application is a simple REST service that returns a list of probable primes based on the `max` number and the provided `certainty`.

```
GET /primes/{max}/{certainty}
```

For instance 
```bash
$ GET /primes/11/100
# Returns
{"certainty":100,"max":11,"results":[2,3,5,7,11]}
```