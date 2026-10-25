package defpackage;

import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchDataState;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationDataState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19258a;
    public final /* synthetic */ ElectricityBillAppModel b;

    public /* synthetic */ s00(ElectricityBillAppModel electricityBillAppModel, int i) {
        this.f19258a = i;
        this.b = electricityBillAppModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19258a) {
            case 0:
                EBillFetchDataState it = (EBillFetchDataState) obj;
                Intrinsics.i(it, "it");
                return EBillFetchDataState.a(it, false, null, true, null, true, false, false, this.b, 106);
            case 1:
                EBillFetchDataState it2 = (EBillFetchDataState) obj;
                Intrinsics.i(it2, "it");
                return EBillFetchDataState.a(it2, false, null, true, null, false, false, false, this.b, 120);
            default:
                EBillPaymentConfirmationDataState it3 = (EBillPaymentConfirmationDataState) obj;
                Intrinsics.i(it3, "it");
                return EBillPaymentConfirmationDataState.a(it3, false, false, this.b, null, false, 26);
        }
    }
}
