# SpringBoot LDAP Integration
This application includes both LDAP and DAO authentication structures.

### Apache Directory Studio - LDAP Users ###
<img src="https://github.com/OzgurAkinci/spring-boot-ldap-integration/blob/master/ldap-1.png" alt="ldap-users">

# Public endpoint
```
curl http://localhost:8080/api/public/test
```

# Secure endpoint (for LDAP Authentication)
```
curl -u ozgur:password http://localhost:8080/api/secure/test
```

# Secure endpoint (for DAO Authentication)
```
curl -u dbuser:dbpass http://localhost:8080/api/secure/test
```