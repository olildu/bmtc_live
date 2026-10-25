package defpackage;

import app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel;
import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.checkout.ui.screen.payment.PaymentMainContractKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kq0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18249a;
    public final /* synthetic */ CheckoutScreenSectionUiModel.OneClickUPI b;

    public /* synthetic */ kq0(CheckoutScreenSectionUiModel.OneClickUPI oneClickUPI, int i) {
        this.f18249a = i;
        this.b = oneClickUPI;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PaymentDataState it = (PaymentDataState) obj;
        switch (this.f18249a) {
            case 0:
                Intrinsics.i(it, "it");
                break;
            default:
                Intrinsics.i(it, "it");
                break;
        }
        return PaymentDataState.a(it, null, false, null, false, null, null, false, null, null, null, PaymentMainContractKt.d(it.l, this.b), false, false, false, null, false, null, 2095103);
    }
}
