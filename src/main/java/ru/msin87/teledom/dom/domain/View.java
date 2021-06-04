package ru.msin87.teledom.dom.domain;

import lombok.Data;
import ru.msin87.teledom.dom.utils.StickinessType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class View {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private StickinessType stickinessType;
    private String args;
    private String data;
    private boolean isSent = false;
    private boolean isDeleted = false;
    private boolean isUserInputOccurred = false;

}
