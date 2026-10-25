package app.chalo.compose.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.gf;
import defpackage.s3;
import defpackage.t3;
import defpackage.vl;
import defpackage.wl;
import defpackage.zc;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloSpacersKt {
    public static final void A(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1019862247);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1019862247, i, -1, "app.chalo.compose.components.ChaloSpacerWidthSmall1 (ChaloSpacers.kt:113)");
            }
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).c), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 18));
        }
    }

    public static final void B(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-146834072);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-146834072, i, -1, "app.chalo.compose.components.ChaloSpacerWidthSmall2 (ChaloSpacers.kt:42)");
            }
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).d), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 13));
        }
    }

    public static final void C(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1313530391);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1313530391, i, -1, "app.chalo.compose.components.ChaloSpacerWidthSmall3 (ChaloSpacers.kt:47)");
            }
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).e), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 15));
        }
    }

    public static final void a(float f, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-965905211);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-965905211, i2, -1, "app.chalo.compose.components.ChaloSpacer (ChaloSpacers.kt:118)");
            }
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, f), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new vl(f, i, 2));
        }
    }

    public static final void b(float f, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1552297484);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1552297484, i2, -1, "app.chalo.compose.components.ChaloSpacerHeight (ChaloSpacers.kt:133)");
            }
            if (gf.x(Modifier.INSTANCE, f, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new vl(f, i, 1));
        }
    }

    public static final void c(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(391064349);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(391064349, i, -1, "app.chalo.compose.components.ChaloSpacerHeight140 (ChaloSpacers.kt:154)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).n0, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 29));
        }
    }

    public static final void d(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(326997398);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(326997398, i, -1, "app.chalo.compose.components.ChaloSpacerHeightExtraLarge1 (ChaloSpacers.kt:138)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).u, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 8));
        }
    }

    public static final void e(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-839698921);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-839698921, i, -1, "app.chalo.compose.components.ChaloSpacerHeightExtraLarge2 (ChaloSpacers.kt:143)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).v, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 19));
        }
    }

    public static final void f(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1072875090);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1072875090, i, -1, "app.chalo.compose.components.ChaloSpacerHeightLarge1 (ChaloSpacers.kt:73)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).j, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 16));
        }
    }

    public static final void g(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2055395887);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2055395887, i, -1, "app.chalo.compose.components.ChaloSpacerHeightLarge2 (ChaloSpacers.kt:78)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).k, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 22));
        }
    }

    public static final void h(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(888699568);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(888699568, i, -1, "app.chalo.compose.components.ChaloSpacerHeightLarge3 (ChaloSpacers.kt:32)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).l, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 21));
        }
    }

    public static final void i(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-277996751);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-277996751, i, -1, "app.chalo.compose.components.ChaloSpacerHeightLarge4 (ChaloSpacers.kt:83)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).m, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 20));
        }
    }

    public static final void j(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1444693070);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1444693070, i, -1, "app.chalo.compose.components.ChaloSpacerHeightLarge5 (ChaloSpacers.kt:88)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).n, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 17));
        }
    }

    public static final void k(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(516881588);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(516881588, i, -1, "app.chalo.compose.components.ChaloSpacerHeightLarge7 (ChaloSpacers.kt:93)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).p, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 9));
        }
    }

    public static final void l(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-649814731);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649814731, i, -1, "app.chalo.compose.components.ChaloSpacerHeightLarge8 (ChaloSpacers.kt:37)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).q, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 24));
        }
    }

    public static final void m(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1014181228);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1014181228, i, -1, "app.chalo.compose.components.ChaloSpacerHeightMedium1 (ChaloSpacers.kt:12)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).f, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 7));
        }
    }

    public static final void n(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-152515091);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-152515091, i, -1, "app.chalo.compose.components.ChaloSpacerHeightMedium2 (ChaloSpacers.kt:17)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).g, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 26));
        }
    }

    public static final void o(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1319211410);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1319211410, i, -1, "app.chalo.compose.components.ChaloSpacerHeightMedium3 (ChaloSpacers.kt:22)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).h, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 25));
        }
    }

    public static final void p(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1809059567);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1809059567, i, -1, "app.chalo.compose.components.ChaloSpacerHeightMedium4 (ChaloSpacers.kt:27)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).i, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 12));
        }
    }

    public static final void q(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1859720340);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1859720340, i, -1, "app.chalo.compose.components.ChaloSpacerHeightSectionHeadingContent (ChaloSpacers.kt:123)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).B, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 28));
        }
    }

    public static final void r(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-376319862);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-376319862, i2, -1, "app.chalo.compose.components.ChaloSpacerHeightSmall0 (ChaloSpacers.kt:108)");
            }
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier, ChaloTheme.b(composerStartRestartGroup, 6).b), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 3));
        }
    }

    public static final void s(Modifier modifier, int i, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-622632949);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-622632949, i3, -1, "app.chalo.compose.components.ChaloSpacerHeightSmall1 (ChaloSpacers.kt:98)");
            }
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier, ChaloTheme.b(composerStartRestartGroup, 6).c), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t3(modifier, i, i2, 1));
        }
    }

    public static final void t(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1910150115);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1910150115, i, -1, "app.chalo.compose.components.ChaloSpacerHeightSmall2 (ChaloSpacers.kt:103)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).d, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 11));
        }
    }

    public static final void u(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(743453796);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(743453796, i, -1, "app.chalo.compose.components.ChaloSpacerHeightSmall3 (ChaloSpacers.kt:149)");
            }
            if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).e, composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 10));
        }
    }

    public static final void v(float f, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2063507985);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2063507985, i2, -1, "app.chalo.compose.components.ChaloSpacerWidth (ChaloSpacers.kt:128)");
            }
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, f), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new vl(f, i, 0));
        }
    }

    public static final void w(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1672180871);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1672180871, i, -1, "app.chalo.compose.components.ChaloSpacerWidthMedium1 (ChaloSpacers.kt:52)");
            }
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).f), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 0));
        }
    }

    public static final void x(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(505484552);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(505484552, i, -1, "app.chalo.compose.components.ChaloSpacerWidthMedium2 (ChaloSpacers.kt:57)");
            }
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).g), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 14));
        }
    }

    public static final void y(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-661211767);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-661211767, i, -1, "app.chalo.compose.components.ChaloSpacerWidthMedium3 (ChaloSpacers.kt:62)");
            }
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).h), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 27));
        }
    }

    public static final void z(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1827908086);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1827908086, i, -1, "app.chalo.compose.components.ChaloSpacerWidthMedium4 (ChaloSpacers.kt:67)");
            }
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).i), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 23));
        }
    }
}
