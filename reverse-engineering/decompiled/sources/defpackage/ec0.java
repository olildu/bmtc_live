package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegStopListSectionKt;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ec0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15539a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ ec0(int i, String str, String str2, boolean z, Function0 function0, Modifier modifier, int i2, int i3, int i4) {
        this.f15539a = i4;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = function0;
        this.g = modifier;
        this.h = i2;
        this.i = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15539a) {
            case 0:
                ((Integer) obj2).getClass();
                ItineraryLegStopListSectionKt.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                JourneyDetailsBottomSheetKt.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.i | 1));
                break;
        }
        return Unit.f17538a;
    }
}
