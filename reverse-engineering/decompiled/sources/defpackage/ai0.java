package defpackage;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class ai0 {
    public static boolean a(MediaSource mediaSource, MediaItem mediaItem) {
        return false;
    }

    public static Timeline b(MediaSource mediaSource) {
        return null;
    }

    public static boolean c(MediaSource mediaSource) {
        return true;
    }

    public static void d(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, TransferListener transferListener) {
        mediaSource.prepareSource(mediaSourceCaller, transferListener, PlayerId.UNSET);
    }

    public static void e(MediaSource mediaSource, MediaItem mediaItem) {
    }
}
