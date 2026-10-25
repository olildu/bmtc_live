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
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.kq;
import defpackage.ui0;
import defpackage.wb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerDefaultLegCardKt {
    public static final void a(String cardTitle, String dropStopName, String str, String str2, Modifier modifier, IconType iconType, int i, String str3, Function0 function0, Composer composer, int i2) {
        int i3;
        String str4;
        String str5;
        int i4;
        Composer composer2;
        String str6;
        Function0 function1;
        Intrinsics.i(cardTitle, "cardTitle");
        Intrinsics.i(dropStopName, "dropStopName");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1553778291);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(cardTitle) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(dropStopName) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            str4 = str;
            i3 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
        } else {
            str4 = str;
        }
        if ((i2 & 3072) == 0) {
            str5 = str2;
            i3 |= composerStartRestartGroup.changed(str5) ? 2048 : 1024;
        } else {
            str5 = str2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 = i;
            i3 |= composerStartRestartGroup.changed(i4) ? 1048576 : 524288;
        } else {
            i4 = i;
        }
        int i5 = i3 | 113246208;
        if (composerStartRestartGroup.shouldExecute((38347923 & i5) != 38347922, i5 & 1)) {
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wb(8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function2 = (Function0) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1553778291, i5, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDefaultLegCard (TripPlannerDefaultLegCard.kt:38)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            float f = ChaloTheme.b(composerStartRestartGroup, 0).d;
            int i6 = CardDefaults.$stable;
            CardKt.Card(modifierFillMaxWidth$default, RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f), cardDefaults.m1694cardColorsro_MJ88(ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, 0L, 0L, composerStartRestartGroup, i6 << 12, 14), cardDefaults.m1695cardElevationaqJV_2Y(f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i6 << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(-916489089, true, new ui0(function2, cardTitle, str5, str4, i4, iconType, dropStopName), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str6 = "";
            function1 = function2;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            str6 = str3;
            function1 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kq(cardTitle, dropStopName, str, str2, modifier, iconType, i, str6, function1, i2));
        }
    }
}
