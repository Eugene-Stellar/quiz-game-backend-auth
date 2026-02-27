package eugenestellar.controller;

import eugenestellar.service.InfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/info")
public class InfoController {

  private final InfoService infoService;

  public InfoController(InfoService infoService) {
    this.infoService = infoService;
  }

  @GetMapping("/user_quantity")
  public ResponseEntity<Map<String, Long>> getUserQuantity() {
    long userQuantity = infoService.getUserQuantity();

    return ResponseEntity.ok().body(Map.of("userQuantity", userQuantity));
  }
}