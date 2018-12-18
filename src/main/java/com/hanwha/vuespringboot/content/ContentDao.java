package com.hanwha.vuespringboot.content;

import lombok.Getter;
import lombok.Setter;

public class ContentDao
{
    @Getter @Setter int seq;
    @Getter @Setter String title;
    @Getter @Setter String name;
    @Getter @Setter String content;
}