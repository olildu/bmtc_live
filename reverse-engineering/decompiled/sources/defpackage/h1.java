package defpackage;

import com.adster.sdk.mediation.adster.AdFullScreenActivity;
import com.adster.sdk.mediation.adster.AdFullScreenActivity$activityCallbacks$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15781a;
    public final /* synthetic */ AdFullScreenActivity b;

    public /* synthetic */ h1(AdFullScreenActivity adFullScreenActivity, int i) {
        this.f15781a = i;
        this.b = adFullScreenActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15781a) {
            case 0:
                AdFullScreenActivity.updateCloseProgressPosition$lambda$8(this.b);
                break;
            case 1:
                AdFullScreenActivity.scheduleEndCardAutoClose$lambda$6(this.b);
                break;
            default:
                AdFullScreenActivity$activityCallbacks$1.a(this.b);
                break;
        }
    }
}
