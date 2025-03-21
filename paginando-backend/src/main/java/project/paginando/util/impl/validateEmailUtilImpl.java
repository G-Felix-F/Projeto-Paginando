package project.paginando.util.impl;

import project.paginando.exceptions.InvalidEmailException;
import project.paginando.util.validateEmailUtil;

public class validateEmailUtilImpl implements validateEmailUtil {

    @Override
    public void validateEmail(String email) {
        if (email.trim().isBlank()) {
            throw new InvalidEmailException("E-mail Inválido:");
        }

        if (email.isEmpty()) {
            throw new InvalidEmailException("E-mail Inválido: ");
        }
    }

    private Boolean isEmailValid(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }
}
