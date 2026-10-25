package defpackage;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h31 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15789a;
    public final /* synthetic */ RolloutsStateSubscriber b;
    public final /* synthetic */ RolloutsState c;

    public /* synthetic */ h31(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState, int i) {
        this.f15789a = i;
        this.b = rolloutsStateSubscriber;
        this.c = rolloutsState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15789a) {
            case 0:
                this.b.onRolloutsStateChanged(this.c);
                break;
            default:
                this.b.onRolloutsStateChanged(this.c);
                break;
        }
    }
}
