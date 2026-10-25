package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.state.ToggleableState;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19317a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ sn(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, Function0 function0, Modifier modifier, ScrollState scrollState, Function3 function3, int i, int i2) {
        this.g = exposedDropdownMenuBoxScope;
        this.b = z;
        this.d = function0;
        this.c = modifier;
        this.h = scrollState;
        this.i = function3;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19317a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CheckboxKt.TriStateCheckbox$lambda$8((ToggleableState) this.g, (Function0) this.d, this.c, this.b, (CheckboxColors) this.h, (MutableInteractionSource) this.i, this.e, this.f, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ContextMenuUiKt.ContextMenuItem$lambda$2((String) this.g, this.b, (ContextMenuColors) this.h, this.c, (Function3) this.i, (Function0) this.d, this.e, this.f, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return ExposedDropdownMenuBoxScope.ExposedDropdownMenu$lambda$9((ExposedDropdownMenuBoxScope) this.g, this.b, (Function0) this.d, this.c, (ScrollState) this.h, (Function3) this.i, this.e, this.f, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return IconButtonKt.IconButton$lambda$0((Function0) this.d, this.c, this.b, (IconButtonColors) this.g, (MutableInteractionSource) this.i, (Function2) this.h, this.e, this.f, (Composer) obj, iIntValue4);
            default:
                ((Integer) obj2).getClass();
                JourneyDetailsBottomSheetKt.g((IconType) this.g, (TripPlannerLegUiModel.Metro) this.d, (String) this.h, this.e, this.b, (String) this.i, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ sn(ToggleableState toggleableState, Function0 function0, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.g = toggleableState;
        this.d = function0;
        this.c = modifier;
        this.b = z;
        this.h = checkboxColors;
        this.i = mutableInteractionSource;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ sn(IconType iconType, TripPlannerLegUiModel.Metro metro, String str, int i, boolean z, String str2, Modifier modifier, int i2) {
        this.g = iconType;
        this.d = metro;
        this.h = str;
        this.e = i;
        this.b = z;
        this.i = str2;
        this.c = modifier;
        this.f = i2;
    }

    public /* synthetic */ sn(String str, boolean z, ContextMenuColors contextMenuColors, Modifier modifier, Function3 function3, Function0 function0, int i, int i2) {
        this.g = str;
        this.b = z;
        this.h = contextMenuColors;
        this.c = modifier;
        this.i = function3;
        this.d = function0;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ sn(Function0 function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2) {
        this.d = function0;
        this.c = modifier;
        this.b = z;
        this.g = iconButtonColors;
        this.i = mutableInteractionSource;
        this.h = function2;
        this.e = i;
        this.f = i2;
    }
}
