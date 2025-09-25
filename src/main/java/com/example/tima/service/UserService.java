package com.example.tima.service;


import com.example.tima.dto.UserRequest;
import com.example.tima.enity.User;

import java.util.List;

public interface UserService {
    User registerGuest(UserRequest request);
    List<User> getAllGuests();
}
