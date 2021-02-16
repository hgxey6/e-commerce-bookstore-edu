package com.bookstore.service;

import com.bookstore.domain.StoreUser;
import com.bookstore.domain.security.PasswordResetToken;

public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final StoreUser user, final String token);
}
