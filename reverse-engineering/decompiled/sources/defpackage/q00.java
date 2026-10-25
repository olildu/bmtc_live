package defpackage;

import com.inmobi.media.E0;
import com.inmobi.media.GestureDetectorOnGestureListenerC2738ya;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19081a;
    public final /* synthetic */ E0 b;
    public final /* synthetic */ GestureDetectorOnGestureListenerC2738ya c;

    public /* synthetic */ q00(E0 e0, GestureDetectorOnGestureListenerC2738ya gestureDetectorOnGestureListenerC2738ya, int i) {
        this.f19081a = i;
        this.b = e0;
        this.c = gestureDetectorOnGestureListenerC2738ya;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19081a) {
            case 0:
                E0.b(this.b, this.c);
                break;
            default:
                E0.c(this.b, this.c);
                break;
        }
    }
}
