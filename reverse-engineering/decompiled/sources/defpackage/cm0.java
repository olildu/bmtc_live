package defpackage;

import androidx.compose.material3.NavigationItemColors;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.SeatAvailabilityKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cm0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11344a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Function g;

    public /* synthetic */ cm0(String str, SeatAvailabilityLevel seatAvailabilityLevel, boolean z, boolean z2, Function0 function0, int i) {
        this.e = str;
        this.f = seatAvailabilityLevel;
        this.b = z;
        this.c = z2;
        this.g = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11344a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return NavigationItemKt.StyledLabel$lambda$41(this.b, (TextStyle) this.e, (NavigationItemColors) this.f, this.c, (Function2) this.g, this.d, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                SeatAvailabilityKt.b((String) this.e, (SeatAvailabilityLevel) this.f, this.b, this.c, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ cm0(boolean z, TextStyle textStyle, NavigationItemColors navigationItemColors, boolean z2, Function2 function2, int i) {
        this.b = z;
        this.e = textStyle;
        this.f = navigationItemColors;
        this.c = z2;
        this.g = function2;
        this.d = i;
    }
}
