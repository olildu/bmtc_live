package defpackage;

import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationDataState;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationIntent;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20064a;
    public final /* synthetic */ EBillPaymentConfirmationComponent b;

    public /* synthetic */ y00(EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent, int i) {
        this.f20064a = i;
        this.b = eBillPaymentConfirmationComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20064a) {
            case 0:
                this.b.E0(new b00(12));
                break;
            case 1:
                this.b.K0(EBillPaymentConfirmationIntent.PayBtnClickIntent.f2572a);
                break;
            case 2:
                this.b.K0(EBillPaymentConfirmationIntent.TnCDialogDismissIntent.f2576a);
                break;
            case 3:
                EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent = this.b;
                ElectricityBillAppModel electricityBillAppModel = ((EBillPaymentConfirmationDataState) eBillPaymentConfirmationComponent.f.getValue()).c;
                Intrinsics.f(electricityBillAppModel);
                eBillPaymentConfirmationComponent.K0(new EBillPaymentConfirmationIntent.TnCAcceptClickIntent(electricityBillAppModel));
                break;
            default:
                String str = this.b.u;
                if (str != null) {
                    return new ResultStateKeeperMeta(str);
                }
                return null;
        }
        return Unit.f17538a;
    }
}
