package com.androidmvi.spacex.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/androidmvi/spacex/utils/Utilities;", "", "()V", "Companion", "android-sample-mvi-ui_debug"})
public final class Utilities {
    @org.jetbrains.annotations.NotNull()
    public static final com.androidmvi.spacex.utils.Utilities.Companion Companion = null;
    
    public Utilities() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\u0011"}, d2 = {"Lcom/androidmvi/spacex/utils/Utilities$Companion;", "", "()V", "listFilesInDir", "", "", "", "path", "context", "Landroid/content/Context;", "loadImage", "", "imageView", "Landroid/widget/ImageView;", "url", "readAssetAsString", "filename", "android-sample-mvi-ui_debug"})
    public static final class Companion {
        
        public final void loadImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
        }
        
        /**
         * Reads input file and returns string content
         *
         * @param filename file path in assets directory
         * @return contents of file
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String readAssetAsString(@org.jetbrains.annotations.NotNull()
        java.lang.String filename, @org.jetbrains.annotations.NotNull()
        android.content.Context context) throws java.io.IOException {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String[]> listFilesInDir(@org.jetbrains.annotations.NotNull()
        java.lang.String path, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}