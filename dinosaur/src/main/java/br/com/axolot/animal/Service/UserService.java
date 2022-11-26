package br.com.axolot.animal.Service;

import br.com.axolot.animal.dtos.DinoDto;
import br.com.axolot.animal.model.UserEntity;
import br.com.axolot.animal.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }
}
