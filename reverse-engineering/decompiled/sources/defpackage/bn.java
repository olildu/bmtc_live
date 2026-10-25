package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangeInputKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import app.chalo.compose.ChaloUserReviewFormComposableKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt;
import app.chalo.onboarding.cityselection.ui.CitySelectionSearchPanelUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.usecase.FeedbackData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11213a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ bn(Animatable animatable, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Modifier modifier, WindowInsets windowInsets, Function2 function2, Function2 function3, Function2 function4, int i) {
        this.f11213a = 6;
        this.d = animatable;
        this.e = mutableFloatState;
        this.f = mutableState;
        this.g = mutableState2;
        this.b = modifier;
        this.h = windowInsets;
        this.j = function2;
        this.i = function3;
        this.k = function4;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11213a) {
            case 0:
                ((Integer) obj2).intValue();
                ChaloUserReviewFormComposableKt.a((Modifier) this.b, (IconType) this.d, (String) this.e, (String) this.f, (String) this.g, (FeedbackData) this.i, (String) this.h, (Function2) this.j, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                CitySelectionScreenKt.h((ToolbarUIState) this.d, (ImageUIState) this.e, (CitySelectionSearchPanelUIState) this.f, (ChaloPadding) this.g, (ChaloPadding) this.h, (ChaloPadding) this.i, (SafeFocusRequester) this.j, (Function1) this.k, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 2:
                int iIntValue = ((Integer) obj2).intValue();
                return ComposableLambdaImpl.invoke$lambda$7((ComposableLambdaImpl) this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.c, (Composer) obj, iIntValue);
            case 3:
                ((Integer) obj2).getClass();
                ConfirmSuperPassScreenKt.k((TextUIState) this.d, (TextUIState) this.e, (ChaloPadding) this.f, (ChaloPadding) this.g, (ChaloPadding) this.h, (Modifier) this.b, (TextUIState) this.i, (TextUIState) this.j, (ImageUIState) this.k, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 4:
                int iIntValue2 = ((Integer) obj2).intValue();
                return DatePickerKt.HorizontalMonthsList$lambda$42((LazyListState) this.b, (Long) this.d, (Function1) this.e, (Function1) this.f, (CalendarModel) this.g, (IntRange) this.h, (DatePickerFormatter) this.i, (SelectableDates) this.j, (DatePickerColors) this.k, this.c, (Composer) obj, iIntValue2);
            case 5:
                int iIntValue3 = ((Integer) obj2).intValue();
                return DateRangeInputKt.DateRangeInputContent$lambda$8((Long) this.b, (Long) this.d, (Function2) this.j, (CalendarModel) this.e, (IntRange) this.f, (DatePickerFormatter) this.g, (SelectableDates) this.h, (DatePickerColors) this.i, (FocusRequester) this.k, this.c, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return SearchBarKt.SearchBarLayout$lambda$49((Animatable) this.d, (MutableFloatState) this.e, (MutableState) this.f, (MutableState) this.g, (Modifier) this.b, (WindowInsets) this.h, (Function2) this.j, (Function2) this.i, (Function2) this.k, this.c, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ bn(Modifier modifier, IconType iconType, String str, String str2, String str3, FeedbackData feedbackData, String str4, Function2 function2, Function0 function0, int i) {
        this.f11213a = 0;
        this.b = modifier;
        this.d = iconType;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.i = feedbackData;
        this.h = str4;
        this.j = function2;
        this.k = function0;
        this.c = i;
    }

    public /* synthetic */ bn(TextUIState textUIState, TextUIState textUIState2, ChaloPadding chaloPadding, ChaloPadding chaloPadding2, ChaloPadding chaloPadding3, Modifier modifier, TextUIState textUIState3, TextUIState textUIState4, ImageUIState imageUIState, int i) {
        this.f11213a = 3;
        this.d = textUIState;
        this.e = textUIState2;
        this.f = chaloPadding;
        this.g = chaloPadding2;
        this.h = chaloPadding3;
        this.b = modifier;
        this.i = textUIState3;
        this.j = textUIState4;
        this.k = imageUIState;
        this.c = i;
    }

    public /* synthetic */ bn(ToolbarUIState toolbarUIState, ImageUIState imageUIState, CitySelectionSearchPanelUIState citySelectionSearchPanelUIState, ChaloPadding chaloPadding, ChaloPadding chaloPadding2, ChaloPadding chaloPadding3, SafeFocusRequester safeFocusRequester, Function1 function1, Modifier modifier, int i) {
        this.f11213a = 1;
        this.d = toolbarUIState;
        this.e = imageUIState;
        this.f = citySelectionSearchPanelUIState;
        this.g = chaloPadding;
        this.h = chaloPadding2;
        this.i = chaloPadding3;
        this.j = safeFocusRequester;
        this.k = function1;
        this.b = modifier;
        this.c = i;
    }

    public /* synthetic */ bn(Long l, Long l2, Function2 function2, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i) {
        this.f11213a = 5;
        this.b = l;
        this.d = l2;
        this.j = function2;
        this.e = calendarModel;
        this.f = intRange;
        this.g = datePickerFormatter;
        this.h = selectableDates;
        this.i = datePickerColors;
        this.k = focusRequester;
        this.c = i;
    }

    public /* synthetic */ bn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i, int i2) {
        this.f11213a = i2;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.j = obj8;
        this.k = obj9;
        this.c = i;
    }
}
