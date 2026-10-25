package app.chalo.compose.components;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.homescreen.data.model.app.BgHighlightType;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.jk;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloGradientBackgroundKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1817a;

        static {
            int[] iArr = new int[BgHighlightType.values().length];
            try {
                iArr[BgHighlightType.QUADRANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BgHighlightType.SEMICIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BgHighlightType.CIRCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BgHighlightType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1817a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x012d  */
    /* JADX WARN: Code duplicated, block: B:69:0x018d  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x0228  */
    /* JADX WARN: Code duplicated, block: B:82:0x022d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0237  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void a(BoxScope ChaloGradientBackground, BgHighlightType bgHighlightType, float f, ChaloColorToken chaloColorToken, Composer composer, int i, int i2) {
        int i3;
        ChaloColorToken chaloColorToken2;
        boolean z;
        ChaloColorToken chaloColorToken3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        float fC;
        Density density;
        boolean z2;
        Object objRememberedValue;
        float f2;
        float fFloatValue;
        int i4;
        Function0<ComposeUiNode> constructor;
        Intrinsics.i(ChaloGradientBackground, "$this$ChaloGradientBackground");
        Intrinsics.i(bgHighlightType, "bgHighlightType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-699457337);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(ChaloGradientBackground) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(bgHighlightType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                chaloColorToken2 = chaloColorToken;
                i3 |= composerStartRestartGroup.changed(chaloColorToken2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i5 != 0) {
                    chaloColorToken2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-699457337, i3, -1, "app.chalo.compose.components.ChaloGradientBackground (ChaloGradientBackground.kt:19)");
                }
                fC = ComposeUtils_androidKt.c(composerStartRestartGroup);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    if (chaloColorToken2 == null) {
                        f2 = 0.3f;
                    } else {
                        f2 = 1.0f;
                    }
                    objRememberedValue = Float.valueOf(f2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                fFloatValue = ((Number) objRememberedValue).floatValue();
                i4 = WhenMappings.f1817a[bgHighlightType.ordinal()];
                if (i4 != 1) {
                    composerStartRestartGroup.startReplaceGroup(1648177531);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierMatchParentSize = ChaloGradientBackground.matchParentSize(companion);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierMatchParentSize);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    float f3 = fC * 2;
                    int i7 = (i3 << 6) & 458752;
                    ChaloBlurRadialGradientKt.a(boxScopeInstance.matchParentSize(companion), Dp.m7278constructorimpl(f3), fFloatValue, 0.0f, 0.0f, chaloColorToken2, composerStartRestartGroup, i7 | 27648, 0);
                    ChaloBlurRadialGradientKt.a(boxScopeInstance.matchParentSize(companion), Dp.m7278constructorimpl(f3), fFloatValue, Dp.m7278constructorimpl(f3), 0.0f, chaloColorToken2, composerStartRestartGroup, i7 | 24576, 0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 != 2) {
                    composerStartRestartGroup.startReplaceGroup(1648919020);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierMatchParentSize2 = ChaloGradientBackground.matchParentSize(companion3);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    float f4 = fC * 2;
                    int i8 = (i3 << 6) & 458752;
                    ChaloBlurRadialGradientKt.a(ChaloGradientBackground.align(modifierMatchParentSize2, companion4.getCenter()), Dp.m7278constructorimpl(f4), fFloatValue, 0.0f, (float) (((double) density.mo404toPx0680j_4(f)) / 4.5d), chaloColorToken2, composerStartRestartGroup, i8 | 3072, 0);
                    ChaloBlurRadialGradientKt.a(ChaloGradientBackground.align(ChaloGradientBackground.matchParentSize(companion3), companion4.getCenter()), Dp.m7278constructorimpl(f4), fFloatValue, Dp.m7278constructorimpl(f4), (float) (((double) density.mo404toPx0680j_4(f)) / 4.5d), chaloColorToken2, composerStartRestartGroup, i8, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 != 3) {
                    composerStartRestartGroup.startReplaceGroup(1649754439);
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    float f5 = fC * 3;
                    int i9 = ((i3 << 6) & 458752) | 24576;
                    ChaloBlurRadialGradientKt.a(ChaloGradientBackground.matchParentSize(companion5), Dp.m7278constructorimpl(f5), 0.0f, Dp.m7278constructorimpl(0.25f * fC), 25.0f, chaloColorToken2, composerStartRestartGroup, i9, 4);
                    ChaloBlurRadialGradientKt.a(ChaloGradientBackground.matchParentSize(companion5), Dp.m7278constructorimpl(f5), 0.0f, Dp.m7278constructorimpl(fC * 2.25f), 25.0f, chaloColorToken2, composerStartRestartGroup, i9, 4);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i4 == 4) {
                        throw pk0.p(composerStartRestartGroup, 2131376576);
                    }
                    composerStartRestartGroup.startReplaceGroup(1650302457);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            chaloColorToken3 = chaloColorToken2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jk(ChaloGradientBackground, bgHighlightType, f, chaloColorToken3, i, i2));
            }
        }
        i3 |= 3072;
        chaloColorToken2 = chaloColorToken;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i5 != 0) {
                chaloColorToken2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-699457337, i3, -1, "app.chalo.compose.components.ChaloGradientBackground (ChaloGradientBackground.kt:19)");
            }
            fC = ComposeUtils_androidKt.c(composerStartRestartGroup);
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2) {
                if (chaloColorToken2 == null) {
                    f2 = 0.3f;
                } else {
                    f2 = 1.0f;
                }
                objRememberedValue = Float.valueOf(f2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                if (chaloColorToken2 == null) {
                    f2 = 0.3f;
                } else {
                    f2 = 1.0f;
                }
                objRememberedValue = Float.valueOf(f2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            fFloatValue = ((Number) objRememberedValue).floatValue();
            i4 = WhenMappings.f1817a[bgHighlightType.ordinal()];
            if (i4 != 1) {
                composerStartRestartGroup.startReplaceGroup(1648177531);
                Modifier.Companion companion6 = Modifier.INSTANCE;
                Modifier modifierMatchParentSize3 = ChaloGradientBackground.matchParentSize(companion6);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i10 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierMatchParentSize3);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                constructor = companion7.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion7, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl2, Integer.valueOf(i10), composerM3915constructorimpl2));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                float f6 = fC * 2;
                int i11 = (i3 << 6) & 458752;
                ChaloBlurRadialGradientKt.a(boxScopeInstance2.matchParentSize(companion6), Dp.m7278constructorimpl(f6), fFloatValue, 0.0f, 0.0f, chaloColorToken2, composerStartRestartGroup, i11 | 27648, 0);
                ChaloBlurRadialGradientKt.a(boxScopeInstance2.matchParentSize(companion6), Dp.m7278constructorimpl(f6), fFloatValue, Dp.m7278constructorimpl(f6), 0.0f, chaloColorToken2, composerStartRestartGroup, i11 | 24576, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 != 2) {
                composerStartRestartGroup.startReplaceGroup(1648919020);
                Modifier.Companion companion8 = Modifier.INSTANCE;
                Modifier modifierMatchParentSize4 = ChaloGradientBackground.matchParentSize(companion8);
                Alignment.Companion companion9 = Alignment.INSTANCE;
                float f7 = fC * 2;
                int i12 = (i3 << 6) & 458752;
                ChaloBlurRadialGradientKt.a(ChaloGradientBackground.align(modifierMatchParentSize4, companion9.getCenter()), Dp.m7278constructorimpl(f7), fFloatValue, 0.0f, (float) (((double) density.mo404toPx0680j_4(f)) / 4.5d), chaloColorToken2, composerStartRestartGroup, i12 | 3072, 0);
                ChaloBlurRadialGradientKt.a(ChaloGradientBackground.align(ChaloGradientBackground.matchParentSize(companion8), companion9.getCenter()), Dp.m7278constructorimpl(f7), fFloatValue, Dp.m7278constructorimpl(f7), (float) (((double) density.mo404toPx0680j_4(f)) / 4.5d), chaloColorToken2, composerStartRestartGroup, i12, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 != 3) {
                composerStartRestartGroup.startReplaceGroup(1649754439);
                Modifier.Companion companion10 = Modifier.INSTANCE;
                float f8 = fC * 3;
                int i13 = ((i3 << 6) & 458752) | 24576;
                ChaloBlurRadialGradientKt.a(ChaloGradientBackground.matchParentSize(companion10), Dp.m7278constructorimpl(f8), 0.0f, Dp.m7278constructorimpl(0.25f * fC), 25.0f, chaloColorToken2, composerStartRestartGroup, i13, 4);
                ChaloBlurRadialGradientKt.a(ChaloGradientBackground.matchParentSize(companion10), Dp.m7278constructorimpl(f8), 0.0f, Dp.m7278constructorimpl(fC * 2.25f), 25.0f, chaloColorToken2, composerStartRestartGroup, i13, 4);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 == 4) {
                    throw pk0.p(composerStartRestartGroup, 2131376576);
                }
                composerStartRestartGroup.startReplaceGroup(1650302457);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        chaloColorToken3 = chaloColorToken2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jk(ChaloGradientBackground, bgHighlightType, f, chaloColorToken3, i, i2));
        }
    }
}
