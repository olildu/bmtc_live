package defpackage;

import androidx.compose.material3.TimePickerDialogDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yi1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20113a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yi1(TimePickerDialogDefaults timePickerDialogDefaults, int i, Modifier modifier, int i2, int i3) {
        this.f = timePickerDialogDefaults;
        this.c = i;
        this.b = modifier;
        this.d = i2;
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20113a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TimePickerDialogDefaults.Title_pK_nZyw$lambda$1((TimePickerDialogDefaults) this.f, this.c, this.b, this.d, this.e, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                TripPlannerResultsScreenKt.l((TripPlannerLegUiModel) this.f, this.b, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ yi1(TripPlannerLegUiModel tripPlannerLegUiModel, Modifier modifier, int i, int i2, int i3) {
        this.f = tripPlannerLegUiModel;
        this.b = modifier;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }
}
