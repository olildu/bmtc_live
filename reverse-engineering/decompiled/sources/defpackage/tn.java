package defpackage;

import app.chalo.checkout.ui.screen.card.CheckoutCardComponent;
import app.chalo.checkout.ui.screen.card.CheckoutCardSideEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19673a;
    public final /* synthetic */ CheckoutCardComponent b;

    public /* synthetic */ tn(CheckoutCardComponent checkoutCardComponent, int i) {
        this.f19673a = i;
        this.b = checkoutCardComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19673a) {
            case 0:
                this.b.r0(new CheckoutCardSideEffect.HandleKeyboardVisibility());
                break;
            case 1:
                this.b.r0(new CheckoutCardSideEffect.HandleKeyboardVisibility());
                break;
            case 2:
                this.b.r0(new CheckoutCardSideEffect.HandleKeyboardVisibility());
                break;
            case 3:
                this.b.r0(new CheckoutCardSideEffect.HandleKeyboardVisibility());
                break;
            default:
                gf.u(null, this.b.p);
                break;
        }
        return Unit.f17538a;
    }
}
