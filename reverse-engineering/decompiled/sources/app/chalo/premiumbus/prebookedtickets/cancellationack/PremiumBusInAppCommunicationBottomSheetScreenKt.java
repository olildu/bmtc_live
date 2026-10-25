package app.chalo.premiumbus.prebookedtickets.cancellationack;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.text.style.TextAlign;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.jn0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusInAppCommunicationBottomSheetScreenKt {
    public static final void a(int i, Composer composer, Modifier modifier, IconType iconType, String title, String subTitle, String positiveBtnText, String negativeBtnText, Function0 onPositiveBtnClicked, Function0 onNegativeBtnClicked) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        int i3;
        int i4;
        Composer composer3;
        Intrinsics.i(title, "title");
        Intrinsics.i(subTitle, "subTitle");
        Intrinsics.i(positiveBtnText, "positiveBtnText");
        Intrinsics.i(negativeBtnText, "negativeBtnText");
        Intrinsics.i(onPositiveBtnClicked, "onPositiveBtnClicked");
        Intrinsics.i(onNegativeBtnClicked, "onNegativeBtnClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(642172592);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(subTitle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(positiveBtnText) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(negativeBtnText) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPositiveBtnClicked) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNegativeBtnClicked) ? 1048576 : 524288;
        }
        int i5 = i2 | 12582912;
        if (composerStartRestartGroup.shouldExecute((4793491 & i5) != 4793490, i5 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(642172592, i5, -1, "app.chalo.premiumbus.prebookedtickets.cancellationack.PremiumBusInAppCommunicationBottomSheetContent (PremiumBusInAppCommunicationBottomSheetScreen.kt:31)");
            }
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).l, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (iconType == null) {
                composerStartRestartGroup.startReplaceGroup(1524238748);
                composerStartRestartGroup.endReplaceGroup();
                composer3 = composerStartRestartGroup;
                i3 = 0;
                i4 = 1;
            } else {
                composerStartRestartGroup.startReplaceGroup(1524238749);
                i3 = 0;
                i4 = 1;
                ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0), (String) null, SizeKt.m835widthInVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).z, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
                composer3 = composerStartRestartGroup;
                composer3.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer3, i3).i), composer3, i3);
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, i4, null), ChaloTheme.b(composer3, i3).h, 0.0f, 2, null);
            TextStyle displaySmall = ChaloTheme.e(composer3, i3).getDisplaySmall();
            long j = ChaloTheme.a(composer3, i3).g;
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            Composer composer4 = composer3;
            TextKt.m2623TextNvy7gAk(title, modifierM786paddingVpY3zN4$default, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion3.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, displaySmall, composer4, (i5 >> 3) & 14, 0, 130040);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer4, i3).f), composer4, i3);
            Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, i4, null), ChaloTheme.b(composer4, i3).h, 0.0f, 2, null);
            TextStyle bodyLarge = ChaloTheme.e(composer4, i3).getBodyLarge();
            long j2 = ChaloTheme.a(composer4, i3).g;
            TextAlign textAlignM7161boximpl = TextAlign.m7161boximpl(companion3.m7168getCentere0LSkKk());
            int i7 = i5 >> 6;
            TextKt.m2623TextNvy7gAk(subTitle, modifierM786paddingVpY3zN4$default2, j2, null, 0L, null, null, null, 0L, null, textAlignM7161boximpl, 0L, 0, false, 0, 0, null, bodyLarge, composer4, i7 & 14, 0, 130040);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer4, i3).j), composer4, i3);
            ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion, 0.0f, i4, null), positiveBtnText, null, 0L, null, true, 0.0f, null, 0L, onPositiveBtnClicked, composer4, (i7 & 112) | 196614 | ((i5 << 12) & 1879048192), 476);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer4, i3).h), composer4, i3);
            ChaloFilledButtonKt.f(negativeBtnText, false, SizeKt.fillMaxWidth$default(companion, 0.0f, i4, null), null, null, 0.0f, 0L, onNegativeBtnClicked, composer4, ((i5 >> 12) & 14) | 384 | (29360128 & (i5 << 3)), 122);
            composer2 = composer4;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jn0(iconType, title, subTitle, positiveBtnText, negativeBtnText, onPositiveBtnClicked, onNegativeBtnClicked, modifier2, i));
        }
    }
}
