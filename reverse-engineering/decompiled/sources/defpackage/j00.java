package defpackage;

import com.amazon.device.ads.DtbOmSdkSessionManager;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17360a;
    public final /* synthetic */ DtbOmSdkSessionManager b;

    public /* synthetic */ j00(DtbOmSdkSessionManager dtbOmSdkSessionManager, int i) {
        this.f17360a = i;
        this.b = dtbOmSdkSessionManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17360a) {
            case 0:
                this.b.lambda$displayAdEventLoaded$5();
                break;
            case 1:
                this.b.lambda$new$0();
                break;
            case 2:
                this.b.lambda$startAdSession$4();
                break;
            case 3:
                this.b.lambda$stopOmAdSession$7();
                break;
            default:
                this.b.lambda$impressionOccured$6();
                break;
        }
    }
}
