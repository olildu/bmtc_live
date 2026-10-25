package app.chalo.home.ui.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.jn0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NotificationPermissionBottomSheetKt {
    public static final void a(int i, Composer composer, Modifier modifier, IconType iconType, String title, String str, String positiveButtonText, String str2, Function0 onPositiveClick, Function0 onNegativeClick) {
        Composer composer2;
        Modifier modifier2;
        int i2;
        int i3;
        int i4;
        Intrinsics.i(title, "title");
        Intrinsics.i(positiveButtonText, "positiveButtonText");
        Intrinsics.i(onPositiveClick, "onPositiveClick");
        Intrinsics.i(onNegativeClick, "onNegativeClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1230164835);
        int i5 = i | 6;
        if ((i & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(title) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(positiveButtonText) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onPositiveClick) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onNegativeClick) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i5) != 4793490, i5 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1230164835, i5, -1, "app.chalo.home.ui.compose.NotificationPermissionBottomSheet (NotificationPermissionBottomSheet.kt:34)");
            }
            int i6 = i5;
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).k, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (iconType == null) {
                composerStartRestartGroup.startReplaceGroup(678898559);
                composerStartRestartGroup.endReplaceGroup();
                i2 = 0;
                i3 = 1;
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(678898560);
                i2 = 0;
                i3 = 1;
                ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0), (String) null, SizeKt.m830sizeVpY3zN4(columnScopeInstance.align(companion, companion2.getCenterHorizontally()), Dp.m7278constructorimpl(188), Dp.m7278constructorimpl(140)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                composer2 = composerStartRestartGroup;
                ChaloSpacersKt.p(composer2, 0);
                composer2.endReplaceGroup();
            }
            if (title.length() > 0) {
                composer2.startReplaceGroup(679340279);
                Composer composer3 = composer2;
                i4 = 677259125;
                TextKt.m2623TextNvy7gAk(title, null, ChaloTheme.a(composer2, i2).g, null, TextUnitKt.getSp(24), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.f(ChaloTheme.e(composer2, i2))), composer3, ((i6 >> 6) & 14) | 24576, 0, 131050);
                composer2 = composer3;
            } else {
                i4 = 677259125;
                composer2.startReplaceGroup(677259125);
            }
            composer2.endReplaceGroup();
            if (str != null) {
                composer2.startReplaceGroup(679564347);
                ChaloSpacersKt.o(composer2, i2);
                Composer composer4 = composer2;
                TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composer2, i2).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.k(ChaloTheme.e(composer2, i2)), composer4, (i6 >> 9) & 14, 0, 131066);
                composer2 = composer4;
            } else {
                composer2.startReplaceGroup(i4);
            }
            composer2.endReplaceGroup();
            if (positiveButtonText.length() > 0) {
                composer2.startReplaceGroup(679825863);
                ChaloSpacersKt.p(composer2, i2);
                Composer composer5 = composer2;
                ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion, 0.0f, i3, null), positiveButtonText, null, 0L, null, false, 0.0f, null, 0L, onPositiveClick, composer5, ((i6 >> 9) & 112) | 6 | (1879048192 & (i6 << 9)), TypedValues.PositionType.TYPE_CURVE_FIT);
                composer2 = composer5;
            } else {
                composer2.startReplaceGroup(i4);
            }
            composer2.endReplaceGroup();
            if (str2 != null) {
                composer2.startReplaceGroup(680101577);
                ChaloSpacersKt.o(composer2, i2);
                Composer composer6 = composer2;
                ChaloFilledButtonKt.f(str2, false, SizeKt.fillMaxWidth$default(companion, 0.0f, i3, null), null, null, 0.0f, 0L, onNegativeClick, composer6, ((i6 >> 15) & 14) | 384 | (i6 & 29360128), 122);
                composer2 = composer6;
            } else {
                composer2.startReplaceGroup(i4);
            }
            composer2.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new jn0(modifier2, iconType, title, str, positiveButtonText, str2, onPositiveClick, onNegativeClick, i));
        }
    }
}
