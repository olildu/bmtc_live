package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kl1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17510a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kl1(TripPlannerItineraryUiModel tripPlannerItineraryUiModel, Function0 function0, Modifier modifier, int i, int i2) {
        this.e = tripPlannerItineraryUiModel;
        this.f = function0;
        this.b = modifier;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17510a) {
            case 0:
                ((Integer) obj2).getClass();
                TripPlannerDetailsScreenKt.h((IconType) this.e, this.c, this.b, (IconType) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                TripPlannerResultsScreenKt.h((TripPlannerItineraryUiModel) this.e, (Function0) this.f, this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ kl1(IconType iconType, int i, Modifier modifier, IconType iconType2, int i2) {
        this.e = iconType;
        this.c = i;
        this.b = modifier;
        this.f = iconType2;
        this.d = i2;
    }
}
