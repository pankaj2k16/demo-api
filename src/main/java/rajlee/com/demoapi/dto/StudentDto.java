package rajlee.com.demoapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

public record StudentDto(
        UUID id,

        @NotBlank(message = "First name is required")
        @JsonProperty("first_name")
        String firstName,

        @NotBlank(message = "Last name is required")
        @JsonProperty("last_name")
        String lastName,

        @NotNull(message = "Date of birth is required")
        LocalDate dob,

        @NotBlank(message = "Address is required")
        String address
) {}
