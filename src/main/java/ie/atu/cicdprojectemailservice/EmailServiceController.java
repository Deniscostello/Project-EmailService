package ie.atu.cicdprojectemailservice;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailServiceController {
    private final EmailSendService emailSendService;

    public EmailServiceController(EmailSendService emailSendService) {
        this.emailSendService = emailSendService;
    }
}
