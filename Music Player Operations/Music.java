package com.rishu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Music {
    private ArrayList<Album> albums = new ArrayList<>();
    private  String name1;
    private LinkedList<String> playlists = new LinkedList<>();
    private boolean b = true;

    public  Music(String Playlist) {
        this.name1 = name1;
    }

    public boolean addALbum(String name)
    {
        if (isFound(name))
        {
            return false;

        }
        else {
            Album album = new Album(name);
            albums.add(album);
            return true;
        }
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    private boolean isFound(String name)
    {
        for (int i=0;i<albums.size();i++)
        {
            if (name.equals(albums.get(i).getAname()))
            {
                return true;
            }
        }
        return false;
    }
    public Album Found(String name)
    {
        for (int i=0;i<albums.size();i++)
        {
            Album album = albums.get(i);
            if (name.equals(album.getAname()))
            {
                return album;
            }
        }
        return null;
    }
    public boolean addSong(String album , String name , double duration)
    {
        Album album1 = Found(album);
        if (album1 == null)
        {
            return  false;

        }
        else
        {
            album1.add_song(name,duration);
            return true;
        }


    }
    public boolean addTOplaylist(String album , String song)
    { Album album1= Found(album);
        if (album1==null)
        {
            return false;
        }
        else {
            Song song1 = album1.Found(song);
            if (song1==null)
            {
                return false;
            }
            else {
                playlists.add(song1.getName());
                return true;
            }
        }

    }
    public void print()
    {
        Iterator<String> iterator = playlists.iterator();
        System.out.println("songs are ");
        int i=1;
        while (iterator.hasNext())
        {
            System.out.println((i++)+"-"+iterator.next());
        }
    }

    public LinkedList<String> getPlaylists() {
        return playlists;
    }
}
