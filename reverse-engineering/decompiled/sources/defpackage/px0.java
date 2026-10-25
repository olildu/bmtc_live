package defpackage;

import app.chalo.productpurchase.productselection.ui.ProductSelectionComponent;
import app.chalo.productpurchase.productselection.ui.ProductSelectionIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class px0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19076a;
    public final /* synthetic */ ProductSelectionComponent b;

    public /* synthetic */ px0(ProductSelectionComponent productSelectionComponent, int i) {
        this.f19076a = i;
        this.b = productSelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19076a) {
            case 0:
                this.b.Z0(ProductSelectionIntent.MTicketDisabledRouteDialogContinueClickedIntent.f8679a);
                break;
            case 1:
                this.b.Z0(ProductSelectionIntent.MTicketDisabledRouteDialogCancelClickedIntent.f8678a);
                break;
            case 2:
                this.b.Z0(ProductSelectionIntent.RetryFetchIntent.f8685a);
                break;
            case 3:
                this.b.Z0(ProductSelectionIntent.RecentMTicketErrorDialogOkayClickedIntent.f8684a);
                break;
            default:
                this.b.Z0(ProductSelectionIntent.RecentMTicketErrorDialogOkayClickedIntent.f8684a);
                break;
        }
        return Unit.f17538a;
    }
}
