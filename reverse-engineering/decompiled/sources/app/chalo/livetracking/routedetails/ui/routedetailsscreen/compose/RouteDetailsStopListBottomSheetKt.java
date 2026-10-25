package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Shape;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsStopListBottomSheetKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsStopListBottomSheetKt {
    public static final void a(final BottomSheetScaffoldState modalBottomSheetState, final Function3 sheetContent, final Shape shape, final float f, final float f2, final Function2 floatingActionButton, final Function3 content, Composer composer, final int i) {
        int i2;
        Shape shape2;
        Composer composer2;
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Intrinsics.i(sheetContent, "sheetContent");
        Intrinsics.i(floatingActionButton, "floatingActionButton");
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1832115550);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modalBottomSheetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sheetContent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            shape2 = shape;
            i2 |= composerStartRestartGroup.changed(shape2) ? 256 : 128;
        } else {
            shape2 = shape;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(floatingActionButton) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1832115550, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsStopListBottomSheet (RouteDetailsStopListBottomSheet.kt:20)");
            }
            int i3 = i2 << 3;
            composer2 = composerStartRestartGroup;
            BottomSheetScaffoldKt.b(sheetContent, null, modalBottomSheetState, null, f2, floatingActionButton, 0, false, shape2, ChaloTheme.b(composerStartRestartGroup, 0).f1916a, ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, f, false, null, 0L, 0L, 0L, 0L, 0L, content, composer2, ((i2 >> 3) & 14) | ((i2 << 6) & 896) | (458752 & i3) | (i3 & 3670016) | ((i2 << 21) & 1879048192), i2 & 7168, (i2 >> 12) & 896, 4182426);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: x31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    RouteDetailsStopListBottomSheetKt.a(modalBottomSheetState, sheetContent, shape, f, f2, floatingActionButton, content, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }
}
