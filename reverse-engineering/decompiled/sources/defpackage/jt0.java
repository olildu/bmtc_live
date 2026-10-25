package defpackage;

import androidx.media3.exoplayer.source.preload.PreloadMediaSource;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jt0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17437a;
    public final /* synthetic */ PreloadMediaSource b;

    public /* synthetic */ jt0(PreloadMediaSource preloadMediaSource, int i) {
        this.f17437a = i;
        this.b = preloadMediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17437a) {
            case 0:
                this.b.lambda$releasePreloadMediaSource$3();
                break;
            default:
                this.b.lambda$clear$1();
                break;
        }
    }
}
