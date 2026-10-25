package defpackage;

import com.inmobi.media.C2464f1;
import in.juspay.hypersdk.core.SdkTracker;
import java.util.ArrayList;
import so.plotline.insights.ActivityCallback;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ps0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19065a;
    public final /* synthetic */ String b;

    public /* synthetic */ ps0(String str, int i) {
        this.f19065a = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        switch (this.f19065a) {
            case 0:
                String str = this.b;
                try {
                    FlowStep flowStep = a.d().c;
                    if (flowStep != null && !flowStep.f.isEmpty() && (arrayList = flowStep.e) != null && !arrayList.contains(str)) {
                        ActivityCallback.a();
                        break;
                    }
                } catch (Exception e) {
                    DebugHelper.a(e);
                    return;
                }
                break;
            case 1:
                SdkTracker.lambda$addToBootLogs$1(this.b);
                break;
            default:
                C2464f1.b(this.b);
                break;
        }
    }
}
