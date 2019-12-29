package com.hyecheon.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {

    @Value("#{target.username + ' '+ target.age}")
    String getUsernameAndAge();

    String getUsername();
}
