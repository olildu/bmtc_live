package defpackage;

import com.inmobi.media.C0;
import com.inmobi.media.E0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ce implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11276a;
    public final /* synthetic */ E0 b;
    public final /* synthetic */ WeakReference c;

    public /* synthetic */ ce(E0 e0, WeakReference weakReference, int i) {
        this.f11276a = i;
        this.b = e0;
        this.c = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11276a) {
            case 0:
                C0.b(this.b, this.c);
                break;
            default:
                C0.a(this.b, this.c);
                break;
        }
    }
}
