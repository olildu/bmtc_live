package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x0 implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19974a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ x0(boolean z, int i) {
        this.f19974a = i;
        this.b = z;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f19974a) {
            case 0:
                activityHandler.tryTrackMeasurementConsentI(this.b);
                break;
            default:
                activityHandler.tryTrackMeasurementConsentI(this.b);
                break;
        }
    }
}
