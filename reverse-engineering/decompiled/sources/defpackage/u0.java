package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u0 implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19702a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ u0(String str, String str2, int i) {
        this.f19702a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f19702a) {
            case 0:
                activityHandler.addGlobalPartnerParameterI(this.b, this.c);
                break;
            default:
                activityHandler.addGlobalCallbackParameterI(this.b, this.c);
                break;
        }
    }
}
