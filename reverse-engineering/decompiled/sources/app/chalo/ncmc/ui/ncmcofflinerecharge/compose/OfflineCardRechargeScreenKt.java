package app.chalo.ncmc.ui.ncmcofflinerecharge.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.TooltipPopupComposableKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardInfoScreenKt;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineRechargeScreenType;
import app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineCardRechargeScreenKt;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.ej;
import defpackage.g5;
import defpackage.h20;
import defpackage.h3;
import defpackage.la0;
import defpackage.ln0;
import defpackage.nn0;
import defpackage.nu;
import defpackage.on0;
import defpackage.op;
import defpackage.pk0;
import defpackage.pn0;
import defpackage.qm0;
import defpackage.t1;
import defpackage.wb;
import defpackage.xc;
import defpackage.yi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "showTooltip", "tFieldFocused", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OfflineCardRechargeScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6402a;

        static {
            int[] iArr = new int[OfflineRechargeScreenType.values().length];
            try {
                iArr[OfflineRechargeScreenType.ENTER_AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineRechargeScreenType.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6402a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static final void a(OfflineCardRechargeViewState viewState, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Function1 function1, Composer composer, int i) {
        int i2;
        ?? r15;
        String str;
        Function1 sendIntent = function1;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(focusRequester, "focusRequester");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-653456341);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-653456341, i3, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineCardRechargeScreen (OfflineCardRechargeScreen.kt:84)");
            }
            if (viewState.j) {
                composerStartRestartGroup.startReplaceGroup(1969156083);
                r15 = 1;
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
            } else {
                r15 = 1;
                composerStartRestartGroup.startReplaceGroup(1964965751);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (viewState.q) {
                composerStartRestartGroup.startReplaceGroup(1969261917);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new wb(8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(504990932, r15, new h3(28, viewState, sendIntent), composerStartRestartGroup, 54), composerStartRestartGroup, 390, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1964965751);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, r15, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), r8);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            OfflineRechargeScreenType offlineRechargeScreenType = viewState.f6399a;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new ln0(8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ?? r0 = r15;
            AnimatedContentKt.AnimatedContent(offlineRechargeScreenType, null, (Function1) objRememberedValue2, null, null, null, ComposableLambdaKt.rememberComposableLambda(896752668, r15, new ej(viewState, focusRequester, softwareKeyboardController, sendIntent, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 58);
            composerStartRestartGroup = composerStartRestartGroup;
            if (!viewState.s || (str = viewState.t) == null || StringsKt.F(str)) {
                sendIntent = function1;
                composerStartRestartGroup.startReplaceGroup(-739934447);
            } else {
                composerStartRestartGroup.startReplaceGroup(-733351442);
                Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, r0 == true ? 1 : 0, null), companion2.getBottomCenter());
                String str2 = viewState.t;
                String strC = StringResourcesHelperKt.c(StringEnum.OKAY_SMALL, new Object[0], composerStartRestartGroup, 6);
                ?? r2 = (i3 & 7168) == 2048 ? r0 == true ? 1 : 0 : 0;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (r2 != 0 || objRememberedValue3 == companion4.getEmpty()) {
                    sendIntent = function1;
                    objRememberedValue3 = new qm0(sendIntent, 17);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    sendIntent = function1;
                }
                ChaloCardInfoScreenKt.d(modifierAlign, str2, strC, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new nn0(viewState, focusRequester, softwareKeyboardController, sendIntent, i, 1));
        }
    }

    public static final void b(OfflineCardRechargeViewState offlineCardRechargeViewState, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Function1 function1, Composer composer, int i) {
        OfflineCardRechargeViewState offlineCardRechargeViewState2;
        int i2;
        SoftwareKeyboardController softwareKeyboardController2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1099456691);
        if ((i & 6) == 0) {
            offlineCardRechargeViewState2 = offlineCardRechargeViewState;
            i2 = (composerStartRestartGroup.changedInstance(offlineCardRechargeViewState2) ? 4 : 2) | i;
        } else {
            offlineCardRechargeViewState2 = offlineCardRechargeViewState;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            softwareKeyboardController2 = softwareKeyboardController;
            i2 |= composerStartRestartGroup.changed(softwareKeyboardController2) ? 256 : 128;
        } else {
            softwareKeyboardController2 = softwareKeyboardController;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1099456691, i2, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineRechargeEnterAmountScreen (OfflineCardRechargeScreen.kt:207)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.g(ChaloToolBarKt.l(companion, composerStartRestartGroup), StringResourcesHelperKt.c(StringEnum.ADD_AMOUNT, new Object[0], composerStartRestartGroup, 6), 0L, null, composerStartRestartGroup, 0, 12);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new op(focusRequester, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            c(OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue), offlineCardRechargeViewState2, focusRequester, softwareKeyboardController2, function1, composerStartRestartGroup, (i2 << 3) & 65520);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nn0(offlineCardRechargeViewState, focusRequester, softwareKeyboardController, function1, i, 0));
        }
    }

    public static final void c(Modifier modifier, OfflineCardRechargeViewState offlineCardRechargeViewState, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Function1 function1, Composer composer, int i) {
        int i2;
        FocusRequester focusRequester2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1119532557);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(offlineCardRechargeViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            focusRequester2 = focusRequester;
            i2 |= composerStartRestartGroup.changed(focusRequester2) ? 256 : 128;
        } else {
            focusRequester2 = focusRequester;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1119532557, i3, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineRechargeMainScreen (OfflineCardRechargeScreen.kt:241)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            boolean z = (57344 & i3) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new nu(function1, 28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            f(modifierM786paddingVpY3zN4$default, offlineCardRechargeViewState, focusRequester2, softwareKeyboardController, (Function1) objRememberedValue, composerStartRestartGroup, i3 & 8176);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).r0;
            float f = ChaloTheme.b(composerStartRestartGroup, 0).h;
            composerStartRestartGroup = composerStartRestartGroup;
            DividerKt.m1950HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), f, j, composerStartRestartGroup, 6, 0);
            e(PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i), offlineCardRechargeViewState.k, offlineCardRechargeViewState.l, offlineCardRechargeViewState.f, offlineCardRechargeViewState.m, function1, composerStartRestartGroup, 458752 & (i3 << 3));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new on0(modifier, offlineCardRechargeViewState, focusRequester, softwareKeyboardController, function1, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(Modifier modifier, boolean z, boolean z2, String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1035323103);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035323103, i2, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OnlineBalance (OfflineCardRechargeScreen.kt:340)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ONLINE_BALANCE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            ChaloSpacersKt.B(composerStartRestartGroup, 0);
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
            RoundedCornerShape roundedCornerShapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new t1(mutableState, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            TooltipPopupComposableKt.a(null, null, zBooleanValue, roundedCornerShapeM1074RoundedCornerShape0680j_4, j, 0.0f, 0.0f, null, false, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(1615231210, true, new la0(mutableState, 11), composerStartRestartGroup, 54), ComposableSingletons$OfflineCardRechargeScreenKt.f6400a, composerStartRestartGroup, 0, 438, 995);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1630482471);
                ShimmerEffectKt.a(null, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.3f, ChaloTheme.d(composerStartRestartGroup, 0).g, ChaloTheme.a(composerStartRestartGroup, 0).p, ChaloTheme.a(composerStartRestartGroup, 0).q, composerStartRestartGroup, 384, 1);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else if (z2) {
                composerStartRestartGroup.startReplaceGroup(1630878589);
                composer2 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.UNAVAILABLE, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131070);
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1631104734);
                if (str == null) {
                    composerStartRestartGroup.startReplaceGroup(-1748497796);
                    String strC = StringResourcesHelperKt.c(StringEnum.UNAVAILABLE, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                    str2 = strC;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1748498137);
                    composerStartRestartGroup.endReplaceGroup();
                    str2 = str;
                }
                composer2 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(str2, null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131066);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h20(modifier, z, z2, str, i, 1));
        }
    }

    public static final void e(final Modifier modifier, final boolean z, final boolean z2, final String str, final boolean z3, final Function1 sendIntent, Composer composer, final int i) {
        int i2;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1310237152);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1310237152, i2, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OnlineBalanceAndCtaSection (OfflineCardRechargeScreen.kt:289)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1027324363, true, new pn0(z, z2, str, sendIntent), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 14);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.RECHARGE, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            boolean z4 = (i2 & 458752) == 131072;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qm0(sendIntent, 15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC, null, 0L, null, z3, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, (458752 & (i2 << 3)) | 6, 476);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: qn0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    OfflineCardRechargeScreenKt.e(modifier, z, z2, str, z3, sendIntent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(Modifier modifier, OfflineCardRechargeViewState offlineCardRechargeViewState, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function2;
        String str;
        long j;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1885282548);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(offlineCardRechargeViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1885282548, i2, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OnlineToOfflineRechargeEnterAmount (OfflineCardRechargeScreen.kt:436)");
            }
            String str2 = offlineCardRechargeViewState.o;
            String str3 = offlineCardRechargeViewState.o;
            boolean zChanged = composerStartRestartGroup.changed(str2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            int i4 = i2;
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                str = str3;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str3.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                str = str3;
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            TextFieldValue textFieldValue = str.length() == 0 ? new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null) : (TextFieldValue) mutableState.getValue();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(835683598);
                j = ChaloTheme.a(composerStartRestartGroup, 0).B;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(835729292);
                j = ChaloTheme.a(composerStartRestartGroup, 0).v0;
                composerStartRestartGroup.endReplaceGroup();
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            long j2 = j;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NCMC_OFFLINE_RECHARGE_DESC, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m6977getNumberPjHm6EE(), ImeAction.INSTANCE.m6921getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            boolean z = (i4 & 7168) == 2048;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new yi(softwareKeyboardController, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue3, null, null, null, null, null, 62, null);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new g5(mutableState2, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BorderKt.m275borderxT4_qwU(FocusRequesterModifierKt.focusRequester(FocusChangedModifierKt.onFocusChanged(modifierFillMaxWidth$default, (Function1) objRememberedValue4), focusRequester), ChaloTheme.b(composerStartRestartGroup, 0).b, j2, ChaloTheme.d(composerStartRestartGroup, 0).c), ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).f);
            TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            long j3 = ChaloTheme.a(composerStartRestartGroup, 0).g;
            long jM4640getTransparent0d7_KjU = Color.INSTANCE.m4640getTransparent0d7_KjU();
            long j4 = ChaloTheme.a(composerStartRestartGroup, 0).k;
            long j5 = ChaloTheme.a(composerStartRestartGroup, 0).k;
            long j6 = ChaloTheme.a(composerStartRestartGroup, 0).k;
            TextFieldColors textFieldColorsM2603colors0hiis_0 = textFieldDefaults.m2603colors0hiis_0(j3, 0L, 0L, 0L, jM4640getTransparent0d7_KjU, 0L, 0L, 0L, ChaloTheme.a(composerStartRestartGroup, 0).f1915a, ChaloTheme.a(composerStartRestartGroup, 0).f1915a, null, ChaloTheme.a(composerStartRestartGroup, 0).Z, ChaloTheme.a(composerStartRestartGroup, 0).Z, ChaloTheme.a(composerStartRestartGroup, 0).Z, ChaloTheme.a(composerStartRestartGroup, 0).d, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j5, ChaloTheme.a(composerStartRestartGroup, 0).k, j6, j4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 0, 0, 0, 3072, 2021623022, 4095);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState) | ((57344 & i4) == 16384);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                function2 = function1;
                i3 = 6;
                objRememberedValue5 = new xc(function2, mutableState, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                function2 = function1;
                i3 = 6;
            }
            ChaloTextFieldKt.a(textFieldValue, (Function1) objRememberedValue5, modifierM785paddingVpY3zN4, false, false, textStyleF, null, ComposableSingletons$OfflineCardRechargeScreenKt.b, null, null, false, null, keyboardOptions, keyboardActions, false, 0, null, null, textFieldColorsM2603colors0hiis_0, null, composerStartRestartGroup, 12582912, 384, 773976);
            composerStartRestartGroup = composerStartRestartGroup;
            String str4 = offlineCardRechargeViewState.n;
            if (str4 == null) {
                composerStartRestartGroup.startReplaceGroup(-379221660);
            } else {
                composerStartRestartGroup.startReplaceGroup(-379221659);
                ChaloSpacersKt.t(composerStartRestartGroup, 0);
                TextKt.m2623TextNvy7gAk(str4, null, ChaloTheme.a(composerStartRestartGroup, 0).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            String str5 = offlineCardRechargeViewState.h;
            if (str5 == null) {
                composerStartRestartGroup.startReplaceGroup(-378953169);
            } else {
                composerStartRestartGroup.startReplaceGroup(-378953168);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                Composer composer2 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NCMC_PAYMENT_CONFIRMATION_MINIMUM_RECHARGE_AMOUNT, new Object[]{str5}, composerStartRestartGroup, i3), null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131066);
                composerStartRestartGroup = composer2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function2 = function1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new on0(modifier, offlineCardRechargeViewState, focusRequester, softwareKeyboardController, function2, i, 1));
        }
    }
}
