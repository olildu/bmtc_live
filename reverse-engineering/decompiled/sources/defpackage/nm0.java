package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.chalomap.ChaloMapOverlayConfig;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.SuperPassResponseAppModel;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nm0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18525a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ nm0(Modifier modifier, SuperPassResponseAppModel superPassResponseAppModel, String str, String str2, Integer num, boolean z, String str3, boolean z2, Function0 function0, Function0 function1, Function1 function2, int i, int i2) {
        this.b = modifier;
        this.k = superPassResponseAppModel;
        this.c = str;
        this.l = str2;
        this.m = num;
        this.d = z;
        this.n = str3;
        this.e = z2;
        this.f = function0;
        this.g = function1;
        this.h = function2;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18525a) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.i | 1);
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.j);
                NearbyStopsMapScreenKt.a((List) this.k, (MapCameraViewState) this.l, (ChaloMapOverlayConfig) this.m, this.c, this.d, this.e, this.b, this.f, this.h, this.g, (Function1) this.n, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.i | 1);
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.j);
                PbBulkBookingRideDetailsScreenKt.g(this.b, (SuperPassResponseAppModel) this.k, this.c, (String) this.l, (Integer) this.m, this.d, (String) this.n, this.e, this.f, this.g, this.h, (Composer) obj, iUpdateChangedFlags3, iUpdateChangedFlags4);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ nm0(List list, MapCameraViewState mapCameraViewState, ChaloMapOverlayConfig chaloMapOverlayConfig, String str, boolean z, boolean z2, Modifier modifier, Function0 function0, Function1 function1, Function0 function2, Function1 function3, int i, int i2) {
        this.k = list;
        this.l = mapCameraViewState;
        this.m = chaloMapOverlayConfig;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.b = modifier;
        this.f = function0;
        this.h = function1;
        this.g = function2;
        this.n = function3;
        this.i = i;
        this.j = i2;
    }
}
