package defpackage;

import app.chalo.productpurchase.passpurchase.ui.passbookingsuccess.SuperPassBookingSuccessComponent;
import app.chalo.productpurchase.passpurchase.ui.passbookingsuccess.SuperPassBookingSuccessIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class of1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18594a;
    public final /* synthetic */ SuperPassBookingSuccessComponent b;

    public /* synthetic */ of1(SuperPassBookingSuccessComponent superPassBookingSuccessComponent, int i) {
        this.f18594a = i;
        this.b = superPassBookingSuccessComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18594a) {
            case 0:
                this.b.I0(SuperPassBookingSuccessIntent.SeeBookingDetailsIntent.f8440a);
                break;
            case 1:
                this.b.I0(SuperPassBookingSuccessIntent.PositiveBtnClickedIntent.f8439a);
                break;
            case 2:
                this.b.I0(SuperPassBookingSuccessIntent.NegativeBtnClickedIntent.f8438a);
                break;
            default:
                this.b.I0(SuperPassBookingSuccessIntent.BackClickedIntent.f8436a);
                break;
        }
        return Unit.f17538a;
    }
}
