package app.chalo.uistate.divider;

import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.pk0;
import defpackage.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DividerUIStateKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10018a;

        static {
            int[] iArr = new int[DividerOrientation.values().length];
            try {
                iArr[DividerOrientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DividerOrientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10018a = iArr;
        }
    }

    public static final void a(Modifier modifier, DividerUIState state, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Intrinsics.i(state, "state");
        ChaloColorToken chaloColorToken = state.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(-132551836);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
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
                ComposerKt.traceEventStart(-132551836, i3, -1, "app.chalo.uistate.divider.Divider (DividerUIState.kt:43)");
            }
            int i5 = WhenMappings.f10018a[state.c.ordinal()];
            if (i5 == 1) {
                modifier3 = modifier;
                composerStartRestartGroup.startReplaceGroup(-1776648947);
                DividerKt.m1951VerticalDivider9IZ8Weo(modifier3, state.f10017a, ChaloColorTokenKt.c(chaloColorToken), composerStartRestartGroup, i3 & 14, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i5 != 2) {
                    throw pk0.p(composerStartRestartGroup, 1466707641);
                }
                composerStartRestartGroup.startReplaceGroup(-1776399893);
                modifier3 = modifier;
                DividerKt.m1950HorizontalDivider9IZ8Weo(modifier3, state.f10017a, ChaloColorTokenKt.c(chaloColorToken), composerStartRestartGroup, i3 & 14, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 13, modifier2, state));
        }
    }
}
