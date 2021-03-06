package com.vividswan.studymate.dto;

import com.vividswan.studymate.model.Task;
import com.vividswan.studymate.model.User;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
public class TaskWriteDto {

    private String title;
    private String content;
    private LocalDateTime deadline;
    private User user;
    private String stringDeadline;
    private int isSuccess;

    @Builder
    public TaskWriteDto(String title, String content, LocalDateTime deadline, User user, int isSuccess){
        this.title = title;
        this.content = content;
        this.deadline = deadline;
        this.user = user;
        this.isSuccess = isSuccess;
    }

    public Task toEntity(){
        return Task.builder()
                .title(title)
                .content(content)
                .deadline(deadline)
                .user(user)
                .isSuccess(isSuccess)
                .stringDeadline(stringDeadline)
                .build();
    }
}
