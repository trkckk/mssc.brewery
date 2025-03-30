package trkck.mssc.brewery.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Customer {

    private UUID id;

    private String customerName;
}
