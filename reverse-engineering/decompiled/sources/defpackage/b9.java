package defpackage;

import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt;
import androidx.compose.material3.internal.PredictiveBackState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.home.ui.history.compose.MyTicketsScreenUIKt;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.ncmc.ui.common.CardRechargeSuccessScreenKt;
import app.chalo.ncmc.ui.common.CardRechargeSuccessScreenUiData;
import app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreenKt;
import app.chalo.premiumbus.ui.slotselection.PBOdPairWithSlotsCardUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.uistate.image.ImageUIState;
import app.zophop.homescreen.MyTicketsViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11177a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b9(Modifier modifier, AnalogTimePickerState analogTimePickerState, int i, boolean z, int i2) {
        this.f11177a = 7;
        this.e = modifier;
        this.f = analogTimePickerState;
        this.c = i;
        this.b = z;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11177a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicEdgeToEdgeDialogKt.PredictiveBackStateHandler$lambda$3((PredictiveBackState) this.e, this.b, (Function0) this.f, this.c, this.d, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                CardRechargeSuccessScreenKt.a((Modifier) this.e, (CardRechargeSuccessScreenUiData) this.f, this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).getClass();
                CommonImageKt.a((ImageUIState) this.e, (Modifier) this.f, this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 3:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ExposedDropdownMenuDefaults.TrailingIcon$lambda$0((ExposedDropdownMenuDefaults) this.e, this.b, (Modifier) this.f, this.c, this.d, (Composer) obj, iIntValue2);
            case 4:
                ((Integer) obj2).intValue();
                MyTicketsScreenUIKt.j((MyTicketsViewState) this.e, (Function1) this.f, this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).getClass();
                PostValidationScreenKt.e((Modifier) this.e, (StopLiveEtaUiModel) this.f, this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).getClass();
                PremiumBusSlotSelectionUiStateKt.f((Modifier) this.e, (PBOdPairWithSlotsCardUIState) this.f, this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TimePickerKt.ClockText$lambda$84((Modifier) this.e, (AnalogTimePickerState) this.f, this.c, this.b, this.d, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ b9(Object obj, Object obj2, boolean z, int i, int i2, int i3) {
        this.f11177a = i3;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ b9(Object obj, boolean z, Object obj2, int i, int i2, int i3) {
        this.f11177a = i3;
        this.e = obj;
        this.b = z;
        this.f = obj2;
        this.c = i;
        this.d = i2;
    }
}
