package defpackage;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17452a;
    public final /* synthetic */ ActivityHandler b;

    public /* synthetic */ k0(ActivityHandler activityHandler, int i) {
        this.f17452a = i;
        this.b = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17452a) {
            case 0:
                this.b.lambda$sendPreinstallReferrer$19();
                break;
            case 1:
                this.b.lambda$removeGlobalPartnerParameters$31();
                break;
            case 2:
                this.b.lambda$endFirstSessionDelay$48();
                break;
            case 3:
                this.b.lambda$sendPreinstallReferrer$18();
                break;
            case 4:
                this.b.lambda$sendReftagReferrer$17();
                break;
            case 5:
                this.b.lambda$removeGlobalCallbackParameters$29();
                break;
            case 6:
                this.b.lambda$gdprForgetMe$34();
                break;
            case 7:
                this.b.lambda$gdprForgetMe$35();
                break;
            default:
                this.b.lambda$sendReftagReferrer$16();
                break;
        }
    }
}
