package defpackage;

import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Network.d;
import so.plotline.insights.Tasks.k;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class es1 implements d.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f15585a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ es1(k kVar, String str, int i, byte[] bArr, long j, int i2, int i3) {
        this.f15585a = kVar;
        this.b = str;
        this.c = bArr;
        this.d = j;
        this.e = i2;
        this.f = i3;
    }

    public final void a(String str, String str2) {
        String str3;
        k kVar = this.f15585a;
        if (kVar.b && (str3 = kVar.c) != null) {
            String str4 = this.b;
            if (str3.equals(str4)) {
                if (str == null || str2 == null) {
                    DebugHelper.b();
                    return;
                }
                DebugHelper.b();
                long j = this.d;
                int i = this.e;
                int i2 = this.f;
                byte[] bArr = this.c;
                kVar.j.execute(new xz0(str, bArr, new fs1(kVar, str4, j, str2, i, i2, bArr)));
                return;
            }
        }
        DebugHelper.b();
    }
}
