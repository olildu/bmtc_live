package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustDeeplink;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19880a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustDeeplink c;
    public final /* synthetic */ long d;

    public /* synthetic */ w0(ActivityHandler activityHandler, AdjustDeeplink adjustDeeplink, long j, int i) {
        this.f19880a = i;
        this.b = activityHandler;
        this.c = adjustDeeplink;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19880a) {
            case 0:
                this.b.lambda$processDeeplink$13(this.c, this.d);
                break;
            case 1:
                this.b.lambda$processDeeplink$12(this.c, this.d);
                break;
            case 2:
                this.b.lambda$processAndResolveDeeplink$14(this.c, this.d);
                break;
            default:
                this.b.lambda$processAndResolveDeeplink$15(this.c, this.d);
                break;
        }
    }
}
