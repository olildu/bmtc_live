package defpackage;

import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mt0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18428a;
    public final /* synthetic */ PremiumBusBulkBookingConfirmationComponent b;

    public /* synthetic */ mt0(PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent, int i) {
        this.f18428a = i;
        this.b = premiumBusBulkBookingConfirmationComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18428a) {
            case 0:
                this.b.O0(PremiumBusBulkBookingConfirmationIntent.TermsAndConditionsTextClickIntent.f7499a);
                break;
            case 1:
                this.b.O0(PremiumBusBulkBookingConfirmationIntent.TnCBottomSheetOkClickIntent.f7501a);
                break;
            case 2:
                this.b.O0(PremiumBusBulkBookingConfirmationIntent.TnCBottomSheetDismissIntent.f7500a);
                break;
            default:
                this.b.O0(PremiumBusBulkBookingConfirmationIntent.BookRideButtonClickIntent.f7496a);
                break;
        }
        return Unit.f17538a;
    }
}
