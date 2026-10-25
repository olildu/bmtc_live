package defpackage;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsBusLegCardKt;
import app.chalo.wallet.ui.promotionscardcontainer.PromotionsCardContainerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zy0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20240a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zy0(PagerState pagerState, int i, int i2) {
        this.b = i;
        this.d = pagerState;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20240a) {
            case 0:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                PromotionsCardContainerKt.a((PagerState) this.d, this.b, (Composer) obj, iUpdateChangedFlags);
                break;
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                TripPlannerDetailsBusLegCardKt.f((SeatAvailabilityLevel) this.d, this.b, (Composer) obj, iUpdateChangedFlags2);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ zy0(SeatAvailabilityLevel seatAvailabilityLevel, int i, int i2) {
        this.d = seatAvailabilityLevel;
        this.b = i;
        this.c = i2;
    }
}
