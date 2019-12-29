package com.hyecheon.datajpa.repository;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class UsernameOnlyDto {
    private final String username;
}
