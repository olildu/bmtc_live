package defpackage;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vm implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19850a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ vm(int i, Function2 function2) {
        this.f19850a = i;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f19850a) {
            case 0:
                RowScope ChaloToolBar = (RowScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloToolBar, "$this$ChaloToolBar");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-697964511, iIntValue, -1, "app.chalo.compose.ChaloToolBarUIWithRightComponent.<anonymous> (ChaloToolBar.kt:452)");
                    }
                    if (t8.q(composer, 0, this.b)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-175810512, iIntValue2, -1, "app.chalo.home.ui.common.ImageResourceSectionUI.<anonymous>.<anonymous> (ImageResourceSectionUI.kt:92)");
                    }
                    if (t8.q(composer2, 6, this.b)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1032278729, iIntValue3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.TimeTableHeading.<anonymous> (RouteTimeTable.kt:98)");
                    }
                    if (t8.q(composer3, 0, this.b)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
