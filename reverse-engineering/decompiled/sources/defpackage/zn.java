package defpackage;

import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutViewIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20214a;
    public final /* synthetic */ CheckoutComponent b;

    public /* synthetic */ zn(CheckoutComponent checkoutComponent, int i) {
        this.f20214a = i;
        this.b = checkoutComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20214a) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                this.b.I0(new CheckoutViewIntent.PaymentCompletedIntent.Success(str));
                break;
            case 1:
                CheckoutViewIntent intent = (CheckoutViewIntent) obj;
                Intrinsics.i(intent, "intent");
                this.b.I0(intent);
                break;
            case 2:
                CheckoutViewIntent intent2 = (CheckoutViewIntent) obj;
                Intrinsics.i(intent2, "intent");
                this.b.I0(intent2);
                break;
            default:
                CheckoutViewIntent intent3 = (CheckoutViewIntent) obj;
                Intrinsics.i(intent3, "intent");
                this.b.I0(intent3);
                break;
        }
        return Unit.f17538a;
    }
}
