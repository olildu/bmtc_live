package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloChipKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.BusTicketCardUIKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.RouteInfo;
import app.chalo.premiumbus.ui.slotselection.OutlinedButtonUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class md implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18389a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ md(int i, boolean z, int i2, Object obj) {
        this.f18389a = i2;
        this.d = obj;
        this.b = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18389a) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                BusTicketCardUIKt.a(this.b, (RouteInfo) this.d, (Composer) obj, iUpdateChangedFlags);
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                ChaloChipKt.a((Modifier) this.d, this.b, (Composer) obj, iUpdateChangedFlags2);
                return Unit.f17538a;
            case 2:
                int iIntValue = ((Integer) obj2).intValue();
                return CoreTextFieldKt.SelectionToolbarAndHandles$lambda$1((TextFieldSelectionManager) this.d, this.b, this.c, (Composer) obj, iIntValue);
            case 3:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ExposedDropdownMenuDefaults.TrailingIcon$lambda$1((ExposedDropdownMenuDefaults) this.d, this.b, this.c, (Composer) obj, iIntValue2);
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                PremiumBusSlotSelectionUiStateKt.h((OutlinedButtonUIState) this.d, this.b, (Composer) obj, iUpdateChangedFlags3);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ md(boolean z, RouteInfo routeInfo, int i) {
        this.f18389a = 0;
        this.b = z;
        this.d = routeInfo;
        this.c = i;
    }
}
