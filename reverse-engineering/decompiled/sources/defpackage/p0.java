package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p0 implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18991a;
    public final /* synthetic */ String b;

    public /* synthetic */ p0(String str, int i) {
        this.f18991a = i;
        this.b = str;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f18991a) {
            case 0:
                activityHandler.removeGlobalPartnerParameterI(this.b);
                break;
            default:
                activityHandler.removeGlobalCallbackParameterI(this.b);
                break;
        }
    }
}
