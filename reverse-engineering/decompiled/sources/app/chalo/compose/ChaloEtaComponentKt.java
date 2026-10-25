package app.chalo.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.providers.lottieassetprovider.LottieType;
import defpackage.pk0;
import defpackage.v;
import io.github.alexzhirkevich.compottie.LottieCompositionResultImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloEtaComponentKt {
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x0174  */
    /* JADX WARN: Code duplicated, block: B:56:0x017c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0188  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void a(String eta, Modifier modifier, TextStyle textStyle, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        TextStyle textStyle2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        int i4;
        Modifier modifier5;
        TextStyle headlineMedium;
        int i5;
        Function0<ComposeUiNode> constructor;
        Intrinsics.i(eta, "eta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1182085564);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(eta) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    i4 = i3 & (-897);
                    modifier5 = modifier4;
                    headlineMedium = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineMedium();
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    i4 = i3 & (-897);
                    headlineMedium = textStyle;
                    modifier5 = modifier2;
                }
                i5 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1182085564, i5, -1, "app.chalo.compose.ChaloEtaComponent (ChaloEtaComponent.kt:22)");
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
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
                pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                LottieCompositionResultImpl lottieCompositionResultImplB = LottieResourceHelperKt.b(LottieType.REAL_TIME_INDICATOR_LOTTIE, composerStartRestartGroup, 6);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ImageKt.Image(LottieResourceHelperKt.c(lottieCompositionResultImplB, 0, false, composerStartRestartGroup, 0, 30), "", PaddingKt.m788paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 6).d, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 6).d), composerStartRestartGroup, 0);
                Modifier modifier6 = modifier5;
                TextKt.m2623TextNvy7gAk(eta, companion2, ChaloTheme.a(composerStartRestartGroup, 6).N, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, headlineMedium, composerStartRestartGroup, (i5 & 14) | 48, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle2 = headlineMedium;
                modifier3 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                textStyle2 = textStyle;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new v(eta, modifier3, textStyle2, i, i2, 6));
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                i4 = i3 & (-897);
                modifier5 = modifier4;
                headlineMedium = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineMedium();
            } else {
                if (i6 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                i4 = i3 & (-897);
                modifier5 = modifier4;
                headlineMedium = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineMedium();
            }
            i5 = i4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1182085564, i5, -1, "app.chalo.compose.ChaloEtaComponent (ChaloEtaComponent.kt:22)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            LottieCompositionResultImpl lottieCompositionResultImplB2 = LottieResourceHelperKt.b(LottieType.REAL_TIME_INDICATOR_LOTTIE, composerStartRestartGroup, 6);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            ImageKt.Image(LottieResourceHelperKt.c(lottieCompositionResultImplB2, 0, false, composerStartRestartGroup, 0, 30), "", PaddingKt.m788paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 6).d, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, 6).d), composerStartRestartGroup, 0);
            Modifier modifier7 = modifier5;
            TextKt.m2623TextNvy7gAk(eta, companion4, ChaloTheme.a(composerStartRestartGroup, 6).N, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, headlineMedium, composerStartRestartGroup, (i5 & 14) | 48, 0, 131064);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = headlineMedium;
            modifier3 = modifier7;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            textStyle2 = textStyle;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(eta, modifier3, textStyle2, i, i2, 6));
        }
    }
}
