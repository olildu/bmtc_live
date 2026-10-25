package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.dialogs.ChaloTimePickerKt;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18326a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ lm(Modifier modifier, int i, int i2, Function0 function0, Function3 function3, Function0 function1, int i3) {
        this.c = modifier;
        this.b = i;
        this.d = i2;
        this.f = function0;
        this.h = function3;
        this.g = function1;
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18326a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloTimePickerKt.a(this.c, this.b, this.d, (Function0) this.f, (Function3) this.h, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                JourneyDetailsBottomSheetKt.i((String) this.f, (String) this.g, this.b, (List) this.h, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                TripPlannerResultsScreenKt.j((String) this.f, this.b, (String) this.g, this.c, (Integer) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                TripPlannerResultsScreenKt.m((Function3) this.h, (Function3) this.f, (Function3) this.g, this.c, this.b, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ lm(String str, int i, String str2, Modifier modifier, Integer num, int i2, int i3) {
        this.f = str;
        this.b = i;
        this.g = str2;
        this.c = modifier;
        this.h = num;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ lm(String str, String str2, int i, List list, Modifier modifier, int i2, int i3) {
        this.f = str;
        this.g = str2;
        this.b = i;
        this.h = list;
        this.c = modifier;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ lm(Function3 function3, Function3 function4, Function3 function5, Modifier modifier, int i, int i2, int i3) {
        this.h = function3;
        this.f = function4;
        this.g = function5;
        this.c = modifier;
        this.b = i;
        this.d = i2;
        this.e = i3;
    }
}
