package defpackage;

import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutViewIntent;
import app.chalo.checkout.ui.screen.checkout.razorpay.RazorpayResultListener;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20125a;
    public final /* synthetic */ CheckoutComponent b;

    public /* synthetic */ yn(CheckoutComponent checkoutComponent, int i) {
        this.f20125a = i;
        this.b = checkoutComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20125a) {
            case 0:
                CheckoutComponent checkoutComponent = this.b;
                return new RazorpayResultListener(new zn(checkoutComponent, 0), new n4(checkoutComponent, 10));
            case 1:
                gf.u(null, this.b.r);
                return Unit.f17538a;
            case 2:
                this.b.r.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Scene(ChaloScenes.CheckoutPaymentMain, false)));
                return Unit.f17538a;
            case 3:
                gf.u(null, this.b.r);
                return Unit.f17538a;
            case 4:
                gf.u(null, this.b.r);
                return Unit.f17538a;
            case 5:
                CheckoutComponent checkoutComponent2 = this.b;
                checkoutComponent2.r.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(checkoutComponent2.k)));
                return Unit.f17538a;
            default:
                this.b.I0(CheckoutViewIntent.CheckoutBackPressed.f1487a);
                return Unit.f17538a;
        }
    }
}
