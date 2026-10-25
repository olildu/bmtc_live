package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.PopupPositionProvider;
import app.chalo.data.TextFormatAppModel;
import app.chalo.home.ui.common.TabHeaderKt;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt;
import app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel;
import app.chalo.instantticket.ui.faredetails.compose.BottomSheetViewsKt;
import app.chalo.instantticket.ui.faredetails.compose.PassengerDetailsViewKt;
import app.chalo.ncmc.ui.landing.compose.SingleCardDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusActiveTicketKt;
import app.chalo.providers.iconassetprovider.IconType;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18382a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ma(Object obj, Object obj2, Object obj3, boolean z, Object obj4, int i, int i2) {
        this.f18382a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = z;
        this.g = obj4;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18382a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTooltipKt.TooltipPopup$lambda$2((PopupPositionProvider) this.d, (BasicTooltipState) this.e, (CoroutineScope) this.f, this.b, (Function2) this.g, this.c, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                BottomSheetViewsKt.c((Modifier) this.d, (String) this.e, this.b, (Function0) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).getClass();
                ChaloBusActiveTicketKt.h((String) this.d, (String) this.e, this.b, (Function0) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).getClass();
                PassengerDetailsViewKt.c((Modifier) this.d, (PassengerFareDetailsUiModel) this.e, this.b, (Function1) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).intValue();
                PassengerDetailsViewKt.f((String) this.d, (String) this.e, (String) this.f, this.b, (String) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).intValue();
                RegularBusScreenUIKt.f((Function1) this.d, (String) this.e, (List) this.f, (Density) this.g, this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).intValue();
                RegularBusScreenUIKt.g((Function1) this.d, (RegularBusViewState) this.e, (TextFormatAppModel) this.f, this.b, (Density) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).getClass();
                SingleCardDetailsScreenKt.e((Modifier) this.d, (String) this.e, (String) this.f, this.b, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).intValue();
                TabHeaderKt.b((String) this.d, (IconType) this.e, (Function0) this.f, this.b, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TimePickerKt.ToggleItem$lambda$50(this.b, (Shape) this.d, (Function0) this.e, (TimePickerColors) this.f, (Function3) this.g, this.c, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ ma(Object obj, Object obj2, boolean z, Function function, Object obj3, int i, int i2) {
        this.f18382a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.f = function;
        this.g = obj3;
        this.c = i;
    }

    public /* synthetic */ ma(Function1 function1, String str, List list, Density density, boolean z, int i) {
        this.f18382a = 5;
        this.d = function1;
        this.e = str;
        this.f = list;
        this.g = density;
        this.b = z;
        this.c = i;
    }

    public /* synthetic */ ma(boolean z, Shape shape, Function0 function0, TimePickerColors timePickerColors, Function3 function3, int i) {
        this.f18382a = 9;
        this.b = z;
        this.d = shape;
        this.e = function0;
        this.f = timePickerColors;
        this.g = function3;
        this.c = i;
    }
}
