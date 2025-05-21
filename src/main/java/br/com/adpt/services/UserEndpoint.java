package br.com.adpt.services;

import br.com.adpt.security.AuthenticatedUser;
import br.com.adpt.data.User;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@BrowserCallable
@AnonymousAllowed
public class UserEndpoint {

    @Autowired
    private AuthenticatedUser authenticatedUser;

    public Optional<User> getAuthenticatedUser() {
        return authenticatedUser.get();
    }
}
