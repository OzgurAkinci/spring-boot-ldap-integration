# SpringBoot LDAP Integration


### Apache Directory Studio - LDAP Users ###
<img src="https://github.com/OzgurAkinci/spring-boot-ldap-integration/blob/master/ldap-1.png" alt="ldap-users">

# Public endpoint
```
curl http://localhost:8080/api/public/test
```

# Secure endpoint (authentication gerekli)
```
curl -u ozgur:password http://localhost:8080/api/secure/test
```