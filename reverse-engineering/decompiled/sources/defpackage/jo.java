package defpackage;

import app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType;
import app.chalo.constants.Source;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.ProductActivationArgs;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jo implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17424a;
    public final /* synthetic */ CheckoutPostPaymentComponent b;
    public final /* synthetic */ PostPaymentSuccessProductType c;

    public /* synthetic */ jo(CheckoutPostPaymentComponent checkoutPostPaymentComponent, PostPaymentSuccessProductType postPaymentSuccessProductType, int i) {
        this.f17424a = i;
        this.b = checkoutPostPaymentComponent;
        this.c = postPaymentSuccessProductType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f17424a;
        Unit unit = Unit.f17538a;
        PostPaymentSuccessProductType postPaymentSuccessProductType = this.c;
        CheckoutPostPaymentComponent checkoutPostPaymentComponent = this.b;
        switch (i) {
            case 0:
                ChaloNavigationManagerKt.b(checkoutPostPaymentComponent.z, new HomeArgs((String) null, (String) null, 7), new ProductActivationArgs(((PostPaymentSuccessProductType.InstantTicket) postPaymentSuccessProductType).f1583a, "mobileTicket", "instantTicket", null, null, null, null, 1016));
                break;
            case 1:
                ChaloNavigationManagerKt.a(checkoutPostPaymentComponent.z, CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), new ProductActivationArgs(((PostPaymentSuccessProductType.MTicket) postPaymentSuccessProductType).f1584a, "singleJourneyTicket", "singleJourneyTicket", Source.CHECKOUT_PAYMENT_ACTIVITY, null, null, null, 1008)));
                break;
            default:
                ChaloNavigationManagerKt.b(checkoutPostPaymentComponent.z, new HomeArgs((String) null, (String) null, 7), new ProductActivationArgs(((PostPaymentSuccessProductType.MultiModalGroupTicket) postPaymentSuccessProductType).f1586a, "mobileTicket", "multiModalTicket", Source.CHECKOUT_PAYMENT_ACTIVITY, null, null, null, 1008));
                break;
        }
        return unit;
    }
}
