### Spring Kafka. Обработка ошибок десериализации сообщений 

Если не предусмотреть обработку ошибок десериализации то процесс обработки сообщений Кафка зациклится на 
"плохом" сообщении выполняя бесконечные повторы.

Решение - использовать десериализатор умеющий обрабатывать ошибки, взаимодействуя с обработчиком ошибок.
Такой десериализатор это org.springframework.kafka.support.serializer.ErrorHandlingDeserializer.
см. [application.yml](application.yml)

Обработчик ошибок по умолчанию будет пропускать "плохие" сообщения, при необходимости можно кастомизировать
обработчик ошибок чтобы отбрасывать "плохие" сообщения в DLT.
см. [DltConfiguration.java](src/main/java/mio68/lab/spring6/kafka/consumer/configuration/DltConfiguration.java)

Обрати внимание на TODO в [PersonService.java](src/main/java/mio68/lab/spring6/kafka/consumer/service/PersonService.java)