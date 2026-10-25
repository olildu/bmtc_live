package app.chalo.premiumbus.bulkbookingridedetails.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.SuperPassResponseAppModel;
import app.chalo.productactivation.ui.ActivationPassComposablesKt;
import app.chalo.productactivation.ui.uistate.ActivationPassContainerUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.pk0;
import defpackage.u50;
import defpackage.vo1;
import defpackage.wm0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PBPreBookingSuccessProceedScreenKt {
    public static final void a(PbBulkBookingRideDetailsViewState viewState, Function0 bookSingleRidesClick, Function0 backToHomeScreen, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(bookSingleRidesClick, "bookSingleRidesClick");
        Intrinsics.i(backToHomeScreen, "backToHomeScreen");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2022831191);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(bookSingleRidesClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(backToHomeScreen) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2022831191, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PBPreBookingSuccessProceedScreen (PBPreBookingSuccessProceedScreen.kt:47)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_CHECK_ICON, composerStartRestartGroup, 6), "", SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).B), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PASS_BOUGHT, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall(), composerStartRestartGroup, 0, 0, 131070);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            SuperPassResponseAppModel superPassResponseAppModel = viewState.f;
            if (superPassResponseAppModel == null) {
                composerStartRestartGroup.startReplaceGroup(1029556917);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion2;
            } else {
                composerStartRestartGroup.startReplaceGroup(1029556918);
                companion = companion2;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m788paddingqDBjuR0$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 8, null), 0.0f, 1, null);
                String str = viewState.g;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1631545449, 0, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.getActivationPassContainerUIState (PBPreBookingSuccessProceedScreen.kt:147)");
                }
                String strC = StringResourcesHelperKt.c(StringEnum.CHALO_BUS_PASS, new Object[0], composerStartRestartGroup, 6);
                UITextStyle uITextStyle = UITextStyle.BodyMedium;
                UIFontWeight uIFontWeight = UIFontWeight.Bold;
                ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(strC, uITextStyle, almostBlackColor, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                String str2 = superPassResponseAppModel.c;
                UITextStyle uITextStyle2 = UITextStyle.BodySmall;
                ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
                ActivationPassContainerUIState activationPassContainerUIState = new ActivationPassContainerUIState(chaloTextUIState, new TextUIState.ChaloTextUIState(str2, uITextStyle2, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.StyledTextUIState(CollectionsKt.S(new StyledTextDataUIState(String.valueOf(superPassResponseAppModel.h), almostBlackColor, uIFontWeight, UITextStyle.DisplayLarge, null, null, null, 1008), new StyledTextDataUIState(vo1.m(" ", StringResourcesHelperKt.c(StringEnum.TOTAL_RIDES_LOWERCASE, new Object[0], composerStartRestartGroup, 6)), shadyGray, null, uITextStyle2, null, null, null, 1012)), null, null, 30), str != null ? new TextUIState.ChaloTextUIState(str, uITextStyle2, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                UIShape.Rectangle rectangle = UIShape.f1926a;
                ActivationPassComposablesKt.c(modifierFillMaxWidth$default, activationPassContainerUIState, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            ChaloRoundedCardKt.b(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-522520450, true, new u50(16, bookSingleRidesClick, backToHomeScreen), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 4, viewState, bookSingleRidesClick, backToHomeScreen));
        }
    }
}
