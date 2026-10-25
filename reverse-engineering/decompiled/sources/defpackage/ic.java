package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegStopListSectionKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.providers.iconassetprovider.IconType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ic implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15900a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ic(IconType iconType, String str, String str2, int i, Modifier modifier, IconType iconType2, int i2, int i3) {
        this.d = iconType;
        this.f = str;
        this.g = str2;
        this.b = i;
        this.h = modifier;
        this.i = iconType2;
        this.c = i2;
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15900a;
        int i2 = this.e;
        int i3 = this.c;
        Unit unit = Unit.f17538a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                float f = BottomSheetScaffoldKt.f4445a;
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                BottomSheetScaffoldKt.a((Function2) obj7, (Function2) obj6, (Function2) obj5, (Function2) obj4, (State) obj3, this.b, this.c, (Composer) obj, iUpdateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                ItineraryLegStopListSectionKt.c((String) obj6, (String) obj5, this.b, (List) obj4, (Modifier) obj3, this.c, (Function2) obj7, (Composer) obj, iUpdateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                TripPlannerDetailsScreenKt.n((IconType) obj7, (String) obj6, (String) obj5, this.b, (Modifier) obj4, (IconType) obj3, (Composer) obj, iUpdateChangedFlags3, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                TripPlannerDetailsScreenKt.e((IconType) obj7, (Function1) obj6, (TripPlannerLegUiModel.Bus) obj5, (String) obj4, this.b, (Modifier) obj3, (Composer) obj, iUpdateChangedFlags4, this.e);
                break;
        }
        return unit;
    }

    public /* synthetic */ ic(IconType iconType, Function1 function1, TripPlannerLegUiModel.Bus bus, String str, int i, Modifier modifier, int i2, int i3) {
        this.d = iconType;
        this.f = function1;
        this.g = bus;
        this.h = str;
        this.b = i;
        this.i = modifier;
        this.c = i2;
        this.e = i3;
    }

    public /* synthetic */ ic(String str, String str2, int i, List list, Modifier modifier, int i2, Function2 function2, int i3) {
        this.f = str;
        this.g = str2;
        this.b = i;
        this.h = list;
        this.i = modifier;
        this.c = i2;
        this.d = function2;
        this.e = i3;
    }

    public /* synthetic */ ic(Function2 function2, Function2 function3, Function2 function4, Function2 function5, State state, int i, int i2, int i3) {
        this.d = function2;
        this.f = function3;
        this.g = function4;
        this.h = function5;
        this.i = state;
        this.b = i;
        this.c = i2;
        this.e = i3;
    }
}
