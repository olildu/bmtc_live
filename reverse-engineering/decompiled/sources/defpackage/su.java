package defpackage;

import com.inmobi.media.D5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class su implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19603a;
    public final /* synthetic */ D5 b;
    public final /* synthetic */ String c;

    public /* synthetic */ su(D5 d5, String str, int i) {
        this.f19603a = i;
        this.b = d5;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19603a) {
            case 0:
                D5.a(this.b, this.c);
                break;
            case 1:
                D5.c(this.b, this.c);
                break;
            default:
                D5.b(this.b, this.c);
                break;
        }
    }
}
