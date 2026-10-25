package app.chalo.home.ui.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.userprofile.UserProfilePicComposableKt;
import app.chalo.compose.components.userprofile.UserProfilePicComposableUIState;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.UiEventHandler;
import defpackage.ag1;
import defpackage.i41;
import defpackage.km;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserProfilingBottomSheetKt {
    public static final void a(UserProfilePicComposableUIState userProfilePicComposableUIState, String title, String str, String positiveButtonText, String str2, Function0 onPositiveClick, Function0 onNegativeClick, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        int i3;
        Modifier.Companion companion2;
        Intrinsics.i(title, "title");
        Intrinsics.i(positiveButtonText, "positiveButtonText");
        Intrinsics.i(onPositiveClick, "onPositiveClick");
        Intrinsics.i(onNegativeClick, "onNegativeClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(368803930);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(userProfilePicComposableUIState) : composerStartRestartGroup.changedInstance(userProfilePicComposableUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(positiveButtonText) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPositiveClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNegativeClick) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(368803930, i2, -1, "app.chalo.home.ui.compose.UserProfilingBottomSheetContent (UserProfilingBottomSheet.kt:37)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion5, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion5, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            SpacerKt.Spacer(i41.a(RowScopeInstance.INSTANCE, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            boolean z = (3670016 & i2) == 1048576;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ag1(onNegativeClick, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i6 = i2;
            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_CLOSE, composerStartRestartGroup, 6), (String) null, ComposeUtilsKt.b(companion3, UiEventHandler.Companion.a((Function0) objRememberedValue), composerStartRestartGroup, 6, 6), ChaloTheme.a(composerStartRestartGroup, 0).v0, composerStartRestartGroup, Painter.$stable | 48, 0);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            UserProfilePicComposableKt.a(userProfilePicComposableUIState, composerStartRestartGroup, i6 & 14);
            if (title.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(818094315);
                ChaloSpacersKt.g(composerStartRestartGroup, 0);
                companion = companion3;
                TextKt.m2623TextNvy7gAk(title, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7173getStarte0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getLabelLarge(), composerStartRestartGroup, ((i6 >> 3) & 14) | 1572912, 0, 129976);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                companion = companion3;
                composerStartRestartGroup.startReplaceGroup(815557554);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(818464051);
                composerStartRestartGroup.endReplaceGroup();
                companion2 = companion;
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(818464052);
                ChaloSpacersKt.t(composerStartRestartGroup, 0);
                Modifier.Companion companion6 = companion;
                Composer composer2 = composerStartRestartGroup;
                i3 = 0;
                companion2 = companion6;
                TextKt.m2623TextNvy7gAk(str, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7173getStarte0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composer2, ((i6 >> 6) & 14) | 48, 0, 130040);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endReplaceGroup();
            }
            if ((positiveButtonText.length() > 0 ? 1 : i3) != 0) {
                composerStartRestartGroup.startReplaceGroup(818826814);
                ChaloSpacersKt.g(composerStartRestartGroup, i3);
                ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), positiveButtonText, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, i3).getHeadlineSmall()), 0L, ChaloTheme.d(composerStartRestartGroup, i3).g, false, 0.0f, null, 0L, onPositiveClick, composerStartRestartGroup, ((r1 >> 6) & 112) | 6 | ((i6 << 12) & 1879048192), 488);
            } else {
                composerStartRestartGroup.startReplaceGroup(815557554);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (str2 == null) {
                composerStartRestartGroup.startReplaceGroup(819224698);
            } else {
                composerStartRestartGroup.startReplaceGroup(819224699);
                ChaloSpacersKt.n(composerStartRestartGroup, i3);
                ChaloFilledButtonKt.f(str2, false, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, i3).getHeadlineSmall()), ChaloTheme.d(composerStartRestartGroup, i3).g, 0.0f, 0L, onNegativeClick, composerStartRestartGroup, ((r1 >> 12) & 14) | 384 | (29360128 & (r1 << 3)), 98);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new km(userProfilePicComposableUIState, title, str, positiveButtonText, str2, onPositiveClick, onNegativeClick, i, 9));
        }
    }
}
