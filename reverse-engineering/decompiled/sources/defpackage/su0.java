package defpackage;

import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class su0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19604a;
    public final /* synthetic */ PremiumBusSeatSelectionComponent b;

    public /* synthetic */ su0(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, int i) {
        this.f19604a = i;
        this.b = premiumBusSeatSelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19604a) {
            case 0:
                gf.u(null, this.b.s);
                break;
            case 1:
                this.b.Y0(PremiumBusSeatSelectionIntent.OnBackPressedIntent.f7742a);
                break;
            default:
                this.b.Y0(PremiumBusSeatSelectionIntent.OnGenderConfirmationSuccessAnimationCompletedIntent.f7743a);
                break;
        }
        return Unit.f17538a;
    }
}
