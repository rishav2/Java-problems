package com.rishu;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> arrayList = new ArrayList<>();
    private String Aname;
    public boolean add_song(String name , double duration)
    {
            if (isFound(name))
            {

                return  false;
            }
            else {
                Song song = new Song(name, duration);
                arrayList.add(song);
                return true;
            }

    }

    private boolean isFound(String name)
    {
        for (int i=0;i<arrayList.size();i++)
        {
            if (name.equals(arrayList.get(i).getName()))
            {
                return true;
            }
        }
        return false;
    }
    public Song Found(String name)
    {
        for (int i=0;i<arrayList.size();i++)
        {
            Song song = arrayList.get(i);
            if (name.equals(song.getName()))
            {
                return song;

            }
        }
        return null;
    }

    public Album(String aname) {
        Aname = aname;
    }

    public ArrayList<Song> getArrayList() {
        return arrayList;
    }

    public String getAname() {
        return Aname;
    }
}
