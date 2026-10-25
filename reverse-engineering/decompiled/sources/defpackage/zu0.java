package defpackage;

import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionViewState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.value.MutableValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zu0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20233a;
    public final /* synthetic */ PremiumBusSlotSelectionComponent b;

    public /* synthetic */ zu0(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, int i) {
        this.f20233a = i;
        this.b = premiumBusSlotSelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20233a) {
            case 0:
                PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent = this.b;
                MutableValue mutableValueT0 = premiumBusSlotSelectionComponent.t0();
                TimeUtilsContract timeUtilsContract = premiumBusSlotSelectionComponent.q;
                Long l = ((PremiumBusSlotSelectionViewState) mutableValueT0.a()).b;
                premiumBusSlotSelectionComponent.h1(new PremiumBusSlotSelectionIntent.SectionItemClickedIntent(l != null ? l.longValue() : timeUtilsContract.q(premiumBusSlotSelectionComponent.B.j(), timeUtilsContract.b())));
                break;
            case 1:
                this.b.h1(PremiumBusSlotSelectionIntent.ExploreAvailableRoutesClickIntent.f7871a);
                break;
            case 2:
                this.b.h1(PremiumBusSlotSelectionIntent.BackBtnClickIntent.f7863a);
                break;
            case 3:
                this.b.h1(PremiumBusSlotSelectionIntent.BackBtnClickIntent.f7863a);
                break;
            default:
                this.b.h1(PremiumBusSlotSelectionIntent.BackBtnClickIntent.f7863a);
                break;
        }
        return Unit.f17538a;
    }
}
