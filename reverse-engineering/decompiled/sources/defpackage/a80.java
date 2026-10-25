package defpackage;

import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.home.ui.home.HomeScreenViewState;
import app.chalo.home.ui.profile.ProfileScreenViewState;
import app.chalo.home.ui.regularbus.RegularBusComponent;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.juspay.JuspayOperationUpdate;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172a;
    public final /* synthetic */ JuspayOperationUpdate b;

    public /* synthetic */ a80(RegularBusComponent regularBusComponent, JuspayOperationUpdate juspayOperationUpdate) {
        this.f172a = 3;
        this.b = juspayOperationUpdate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.f172a) {
            case 0:
                HomeScreenViewState it = (HomeScreenViewState) obj;
                Intrinsics.i(it, "it");
                return HomeScreenViewState.a(it, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, ((JuspayOperationUpdate.Loading) this.b).f4063a, false, 393215);
            case 1:
                PaymentDataState it2 = (PaymentDataState) obj;
                Intrinsics.i(it2, "it");
                return PaymentDataState.a(it2, null, false, null, ((JuspayOperationUpdate.Loading) this.b).f4063a, null, null, false, null, null, null, null, false, false, false, null, false, null, 2097143);
            case 2:
                ProfileScreenViewState it3 = (ProfileScreenViewState) obj;
                Intrinsics.i(it3, "it");
                return ProfileScreenViewState.a(it3, null, null, null, false, null, false, false, null, ((JuspayOperationUpdate.Loading) this.b).f4063a, false, 767);
            case 3:
                Map scanAndPayProperties = (Map) obj;
                Intrinsics.i(scanAndPayProperties, "$this$scanAndPayProperties");
                JuspayOperationUpdate.Started started = JuspayOperationUpdate.Started.f4065a;
                JuspayOperationUpdate juspayOperationUpdate = this.b;
                if (Intrinsics.d(juspayOperationUpdate, started)) {
                    str = "started";
                } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Loading) {
                    str = ((JuspayOperationUpdate.Loading) juspayOperationUpdate).f4063a ? "loader_shown" : "loader_hidden";
                } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Completed) {
                    str = "completed";
                } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Failed) {
                    str = "failed";
                } else if (Intrinsics.d(juspayOperationUpdate, JuspayOperationUpdate.Rejected.f4064a)) {
                    str = "rejected";
                } else {
                    if (!Intrinsics.d(juspayOperationUpdate, JuspayOperationUpdate.Abandoned.f4060a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "abandoned";
                }
                scanAndPayProperties.put("scanAndPayUpdate", str);
                JuspayOperationUpdate.Loading loading = juspayOperationUpdate instanceof JuspayOperationUpdate.Loading ? (JuspayOperationUpdate.Loading) juspayOperationUpdate : null;
                if (loading != null) {
                    scanAndPayProperties.put("isLoading", Boolean.valueOf(loading.f4063a));
                }
                return Unit.f17538a;
            default:
                RegularBusViewState it4 = (RegularBusViewState) obj;
                Intrinsics.i(it4, "it");
                return RegularBusViewState.a(it4, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, ((JuspayOperationUpdate.Loading) this.b).f4063a, false, 3145727);
        }
    }

    public /* synthetic */ a80(JuspayOperationUpdate juspayOperationUpdate, int i) {
        this.f172a = i;
        this.b = juspayOperationUpdate;
    }
}
