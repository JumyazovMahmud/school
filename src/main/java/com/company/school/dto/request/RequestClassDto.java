package com.company.school.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestClassDto {

    @NotNull
    private Integer teacherId;

    @NotNull
    private Integer studentId;

    @NotNull
    private Integer mentorId;

    @NotNull
    private Integer roomId;


    private boolean status;


}
