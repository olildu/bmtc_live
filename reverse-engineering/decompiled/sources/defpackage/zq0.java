package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import app.chalo.compose.components.ChaloScrollableTabRowKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zq0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20223a;
    public final /* synthetic */ int b;

    public /* synthetic */ zq0(int i, int i2) {
        this.f20223a = i2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f20223a;
        List it = (List) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                Intrinsics.i(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1901148677, iIntValue, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.UpcomingAndPastRidesFilterTab.<anonymous>.<anonymous>.<anonymous> (PbBulkBookingRideDetailsScreen.kt:1155)");
                }
                ChaloScrollableTabRowKt.c(it, this.b, composer, iIntValue & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            default:
                Intrinsics.i(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1557994502, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.tripPlannerQuickFilterTab.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:555)");
                }
                ChaloScrollableTabRowKt.b(it, this.b, composer, iIntValue & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
