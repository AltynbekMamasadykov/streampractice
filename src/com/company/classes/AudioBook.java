package com.company.classes;
import com.company.interfaces.BookType;
import java.time.LocalTime;

public class AudioBook implements BookType {
    private FileInfo audioFragment;
    private LocalTime duration;
    private FileInfo audio;

    public AudioBook(FileInfo audioFragment, LocalTime duration, FileInfo audio) {
        this.audioFragment = audioFragment;
        this.duration = duration;
        this.audio = audio;
    }

    public FileInfo getAudioFragment() {
        return audioFragment;
    }

    public void setAudioFragment(FileInfo audioFragment) {
        this.audioFragment = audioFragment;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public FileInfo getAudio() {
        return audio;
    }

    public void setAudio(FileInfo audio) {
        this.audio = audio;
    }
}
