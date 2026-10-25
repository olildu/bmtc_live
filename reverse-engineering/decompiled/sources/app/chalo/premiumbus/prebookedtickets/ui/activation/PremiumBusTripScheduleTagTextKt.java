package app.chalo.premiumbus.prebookedtickets.ui.activation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusTripScheduleTag;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.bu0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusTripScheduleTagTextKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7357a;

        static {
            int[] iArr = new int[PremiumBusTripScheduleTag.values().length];
            try {
                iArr[PremiumBusTripScheduleTag.ON_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusTripScheduleTag.ARRIVING_EARLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumBusTripScheduleTag.RUNNING_BEHIND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumBusTripScheduleTag.DELAYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7357a = iArr;
        }
    }

    public static final void a(PremiumBusTripScheduleTag tag, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        long jC;
        long j;
        Intrinsics.i(tag, "tag");
        Composer composerStartRestartGroup = composer.startRestartGroup(-616248167);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(tag.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-616248167, i3, -1, "app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusTripScheduleTagText (PremiumBusTripScheduleTagText.kt:19)");
            }
            int[] iArr = WhenMappings.f7357a;
            int i4 = iArr[tag.ordinal()];
            if (i4 == 1) {
                jC = ChaloColorTokenKt.c(ChaloColorToken.ProductProgressStatus.f9843a);
            } else if (i4 == 2 || i4 == 3) {
                jC = ChaloColorTokenKt.c(ChaloColorToken.LightOrange.f9816a);
            } else {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                jC = ChaloColorTokenKt.c(ChaloColorToken.RedBase.f9846a);
            }
            int i5 = iArr[tag.ordinal()];
            if (i5 == 1) {
                composerStartRestartGroup.startReplaceGroup(491016318);
                j = ChaloTheme.a(composerStartRestartGroup, 0).C;
                composerStartRestartGroup.endReplaceGroup();
            } else if (i5 == 2 || i5 == 3) {
                composerStartRestartGroup.startReplaceGroup(491020318);
                j = ChaloTheme.a(composerStartRestartGroup, 0).e;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i5 != 4) {
                    throw pk0.p(composerStartRestartGroup, 491014194);
                }
                composerStartRestartGroup.startReplaceGroup(491022496);
                j = ChaloTheme.a(composerStartRestartGroup, 0).X;
                composerStartRestartGroup.endReplaceGroup();
            }
            modifier2 = companion;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(tag.getStringEnum(), new Object[0], composerStartRestartGroup, 0), PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(companion, jC, RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).d)), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).d), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getTitleLarge(), composer2, 0, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(tag, modifier2, i, 19));
        }
    }
}
