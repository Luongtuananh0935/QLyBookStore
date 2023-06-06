package hutech.LuongTuanAnh.demo.services;

import hutech.LuongTuanAnh.demo.enity.User;
import hutech.LuongTuanAnh.demo.repository.IUserRepository;
import hutech.LuongTuanAnh.demo.enity.User;
import hutech.LuongTuanAnh.demo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public void save(User user){ userRepository.save(user);}
}
