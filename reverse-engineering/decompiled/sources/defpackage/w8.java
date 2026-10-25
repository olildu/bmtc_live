package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.compose.components.CommonFromAndToSelectionKt;
import app.chalo.compose.components.textfields.BaseChaloTextFieldKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.MetroTicketPurchaseBottomSheetContentKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsBusLegCardKt;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.routeselection.ui.compose.RouteSelectionBottomSheetKt;
import app.chalo.uistate.components.FromToStopIconUIState;
import app.chalo.uistate.components.StopSelectionUIState;
import app.chalo.uistate.fromto.StopBasedFromToSelectionContainerUISpec;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19902a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ w8(int i, Function2 function2, Function3 function3, Function2 function4, Function2 function5, WindowInsets windowInsets, Function2 function6, int i2) {
        this.f19902a = 5;
        this.c = i;
        this.g = function2;
        this.h = function3;
        this.e = function4;
        this.b = function5;
        this.f = windowInsets;
        this.i = function6;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19902a) {
            case 0:
                ((Integer) obj2).getClass();
                BaseChaloTextFieldKt.a((BaseTextFieldUIState) this.e, (Modifier) this.b, (MutableInteractionSource) this.f, (Function2) this.g, (Function3) this.h, (VisualTransformation) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                CommonFromAndToSelectionKt.a((Modifier) this.b, (StopBasedFromToSelectionContainerUISpec) this.e, (StopSelectionUIState) this.f, (StopSelectionUIState) this.g, (FromToStopIconUIState) this.h, (ImageUIState) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).getClass();
                MetroTicketPurchaseBottomSheetContentKt.a((Modifier) this.b, (String) this.e, (String) this.f, this.c, (Function0) this.g, (Function0) this.h, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).getClass();
                PremiumBusStopSelectionScreenKt.b((Modifier) this.b, (String) this.e, (TextStyle) this.f, (String) this.g, (TextStyle) this.h, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).getClass();
                RouteSelectionBottomSheetKt.c((Modifier) this.b, (Painter) this.e, (String) this.f, (String) this.g, (List) this.h, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 5:
                int iIntValue = ((Integer) obj2).intValue();
                return ScaffoldKt.ScaffoldLayout_FMILGgc$lambda$16(this.c, (Function2) this.g, (Function3) this.h, (Function2) this.e, (Function2) this.b, (WindowInsets) this.f, (Function2) this.i, this.d, (Composer) obj, iIntValue);
            case 6:
                ((Integer) obj2).getClass();
                TripPlannerDetailsBusLegCardKt.c((RouteServiceType) this.e, (String) this.f, (String) this.g, (Function0) this.h, (Function0) this.i, (Modifier) this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).getClass();
                TripPlannerDetailsScreenKt.m((IconType) this.e, (String) this.f, (String) this.g, (String) this.h, this.c, (Modifier) this.b, (IconType) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).getClass();
                TripPlannerResultsScreenKt.i((String) this.e, (String) this.f, (String) this.g, (SeatAvailabilityLevel) this.h, (StringEnum) this.i, (Modifier) this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ w8(Modifier modifier, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        this.f19902a = i3;
        this.b = modifier;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ w8(Modifier modifier, String str, String str2, int i, Function0 function0, Function0 function1, Function0 function2, int i2) {
        this.f19902a = 2;
        this.b = modifier;
        this.e = str;
        this.f = str2;
        this.c = i;
        this.g = function0;
        this.h = function1;
        this.i = function2;
        this.d = i2;
    }

    public /* synthetic */ w8(IconType iconType, String str, String str2, String str3, int i, Modifier modifier, IconType iconType2, int i2) {
        this.f19902a = 7;
        this.e = iconType;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.c = i;
        this.b = modifier;
        this.i = iconType2;
        this.d = i2;
    }

    public /* synthetic */ w8(BaseTextFieldUIState baseTextFieldUIState, Modifier modifier, MutableInteractionSource mutableInteractionSource, Function2 function2, Function3 function3, VisualTransformation visualTransformation, int i, int i2) {
        this.f19902a = 0;
        this.e = baseTextFieldUIState;
        this.b = modifier;
        this.f = mutableInteractionSource;
        this.g = function2;
        this.h = function3;
        this.i = visualTransformation;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ w8(Object obj, String str, String str2, Object obj2, Object obj3, Modifier modifier, int i, int i2, int i3) {
        this.f19902a = i3;
        this.e = obj;
        this.f = str;
        this.g = str2;
        this.h = obj2;
        this.i = obj3;
        this.b = modifier;
        this.c = i;
        this.d = i2;
    }
}
