package hutech.LuongTuanAnh.demo.validator;

import hutech.LuongTuanAnh.demo.repository.IUserRepository;
import hutech.LuongTuanAnh.demo.validator.annotation.ValidUsername;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import hutech.LuongTuanAnh.demo.repository.IUserRepository;
import hutech.LuongTuanAnh.demo.validator.annotation.ValidUsername;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (userRepository == null)
            return true;
        return userRepository.findByUsername(username) == null;
    }
}