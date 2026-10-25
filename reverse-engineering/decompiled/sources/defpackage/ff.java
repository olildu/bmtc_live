package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.DateRangePickerState;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.state.ToggleableState;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.data.ChaloTextWithBackgroundData;
import app.chalo.providers.iconassetprovider.IconType;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ff implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15635a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ ff(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Object obj, Object obj2, FlingBehavior flingBehavior, Function1 function1, int i, int i2, int i3) {
        this.f15635a = i3;
        this.b = modifier;
        this.f = lazyListState;
        this.g = paddingValues;
        this.c = z;
        this.h = obj;
        this.i = obj2;
        this.j = flingBehavior;
        this.k = function1;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15635a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CardKt.ElevatedCard$lambda$4((Function0) this.f, this.b, this.c, (Shape) this.g, (CardColors) this.h, (CardElevation) this.i, (MutableInteractionSource) this.j, (Function3) this.k, this.d, this.e, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                ChaloWidgetCardKt.c(this.b, (Color) this.f, (String) this.g, (ChaloTextWithBackgroundData) this.h, (List) this.i, (List) this.j, (IconType) this.k, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
                return Unit.f17538a;
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return CheckboxKt.TriStateCheckbox$lambda$9((ToggleableState) this.g, (Function0) this.f, (Stroke) this.h, (Stroke) this.i, this.b, this.c, (CheckboxColors) this.k, (MutableInteractionSource) this.j, this.d, this.e, (Composer) obj, iIntValue2);
            case 3:
                int iIntValue3 = ((Integer) obj2).intValue();
                return DatePickerKt.DatePicker$lambda$3((DatePickerState) this.f, this.b, (DatePickerFormatter) this.g, (DatePickerColors) this.h, (Function2) this.i, (Function2) this.j, this.c, (FocusRequester) this.k, this.d, this.e, (Composer) obj, iIntValue3);
            case 4:
                int iIntValue4 = ((Integer) obj2).intValue();
                return DateRangePickerKt.DateRangePicker$lambda$3((DateRangePickerState) this.f, this.b, (DatePickerFormatter) this.g, (DatePickerColors) this.h, (Function2) this.i, (Function2) this.j, this.c, (FocusRequester) this.k, this.d, this.e, (Composer) obj, iIntValue4);
            case 5:
                int iIntValue5 = ((Integer) obj2).intValue();
                return IconButtonKt.OutlinedIconButton$lambda$18((Function0) this.f, this.b, this.c, (Shape) this.g, (IconButtonColors) this.h, (BorderStroke) this.i, (MutableInteractionSource) this.j, (Function2) this.k, this.d, this.e, (Composer) obj, iIntValue5);
            case 6:
                int iIntValue6 = ((Integer) obj2).intValue();
                return LazyDslKt.LazyColumn$lambda$2(this.b, (LazyListState) this.f, (PaddingValues) this.g, this.c, (Arrangement.Vertical) this.h, (Alignment.Horizontal) this.i, (FlingBehavior) this.j, (Function1) this.k, this.d, this.e, (Composer) obj, iIntValue6);
            default:
                int iIntValue7 = ((Integer) obj2).intValue();
                return LazyDslKt.LazyRow$lambda$2(this.b, (LazyListState) this.f, (PaddingValues) this.g, this.c, (Arrangement.Horizontal) this.h, (Alignment.Vertical) this.i, (FlingBehavior) this.j, (Function1) this.k, this.d, this.e, (Composer) obj, iIntValue7);
        }
    }

    public /* synthetic */ ff(Modifier modifier, Color color, String str, ChaloTextWithBackgroundData chaloTextWithBackgroundData, List list, List list2, IconType iconType, boolean z, int i, int i2) {
        this.f15635a = 1;
        this.b = modifier;
        this.f = color;
        this.g = str;
        this.h = chaloTextWithBackgroundData;
        this.i = list;
        this.j = list2;
        this.k = iconType;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ ff(ToggleableState toggleableState, Function0 function0, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.f15635a = 2;
        this.g = toggleableState;
        this.f = function0;
        this.h = stroke;
        this.i = stroke2;
        this.b = modifier;
        this.c = z;
        this.k = checkboxColors;
        this.j = mutableInteractionSource;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ ff(Object obj, Modifier modifier, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function2 function2, Function2 function3, boolean z, FocusRequester focusRequester, int i, int i2, int i3) {
        this.f15635a = i3;
        this.f = obj;
        this.b = modifier;
        this.g = datePickerFormatter;
        this.h = datePickerColors;
        this.i = function2;
        this.j = function3;
        this.c = z;
        this.k = focusRequester;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ ff(Function0 function0, Modifier modifier, boolean z, Shape shape, Object obj, Object obj2, MutableInteractionSource mutableInteractionSource, Function function, int i, int i2, int i3) {
        this.f15635a = i3;
        this.f = function0;
        this.b = modifier;
        this.c = z;
        this.g = shape;
        this.h = obj;
        this.i = obj2;
        this.j = mutableInteractionSource;
        this.k = function;
        this.d = i;
        this.e = i2;
    }
}
