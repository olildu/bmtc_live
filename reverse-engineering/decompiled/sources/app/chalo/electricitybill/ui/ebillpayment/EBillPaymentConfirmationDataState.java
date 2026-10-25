package app.chalo.electricitybill.ui.ebillpayment;

import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import defpackage.b3;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillPaymentConfirmationDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2570a;
    public final boolean b;
    public final ElectricityBillAppModel c;
    public final CreateOrderResponseAppModel d;
    public final boolean e;

    static {
        CreateOrderResponseAppModel.Companion companion = CreateOrderResponseAppModel.INSTANCE;
    }

    public EBillPaymentConfirmationDataState(boolean z, boolean z2, ElectricityBillAppModel electricityBillAppModel, CreateOrderResponseAppModel createOrderResponseAppModel, boolean z3) {
        this.f2570a = z;
        this.b = z2;
        this.c = electricityBillAppModel;
        this.d = createOrderResponseAppModel;
        this.e = z3;
    }

    public static EBillPaymentConfirmationDataState a(EBillPaymentConfirmationDataState eBillPaymentConfirmationDataState, boolean z, boolean z2, ElectricityBillAppModel electricityBillAppModel, CreateOrderResponseAppModel createOrderResponseAppModel, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = eBillPaymentConfirmationDataState.f2570a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = eBillPaymentConfirmationDataState.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            electricityBillAppModel = eBillPaymentConfirmationDataState.c;
        }
        ElectricityBillAppModel electricityBillAppModel2 = electricityBillAppModel;
        if ((i & 8) != 0) {
            createOrderResponseAppModel = eBillPaymentConfirmationDataState.d;
        }
        CreateOrderResponseAppModel createOrderResponseAppModel2 = createOrderResponseAppModel;
        if ((i & 16) != 0) {
            z3 = eBillPaymentConfirmationDataState.e;
        }
        eBillPaymentConfirmationDataState.getClass();
        return new EBillPaymentConfirmationDataState(z4, z5, electricityBillAppModel2, createOrderResponseAppModel2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillPaymentConfirmationDataState)) {
            return false;
        }
        EBillPaymentConfirmationDataState eBillPaymentConfirmationDataState = (EBillPaymentConfirmationDataState) obj;
        return this.f2570a == eBillPaymentConfirmationDataState.f2570a && this.b == eBillPaymentConfirmationDataState.b && Intrinsics.d(this.c, eBillPaymentConfirmationDataState.c) && Intrinsics.d(this.d, eBillPaymentConfirmationDataState.d) && this.e == eBillPaymentConfirmationDataState.e;
    }

    public final int hashCode() {
        int i = (((this.f2570a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        ElectricityBillAppModel electricityBillAppModel = this.c;
        int iHashCode = (i + (electricityBillAppModel == null ? 0 : electricityBillAppModel.hashCode())) * 31;
        CreateOrderResponseAppModel createOrderResponseAppModel = this.d;
        return ((iHashCode + (createOrderResponseAppModel != null ? createOrderResponseAppModel.hashCode() : 0)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("EBillPaymentConfirmationDataState(isLoading=", ", showTnCDialog=", ", electricityBillAppModel=", this.f2570a, this.b);
        sbR.append(this.c);
        sbR.append(", electricityBillPaymentOrderDetails=");
        sbR.append(this.d);
        sbR.append(", showInternetConnectionSnackBar=");
        return b3.g(")", sbR, this.e);
    }
}
