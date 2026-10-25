package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DragHandleColors;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.DragHandleShapes;
import androidx.compose.material3.DragHandleSizes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import androidx.compose.ui.window.PopupPositionProvider;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.compose.ContactSupportTextComposableKt;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoMainScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsBusLegCardKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17371a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ j5(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, Function3 function3, int i, int i2) {
        this.f17371a = 1;
        this.b = modifier;
        this.f = shape;
        this.g = cardColors;
        this.h = cardElevation;
        this.c = function3;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17371a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidViewBindingKt.AndroidViewBinding$lambda$9((Function3) this.c, (Modifier) this.b, (Function1) this.f, (Function1) this.g, (Function1) this.h, this.d, this.e, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return CardKt.ElevatedCard$lambda$3((Modifier) this.b, (Shape) this.f, (CardColors) this.g, (CardElevation) this.h, (Function3) this.c, this.d, this.e, (Composer) obj, iIntValue2);
            case 2:
                ((Integer) obj2).getClass();
                ChaloBusRouteInfoMainScreenKt.a((ImageUIState) this.c, (TextUIState.ChaloTextUIState) this.b, (TextUIState.ChaloTextUIState) this.f, (ButtonUIState) this.g, (ClickableTextUiState) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).getClass();
                ContactSupportTextComposableKt.b((Modifier) this.b, (IconType) this.c, (String) this.f, (String) this.g, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
                return Unit.f17538a;
            case 4:
                int iIntValue3 = ((Integer) obj2).intValue();
                return ContextMenuUiKt.ContextMenuPopup$lambda$2((PopupPositionProvider) this.c, (Function0) this.g, (Modifier) this.b, (ContextMenuColors) this.h, (Function1) this.f, this.d, this.e, (Composer) obj, iIntValue3);
            case 5:
                int iIntValue4 = ((Integer) obj2).intValue();
                return DragHandleKt.VerticalDragHandle$lambda$16((Modifier) this.b, (DragHandleSizes) this.c, (DragHandleColors) this.f, (DragHandleShapes) this.g, (MutableInteractionSource) this.h, this.d, this.e, (Composer) obj, iIntValue4);
            case 6:
                ((Integer) obj2).getClass();
                TripPlannerDetailsBusLegCardKt.b((String) this.c, (String) this.f, (Function0) this.g, (Function0) this.h, (Modifier) this.b, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).getClass();
                TripPlannerDetailsBusLegCardKt.d((String) this.c, (SeatAvailabilityLevel) this.f, (String) this.g, (String) this.h, (Modifier) this.b, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ j5(Modifier modifier, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.f17371a = i3;
        this.b = modifier;
        this.c = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ j5(PopupPositionProvider popupPositionProvider, Function0 function0, Modifier modifier, ContextMenuColors contextMenuColors, Function1 function1, int i, int i2) {
        this.f17371a = 4;
        this.c = popupPositionProvider;
        this.g = function0;
        this.b = modifier;
        this.h = contextMenuColors;
        this.f = function1;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ j5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        this.f17371a = i3;
        this.c = obj;
        this.b = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ j5(String str, Object obj, Object obj2, Object obj3, Modifier modifier, int i, int i2, int i3) {
        this.f17371a = i3;
        this.c = str;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.b = modifier;
        this.d = i;
        this.e = i2;
    }
}
