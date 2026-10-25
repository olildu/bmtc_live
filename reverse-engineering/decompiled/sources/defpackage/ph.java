package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.LabelKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderPositions;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import app.chalo.compose.CityLocationConfigFetchErrorScreenKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.home.ui.chalobus.ChaloBusComponent;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.home.HomeScreenViewState;
import app.chalo.home.ui.home.HomeTabCallbacks;
import app.chalo.home.ui.home.HomeTabScaffoldKt;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchRecentSearchedItemLayoutUiModel;
import app.chalo.livetracking.universalsearch.ui.compose.SearchStopAndLocationItemComposableKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ph implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19035a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ph(Modifier modifier, String str, boolean z, Function0 function0, Function0 function1, int i, int i2) {
        this.f19035a = 1;
        this.e = modifier;
        this.f = str;
        this.b = z;
        this.g = function0;
        this.h = function1;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19035a) {
            case 0:
                ((Integer) obj2).intValue();
                ChaloBusScreenUIKt.g((ChaloBusComponent) this.e, (ChaloBusViewState) this.f, (Function1) this.g, (SheetState) this.h, this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                CityLocationConfigFetchErrorScreenKt.a((Modifier) this.e, (String) this.f, this.b, (Function0) this.g, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 2:
                int iIntValue = ((Integer) obj2).intValue();
                return DatePickerKt.IconButtonWithTooltip$lambda$71((Function0) this.e, (ImageVector) this.f, (String) this.g, (Modifier) this.h, this.b, this.c, this.d, (Composer) obj, iIntValue);
            case 3:
                ((Integer) obj2).getClass();
                FromAndToStopDetailViewKt.b((Modifier) this.e, (Function2) this.f, (Function2) this.g, this.b, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).intValue();
                HomeTabScaffoldKt.f((HomeScreenViewState) this.e, (Function1) this.g, (SheetState) this.h, (HomeTabCallbacks) this.f, this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 5:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LabelKt.Label$lambda$5((Function3) this.e, (Modifier) this.f, (MutableInteractionSource) this.g, this.b, (Function2) this.h, this.c, this.d, (Composer) obj, iIntValue2);
            case 6:
                int iIntValue3 = ((Integer) obj2).intValue();
                return NavigationDrawerKt.DismissibleNavigationDrawer$lambda$39((Function2) this.e, (Modifier) this.f, (DrawerState) this.g, this.b, (Function2) this.h, this.c, this.d, (Composer) obj, iIntValue3);
            case 7:
                ((Integer) obj2).getClass();
                SearchStopAndLocationItemComposableKt.b((UniversalSearchRecentSearchedItemLayoutUiModel) this.e, this.b, (Function0) this.f, (Function0) this.h, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 8:
                int iIntValue4 = ((Integer) obj2).intValue();
                return SliderDefaults.Track$lambda$13((SliderDefaults) this.e, (SliderState) this.f, (Modifier) this.g, (SliderColors) this.h, this.b, this.c, this.d, (Composer) obj, iIntValue4);
            case 9:
                int iIntValue5 = ((Integer) obj2).intValue();
                return SliderDefaults.Track$lambda$12((SliderDefaults) this.e, (SliderPositions) this.f, (Modifier) this.g, (SliderColors) this.h, this.b, this.c, this.d, (Composer) obj, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj2).intValue();
                return SliderDefaults.Track$lambda$33((SliderDefaults) this.e, (RangeSliderState) this.f, (Modifier) this.g, (SliderColors) this.h, this.b, this.c, this.d, (Composer) obj, iIntValue6);
        }
    }

    public /* synthetic */ ph(HomeScreenViewState homeScreenViewState, Function1 function1, SheetState sheetState, HomeTabCallbacks homeTabCallbacks, boolean z, int i, int i2) {
        this.f19035a = 4;
        this.e = homeScreenViewState;
        this.g = function1;
        this.h = sheetState;
        this.f = homeTabCallbacks;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ ph(UniversalSearchRecentSearchedItemLayoutUiModel universalSearchRecentSearchedItemLayoutUiModel, boolean z, Function0 function0, Function0 function1, Function1 function2, int i, int i2) {
        this.f19035a = 7;
        this.e = universalSearchRecentSearchedItemLayoutUiModel;
        this.b = z;
        this.f = function0;
        this.h = function1;
        this.g = function2;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ ph(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i, int i2, int i3) {
        this.f19035a = i3;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ ph(Object obj, Object obj2, Object obj3, boolean z, Function function, int i, int i2, int i3) {
        this.f19035a = i3;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.b = z;
        this.h = function;
        this.c = i;
        this.d = i2;
    }
}
