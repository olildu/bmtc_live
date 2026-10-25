package defpackage;

import com.inmobi.media.C2461ec;
import com.inmobi.media.C2575n0;
import com.inmobi.media.C2589o0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class pr1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19063a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pr1(Object obj, byte b, int i) {
        this.f19063a = i;
        this.c = obj;
        this.b = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19063a) {
            case 0:
                C2461ec.a((C2461ec) this.c, this.b);
                break;
            default:
                C2575n0.a((C2589o0) this.c, this.b);
                break;
        }
    }
}
