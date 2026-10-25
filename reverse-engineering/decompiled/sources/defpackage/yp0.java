package defpackage;

import app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yp0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20132a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ PassengerFareDetailsUiModel c;

    public /* synthetic */ yp0(Function1 function1, PassengerFareDetailsUiModel passengerFareDetailsUiModel, int i) {
        this.f20132a = i;
        this.b = function1;
        this.c = passengerFareDetailsUiModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f20132a;
        Unit unit = Unit.f17538a;
        PassengerFareDetailsUiModel passengerFareDetailsUiModel = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(passengerFareDetailsUiModel.f3895a);
                break;
            case 1:
                function1.invoke(passengerFareDetailsUiModel.f3895a);
                break;
            case 2:
                function1.invoke(passengerFareDetailsUiModel.f3895a);
                break;
            case 3:
                float f = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(new PremiumBusFareDetailsIntent.OnPassengerCategorySelectedIntent(passengerFareDetailsUiModel.f3895a));
                break;
            case 4:
                float f2 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(new PremiumBusFareDetailsIntent.DecreasePassengerCountClicked(passengerFareDetailsUiModel.f3895a));
                break;
            default:
                float f3 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(new PremiumBusFareDetailsIntent.IncreasePassengerCountClicked(passengerFareDetailsUiModel.f3895a));
                break;
        }
        return unit;
    }
}
