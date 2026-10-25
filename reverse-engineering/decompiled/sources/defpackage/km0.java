package defpackage;

import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeIntent;
import app.chalo.ncmc.ui.ncmconlinerecharge.compose.NCMCOnlineRechargeSuccessBottomSheetDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class km0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17512a = 1;
    public final /* synthetic */ NCMCOnlineRechargeSuccessBottomSheetDetails b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ km0(NCMCOnlineRechargeSuccessBottomSheetDetails nCMCOnlineRechargeSuccessBottomSheetDetails, Function1 function1) {
        this.b = nCMCOnlineRechargeSuccessBottomSheetDetails;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17512a) {
            case 0:
                this.c.invoke(this.b.d);
                break;
            default:
                NCMCOnlineRechargeIntent nCMCOnlineRechargeIntent = this.b.f;
                if (nCMCOnlineRechargeIntent != null) {
                    this.c.invoke(nCMCOnlineRechargeIntent);
                }
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ km0(Function1 function1, NCMCOnlineRechargeSuccessBottomSheetDetails nCMCOnlineRechargeSuccessBottomSheetDetails) {
        this.c = function1;
        this.b = nCMCOnlineRechargeSuccessBottomSheetDetails;
    }
}
