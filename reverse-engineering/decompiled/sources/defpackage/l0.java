package defpackage;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18268a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ l0(ActivityHandler activityHandler, boolean z, int i) {
        this.f18268a = i;
        this.b = activityHandler;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18268a) {
            case 0:
                this.b.lambda$onActivityLifecycle$0(this.c);
                break;
            case 1:
                this.b.lambda$trackMeasurementConsent$39(this.c);
                break;
            case 2:
                this.b.lambda$setCoppaComplianceInDelay$49(this.c);
                break;
            case 3:
                this.b.lambda$setOfflineMode$7(this.c);
                break;
            case 4:
                this.b.lambda$setOfflineMode$8(this.c);
                break;
            case 5:
                this.b.lambda$setEnabled$6(this.c);
                break;
            case 6:
                this.b.lambda$setPlayStoreKidsComplianceInDelay$50(this.c);
                break;
            case 7:
                this.b.lambda$setEnabled$5(this.c);
                break;
            default:
                this.b.lambda$onActivityLifecycle$1(this.c);
                break;
        }
    }
}
