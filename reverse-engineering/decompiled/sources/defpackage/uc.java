package defpackage;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.window.PopupPositionProvider;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.webview.WebViewComponent_androidKt;
import app.chalo.instantticket.ui.routeselection.compose.RouteSelectionInputKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsBusLegCardKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.bottomsheet.BottomSheetUiStateKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.webview.PlatformWebViewContract;
import app.chalo.uistate.webview.WebViewUIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19732a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ uc(Painter painter, ColorProducer colorProducer, String str, Modifier modifier, int i, int i2) {
        this.f19732a = 4;
        this.e = painter;
        this.f = colorProducer;
        this.g = str;
        this.b = modifier;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19732a) {
            case 0:
                ((Integer) obj2).getClass();
                BottomSheetUiStateKt.a((Modifier) this.b, (BottomSheetUiState) this.e, (SheetState) this.f, (Function3) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                ChaloFilledButtonKt.i((Modifier) this.b, (TextUIState.ChaloTextUIState) this.e, (ImageUIState) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).getClass();
                ChaloTextViewKt.a((Modifier) this.b, (TextUIState.ChaloTextUIState) this.e, (MutableInteractionSource) this.f, (Indication) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 3:
                int iIntValue = ((Integer) obj2).intValue();
                return ContextMenuUiKt.ContextMenuPopup$lambda$0((PopupPositionProvider) this.e, (Function0) this.f, (Modifier) this.b, (Function1) this.g, this.c, this.d, (Composer) obj, iIntValue);
            case 4:
                int iIntValue2 = ((Integer) obj2).intValue();
                return IconKt.Icon$lambda$13((Painter) this.e, (ColorProducer) this.f, (String) this.g, (Modifier) this.b, this.c, this.d, (Composer) obj, iIntValue2);
            case 5:
                int iIntValue3 = ((Integer) obj2).intValue();
                return LazyLayoutKt.LazyLayout$lambda$0((Function0) this.e, (Modifier) this.b, (LazyLayoutPrefetchState) this.f, (Function2) this.g, this.c, this.d, (Composer) obj, iIntValue3);
            case 6:
                int iIntValue4 = ((Integer) obj2).intValue();
                return LazyLayoutKt.LazyLayout$lambda$2((Function0) this.e, (Modifier) this.b, (LazyLayoutPrefetchState) this.f, (LazyLayoutMeasurePolicy) this.g, this.c, this.d, (Composer) obj, iIntValue4);
            case 7:
                int iIntValue5 = ((Integer) obj2).intValue();
                return MaterialThemeKt.MaterialTheme$lambda$0((ColorScheme) this.b, (Shapes) this.e, (Typography) this.f, (Function2) this.g, this.c, this.d, (Composer) obj, iIntValue5);
            case 8:
                ((Integer) obj2).getClass();
                RouteSelectionInputKt.b((String) this.b, (String) this.e, (List) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 9:
                int iIntValue6 = ((Integer) obj2).intValue();
                return SelectionContainerKt.SelectionContainer$lambda$11((Modifier) this.b, (Selection) this.e, (Function1) this.f, (Function2) this.g, this.c, this.d, (Composer) obj, iIntValue6);
            case 10:
                ((Integer) obj2).getClass();
                TextKt.c((TextUIState) this.e, (Modifier) this.b, (MutableInteractionSource) this.f, (Indication) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).getClass();
                TripPlannerDetailsBusLegCardKt.g((Function1) this.e, (TripPlannerLegUiModel.Bus) this.f, (String) this.g, this.c, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).getClass();
                TripPlannerDetailsScreenKt.j((IconType) this.e, (Function1) this.f, (TripPlannerLegUiModel.Metro) this.g, this.c, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).getClass();
                WebViewComponent_androidKt.b((WebViewUIState) this.e, (Modifier) this.b, (Function1) this.f, (PlatformWebViewContract) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ uc(PopupPositionProvider popupPositionProvider, Function0 function0, Modifier modifier, Function1 function1, int i, int i2) {
        this.f19732a = 3;
        this.e = popupPositionProvider;
        this.f = function0;
        this.b = modifier;
        this.g = function1;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ uc(Object obj, Modifier modifier, Object obj2, Object obj3, int i, int i2, int i3) {
        this.f19732a = i3;
        this.e = obj;
        this.b = modifier;
        this.f = obj2;
        this.g = obj3;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ uc(Object obj, Object obj2, Object obj3, int i, Modifier modifier, int i2, int i3) {
        this.f19732a = i3;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = i;
        this.b = modifier;
        this.d = i2;
    }

    public /* synthetic */ uc(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.f19732a = i3;
        this.b = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = i;
        this.d = i2;
    }
}
