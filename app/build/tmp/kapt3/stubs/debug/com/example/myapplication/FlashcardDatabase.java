package com.example.myapplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/myapplication/FlashcardDatabase;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "db", "Lcom/example/myapplication/AppDatabase;", "deleteAll", "", "deleteCard", "flashcardQuestion", "", "getAllCards", "", "Lcom/example/myapplication/Flashcard;", "initFirstCard", "insertCard", "flashcard", "updateCard", "app_debug"})
public final class FlashcardDatabase {
    private final com.example.myapplication.AppDatabase db = null;
    
    public FlashcardDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void initFirstCard() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.myapplication.Flashcard> getAllCards() {
        return null;
    }
    
    public final void insertCard(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.Flashcard flashcard) {
    }
    
    public final void deleteCard(@org.jetbrains.annotations.NotNull()
    java.lang.String flashcardQuestion) {
    }
    
    public final void updateCard(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.Flashcard flashcard) {
    }
    
    public final void deleteAll() {
    }
}