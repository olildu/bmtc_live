package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustEvent c;
    public final /* synthetic */ OnPurchaseVerificationFinishedListener d;

    public /* synthetic */ a1(ActivityHandler activityHandler, AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i) {
        this.f150a = i;
        this.b = activityHandler;
        this.c = adjustEvent;
        this.d = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f150a) {
            case 0:
                this.b.lambda$verifyAndTrackPlayStorePurchase$46(this.c, this.d);
                break;
            default:
                this.b.lambda$verifyAndTrackPlayStorePurchase$47(this.c, this.d);
                break;
        }
    }
}
