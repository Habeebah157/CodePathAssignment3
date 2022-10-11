package com.example.myapplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2 = {"Lcom/example/myapplication/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "allFlashcard", "", "Lcom/example/myapplication/Flashcard;", "getAllFlashcard", "()Ljava/util/List;", "setAllFlashcard", "(Ljava/util/List;)V", "currCardDisplayIndex", "", "getCurrCardDisplayIndex", "()I", "setCurrCardDisplayIndex", "(I)V", "flashcardDatabase", "Lcom/example/myapplication/FlashcardDatabase;", "getFlashcardDatabase", "()Lcom/example/myapplication/FlashcardDatabase;", "setFlashcardDatabase", "(Lcom/example/myapplication/FlashcardDatabase;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.example.myapplication.FlashcardDatabase flashcardDatabase;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.myapplication.Flashcard> allFlashcard;
    private int currCardDisplayIndex = 0;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.FlashcardDatabase getFlashcardDatabase() {
        return null;
    }
    
    public final void setFlashcardDatabase(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.FlashcardDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.myapplication.Flashcard> getAllFlashcard() {
        return null;
    }
    
    public final void setAllFlashcard(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myapplication.Flashcard> p0) {
    }
    
    public final int getCurrCardDisplayIndex() {
        return 0;
    }
    
    public final void setCurrCardDisplayIndex(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}