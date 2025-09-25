package com.example.tima.service.serviceImpl;

import com.example.tima.dto.UserRequest;
import com.example.tima.enity.User;
import com.example.tima.enums.Role;
import com.example.tima.repo.UserRepository;
import com.example.tima.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User registerGuest(UserRequest request) {
        User guest = User.builder()
                .fullName(request.fullName())
                .relatives(request.relatives())
                .isCome(request.isCome())
                .guestCount(request.guestCount())
                .role(Role.USER)
                .build();
        return userRepository.save(guest);
    }

    @Override
    public List<User> getAllGuests() {
        return userRepository.findAll();
    }
}

