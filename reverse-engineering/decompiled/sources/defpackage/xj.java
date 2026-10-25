package defpackage;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.PlotlineComposePolicyHelper;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import so.plotline.plotline_kmp.Plotline_androidKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xj implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20025a;
    public final /* synthetic */ String b;

    public /* synthetic */ xj(String str, int i) {
        this.f20025a = i;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        int i = this.f20025a;
        String str = this.b;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i((RowScope) obj, "$this$Button");
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1248267717, iIntValue, -1, "app.chalo.compose.components.buttons.ChaloWhiteButton.<anonymous> (ChaloFilledButton.kt:226)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, null, ChaloTheme.a(composer2, 6).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTheme.e(composer2, 6).getHeadlineSmall(), composer2, 0, 24960, 110586);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 1:
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1136436623, iIntValue2, -1, "app.chalo.compose.components.buttons.ChaloRoundedButton.<anonymous> (ChaloFilledButton.kt:538)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer3, 6)), composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 2:
                RowScope Button = (RowScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(Button, "$this$Button");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= composer4.changed(Button) ? 4 : 2;
                }
                if (composer4.shouldExecute((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1829955202, iIntValue3, -1, "app.chalo.compose.components.ChaloHollowOrangeButton.<anonymous> (ChaloHollowOrangeButton.kt:35)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, Button.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), ChaloTheme.a(composer4, 6).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer4, 6)), composer4, 0, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 3:
                RowScope ChaloSnackbarContainer = (RowScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                float f = ChaloSnackbarKt.f1826a;
                Intrinsics.i(ChaloSnackbarContainer, "$this$ChaloSnackbarContainer");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= composer5.changed(ChaloSnackbarContainer) ? 4 : 2;
                }
                if (composer5.shouldExecute((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(165637607, iIntValue4, -1, "app.chalo.compose.components.ChaloSnackbar.<anonymous> (ChaloSnackbar.kt:116)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, i41.a(ChaloSnackbarContainer, Modifier.INSTANCE, 1.0f, false, 2, null), ChaloTheme.a(composer5, 6).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer5, 6).getBodyMedium(), composer5, 0, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 4:
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer6.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2102680829, iIntValue5, -1, "app.chalo.core.compose.NetworkInspectorList.<anonymous>.<anonymous>.<anonymous> (NetworkInspectorScreen.kt:157)");
                    }
                    String str2 = this.b;
                    if (str2 == null || StringsKt.F(str2)) {
                        composer = composer6;
                        composer.startReplaceGroup(1127864351);
                    } else {
                        composer6.startReplaceGroup(1133492649);
                        TextKt.m2623TextNvy7gAk(str2, PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, Dp.m7278constructorimpl(16), Dp.m7278constructorimpl(8)), MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 48, 0, 262136);
                        DividerKt.m1950HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer6, 0, 7);
                        composer = composer6;
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 5:
                Modifier composed = (Modifier) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(composed, "$this$composed");
                composer7.startReplaceGroup(1697117670);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1697117670, iIntValue6, -1, "app.chalo.compose.components.PLabel.<anonymous> (PlotlineComposeWidget.kt:7)");
                }
                if (((SdkIntegrationPolicyManager) PlotlineComposePolicyHelper.f1847a.getValue()).f1078a.b) {
                    composer7.startReplaceGroup(-1522412353);
                    composed = Plotline_androidKt.a(composed, str, false, composer7, (iIntValue6 & 14) | 384);
                    composer7.endReplaceGroup();
                } else {
                    composer7.startReplaceGroup(-1522441400);
                    composer7.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer7.endReplaceGroup();
                return composed;
            case 6:
                Modifier composed2 = (Modifier) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                Intrinsics.i(composed2, "$this$composed");
                composer8.startReplaceGroup(-295175595);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-295175595, iIntValue7, -1, "app.chalo.compose.components.PLabelIfValid.<anonymous> (PlotlineComposeWidget.kt:19)");
                }
                if (str != null) {
                    Modifier modifierComposed$default = str.length() == 0 ? composed2 : ComposedModifierKt.composed$default(composed2, null, new xj(str, 5), 1, null);
                    if (modifierComposed$default != null) {
                        composed2 = modifierComposed$default;
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer8.endReplaceGroup();
                return composed2;
            case 7:
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-139954133, iIntValue8, -1, "app.chalo.home.ui.regularbus.compose.ChaloFAQUI.<anonymous>.<anonymous> (RegularBusScreenUI.kt:827)");
                }
                TextKt.m2623TextNvy7gAk(this.b, PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, ChaloTheme.b(composer9, 0).h, 7, null), ChaloTheme.a(composer9, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer9, 0).getBodySmall(), composer9, 0, 0, 131064);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 8:
                Modifier it = (Modifier) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                Intrinsics.i(it, "it");
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= composer10.changed(it) ? 4 : 2;
                }
                if (composer10.shouldExecute((iIntValue9 & 19) != 18, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2002470546, iIntValue9, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1012)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, it, ChaloTheme.a(composer10, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer10, 0)), composer10, (iIntValue9 << 3) & 112, 24960, 110584);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 9:
                Modifier it2 = (Modifier) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                Intrinsics.i(it2, "it");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= composer11.changed(it2) ? 4 : 2;
                }
                if (composer11.shouldExecute((iIntValue10 & 19) != 18, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1588633775, iIntValue10, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1041)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, it2, ChaloTheme.a(composer11, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer11, 0)), composer11, (iIntValue10 << 3) & 112, 24960, 110584);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 10:
                Modifier it3 = (Modifier) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                Intrinsics.i(it3, "it");
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= composer12.changed(it3) ? 4 : 2;
                }
                if (composer12.shouldExecute((iIntValue11 & 19) != 18, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(884770800, iIntValue11, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1070)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, it3, ChaloTheme.a(composer12, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer12, 0)), composer12, (iIntValue11 << 3) & 112, 24960, 110584);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            default:
                Modifier it4 = (Modifier) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                Intrinsics.i(it4, "it");
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= composer13.changed(it4) ? 4 : 2;
                }
                if (composer13.shouldExecute((iIntValue12 & 19) != 18, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180907825, iIntValue12, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1112)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, it4, ChaloTheme.a(composer13, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer13, 0)), composer13, (iIntValue12 << 3) & 112, 24960, 110584);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
        }
    }
}
