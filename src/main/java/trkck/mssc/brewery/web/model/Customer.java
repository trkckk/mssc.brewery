package trkck.mssc.brewery.web.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Customer {

    private UUID id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String customerName;
}
