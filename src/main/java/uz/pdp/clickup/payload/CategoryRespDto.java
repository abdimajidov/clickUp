package uz.pdp.clickup.payload;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class CategoryRespDto {
    private String name;

    private UUID project;
}
