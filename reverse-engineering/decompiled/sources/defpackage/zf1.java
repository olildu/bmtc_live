package defpackage;

import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionDataState;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionIntent;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zf1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20195a;
    public final /* synthetic */ SuperPassPassengerSelectionViewModel b;

    public /* synthetic */ zf1(SuperPassPassengerSelectionViewModel superPassPassengerSelectionViewModel, int i) {
        this.f20195a = i;
        this.b = superPassPassengerSelectionViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20195a) {
            case 0:
                this.b.s(SuperPassPassengerSelectionIntent.AddNewPassengerIntent.f8446a);
                return Unit.f17538a;
            case 1:
                return (SuperPassPassengerSelectionDataState) this.b.f.getValue();
            default:
                this.b.s(SuperPassPassengerSelectionIntent.InitializationIntent.f8447a);
                return Unit.f17538a;
        }
    }
}
