package app.chalo.compose.components.image;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIStateKt;
import defpackage.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GifUIKt {
    public static final void a(Modifier modifier, GifImageUIState state, Composer composer, int i, int i2) {
        int i3;
        Modifier modifierB;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(2026512654);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2026512654, i3, -1, "app.chalo.compose.components.image.GifUI (GifUI.kt:13)");
            }
            ImageUISize imageUISize = state.c;
            if (imageUISize == null || (modifierB = ImageUIStateKt.b(modifier, imageUISize)) == null) {
                modifierB = modifier;
            }
            LottieType lottieType = state.f10033a;
            int i5 = state.b;
            Intrinsics.i(lottieType, "lottieType");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1175622560, 0, -1, "app.chalo.compose.resources.rememberLottiePainter (LottieResourceHelper.kt:65)");
            }
            Painter painterC = LottieResourceHelperKt.c(LottieResourceHelperKt.b(lottieType, composerStartRestartGroup, 0), i5, true, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ImageKt.Image(painterC, "", modifierB, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 15, modifier2, state));
        }
    }
}
