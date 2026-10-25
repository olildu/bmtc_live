package defpackage;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.C2618q1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class rs1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19241a;
    public final /* synthetic */ C2618q1 b;
    public final /* synthetic */ AdMetaInfo c;

    public /* synthetic */ rs1(C2618q1 c2618q1, AdMetaInfo adMetaInfo, int i) {
        this.f19241a = i;
        this.b = c2618q1;
        this.c = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19241a) {
            case 0:
                C2618q1.b(this.b, this.c);
                break;
            default:
                C2618q1.a(this.b, this.c);
                break;
        }
    }
}
