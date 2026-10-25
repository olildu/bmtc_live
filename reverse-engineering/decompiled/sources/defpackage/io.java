package defpackage;

import app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentViewIntent;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class io implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16082a;
    public final /* synthetic */ CheckoutPostPaymentComponent b;

    public /* synthetic */ io(CheckoutPostPaymentComponent checkoutPostPaymentComponent, int i) {
        this.f16082a = i;
        this.b = checkoutPostPaymentComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16082a) {
            case 0:
                this.b.z.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                break;
            case 1:
                this.b.z.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                break;
            case 2:
                this.b.U0(PostPaymentViewIntent.ErrorScreenNegativeBtnClickIntent.f1592a);
                break;
            default:
                gf.u(null, this.b.z);
                break;
        }
        return Unit.f17538a;
    }
}
