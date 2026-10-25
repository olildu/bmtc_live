package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustEvent;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18556a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustEvent c;

    public /* synthetic */ o0(ActivityHandler activityHandler, AdjustEvent adjustEvent, int i) {
        this.f18556a = i;
        this.b = activityHandler;
        this.c = adjustEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18556a) {
            case 0:
                this.b.lambda$trackEvent$3(this.c);
                break;
            default:
                this.b.lambda$trackEvent$4(this.c);
                break;
        }
    }
}
