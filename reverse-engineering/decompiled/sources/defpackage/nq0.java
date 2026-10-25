package defpackage;

import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.MinKycDetailsArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18537a;
    public final /* synthetic */ PaymentMainComponent b;

    public /* synthetic */ nq0(PaymentMainComponent paymentMainComponent, int i) {
        this.f18537a = i;
        this.b = paymentMainComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18537a) {
            case 0:
                PaymentMainComponent paymentMainComponent = this.b;
                paymentMainComponent.H.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(paymentMainComponent.k)));
                break;
            case 1:
                PaymentMainComponent paymentMainComponent2 = this.b;
                paymentMainComponent2.H.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(paymentMainComponent2.k)));
                break;
            default:
                this.b.H.b(new ChaloNavigationRequest.Navigate(MinKycDetailsArgs.INSTANCE, null, null, 6));
                break;
        }
        return Unit.f17538a;
    }
}
