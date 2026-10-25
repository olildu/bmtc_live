package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsScreenAnimationEventHandler;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteDetailsUIStateFactory$animationEventHandler$2$1", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsScreenAnimationEventHandler;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsUIStateFactory$animationEventHandler$2$1 implements RouteDetailsScreenAnimationEventHandler {
    @Override // app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsScreenAnimationEventHandler
    public final float a(float f, int i, int i2) {
        return i - i2 > 0 ? Dp.m7278constructorimpl(ChaloThemeHelper.a().o * f) : ChaloThemeHelper.a().f1916a;
    }

    @Override // app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsScreenAnimationEventHandler
    public final float b(float f, int i, int i2) {
        if (i - i2 <= 0) {
            return ChaloThemeHelper.a().e;
        }
        return Dp.m7278constructorimpl((1 - f) * ChaloThemeHelper.a().e);
    }
}
