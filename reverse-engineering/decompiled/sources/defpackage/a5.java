package defpackage;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.ui.draw.CacheDrawScope;
import app.chalo.compose.SearchFieldSectionType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultSectionType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import app.chalo.usecase.ChaloCustomDateFormat;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a5(long j, Function0 function0, boolean z) {
        this.b = j;
        this.d = function0;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f162a;
        boolean z = this.c;
        long j = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return AndroidSelectionHandles_androidKt.drawSelectionHandle$lambda$0$0$0(j, (Function0) obj2, z, (CacheDrawScope) obj);
            default:
                TripPlannerResultsComponent tripPlannerResultsComponent = (TripPlannerResultsComponent) obj2;
                TripPlannerResultsState it = (TripPlannerResultsState) obj;
                List list = TripPlannerResultsComponent.Z;
                Intrinsics.i(it, "it");
                return TripPlannerResultsState.a(it, null, null, tripPlannerResultsComponent.p.e(j), FormatTimeInMillisToGivenFormatUseCase.a(tripPlannerResultsComponent.t, j, ChaloCustomDateFormat.DAY_NAME_WITH_DATE_FORMAT, 12), false, SearchFieldSectionType.WITHOUT_PROCEED_BTN, false, TripPlannerResultSectionType.LOADING, null, null, null, null, null, TripPlannerResultsComponent.P0(((TripPlannerResultsState) tripPlannerResultsComponent.f.getValue()).m, z), false, Long.valueOf(j), false, false, false, false, 24147);
        }
    }

    public /* synthetic */ a5(TripPlannerResultsComponent tripPlannerResultsComponent, long j, boolean z) {
        this.d = tripPlannerResultsComponent;
        this.b = j;
        this.c = z;
    }
}
