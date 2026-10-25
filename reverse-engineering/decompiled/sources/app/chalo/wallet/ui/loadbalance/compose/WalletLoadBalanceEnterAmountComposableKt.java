package app.chalo.wallet.ui.loadbalance.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.pager.PagerState;
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
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.textfields.BaseChaloTextFieldKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper$basic$3;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import app.chalo.uistate.textField.UIKeyboardOption;
import app.chalo.uistate.textField.UIKeyboardType;
import app.chalo.uistate.textField.UITextFieldColors;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountViewState;
import app.chalo.wallet.ui.promotionscardcontainer.PromotionsCardContainerKt;
import defpackage.ol1;
import defpackage.pk0;
import defpackage.wl1;
import defpackage.xo1;
import defpackage.yo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletLoadBalanceEnterAmountComposableKt {
    public static final void a(WalletLoadBalanceEnterAmountViewState state, PagerState pagerState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        int i3;
        Arrangement arrangement;
        ComposeUiNode.Companion companion;
        int i4;
        PagerState pagerState2;
        PagerState pagerState3 = pagerState;
        Intrinsics.i(state, "state");
        List list = state.h;
        Intrinsics.i(pagerState3, "pagerState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(70520519);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(pagerState3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70520519, i2, -1, "app.chalo.wallet.ui.loadbalance.compose.WalletLoadBalanceEnterAmountComposable (WalletLoadBalanceEnterAmountComposable.kt:51)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement2.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(PaddingKt.m788paddingqDBjuR0$default(companion2, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).i, 0.0f, 0.0f, 13, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Painter painterA = PainterResourceHelperKt.a(IconType.RECHARGE_CHALO_PAY_WALLET_ICON, composerStartRestartGroup, 6);
            int i7 = Painter.$stable;
            int i8 = i2;
            ImageKt.Image(painterA, (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i7 | 48, 124);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.RECHARGE_WALLET_BALANCE_HEADING, new Object[0], composerStartRestartGroup, 6), PaddingKt.m788paddingqDBjuR0$default(companion2, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 0.0f, 0.0f, 14, null), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getDisplayMedium()), composerStartRestartGroup, 0, 0, 131064);
            Composer composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (state.f != -1) {
                composer2.startReplaceGroup(-544890983);
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.a(StringEnum.TEXT_REMAINING_WALLET_BALANCE, CollectionsKt.R(state.g)), PaddingKt.m788paddingqDBjuR0$default(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composer2, 0).h, 0.0f, 2, null), 0.0f, ChaloTheme.b(composer2, 0).l0, 0.0f, 0.0f, 13, null), ChaloTheme.a(composer2, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7173getStarte0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getDisplaySmall(), composer2, 0, 0, 130040);
                composer2 = composer2;
            } else {
                composer2.startReplaceGroup(-548206619);
            }
            composer2.endReplaceGroup();
            Composer composer3 = composer2;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.LOAD_BALANCE_ADDITIONAL_INFO, new Object[0], composer2, 6), PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composer2, 0).h, ChaloTheme.b(composer2, 0).W, ChaloTheme.b(composer2, 0).h, 0.0f, 8, null), ChaloTheme.a(composer2, 0).r, ChaloTheme.d(composer2, 0).b), ChaloTheme.b(composer2, 0).h, ChaloTheme.b(composer2, 0).g), ChaloTheme.a(composer2, 0).f1915a, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getBodyMedium(), composer3, 1572864, 0, 131000);
            String str = state.c;
            if (str == null) {
                str = state.k;
            }
            String str2 = str;
            int i9 = i8 & 896;
            boolean z = i9 == 256;
            Object objRememberedValue = composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wl1(sendIntent, 27);
                composer3.updateRememberedValue(objRememberedValue);
            }
            TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B = TextFieldEventHandlerHelper.b(2, (Function1) objRememberedValue, null);
            UITextStyle uITextStyle = UITextStyle.DisplaySmall;
            TextFieldLabelPlaceholderUIState.TextLabel textLabel = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState(StringResourcesHelperKt.c(StringEnum.ENTER_RECHARGE_AMOUNT, new Object[0], composer3, 6), UITextStyle.BodyMedium, ChaloColorToken.Black_40.f9764a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
            UIKeyboardOption uIKeyboardOption = new UIKeyboardOption(null, UIKeyboardType.Decimal, null, 5);
            ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
            ChaloColorToken.TextFieldIndicator textFieldIndicator = ChaloColorToken.TextFieldIndicator.f9859a;
            BaseChaloTextFieldKt.a(new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandlerHelper$basic$3B, uITextStyle, textLabel, null, null, false, uIKeyboardOption, 0, null, new UITextFieldColors(black_87, black_87, null, null, null, null, textFieldIndicator, textFieldIndicator, null, null, ChaloColorToken.OrangePrimary.f9835a, null, 4174844), 0.0f, 97228), SizeKt.fillMaxWidth$default(PaddingKt.m787paddingqDBjuR0(companion2, ChaloTheme.b(composer3, 0).h, ChaloTheme.b(composer3, 0).h, ChaloTheme.b(composer3, 0).h, ChaloTheme.b(composer3, 0).f1916a), 0.0f, 1, null), null, null, null, null, composer3, 0, 124);
            Composer composer4 = composer3;
            if (state.d != null) {
                composer4.startReplaceGroup(-541763362);
                i3 = i9;
                TextKt.m2623TextNvy7gAk(state.d, PaddingKt.m788paddingqDBjuR0$default(PaddingKt.m786paddingVpY3zN4$default(companion2, ChaloTheme.b(composer4, 0).h, 0.0f, 2, null), 0.0f, ChaloTheme.b(composer4, 0).g, 0.0f, 0.0f, 13, null), ChaloTheme.a(composer4, 0).a0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer4, 0).getBodyMedium(), composer4, 0, 0, 131064);
                composer4 = composer4;
            } else {
                i3 = i9;
                composer4.startReplaceGroup(-548206619);
            }
            composer4.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion3.getStart(), composer4, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
            int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, companion2);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composer4.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor3);
            } else {
                composer4.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer4);
            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i10), composerM3915constructorimpl3));
            if (state.e.isEmpty()) {
                arrangement = arrangement2;
                companion = companion4;
                i4 = i3;
                composer4.startReplaceGroup(-1193401361);
            } else {
                composer4.startReplaceGroup(-1186514277);
                PaddingValues paddingValuesM779PaddingValuesYgX7TsA$default = PaddingKt.m779PaddingValuesYgX7TsA$default(ChaloTheme.b(composer4, 0).f, 0.0f, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM672spacedBy0680j_4 = arrangement2.m672spacedBy0680j_4(ChaloTheme.b(composer4, 0).f);
                Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(PaddingKt.m786paddingVpY3zN4$default(companion2, ChaloTheme.b(composer4, 0).h, 0.0f, 2, null), 0.0f, ChaloTheme.b(composer4, 0).g, 0.0f, 0.0f, 13, null);
                int i11 = i3;
                boolean zChangedInstance = composer4.changedInstance(state) | (i11 == 256);
                Object objRememberedValue2 = composer4.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ol1(12, state, sendIntent);
                    composer4.updateRememberedValue(objRememberedValue2);
                }
                Composer composer5 = composer4;
                arrangement = arrangement2;
                companion = companion4;
                i4 = i11;
                LazyDslKt.LazyRow(modifierM788paddingqDBjuR0$default, null, paddingValuesM779PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM672spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue2, composer5, 0, 490);
                composer4 = composer5;
            }
            composer4.endReplaceGroup();
            composer4.endNode();
            String strC = StringResourcesHelperKt.c(StringEnum.NEXT_CAPS, new Object[0], composer4, 6);
            boolean z2 = state.b;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m788paddingqDBjuR0$default(PaddingKt.m786paddingVpY3zN4$default(companion2, ChaloTheme.b(composer4, 0).h, 0.0f, 2, null), 0.0f, ChaloTheme.b(composer4, 0).W, 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            int i12 = i4;
            boolean z3 = i12 == 256;
            Object objRememberedValue3 = composer4.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new xo1(sendIntent, 18);
                composer4.updateRememberedValue(objRememberedValue3);
            }
            Composer composer6 = composer4;
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC, null, 0L, null, z2, 0.0f, null, 0L, (Function0) objRememberedValue3, composer6, 0, 476);
            composerStartRestartGroup = composer6;
            if (list.isEmpty()) {
                pagerState2 = pagerState;
                composerStartRestartGroup.startReplaceGroup(-548206619);
            } else {
                composerStartRestartGroup.startReplaceGroup(-539911143);
                boolean z4 = i12 == 256;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new wl1(sendIntent, 28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                pagerState2 = pagerState;
                PromotionsCardContainerKt.c(list, (Function1) objRememberedValue4, pagerState2, composerStartRestartGroup, (i8 << 3) & 896);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (state.m) {
                composerStartRestartGroup.startReplaceGroup(-539582388);
                Modifier modifierM788paddingqDBjuR0$default2 = PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).q, 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i13 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM788paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor4 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
                ComposeUiNode.Companion companion5 = companion;
                pk0.v(companion5, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i13), composerM3915constructorimpl4));
                pagerState3 = pagerState2;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.POWERED_BY, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).q0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge(), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
                ImageKt.Image(PainterResourceHelperKt.a(IconType.YES_BANK, composerStartRestartGroup, 6), StringResourcesHelperKt.c(StringEnum.POWERED_BY_YES_BANK, new Object[0], composerStartRestartGroup, 6), SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).a0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i7, 120);
                composerStartRestartGroup.endNode();
            } else {
                pagerState3 = pagerState2;
                composerStartRestartGroup.startReplaceGroup(-548206619);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new yo1(state, pagerState3, sendIntent, i));
        }
    }
}
