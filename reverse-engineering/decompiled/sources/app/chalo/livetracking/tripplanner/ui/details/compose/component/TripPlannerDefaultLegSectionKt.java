package app.chalo.livetracking.tripplanner.ui.details.compose.component;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.CardWithSideStepIconAndLineKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.g4;
import defpackage.qb1;
import defpackage.ym;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerDefaultLegSectionKt {
    public static final void a(IconType legIcon, String sectionTitle, boolean z, Function2 legCardContent, Modifier modifier, long j, Composer composer, int i, int i2) {
        int i3;
        long j2;
        Intrinsics.i(legIcon, "legIcon");
        Intrinsics.i(sectionTitle, "sectionTitle");
        Intrinsics.i(legCardContent, "legCardContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(330152262);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(legIcon.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(sectionTitle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(legCardContent) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j2 = j;
                int i4 = composerStartRestartGroup.changed(j2) ? 131072 : 65536;
                i3 |= i4;
            } else {
                j2 = j;
            }
            i3 |= i4;
        } else {
            j2 = j;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            } else if ((i2 & 32) != 0) {
                j2 = ChaloTheme.a(composerStartRestartGroup, 0).e;
                i3 &= -458753;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(330152262, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDefaultLegSection (TripPlannerDefaultLegSection.kt:28)");
            }
            long j3 = j2;
            CardWithSideStepIconAndLineKt.a(ComposableLambdaKt.rememberComposableLambda(247161268, true, new ym(legIcon, 2), composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1337612234, true, new qb1(6, sectionTitle, legCardContent), composerStartRestartGroup, 54), SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), z, j3, composerStartRestartGroup, 54 | ((i3 << 3) & 7168) | ((i3 >> 3) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j2 = j3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g4(legIcon, sectionTitle, z, legCardContent, modifier, j2, i, i2));
        }
    }
}
