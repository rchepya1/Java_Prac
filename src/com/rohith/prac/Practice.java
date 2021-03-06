package com.rohith.prac;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Practice {
/*
"my.song.mp3 11b
greatSong.flac 1000b
not3.txt 5b
video.mp4 200b
game.exe 100b
mov!e.mkv 10000b"
 */

    public static void main(String[] args) {

        StringBuilder S = new StringBuilder();
        S.append("my.song.mp3 11b");
        S.append("\n" + "greatSong.flac 1000b");
        S.append("\n" + "not3.txt 5b");
        S.append("\n" + "video.mp4 200b");
        S.append("\n" + "game.exe 100b");
        S.append("\n" + "mov!e.mkv 10000b");
        String x = S.toString();
        List<String> music = Arrays.asList("mp3", "aac", "flac");
        List<String> image = Arrays.asList("jpg", "bmp", "gif");
        List<String> movie = Arrays.asList("mp4", "avi", "mkv");


        int musicSize = 0;
        int imageSize = 0;
        int movieSize = 0;
        int othersSize = 0;
        System.out.println("Input: \n" + x);

        List<String> myList = new ArrayList<>(Arrays.asList(x.split("\n")));

        for (String var : myList) {
            String contents[] = var.split("\\s+");
            int i = contents[0].lastIndexOf(".");
            String fileType = contents[0].substring(i + 1);
            if (music.contains(fileType)) {
                musicSize = musicSize + Integer.parseInt(contents[1].substring(0, contents[1].indexOf("b")));
            } else if (image.contains(fileType)) {
                imageSize = imageSize + Integer.parseInt(contents[1].substring(0, contents[1].indexOf("b")));
            } else if (movie.contains(fileType)) {
                movieSize = movieSize + Integer.parseInt(contents[1].substring(0, contents[1].indexOf("b")));
            } else othersSize = othersSize + Integer.parseInt(contents[1].substring(0, contents[1].indexOf("b")));

        }

        String output = ("music " + musicSize) +
                "\n" + "image " + imageSize +
                "\n" + "movie " + movieSize +
                "\n" + "others " + othersSize;
        System.out.println("Output: \n" + output);

    }


}
