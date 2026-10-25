package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import com.amazon.device.ads.DtbDeviceRegistration;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.inmobi.media.AbstractC2545kc;
import com.inmobi.media.C2487ga;
import com.inmobi.media.C2493h2;
import com.inmobi.media.C2564m3;
import com.inmobi.media.C2601oc;
import com.inmobi.media.C2702w2;
import com.inmobi.media.R4;
import com.inmobi.media.sd;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import in.juspay.hypersdk.core.PrefetchServices;
import in.juspay.hypersdk.core.SdkTracker;
import so.plotline.insights.Database.e0;
import so.plotline.insights.Plotline;
import so.plotline.insights.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19885a;

    public /* synthetic */ w2(int i) {
        this.f19885a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19885a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.f13143a;
                break;
            case 1:
                AndroidComposeView.Companion.addNotificationForSysPropsChange$lambda$0();
                break;
            case 2:
                CrashlyticsWorker.lambda$await$6();
                break;
            case 3:
                DtbDeviceRegistration.lambda$verifyRegistration$0();
                break;
            case 4:
                InMobiSdk.b();
                break;
            case 5:
                InMobiUnifiedIdService.a();
                break;
            case 6:
                PrefetchServices.lambda$preFetch$0();
                break;
            case 7:
                R4.c();
                break;
            case 8:
                SdkTracker.lambda$new$0();
                break;
            case 9:
                a.f();
                break;
            case 10:
                a.f();
                break;
            case 11:
                int i2 = e0.d;
                try {
                    Plotline.b().getClass();
                    Plotline.b().getClass();
                } catch (Exception unused) {
                    return;
                }
                break;
            case 12:
                C2487ga.c();
                break;
            case 13:
                C2487ga.a();
                break;
            case 14:
                C2493h2.a();
                break;
            case 15:
                AbstractC2545kc.b();
                break;
            case 16:
                C2564m3.M();
                break;
            case 17:
                C2564m3.K();
                break;
            case 18:
                C2564m3.O();
                break;
            case 19:
                C2564m3.I();
                break;
            case 20:
                C2601oc.f();
                break;
            case 21:
                sd.b();
                break;
            default:
                C2702w2.a();
                break;
        }
    }
}
