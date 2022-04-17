# Spring Boot and Spring Security using JWT

The JWT Tokens are used to access the application and the tokens are refreshed after they are expired.

This repo contains 

#JWT Structure

THE JWT has header, payload, signature.
The header typically consists of two parts: the type of the token, which is JWT, and the signing algorithm being used, such as HMAC SHA256 or RSA.

The payload contains the claims. Claims are statements about an entity (typically, the user) and additional data. There are three types of claims: registered, public, and private claims.

To create the signature part you have to take the encoded header, the encoded payload, a secret, the algorithm specified in the header, and sign that.
HMACSHA256(
  base64UrlEncode(header) + "." +
  base64UrlEncode(payload),
  secret)

The output is three Base64-URL strings separated by dots that can be easily passed in HTML and HTTP environments, while being more compact when compared to XML-based standards such as SAML.
Therefore, a JWT typically looks like the following.
xxxxx.yyyyy.zzzzz

To experiment with JWT,
following link can be used : https://jwt.io/#debugger-io 


In authentication, when the user successfully logs in using their credentials, a JSON Web Token will be returned. Since tokens are credentials, great care must be taken to prevent security issues. In general, you should not keep tokens longer than required.

#Benefits of JWT

Benefits of JSON Web Tokens (JWT) when compared to Simple Web Tokens (SWT) and Security Assertion Markup Language Tokens (SAML) are as follows:



To view a live demo, [click here](https://github.com/skushal746/UserServiceSpringSecurity).

Future Improvements:
