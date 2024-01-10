package ie.atu.cicdprojectemailservice;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailServiceController {
    private final EmailSendService senderService;

    public EmailServiceController(EmailSendService senderService) {
        this.senderService = senderService;
    }

    @PostMapping("/email")
    public String emailUser(@Valid @RequestBody User user){
        String subject = "Hi " + user.getName() + " welcome to the platfrom";
        senderService.sendEmail(user.getEmail(), subject, "You are now registered");
        String confirmEmail = "User emailed";
        return confirmEmail;
    }
}
