# Spring Boot Project for Kafka

## Use docker-compose file to create Kafka cluster for testing

## Use offset explorer as Kafka ui tool 
https://www.kafkatool.com/download.html

## Binding Maps

>		my:
>		   map:
>		     "[/key1]": "value1"
>		     "[/key2]": "value2"
>		     "/key3": "value3"

   
> Note: For YAML files, the brackets need to be surrounded by quotes for the keys to be parsed properly.
    
The properties above will bind to a Map with /key1, /key2 and key3 as the keys in the map. The slash has been removed from key3 because it was not surrounded by square brackets.

You may also occasionally need to use the bracket notation if your key contains a . and you are binding to non-scalar value. For example, binding a.b=c to Map<String, Object> will return a Map with the entry {"a"={"b"="c"}} whereas [a.b]=c will return a Map with the entry {"a.b"="c"}.

https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#messaging.kafka