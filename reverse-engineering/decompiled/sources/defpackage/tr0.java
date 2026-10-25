package defpackage;

import app.chalo.checkout.ui.screen.checkout.phonepe.PhonePeCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.phonepe.PhonePeCheckoutViewIntent;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19683a;
    public final /* synthetic */ PhonePeCheckoutComponent b;

    public /* synthetic */ tr0(PhonePeCheckoutComponent phonePeCheckoutComponent, int i) {
        this.f19683a = i;
        this.b = phonePeCheckoutComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19683a) {
            case 0:
                gf.u(null, this.b.n);
                break;
            case 1:
                this.b.F0();
                break;
            case 2:
                this.b.n.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Scene(ChaloScenes.CheckoutPaymentMain, false)));
                break;
            case 3:
                this.b.F0();
                break;
            default:
                this.b.G0(PhonePeCheckoutViewIntent.CheckoutBackPressed.f1480a);
                break;
        }
        return Unit.f17538a;
    }
}
