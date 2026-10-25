package defpackage;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.source.ConcatenatingMediaSource;
import androidx.media3.exoplayer.source.ConcatenatingMediaSource2;
import androidx.media3.ui.PlayerNotificationManager;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fs implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15670a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fs(Object obj, int i) {
        this.f15670a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f15670a) {
            case 0:
                return ((ConcatenatingMediaSource) this.b).handleMessage(message);
            case 1:
                return ((ConcatenatingMediaSource2) this.b).handleMessage(message);
            case 2:
                return ((DownloadManager) this.b).handleMainMessage(message);
            case 3:
                return ((ListenerSet) this.b).handleMessage(message);
            default:
                return ((PlayerNotificationManager) this.b).handleMessage(message);
        }
    }
}
