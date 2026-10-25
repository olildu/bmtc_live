package defpackage;

import com.inmobi.media.C2694v8;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zs1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20229a;
    public final /* synthetic */ C2694v8 b;

    public /* synthetic */ zs1(C2694v8 c2694v8, int i) {
        this.f20229a = i;
        this.b = c2694v8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20229a) {
            case 0:
                C2694v8.a(this.b);
                break;
            default:
                C2694v8.b(this.b);
                break;
        }
    }
}
