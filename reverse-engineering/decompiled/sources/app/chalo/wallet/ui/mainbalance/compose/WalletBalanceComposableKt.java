package app.chalo.wallet.ui.mainbalance.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.exifinterface.media.ExifInterface;
import app.chalo.compose.ContactSupportTextComposableKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.models.contactsupport.ContactSupportUIState;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.wallet.ui.mainbalance.WalletBalanceScreenType;
import app.chalo.wallet.ui.mainbalance.WalletBalanceViewState;
import app.chalo.wallet.ui.model.WalletTransactionUiModel;
import app.chalo.wallet.ui.model.WalletTransactionUiWrapper;
import app.chalo.wallet.ui.promotionscardcontainer.PromotionsCardContainerKt;
import app.chalo.wallet.ui.transactionsContent.WalletTransactionsContentKt;
import defpackage.fb;
import defpackage.hn1;
import defpackage.i41;
import defpackage.nf;
import defpackage.pk0;
import defpackage.wl1;
import defpackage.xo1;
import defpackage.y4;
import defpackage.yo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletBalanceComposableKt {
    public static final void a(int i, Composer composer, Function1 sendIntent, boolean z) {
        int i2;
        Composer composer2;
        long j;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-394306443);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-394306443, i2, -1, "app.chalo.wallet.ui.mainbalance.compose.AddMoneyInfoSection (WalletBalanceComposable.kt:299)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 0.0f, 13, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CHALO_PAY_ADD_MONEY_INFO_TITLE, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineMedium(), composerStartRestartGroup, 0, 0, 131070);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            c("1", StringResourcesHelperKt.c(StringEnum.CHALO_PAY_ADD_MONEY_INFO_MESSAGE_ONE, new Object[0], composerStartRestartGroup, 6), composerStartRestartGroup, 6);
            c(ExifInterface.GPS_MEASUREMENT_2D, StringResourcesHelperKt.c(StringEnum.CHALO_PAY_ADD_MONEY_INFO_MESSAGE_TWO, new Object[0], composerStartRestartGroup, 6), composerStartRestartGroup, 6);
            c(ExifInterface.GPS_MEASUREMENT_3D, StringResourcesHelperKt.c(StringEnum.CHALO_PAY_ADD_MONEY_INFO_MESSAGE_THREE, new Object[0], composerStartRestartGroup, 6), composerStartRestartGroup, 6);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.WALLET_ADD_MONEY_INFO_MESSAGE_END, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium(), composerStartRestartGroup, 0, 0, 131070);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer2, 0).h), composer2, 0);
            float f = ChaloTheme.b(composer2, 0).b;
            if (z) {
                composer2.startReplaceGroup(1516007500);
                j = ChaloTheme.a(composer2, 0).f1915a;
            } else {
                composer2.startReplaceGroup(1516008660);
                j = ChaloTheme.a(composer2, 0).b;
            }
            composer2.endReplaceGroup();
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(BorderKt.m275borderxT4_qwU(companion, f, j, ChaloTheme.d(composer2, 0).b), ChaloTheme.b(composer2, 0).n);
            TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(StringResourcesHelperKt.c(StringEnum.RECHARGE_WALLET, new Object[0], composer2, 6), UITextStyle.HeadlineSmall, z ? ChaloColorToken.OrangePrimary.f9835a : ChaloColorToken.OrangePrimaryDisabled.f9836a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            UIShape.Rectangle rectangle = UIShape.c;
            boolean z2 = (i2 & 112) == 32;
            Object objRememberedValue = composer2.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xo1(sendIntent, 16);
                composer2.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.a(0, 0, composer2, modifierM814height3ABfNKs, ButtonUIStateFactory.h(ButtonUIStateFactory.f9921a, chaloTextUIState, UiEventHandler.Companion.a((Function0) objRememberedValue), rectangle, z, 4));
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer2, 0).i), composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fb(z, sendIntent, i, 3));
        }
    }

    public static final void b(String balance, boolean z, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Function1 function1;
        Composer composer2;
        long j;
        Intrinsics.i(balance, "balance");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1787469665);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(balance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1787469665, i2, -1, "app.chalo.wallet.ui.mainbalance.compose.BalanceSection (WalletBalanceComposable.kt:113)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            int i4 = i2;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BALANCE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0))), composerStartRestartGroup, 0, 0, 131066);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).e0), composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextStyle textStyleA = ChaloTypographyKt.a(ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)));
            TextKt.m2623TextNvy7gAk(balance, null, Color.INSTANCE.m4631getBlack0d7_KjU(), null, TextUnitKt.getSp(36), null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleA, composerStartRestartGroup, (i4 & 14) | 1597824, 0, 130986);
            composer2 = composerStartRestartGroup;
            float f = ChaloTheme.b(composer2, 0).b;
            if (z) {
                composer2.startReplaceGroup(1213029012);
                j = ChaloTheme.a(composer2, 0).f1915a;
            } else {
                composer2.startReplaceGroup(1213030172);
                j = ChaloTheme.a(composer2, 0).b;
            }
            composer2.endReplaceGroup();
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(BorderKt.m275borderxT4_qwU(companion, f, j, ChaloTheme.d(composer2, 0).b), ChaloTheme.b(composer2, 0).n);
            TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(StringResourcesHelperKt.c(StringEnum.RECHARGE_WALLET, new Object[0], composer2, 6), UITextStyle.HeadlineSmall, z ? ChaloColorToken.OrangePrimary.f9835a : ChaloColorToken.OrangePrimaryDisabled.f9836a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            UIShape.Rectangle rectangle = UIShape.c;
            boolean z2 = (i4 & 896) == 256;
            Object objRememberedValue = composer2.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                function1 = sendIntent;
                objRememberedValue = new xo1(function1, 15);
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                function1 = sendIntent;
            }
            ChaloFilledButtonKt.a(0, 0, composer2, modifierM814height3ABfNKs, ButtonUIStateFactory.h(ButtonUIStateFactory.f9921a, chaloTextUIState, UiEventHandler.Companion.a((Function0) objRememberedValue), rectangle, z, 4));
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function1 = sendIntent;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new y4(balance, z, function1, i, 10));
        }
    }

    public static final void c(String str, String text, Composer composer, int i) {
        int i2;
        String str2;
        Composer composer2;
        Intrinsics.i(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1277990568);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1277990568, i2, -1, "app.chalo.wallet.ui.mainbalance.compose.BulletPoint (WalletBalanceComposable.kt:366)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).l), ChaloTheme.a(composerStartRestartGroup, 0).C0, RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM263backgroundbw27NRU);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getLabelMedium(), composer2, i2 & 14, 0, 131070);
            composer2.endNode();
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composer2, 0).h), composer2, 0);
            str2 = text;
            TextKt.m2623TextNvy7gAk(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getBodyMedium(), composer2, (i2 >> 3) & 14, 0, 131070);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str2 = text;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nf(str, str2, i, 5));
        }
    }

    public static final void d(ContactSupportUIState state, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1416051142);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1416051142, i2, -1, "app.chalo.wallet.ui.mainbalance.compose.TransactionHeaderWithContactSupportComposable (WalletBalanceComposable.kt:281)");
            }
            g((i2 & 112) | 6, composerStartRestartGroup, sendIntent, false);
            ChaloSpacersKt.b(ChaloTheme.b(composerStartRestartGroup, 0).o0, composerStartRestartGroup, 0);
            ContactSupportTextComposableKt.a(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).n, 0.0f, 2, null), state, composerStartRestartGroup, ((i2 << 3) & 112) | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hn1(state, sendIntent, i, 9));
        }
    }

    public static final void e(WalletBalanceViewState state, Function1 sendIntent, PagerState pagerState, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.i(state, "state");
        List list = state.i;
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(pagerState, "pagerState");
        Composer composerStartRestartGroup = composer.startRestartGroup(59783790);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(pagerState) ? 256 : 128;
        }
        int i4 = i2;
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(59783790, i4, -1, "app.chalo.wallet.ui.mainbalance.compose.WalletBalanceComposable (WalletBalanceComposable.kt:62)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            b(state.b, state.c, sendIntent, composerStartRestartGroup, (i4 << 3) & 896);
            DividerKt.m1950HorizontalDivider9IZ8Weo(PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.a(composerStartRestartGroup, 0).A0, composerStartRestartGroup, 0, 0);
            if (list.isEmpty()) {
                i3 = i4;
                composerStartRestartGroup.startReplaceGroup(-622332470);
            } else {
                composerStartRestartGroup.startReplaceGroup(-618745770);
                boolean z = (i4 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new wl1(sendIntent, 25);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                i3 = i4;
                PromotionsCardContainerKt.c(list, (Function1) objRememberedValue, pagerState, composerStartRestartGroup, i3 & 896);
                DividerKt.m1950HorizontalDivider9IZ8Weo(null, ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.a(composerStartRestartGroup, 0).A0, composerStartRestartGroup, 0, 1);
            }
            composerStartRestartGroup.endReplaceGroup();
            f(state, sendIntent, composerStartRestartGroup, i3 & WebSocketProtocol.PAYLOAD_SHORT);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yo1(state, sendIntent, pagerState, i, 2));
        }
    }

    public static final void f(WalletBalanceViewState state, Function1 sendIntent, Composer composer, int i) {
        Intrinsics.i(state, "state");
        List<WalletTransactionUiWrapper> list = state.g;
        ContactSupportUIState contactSupportUIState = state.k;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1597483600);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i : i;
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1597483600, i2, -1, "app.chalo.wallet.ui.mainbalance.compose.WalletTransactionContent (WalletBalanceComposable.kt:196)");
            }
            WalletBalanceScreenType walletBalanceScreenType = state.e;
            if (Intrinsics.d(walletBalanceScreenType, WalletBalanceScreenType.AddMoneyTutorial.f10878a)) {
                composerStartRestartGroup.startReplaceGroup(1898909057);
                int i4 = i2 & 112;
                a(i4, composerStartRestartGroup, sendIntent, state.c);
                DividerKt.m1950HorizontalDivider9IZ8Weo(null, ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.a(composerStartRestartGroup, 0).A0, composerStartRestartGroup, 0, 1);
                d(contactSupportUIState, sendIntent, composerStartRestartGroup, 8 | i4);
                if (list.isEmpty()) {
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(1899406359);
                    PlotlineComposeWidgetKt.a(6, 2, composerStartRestartGroup, null, "loadBalanceEnterAmountScreenBanner");
                } else {
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(1891484402);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (state.m) {
                    composerStartRestartGroup.startReplaceGroup(1899544929);
                    WalletTransactionsContentKt.c(composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1891484402);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.d(walletBalanceScreenType, WalletBalanceScreenType.EmptyScreenWithContactSupport.f10879a)) {
                composerStartRestartGroup.startReplaceGroup(1899673889);
                d(contactSupportUIState, sendIntent, composerStartRestartGroup, 8 | (i2 & 112));
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.d(walletBalanceScreenType, WalletBalanceScreenType.WalletTransactions.f10881a)) {
                composerStartRestartGroup.startReplaceGroup(1899951401);
                int i5 = i2 & 112;
                g(i5, composerStartRestartGroup, sendIntent, state.d);
                ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).i, composerStartRestartGroup, 0);
                for (WalletTransactionUiWrapper walletTransactionUiWrapper : list) {
                    boolean z = walletTransactionUiWrapper.b;
                    WalletTransactionUiModel walletTransactionUiModel = walletTransactionUiWrapper.f10887a;
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(-670277224);
                        WalletTransactionsContentKt.a(composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (walletTransactionUiWrapper.c) {
                            composerStartRestartGroup.startReplaceGroup(-670108987);
                            ChaloSpacersKt.b(ChaloTheme.b(composerStartRestartGroup, 0).k, composerStartRestartGroup, 0);
                            ContactSupportTextComposableKt.a(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).n, 0.0f, 2, null), contactSupportUIState, composerStartRestartGroup, 64);
                            ChaloSpacersKt.b(ChaloTheme.b(composerStartRestartGroup, 0).g, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (walletTransactionUiModel == null) {
                            composerStartRestartGroup.startReplaceGroup(-669638934);
                            WalletTransactionsContentKt.c(composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-669530341);
                            boolean z2 = i5 == i3;
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new wl1(sendIntent, 26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            WalletTransactionsContentKt.b(walletTransactionUiModel, (Function1) objRememberedValue, PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), composerStartRestartGroup, 0);
                            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).h, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        i3 = 32;
                    }
                    i3 = 32;
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.d(walletBalanceScreenType, WalletBalanceScreenType.None.f10880a)) {
                    throw pk0.p(composerStartRestartGroup, -1878408286);
                }
                composerStartRestartGroup.startReplaceGroup(1901600880);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hn1(state, sendIntent, i, 8));
        }
    }

    public static final void g(int i, Composer composer, Function1 sendIntent, boolean z) {
        int i2;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-795647141);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-795647141, i2, -1, "app.chalo.wallet.ui.mainbalance.compose.WalletTransactionHeader (WalletBalanceComposable.kt:164)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 8, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM788paddingqDBjuR0$default);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strC = StringResourcesHelperKt.c(StringEnum.WALLET_MY_TRANSACTIONS, new Object[0], composerStartRestartGroup, 6);
            TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            int i4 = i2;
            TextKt.m2623TextNvy7gAk(strC, i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), 0L, null, 0L, null, companion3.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleF, composerStartRestartGroup, 1572864, 0, 131004);
            composerStartRestartGroup = composerStartRestartGroup;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1124178977);
                boolean z2 = (i4 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new xo1(sendIntent, 17);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SEE_ALL_CAPITAL, new Object[0], composerStartRestartGroup, 6), ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, null, 0L, null, companion3.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium(), composerStartRestartGroup, 1572864, 0, 131000);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1130961653);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fb(z, sendIntent, i, 2));
        }
    }
}
