package com.sparta.springprepare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Memo {
    private String username;
    private final String contents;
}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo("Robert", "내용");
        Memo memo1 = new Memo("필수 내용");
        memo.setUsername("Robbie");
        System.out.println(memo.getUsername());
        System.out.println(memo1.getContents());
    }
}