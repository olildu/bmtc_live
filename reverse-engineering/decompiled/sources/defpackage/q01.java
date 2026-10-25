package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchItem;
import app.chalo.livetracking.universalsearch.ui.compose.RecentSearchedItemComposableKt;
import app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchListComposableKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q01 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19082a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Function f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ q01(UniversalSearchRecentSearchItem.Place place, boolean z, boolean z2, Function1 function1, Function2 function2, Function2 function3, int i) {
        this.h = place;
        this.b = z;
        this.c = z2;
        this.e = function1;
        this.d = function2;
        this.f = function3;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19082a) {
            case 0:
                ((Integer) obj2).getClass();
                RecentSearchedItemComposableKt.c((UniversalSearchRecentSearchItem.Place) this.h, this.b, this.c, (Function1) this.e, this.d, (Function2) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.g | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                RecentSearchedItemComposableKt.e((UniversalSearchRecentSearchItem.Stop) this.h, this.b, this.c, this.d, (Function1) this.e, (Function2) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.g | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                UniversalSearchListComposableKt.b((UniversalSearchItem.RouteList) this.h, this.b, this.c, (TextFieldValue) this.e, (Function0) this.f, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.g | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ q01(UniversalSearchRecentSearchItem.Stop stop, boolean z, boolean z2, Function2 function2, Function1 function1, Function2 function3, int i) {
        this.h = stop;
        this.b = z;
        this.c = z2;
        this.d = function2;
        this.e = function1;
        this.f = function3;
        this.g = i;
    }

    public /* synthetic */ q01(UniversalSearchItem.RouteList routeList, boolean z, boolean z2, TextFieldValue textFieldValue, Function0 function0, Function2 function2, int i) {
        this.h = routeList;
        this.b = z;
        this.c = z2;
        this.e = textFieldValue;
        this.f = function0;
        this.d = function2;
        this.g = i;
    }
}
