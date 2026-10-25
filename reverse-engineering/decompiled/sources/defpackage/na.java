package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import app.chalo.checkout.ui.payment.CheckoutItemListKt;
import app.chalo.checkout.ui.screen.payment.PaymentCardUiSpec;
import app.chalo.compose.components.GenericErrorScreenComponentKt;
import app.chalo.home.ui.history.compose.MyTicketsScreenUIKt;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.dialog.DropDownMenuUIState;
import app.chalo.uistate.dialog.DropDownMenuUIStateKt;
import app.zophop.homescreen.MyTicketsViewState;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class na implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18466a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ na(SegmentedButtonDefaults segmentedButtonDefaults, boolean z, Function2 function2, Function2 function3, int i, int i2) {
        this.f18466a = 8;
        this.f = segmentedButtonDefaults;
        this.c = z;
        this.g = function2;
        this.b = function3;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18466a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTooltipKt.WrappedAnchor$lambda$1(this.c, (BasicTooltipState) this.f, (Modifier) this.b, (Function2) this.g, this.d, this.e, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BoxWithConstraintsKt.BoxWithConstraints$lambda$1((Modifier) this.b, (Alignment) this.f, this.c, (Function3) this.g, this.d, this.e, (Composer) obj, iIntValue2);
            case 2:
                ((Integer) obj2).getClass();
                CheckoutItemListKt.b((PaymentCardUiSpec) this.f, (List) this.b, (ClickableTextUiState) this.g, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
                return Unit.f17538a;
            case 3:
                int iIntValue3 = ((Integer) obj2).intValue();
                return DatePickerKt.YearPickerMenuButton$lambda$70((Function0) this.f, this.c, (Modifier) this.b, (Function2) this.g, this.d, this.e, (Composer) obj, iIntValue3);
            case 4:
                ((Integer) obj2).getClass();
                DropDownMenuUIStateKt.a(this.c, (Function0) this.f, (DropDownMenuUIState) this.g, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
                return Unit.f17538a;
            case 5:
                int iIntValue4 = ((Integer) obj2).intValue();
                return ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$23(this.c, (Function1) this.f, (Modifier) this.b, (Function3) this.g, this.d, this.e, (Composer) obj, iIntValue4);
            case 6:
                ((Integer) obj2).getClass();
                GenericErrorScreenComponentKt.a((Modifier) this.b, (String) this.f, this.c, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).intValue();
                MyTicketsScreenUIKt.e((MyTicketsViewState) this.f, (Function1) this.b, (SheetState) this.g, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.f17538a;
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                return SegmentedButtonDefaults.Icon$lambda$2((SegmentedButtonDefaults) this.f, this.c, (Function2) this.g, (Function2) this.b, this.d, this.e, (Composer) obj, iIntValue5);
        }
    }

    public /* synthetic */ na(Modifier modifier, Object obj, boolean z, Function function, int i, int i2, int i3) {
        this.f18466a = i3;
        this.b = modifier;
        this.f = obj;
        this.c = z;
        this.g = function;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ na(Object obj, Object obj2, Object obj3, boolean z, int i, int i2, int i3) {
        this.f18466a = i3;
        this.f = obj;
        this.b = obj2;
        this.g = obj3;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ na(Function0 function0, boolean z, Modifier modifier, Function2 function2, int i, int i2) {
        this.f18466a = 3;
        this.f = function0;
        this.c = z;
        this.b = modifier;
        this.g = function2;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ na(boolean z, Object obj, Modifier modifier, Function function, int i, int i2, int i3) {
        this.f18466a = i3;
        this.c = z;
        this.f = obj;
        this.b = modifier;
        this.g = function;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ na(boolean z, Function0 function0, DropDownMenuUIState dropDownMenuUIState, Modifier modifier, int i, int i2) {
        this.f18466a = 4;
        this.c = z;
        this.f = function0;
        this.g = dropDownMenuUIState;
        this.b = modifier;
        this.d = i;
        this.e = i2;
    }
}
