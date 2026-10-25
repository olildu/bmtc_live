package defpackage;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15505a;
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher b;
    public final /* synthetic */ DrmSessionEventListener c;

    public /* synthetic */ e00(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.f15505a = i;
        this.b = eventDispatcher;
        this.c = drmSessionEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15505a) {
            case 0:
                this.b.lambda$drmKeysRemoved$4(this.c);
                break;
            case 1:
                this.b.lambda$drmKeysRestored$3(this.c);
                break;
            case 2:
                this.b.lambda$drmKeysLoaded$1(this.c);
                break;
            default:
                this.b.lambda$drmSessionReleased$5(this.c);
                break;
        }
    }
}
