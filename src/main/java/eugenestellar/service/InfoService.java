package eugenestellar.service;

import eugenestellar.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

  private final UserRepo userRepo;

  public InfoService(UserRepo userRepo) {
    this.userRepo = userRepo;
  }

  public long getUserQuantity() {
    return userRepo.count();
  }
}