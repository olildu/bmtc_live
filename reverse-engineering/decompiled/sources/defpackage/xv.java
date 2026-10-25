package defpackage;

import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.premiumbus.ui.slotselection.NoRideAvailableForSelectedTimeUIState;
import app.chalo.premiumbus.ui.slotselection.PassPurchaseNudgeCardUIState;
import app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt;
import app.chalo.uistate.text.TextUIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xv implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20054a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ xv(String str, Modifier modifier, boolean z, boolean z2, Function0 function0, boolean z3, String str2, DatePickerColors datePickerColors, int i) {
        this.g = str;
        this.b = modifier;
        this.c = z;
        this.d = z2;
        this.i = function0;
        this.e = z3;
        this.h = str2;
        this.j = datePickerColors;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20054a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return DatePickerKt.Year$lambda$67((String) this.g, this.b, this.c, this.d, (Function0) this.i, this.e, (String) this.h, (DatePickerColors) this.j, this.f, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                PremiumBusSlotSelectionScreenKt.d((List) this.g, this.b, this.c, (PassPurchaseNudgeCardUIState) this.h, (NoRideAvailableForSelectedTimeUIState) this.i, (TextUIState.ChaloTextUIState) this.j, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ xv(List list, Modifier modifier, boolean z, PassPurchaseNudgeCardUIState passPurchaseNudgeCardUIState, NoRideAvailableForSelectedTimeUIState noRideAvailableForSelectedTimeUIState, TextUIState.ChaloTextUIState chaloTextUIState, boolean z2, boolean z3, int i) {
        this.g = list;
        this.b = modifier;
        this.c = z;
        this.h = passPurchaseNudgeCardUIState;
        this.i = noRideAvailableForSelectedTimeUIState;
        this.j = chaloTextUIState;
        this.d = z2;
        this.e = z3;
        this.f = i;
    }
}
