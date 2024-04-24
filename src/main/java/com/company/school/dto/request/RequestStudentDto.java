package com.company.school.dto.request;

import com.company.school.entity.enums.Gender;
import com.company.school.entity.enums.Status;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestStudentDto {

    @NotBlank(message = "Firstname cannot be null or empty")
    private String firstname;

    @NotBlank(message = "Lastname cannot be null or empty")
    private String lastname;

    @NotBlank(message = "Middle name cannot be null or empty")
    private String middleName;

    @Email
    @NotBlank(message = "Email cannot be null or empty")
    private String email;

    @NotBlank(message = "Password cannot be null or empty")
    private String password;

    @NotBlank(message = "Phone number cannot be null or empty")
    private String phoneNumber;

    @NotBlank(message = "Parents phone number cannot be null or empty")
    private String parentsPhoneNumber;

    @NotBlank(message = "Address cannot be null or empty")
    private String address;

    @Min(value = 6 , message = "Age cannot be lower than 6")
    private int age;

    private LocalDate birthDate;

    @NotNull(message = "Subject id cannot be null or empty")
    private Integer subjectId;
    @NotNull(message = "Teacher id cannot be null or empty")
    private Integer teacherId;

    @NotNull(message = "Class id cannot be null or empty")
    private Integer classId;

    @NotNull(message = "Marks id cannot be null or empty")
    private Integer marksId;

    @NotNull(message = "Status cannot be null")
    private Status status;

    @NotNull(message = "Gender cannot be null")
    private Gender gender;

    private boolean attended;

}
