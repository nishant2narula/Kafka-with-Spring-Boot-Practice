# Kafka-with-Spring-Boot-Practice
Spring Boot Kafka Project

https://kafka.apache.org/quickstart/

First Generate a Cluster ID:-
$ KAFKA_CLUSTER_ID="$(bin/kafka-storage.sh random-uuid)"

Format Log Directories
$ bin/kafka-storage.sh format --standalone -t $KAFKA_CLUSTER_ID -c config/server.properties


Start the Kafka Server
$ bin/kafka-server-start.sh config/server.properties


Start the consumer with the topic 
bin/kafka-console-consumer.sh --topic JsonMessage --from-beginning --bootstrap-server localhost:9092



<img width="901" height="633" alt="Terminal Screenshot" src="https://github.com/user-attachments/assets/856ac34f-9ed8-47d6-b2df-88e1669e82e6" />
