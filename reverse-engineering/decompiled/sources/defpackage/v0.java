package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.adjust.sdk.IRunActivityHandler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v0 implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19789a;
    public final /* synthetic */ AdjustThirdPartySharing b;

    public /* synthetic */ v0(AdjustThirdPartySharing adjustThirdPartySharing, int i) {
        this.f19789a = i;
        this.b = adjustThirdPartySharing;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f19789a) {
            case 0:
                activityHandler.tryTrackThirdPartySharingI(this.b);
                break;
            default:
                activityHandler.tryTrackThirdPartySharingI(this.b);
                break;
        }
    }
}
