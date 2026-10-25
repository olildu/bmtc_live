package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.ChaloLocationHeaderItemKt;
import app.chalo.compose.components.ChaloHollowOrangeButtonKt;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsCTAViewKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsBusLegCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18519a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ nk(Modifier modifier, String str, Function0 function0, int i, int i2) {
        this.b = modifier;
        this.c = str;
        this.d = function0;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18519a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloHollowOrangeButtonKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f, (Composer) obj, this.b, this.c, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ChaloLocationHeaderItemKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f, (Composer) obj, this.b, this.c, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f | 1);
                FareDetailsCTAViewKt.b(this.e, iUpdateChangedFlags, (Composer) obj, this.b, this.c, this.d);
                break;
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f | 1);
                TripPlannerDetailsBusLegCardKt.a(this.e, iUpdateChangedFlags2, (Composer) obj, this.b, this.c, this.d);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ nk(String str, Modifier modifier, int i, Function0 function0, int i2) {
        this.c = str;
        this.b = modifier;
        this.e = i;
        this.d = function0;
        this.f = i2;
    }

    public /* synthetic */ nk(String str, Modifier modifier, Function0 function0, int i, int i2) {
        this.c = str;
        this.b = modifier;
        this.d = function0;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ nk(String str, Function0 function0, Modifier modifier, int i, int i2) {
        this.c = str;
        this.d = function0;
        this.b = modifier;
        this.e = i;
        this.f = i2;
    }
}
