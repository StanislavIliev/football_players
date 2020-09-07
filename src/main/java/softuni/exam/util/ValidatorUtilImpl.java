package softuni.exam.util;


import org.hibernate.validator.ap.internal.ConstraintAnnotationVisitor;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;
public class ValidatorUtilImpl implements ValidatorUtil {
private final Validator validator;

    public ValidatorUtilImpl() {
         this.validator= Validation.buildDefaultValidatorFactory().getValidator();
    }



    @Override
    public <T> boolean isValid(T entity) {
        return this.validator.validate(entity).size()==0;
    }

    @Override
    public <T> Set<ConstraintViolation<T>> violations(T entity) {

        return this.validator.validate(entity);
    }



}
