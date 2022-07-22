package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.IUserRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private IUserRepository _userRepository;
    public UserService(IUserRepository userRepository){
        _userRepository = userRepository;
    }
    
    public long UserCount(){
        return _userRepository.count();
    }
    
    public List<User> UserList(){
        return _userRepository.findAll();
    }
}
