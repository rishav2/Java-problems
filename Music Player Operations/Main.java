package com.rishu;

import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean b = true;
        boolean quit = true;
        Scanner scanner = new Scanner(System.in);
        Music music = new Music("favourites");
        music.addALbum("aashiqui");
        music.addALbum("rockstar");
        music.addALbum("kick");
        music.addALbum("kick");
        music.addSong("kick", "kick", 3);
        music.addSong("kick", "hangover", 4);
        music.addSong("rockstar", "kunfaaya", 3);
        music.addSong("rockstar", "katya", 2);
        music.addSong("rockstar", "parindey", 3);
        music.addSong("aashiqui", "tum hi ho", 5);
        music.addSong("aashiqui", "sun raha", 4);
        music.addTOplaylist("kick", "hangover");
        music.addTOplaylist("kick", "kick");
        music.addTOplaylist("rockstar", "katya");
        music.addTOplaylist("rockstar", "kunfaaya");
        music.addTOplaylist("aashiqui", "tum hi ho");
        ListIterator<String> listIterator = music.getPlaylists().listIterator();
        operations();
        while (quit) {
            int a = scanner.nextInt();
            scanner.nextLine();
            switch (a) {
                case 1:
                    music.print();
                    System.out.println("enter a song from playlist");
                    String song = scanner.nextLine();
                    while (listIterator.hasNext()) {
                        if (song.equals(listIterator.next())) {
                            System.out.println("playing " + song);
                            break;
                        }
                    }
                    break;
                case 2:
                    if (b) {
                        b = false;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("playing --" + listIterator.next());
                    } else {
                        System.out.println("playing again "+"tum hi ho1" +
                                "");
                    }

                    break;
                case 3:
                    if (!b) {
                        listIterator.previous();
                        b = true;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("now playing " + listIterator.previous());
                    }
                    else
                    {
                        System.out.println(" playing again "+"hangover");
                        listIterator.next();
                        b = true;
                    }

                    break;
                case 4:
                    if (music.getPlaylists().size()>=0)
                    {
                        listIterator.remove();
                        System.out.println("song removed");
                        if (listIterator.hasNext())
                        {
                            System.out.println("now playing "+listIterator.next());
                        }
                        else if(listIterator.hasPrevious())
                        {
                            System.out.println("now playing "+listIterator.previous());
                        }
                        else
                        {
                            System.out.println("no song left");
                        }
                    }
                    break;
                case 5:
                    operations();
                    break;
                default:
                    System.out.println("good bye");
                    quit = false;

            }
        }
        scanner.close();


    }

    public static void operations() {
        System.out.println("MUSIC PLAYER");
        System.out.println("1.Play song ");
        System.out.println("2.next song");
        System.out.println("3.previous song");
        System.out.println("4.remove current song");
        System.out.println("5.options");
        System.out.println("6.quit");

    }

}