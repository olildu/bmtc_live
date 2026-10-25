package defpackage;

import androidx.media3.exoplayer.ima.ImaServerSideAdInsertionMediaSource;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y90 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20089a;
    public final /* synthetic */ ImaServerSideAdInsertionMediaSource b;

    public /* synthetic */ y90(ImaServerSideAdInsertionMediaSource imaServerSideAdInsertionMediaSource, int i) {
        this.f20089a = i;
        this.b = imaServerSideAdInsertionMediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20089a) {
            case 0:
                this.b.lambda$prepareSourceInternal$0();
                break;
            case 1:
                this.b.lambda$releaseSourceInternal$1();
                break;
            default:
                this.b.lambda$setContentUri$2();
                break;
        }
    }
}
