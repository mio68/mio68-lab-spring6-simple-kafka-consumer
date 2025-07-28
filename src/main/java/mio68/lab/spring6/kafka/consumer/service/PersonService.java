package mio68.lab.spring6.kafka.consumer.service;

import lombok.extern.slf4j.Slf4j;
import mio68.lab.spring6.kafka.consumer.dto.Person;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonService {

    @KafkaListener(topics = "persons")
/*
     TODO Что будет если обработчик бросит исключение. Необходимо проработать и реализовать.
     Рассмотреть варианты
     1. При возникновении ошибки делаем повторы и если лимит повторов исчерпан то переходим к следующему сообщению.
     2. При возникновении ошибки делаем повторы и если лимит повторов исчерпан то отбрасываем плохое сообщение в DLT и
     переходим к следующему сообщению.
*/
    public void registerPerson(Person person) {
        log.info("Person registered: [{}].", person);
    }

}
