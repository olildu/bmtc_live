package defpackage;

import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegInfoCardSectionKt;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreenKt;
import app.chalo.providers.RouteNamingSchemeType;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hp implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15848a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Function j;

    public /* synthetic */ hp(Modifier modifier, FocusRequester focusRequester, TextFieldValue textFieldValue, UniversalPickerViewState universalPickerViewState, TextFieldColors textFieldColors, Function1 function1, Function0 function0, int i, int i2) {
        this.b = modifier;
        this.e = focusRequester;
        this.f = textFieldValue;
        this.g = universalPickerViewState;
        this.h = textFieldColors;
        this.i = function1;
        this.j = function0;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15848a) {
            case 0:
                ((Integer) obj2).getClass();
                CitySelectionUniversalPickerScreenKt.i(this.b, (FocusRequester) this.e, (TextFieldValue) this.f, (UniversalPickerViewState) this.g, (TextFieldColors) this.h, (Function1) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                ItineraryLegInfoCardSectionKt.a((String) this.e, (String) this.f, (RouteNamingSchemeType) this.g, (String) this.h, (List) this.i, this.b, (Function3) this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ hp(String str, String str2, RouteNamingSchemeType routeNamingSchemeType, String str3, List list, Modifier modifier, Function3 function3, int i, int i2) {
        this.e = str;
        this.f = str2;
        this.g = routeNamingSchemeType;
        this.h = str3;
        this.i = list;
        this.b = modifier;
        this.j = function3;
        this.c = i;
        this.d = i2;
    }
}
