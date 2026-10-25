package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.maps.android.compose.IndoorStateChangeListener;
import com.google.maps.android.compose.MapProperties;
import com.google.maps.android.compose.MapUiSettings;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15432a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ d60(Modifier modifier, CameraPositionState cameraPositionState, Function0 function0, MapProperties mapProperties, MapUiSettings mapUiSettings, IndoorStateChangeListener indoorStateChangeListener, Function1 function1, Function0 function2, PaddingValues paddingValues, Function2 function3, Function2 function4, int i, int i2, int i3) {
        this.f15432a = i3;
        this.b = modifier;
        this.c = cameraPositionState;
        this.d = function0;
        this.e = mapProperties;
        this.f = mapUiSettings;
        this.g = indoorStateChangeListener;
        this.h = function1;
        this.i = function2;
        this.j = paddingValues;
        this.k = function3;
        this.l = function4;
        this.m = i;
        this.n = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15432a) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.m | 1);
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.n);
                GoogleMapKt.a(this.b, (CameraPositionState) this.c, (Function0) this.d, (MapProperties) this.e, (MapUiSettings) this.f, (IndoorStateChangeListener) this.g, this.h, (Function0) this.i, (PaddingValues) this.j, (Function2) this.k, (Function2) this.l, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.m | 1);
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.n);
                GoogleMapKt.a(this.b, (CameraPositionState) this.c, (Function0) this.d, (MapProperties) this.e, (MapUiSettings) this.f, (IndoorStateChangeListener) this.g, this.h, (Function0) this.i, (PaddingValues) this.j, (Function2) this.k, (Function2) this.l, (Composer) obj, iUpdateChangedFlags3, iUpdateChangedFlags4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags5 = RecomposeScopeImplKt.updateChangedFlags(this.m | 1);
                int iUpdateChangedFlags6 = RecomposeScopeImplKt.updateChangedFlags(this.n);
                PostValidationScreenKt.g((List) this.c, (List) this.d, (List) this.i, this.h, this.b, (String) this.e, (String) this.f, (String) this.g, (String) this.j, (Integer) this.k, (PremiumBusPostBookingStopSchedule) this.l, (Composer) obj, iUpdateChangedFlags5, iUpdateChangedFlags6);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ d60(List list, List list2, List list3, Function1 function1, Modifier modifier, String str, String str2, String str3, String str4, Integer num, PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule, int i, int i2) {
        this.f15432a = 2;
        this.c = list;
        this.d = list2;
        this.i = list3;
        this.h = function1;
        this.b = modifier;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.j = str4;
        this.k = num;
        this.l = premiumBusPostBookingStopSchedule;
        this.m = i;
        this.n = i2;
    }
}
