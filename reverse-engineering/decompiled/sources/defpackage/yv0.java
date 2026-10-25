package defpackage;

import app.chalo.constants.Source;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionIntent;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.ChaloBusRouteInfoScreenArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yv0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20146a;
    public final /* synthetic */ PremiumBusStopSelectionComponent b;

    public /* synthetic */ yv0(PremiumBusStopSelectionComponent premiumBusStopSelectionComponent, int i) {
        this.f20146a = i;
        this.b = premiumBusStopSelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20146a) {
            case 0:
                this.b.L0(PremiumBusStopSelectionIntent.TimePickerContinueBtnClickedIntent.f7984a);
                break;
            case 1:
                this.b.E0(new dv0(27));
                break;
            case 2:
                this.b.E0(new dv0(26));
                break;
            default:
                this.b.A.b(new ChaloNavigationRequest.Navigate(new ChaloBusRouteInfoScreenArgs(Source.PREMIUM_BUS_STOP_SELECTION_SCREEN), null, null, 6));
                break;
        }
        return Unit.f17538a;
    }
}
