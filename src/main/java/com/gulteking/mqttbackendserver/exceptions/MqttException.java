package com.gulteking.mqttbackendserver.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class MqttException extends RuntimeException{
    public MqttException(String message) {
        super(message);
    }
}
