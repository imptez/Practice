package walmart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.config.SslConfigs;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;

public class OrderKafkaPublisher {

    public static void main(String[] args) {


        Producer<String, Employee> producer = new KafkaProducer<>(getKafkaConsumerSecureConfigs());

        Employee employee1 = new Employee("John Doe", 30, "Software Engineer");
        Employee employee2 = new Employee("Jane Smith", 25, "Data Analyst");

        producer.send(new ProducerRecord<>("employee-topic", employee1.getName(), employee1));
        producer.send(new ProducerRecord<>("employee-topic", employee2.getName(), employee2));

        producer.close();
    }
    public static  Properties getKafkaConsumerSecureConfigs() {

        Properties props = new Properties();

        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(
                CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG, "kafka-1301504412-1-1404508139.scus.kafka-v2-secured-shared3-stg.ms-df-messaging.stg-az-southcentralus-10.prod.us.walmart.net:9093,kafka-1301504412-2-1404508142.scus.kafka-v2-secured-shared3-stg.ms-df-messaging.stg-az-southcentralus-10.prod.us.walmart.net:9093,kafka-1301504412-3-1404508145.scus.kafka-v2-secured-shared3-stg.ms-df-messaging.stg-az-southcentralus-10.prod.us.walmart.net:9093,kafka-1301504412-4-1404508148.scus.kafka-v2-secured-shared3-stg.ms-df-messaging.stg-az-southcentralus-10.prod.us.walmart.net:9093,kafka-1301504412-5-1404508151.scus.kafka-v2-secured-shared3-stg.ms-df-messaging.stg-az-southcentralus-10.prod.us.walmart.net:9093,kafka-1301504412-6-1404508154.scus.kafka-v2-secured-shared3-stg.ms-df-messaging.stg-az-southcentralus-10.prod.us.walmart.net:9093");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "delta-batch-consumers");
        props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SSL");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
        props.put(
                SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG, "C:\\Users\\vn537tm\\Payments_Workspace\\asda-extractor\\secrets\\APM0015374.truststore.jks");
        props.put(
                SslConfigs.SSL_TRUSTSTORE_PASSWORD_CONFIG, "Asdaqa@ods1234");
        props.put(
                SslConfigs.SSL_KEYSTORE_LOCATION_CONFIG, "C:\\Users\\vn537tm\\Payments_Workspace\\asda-extractor\\secrets\\APM0015374.keystore.jks");
        props.put(SslConfigs.SSL_KEYSTORE_PASSWORD_CONFIG, "Asdaqa@ods1234");
        props.put(SslConfigs.SSL_KEY_PASSWORD_CONFIG, "Asdaqa@ods1234");
        return props;
    }


    class EmployeeSerializer implements org.apache.kafka.common.serialization.Serializer<Employee> {
        @Override
        public byte[] serialize(String topic, Employee employee) {
            String json = "{\"name\":\"" + employee.getName() + "\",\"age\":" + employee.getAge() + ",\"position\":\"" + employee.getPosition() + "\"}";
            return json.getBytes();
        }

        @Override
        public void configure(java.util.Map<java.lang.String, ?> configs, boolean isKey) {
            // do nothing
        }

        @Override
        public void close() {
            // do nothing
        }
    }
}