package defpackage;

import com.inmobi.media.GestureDetectorOnGestureListenerC2738ya;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class it1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17090a;
    public final /* synthetic */ GestureDetectorOnGestureListenerC2738ya b;

    public /* synthetic */ it1(int i, GestureDetectorOnGestureListenerC2738ya gestureDetectorOnGestureListenerC2738ya) {
        this.f17090a = i;
        this.b = gestureDetectorOnGestureListenerC2738ya;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17090a) {
            case 0:
                GestureDetectorOnGestureListenerC2738ya.b(this.b);
                break;
            default:
                GestureDetectorOnGestureListenerC2738ya.a(this.b);
                break;
        }
    }
}
