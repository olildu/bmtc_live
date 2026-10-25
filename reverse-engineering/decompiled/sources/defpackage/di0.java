package defpackage;

import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class di0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15465a;
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher b;
    public final /* synthetic */ MediaSourceEventListener c;
    public final /* synthetic */ LoadEventInfo d;
    public final /* synthetic */ MediaLoadData e;

    public /* synthetic */ di0(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f15465a = i;
        this.b = eventDispatcher;
        this.c = mediaSourceEventListener;
        this.d = loadEventInfo;
        this.e = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15465a) {
            case 0:
                this.b.lambda$loadStarted$0(this.c, this.d, this.e);
                break;
            case 1:
                this.b.lambda$loadCompleted$1(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$loadCanceled$2(this.c, this.d, this.e);
                break;
        }
    }
}
