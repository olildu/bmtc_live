package defpackage;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.C2485g8;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class tr1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19684a;
    public final /* synthetic */ C2485g8 b;
    public final /* synthetic */ AdMetaInfo c;

    public /* synthetic */ tr1(C2485g8 c2485g8, AdMetaInfo adMetaInfo, int i) {
        this.f19684a = i;
        this.b = c2485g8;
        this.c = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19684a) {
            case 0:
                C2485g8.a(this.b, this.c);
                break;
            default:
                C2485g8.b(this.b, this.c);
                break;
        }
    }
}
