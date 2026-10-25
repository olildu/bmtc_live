package defpackage;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.SessionReplay.b;
import so.plotline.insights.SessionReplay.c;
import so.plotline.insights.Tasks.k;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class fs1 implements k.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f15672a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte[] g;

    public /* synthetic */ fs1(k kVar, String str, long j, String str2, int i, int i2, byte[] bArr) {
        this.f15672a = kVar;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = i;
        this.f = i2;
        this.g = bArr;
    }

    public final void a(boolean z) {
        String str;
        String str2;
        k kVar = this.f15672a;
        String str3 = this.b;
        long j = this.c;
        String str4 = this.d;
        int i = this.e;
        int i2 = this.f;
        byte[] bArr = this.g;
        if (!kVar.b || (str = kVar.c) == null || !str.equals(str3)) {
            DebugHelper.b();
            return;
        }
        if (!z) {
            DebugHelper.b();
            return;
        }
        try {
            synchronized (kVar.g) {
                try {
                    if (kVar.b && (str2 = kVar.c) != null && str2.equals(str3)) {
                        if (!kVar.p) {
                            String str5 = kVar.e;
                            int i3 = kVar.q;
                            int i4 = kVar.r;
                            b bVar = new b(c.META, j);
                            bVar.c.put("href", str5);
                            bVar.c.put(InMobiNetworkValues.WIDTH, i3);
                            bVar.c.put(InMobiNetworkValues.HEIGHT, i4);
                            kVar.f.add(bVar);
                            kVar.p = true;
                        }
                        kVar.f.add(b.a(i, j, str4, i2, bArr.length));
                        if (kVar.f.size() >= 100) {
                            kVar.f();
                        }
                        DebugHelper.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            DebugHelper.a(e);
        }
    }
}
