package com.ganesh.consumer;

import com.ganesh.producer.Message;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MessageConsumer {
    public static void main(String[] args) {

        BeanFactory springContainer = new XmlBeanFactory(new ClassPathResource("message.xml"));

        Message smsMessage = (Message)springContainer.getBean("sms");
        smsMessage.sendMessage("Person 1","Person 2");
        Message emailMessage = (Message)springContainer.getBean("email");
        emailMessage.sendMessage("Person 1","Person 2");
        Message textMessage = (Message)springContainer.getBean("text");
        textMessage.sendMessage("Person 1","Person 2");
    }
}
