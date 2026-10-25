package app.chalo.premiumbus.prebookedtickets.newactivation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.pk0;
import defpackage.wm0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusInAppCommunicationBottomSheetScreenKt {
    public static final void a(PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData, Function0 onPositiveBtnClicked, Function0 onNegativeBtnClicked, Composer composer, int i) {
        int i2;
        IconType iconType;
        String strC;
        String str;
        String str2;
        Intrinsics.i(onPositiveBtnClicked, "onPositiveBtnClicked");
        Intrinsics.i(onNegativeBtnClicked, "onNegativeBtnClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(2130009196);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusInAppCommunicationBottomSheetData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPositiveBtnClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNegativeBtnClicked) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2130009196, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusInAppCommunicationBottomSheetScreen (PremiumBusInAppCommunicationBottomSheetScreen.kt:14)");
            }
            String strC2 = StringResourcesHelperKt.c(StringEnum.SEE_DETAILS, new Object[0], composerStartRestartGroup, 6);
            String strC3 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composerStartRestartGroup, 6);
            if (premiumBusInAppCommunicationBottomSheetData instanceof PremiumBusInAppCommunicationBottomSheetData.SystemCancellation) {
                composerStartRestartGroup.startReplaceGroup(1257673185);
                IconType iconType2 = IconType.IC_TRIP_CANCELLED_ACK;
                String strC4 = StringResourcesHelperKt.c(StringEnum.TRIP_CANCELLED, new Object[0], composerStartRestartGroup, 6);
                PremiumBusInAppCommunicationBottomSheetData.SystemCancellation systemCancellation = (PremiumBusInAppCommunicationBottomSheetData.SystemCancellation) premiumBusInAppCommunicationBottomSheetData;
                strC = StringResourcesHelperKt.c(StringEnum.TRIP_CANCELLED_ACK_MSG, new Object[]{systemCancellation.f, systemCancellation.e.g.b}, composerStartRestartGroup, 6);
                String strC5 = StringResourcesHelperKt.c(StringEnum.BOOK_ANOTHER_RIDE, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
                str2 = strC4;
                str = strC5;
                iconType = iconType2;
            } else {
                if (!(premiumBusInAppCommunicationBottomSheetData instanceof PremiumBusInAppCommunicationBottomSheetData.SystemReschedule)) {
                    throw pk0.p(composerStartRestartGroup, -1760547560);
                }
                composerStartRestartGroup.startReplaceGroup(1258181709);
                iconType = IconType.IC_SYSTEM_RESCHEDULED;
                String strC6 = StringResourcesHelperKt.c(StringEnum.TRIP_RESCHEDULED, new Object[0], composerStartRestartGroup, 6);
                PremiumBusInAppCommunicationBottomSheetData.SystemReschedule systemReschedule = (PremiumBusInAppCommunicationBottomSheetData.SystemReschedule) premiumBusInAppCommunicationBottomSheetData;
                strC = StringResourcesHelperKt.c(StringEnum.TRIP_RESCHEDULED_ACK_MSG, new Object[]{systemReschedule.f, systemReschedule.g, systemReschedule.h, systemReschedule.i}, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
                str = strC2;
                str2 = strC6;
            }
            app.chalo.premiumbus.prebookedtickets.cancellationack.PremiumBusInAppCommunicationBottomSheetScreenKt.a((i2 << 12) & 4128768, composerStartRestartGroup, null, iconType, str2, strC, str, strC3, onPositiveBtnClicked, onNegativeBtnClicked);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 17, premiumBusInAppCommunicationBottomSheetData, onPositiveBtnClicked, onNegativeBtnClicked));
        }
    }
}
