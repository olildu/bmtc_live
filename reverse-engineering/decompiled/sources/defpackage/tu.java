package defpackage;

import com.inmobi.media.D5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class tu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19690a;
    public final /* synthetic */ D5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public /* synthetic */ tu(D5 d5, boolean z, String str, int i) {
        this.f19690a = i;
        this.b = d5;
        this.c = z;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19690a) {
            case 0:
                D5.b(this.b, this.c, this.d);
                break;
            default:
                D5.a(this.b, this.c, this.d);
                break;
        }
    }
}
