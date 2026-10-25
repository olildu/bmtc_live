package defpackage;

import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutViewIntent;
import app.chalo.scenes.ChaloNavigationManagerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lu implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18347a;
    public final /* synthetic */ CustomUrlCheckoutComponent b;

    public /* synthetic */ lu(CustomUrlCheckoutComponent customUrlCheckoutComponent, int i) {
        this.f18347a = i;
        this.b = customUrlCheckoutComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18347a) {
            case 0:
                ChaloNavigationManagerKt.c(this.b.q);
                break;
            case 1:
                this.b.I0(CustomUrlCheckoutViewIntent.ConfirmCancelPayment.f1458a);
                break;
            case 2:
                this.b.I0(CustomUrlCheckoutViewIntent.DismissCancelConfirmationDialog.f1459a);
                break;
            default:
                ChaloNavigationManagerKt.c(this.b.q);
                break;
        }
        return Unit.f17538a;
    }
}
