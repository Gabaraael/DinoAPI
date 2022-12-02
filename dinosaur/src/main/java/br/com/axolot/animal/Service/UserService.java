package br.com.axolot.animal.Service;

import br.com.axolot.animal.dtos.UserRegister;
import br.com.axolot.animal.model.UserEntity;
import br.com.axolot.animal.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder encoder, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void register(UserRegister userRegister) {
        userRepository.save(buildUser(userRegister));
    }

    public UserEntity buildUser(UserRegister userRegister) {
        return UserEntity.builder()
                .username(userRegister.getUsername())
                .password(passwordEncoder.encode(userRegister.getPassword()))
                .build();
    }

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }
}
