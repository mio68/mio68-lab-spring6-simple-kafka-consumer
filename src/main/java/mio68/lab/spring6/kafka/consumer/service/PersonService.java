package mio68.lab.spring6.kafka.consumer.service;

import lombok.extern.slf4j.Slf4j;
import mio68.lab.spring6.kafka.consumer.dto.Person;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonService {

    @KafkaListener(topics = "persons")
    public void registerPerson(Person person) {
        log.info("Person registered: [{}].", person);
    }

}
