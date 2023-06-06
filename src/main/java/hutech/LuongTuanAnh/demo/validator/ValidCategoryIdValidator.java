package hutech.LuongTuanAnh.demo.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import hutech.LuongTuanAnh.demo.enity.Category;
import hutech.LuongTuanAnh.demo.validator.annotation.ValidCategoryId;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != 0L;
    }
}
