package auth;


import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import models.Role;
import models.User;
import auth.LoginRequest;
import auth.AuthResponse;

@Service
@RequiredArgsConstructor
public class AuthService {

	public AuthResponse login(LoginRequest request) {
		
		return null;
	}


	public AuthResponse register(RegisterRequest request) {
		User user = User.builder()
				.username(request.getUsername())
				.password(request.getPassword())
				.firstname(request.getFirstname())
				.lastname(request.getLastname())
				.country(request.getCountry())
				.role(Role.USER)
				.build();
				
		return null;
	}

}
