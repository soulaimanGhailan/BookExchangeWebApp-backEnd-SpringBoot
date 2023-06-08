package soul.smi.pfe.bookservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import soul.smi.pfe.bookservice.model.UserEntity;

@FeignClient("users-service")

public interface UsersRestClient {
    @GetMapping("/users/{id}")
    UserEntity getUser(@RequestHeader(value = "Authorization", required = true) String authorizationHeader , @PathVariable String id);
}
