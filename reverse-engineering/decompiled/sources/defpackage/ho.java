package defpackage;

import app.chalo.checkout.ui.screen.payment.PaymentStatusAlertDetails;
import app.chalo.checkout.ui.screen.payment.PaymentStatusCTAActionType;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentDataState;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ho implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15845a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ IconType d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ ho(String str, String str2, IconType iconType, String str3, String str4, int i) {
        this.f15845a = i;
        this.b = str;
        this.c = str2;
        this.d = iconType;
        this.e = str3;
        this.f = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PostPaymentDataState it = (PostPaymentDataState) obj;
        switch (this.f15845a) {
            case 0:
                Intrinsics.i(it, "it");
                return PostPaymentDataState.a(it, false, null, new PaymentStatusAlertDetails(this.b, this.c, null, this.d, this.e, PaymentStatusCTAActionType.NAVIGATE_TO_MY_TICKETS_AND_PASSES, this.f, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, 4), 2);
            case 1:
                Intrinsics.i(it, "it");
                return PostPaymentDataState.a(it, false, null, new PaymentStatusAlertDetails(this.b, this.c, null, this.d, this.e, PaymentStatusCTAActionType.NAVIGATE_TO_MY_TICKETS_AND_PASSES, this.f, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, 4), 2);
            case 2:
                Intrinsics.i(it, "it");
                return PostPaymentDataState.a(it, false, null, new PaymentStatusAlertDetails(this.b, this.c, null, this.d, this.e, PaymentStatusCTAActionType.NAVIGATE_TO_MY_TICKETS_AND_PASSES, this.f, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, 4), 2);
            case 3:
                Intrinsics.i(it, "it");
                return PostPaymentDataState.a(it, false, null, new PaymentStatusAlertDetails(this.b, this.c, null, this.d, this.e, PaymentStatusCTAActionType.NAVIGATE_TO_MY_TICKETS_AND_PASSES, this.f, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, 4), 2);
            default:
                Intrinsics.i(it, "it");
                return PostPaymentDataState.a(it, false, null, new PaymentStatusAlertDetails(this.b, this.c, null, this.d, this.e, PaymentStatusCTAActionType.NAVIGATE_TO_MY_TICKETS_AND_PASSES, this.f, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, 4), 2);
        }
    }
}
