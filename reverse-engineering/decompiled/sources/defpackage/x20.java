package defpackage;

import app.chalo.data.ProductBookingBranding;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.productactivation.ui.ProductActivationDataState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19980a;
    public final /* synthetic */ ProductBookingBranding b;

    public /* synthetic */ x20(ProductBookingBranding productBookingBranding, int i) {
        this.f19980a = i;
        this.b = productBookingBranding;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19980a) {
            case 0:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, this.b, false, null, null, null, null, null, null, -536870913, 31);
            default:
                return ProductActivationDataState.a((ProductActivationDataState) obj, null, null, null, this.b, false, null, null, null, null, false, null, null, false, 16375);
        }
    }
}
