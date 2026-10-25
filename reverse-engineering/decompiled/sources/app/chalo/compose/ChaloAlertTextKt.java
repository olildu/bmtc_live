package app.chalo.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
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
import app.chalo.compose.ChaloAlertTextKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloAlertTextKt {
    public static final void a(final Modifier modifier, final String alertText, TextStyle textStyle, final long j, IconType iconType, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        TextStyle textStyleD;
        float f3;
        float f4;
        Composer composer2;
        final IconType iconType2;
        final TextStyle textStyle2;
        final float f5;
        final float f6;
        TextStyle textStyle3;
        float f7;
        int i4;
        IconType iconType3;
        float f8;
        Intrinsics.i(alertText, "alertText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-822764206);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(alertText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                textStyleD = textStyle;
                int i5 = composerStartRestartGroup.changed(textStyleD) ? 256 : 128;
                i3 |= i5;
            } else {
                textStyleD = textStyle;
            }
            i3 |= i5;
        } else {
            textStyleD = textStyle;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                int i7 = composerStartRestartGroup.changed(f3) ? 131072 : 65536;
                i3 |= i7;
            } else {
                f3 = f;
            }
            i3 |= i7;
        } else {
            f3 = f;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                int i8 = composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
                i3 |= i8;
            } else {
                f4 = f2;
            }
            i3 |= i8;
        } else {
            f4 = f2;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    textStyleD = ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 6));
                    i3 &= -897;
                }
                IconType iconType4 = i6 != 0 ? IconType.ALERT_ROUTESCREEN : iconType;
                if ((i2 & 32) != 0) {
                    f3 = ChaloTheme.b(composerStartRestartGroup, 6).i;
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    f4 = ChaloTheme.b(composerStartRestartGroup, 6).f1916a;
                    i3 &= -3670017;
                }
                textStyle3 = textStyleD;
                f7 = f3;
                i4 = i3;
                iconType3 = iconType4;
                f8 = f4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                textStyle3 = textStyleD;
                f7 = f3;
                f8 = f4;
                i4 = i3;
                iconType3 = iconType;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-822764206, i4, -1, "app.chalo.compose.ChaloAlertText (ChaloAlertText.kt:27)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i9), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f9 = f7;
            float f10 = f8;
            int i10 = i4;
            IconType iconType5 = iconType3;
            ImageKt.Image(PainterResourceHelperKt.a(iconType3, composerStartRestartGroup, (i4 >> 12) & 14), (String) null, PaddingKt.m788paddingqDBjuR0$default(SizeKt.m828size3ABfNKs(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, f8, 1, null), f7), 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 6).f, 0.0f, 11, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(alertText, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle3, composer2, (i10 >> 3) & 910, (i10 << 15) & 29360128, 131066);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle3;
            iconType2 = iconType5;
            f6 = f10;
            f5 = f9;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            iconType2 = iconType;
            textStyle2 = textStyleD;
            f5 = f3;
            f6 = f4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: hg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloAlertTextKt.a(modifier, alertText, textStyle2, j, iconType2, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
