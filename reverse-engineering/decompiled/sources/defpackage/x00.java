package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.checkout.ui.screen.payment.compose.PaymentMainScreenKt;
import app.chalo.electricitybill.ui.ebillfetch.ui.EBillFetchScreenKt;
import app.chalo.electricitybill.ui.ebillpayment.ui.EBillPaymentConfirmationScreenKt;
import app.chalo.electricitybill.ui.paymenthistory.ui.EBillPaymentHistoryScreenKt;
import app.chalo.reportproblem.ReportProblemScreenKt;
import app.chalo.uistate.snackbar.SnackbarUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19975a;
    public final /* synthetic */ SnackbarUIState b;
    public final /* synthetic */ int c;

    public /* synthetic */ x00(SnackbarUIState snackbarUIState, int i, int i2) {
        this.f19975a = i2;
        this.b = snackbarUIState;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19975a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                EBillFetchScreenKt.b(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 1:
                EBillPaymentConfirmationScreenKt.b(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 2:
                EBillPaymentHistoryScreenKt.c(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 3:
                PaymentMainScreenKt.e(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                ReportProblemScreenKt.c(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }
}
