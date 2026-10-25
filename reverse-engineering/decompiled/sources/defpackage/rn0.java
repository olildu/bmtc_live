package defpackage;

import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.OfflineLicenseHelper;
import com.google.common.util.concurrent.SettableFuture;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rn0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19226a;
    public final /* synthetic */ OfflineLicenseHelper b;
    public final /* synthetic */ DrmSession c;
    public final /* synthetic */ SettableFuture d;

    public /* synthetic */ rn0(DrmSession drmSession, OfflineLicenseHelper offlineLicenseHelper, SettableFuture settableFuture) {
        this.f19226a = 1;
        this.b = offlineLicenseHelper;
        this.c = drmSession;
        this.d = settableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19226a) {
            case 0:
                this.b.lambda$getLicenseDurationRemainingSec$0(this.d, this.c);
                break;
            case 1:
                this.b.lambda$acquireFirstSessionOnHandlerThread$3(this.c, this.d);
                break;
            default:
                this.b.lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(this.d, this.c);
                break;
        }
    }

    public /* synthetic */ rn0(OfflineLicenseHelper offlineLicenseHelper, SettableFuture settableFuture, DrmSession drmSession, int i) {
        this.f19226a = i;
        this.b = offlineLicenseHelper;
        this.d = settableFuture;
        this.c = drmSession;
    }
}
