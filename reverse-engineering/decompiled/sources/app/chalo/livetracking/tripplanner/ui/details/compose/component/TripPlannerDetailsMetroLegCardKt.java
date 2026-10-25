package app.chalo.livetracking.tripplanner.ui.details.compose.component;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import defpackage.pz0;
import defpackage.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerDetailsMetroLegCardKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4751a;

        static {
            int[] iArr = new int[RouteServiceType.values().length];
            try {
                iArr[RouteServiceType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteServiceType.PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteServiceType.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4751a = iArr;
        }
    }

    public static final void a(Function1 sendIntent, TripPlannerLegUiModel.Metro metro, int i, Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1240368397);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sendIntent) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(metro) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1240368397, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsMetroLegCard (TripPlannerDetailsMetroLegCard.kt:29)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            float f = ChaloTheme.b(composerStartRestartGroup, 0).d;
            int i4 = CardDefaults.$stable;
            CardKt.Card(modifierFillMaxWidth$default, RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f), cardDefaults.m1694cardColorsro_MJ88(ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, 0L, 0L, composerStartRestartGroup, i4 << 12, 14), cardDefaults.m1695cardElevationaqJV_2Y(f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i4 << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(715147007, true, new pz0(metro, i, sendIntent, 2), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(sendIntent, metro, i, modifier, i2));
        }
    }
}
