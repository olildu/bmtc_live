package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustPlayStorePurchase;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19615a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustPlayStorePurchase c;
    public final /* synthetic */ OnPurchaseVerificationFinishedListener d;

    public /* synthetic */ t0(ActivityHandler activityHandler, AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i) {
        this.f19615a = i;
        this.b = activityHandler;
        this.c = adjustPlayStorePurchase;
        this.d = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19615a) {
            case 0:
                this.b.lambda$verifyPlayStorePurchase$44(this.c, this.d);
                break;
            default:
                this.b.lambda$verifyPlayStorePurchase$45(this.c, this.d);
                break;
        }
    }
}
