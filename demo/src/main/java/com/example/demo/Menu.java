package com.example.demo;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    private String text;
    private String icon;
    private String href;
    private Long id;
    private Long pid;
    private boolean target;
    private List<Menu> subset;

    public Menu() {
    }

    public Menu(String text, String icon, String href) {
        this.text = text;
        this.icon = icon;
        this.href = href;
    }
}
