package defpackage;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.D1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ou implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18979a;
    public final /* synthetic */ D1 b;
    public final /* synthetic */ AdMetaInfo c;

    public /* synthetic */ ou(D1 d1, AdMetaInfo adMetaInfo, int i) {
        this.f18979a = i;
        this.b = d1;
        this.c = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18979a) {
            case 0:
                D1.b(this.b, this.c);
                break;
            default:
                D1.a(this.b, this.c);
                break;
        }
    }
}
