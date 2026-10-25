package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustPlayStoreSubscription;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19166a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustPlayStoreSubscription c;

    public /* synthetic */ r0(ActivityHandler activityHandler, AdjustPlayStoreSubscription adjustPlayStoreSubscription, int i) {
        this.f19166a = i;
        this.b = activityHandler;
        this.c = adjustPlayStoreSubscription;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19166a) {
            case 0:
                this.b.lambda$trackPlayStoreSubscription$42(this.c);
                break;
            default:
                this.b.lambda$trackPlayStoreSubscription$43(this.c);
                break;
        }
    }
}
