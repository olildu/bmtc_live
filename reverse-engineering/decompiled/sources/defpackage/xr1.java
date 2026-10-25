package defpackage;

import com.inmobi.media.C2493h2;
import com.inmobi.media.L1;
import com.inmobi.media.N4;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class xr1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20047a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ N4 d;
    public final /* synthetic */ L1 e;

    public /* synthetic */ xr1(String str, boolean z, N4 n4, L1 l1, int i) {
        this.f20047a = i;
        this.b = str;
        this.c = z;
        this.d = n4;
        this.e = l1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20047a) {
            case 0:
                C2493h2.a(this.b, this.c, this.d, this.e);
                break;
            default:
                C2493h2.b(this.b, this.c, this.d, this.e);
                break;
        }
    }
}
