package ru.msin87.teledom.dom.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class SendMessage {
    @NotNull
    @Id
    private Long id;

    @Column(updatable = false)
    private LocalDateTime created;
    private LocalDateTime modified;



    @NotNull
    private String chatId;

    @NotNull
    private String text;

    private String parseMode;

    private boolean disableWebPagePreview;
    private boolean disableNotification;
    private Integer replyToMessageId;
    private boolean allowSendingWithoutReply;
}
