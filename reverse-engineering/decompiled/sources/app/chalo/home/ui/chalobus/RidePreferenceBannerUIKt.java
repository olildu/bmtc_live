package app.chalo.home.ui.chalobus;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.SwitchKt;
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
import androidx.compose.ui.text.font.FontWeight;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.OriginDestinationSideIndicatorKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposeItemsKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.text.UITextStyle;
import defpackage.ey0;
import defpackage.gb;
import defpackage.i41;
import defpackage.p01;
import defpackage.pk0;
import defpackage.r1;
import defpackage.wc;
import defpackage.zc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RidePreferenceBannerUIKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1396178568);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1396178568, i2, -1, "app.chalo.home.ui.chalobus.ConfirmTimeUpdateBanner (RidePreferenceBannerUI.kt:207)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).A0, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Painter painterA = PainterResourceHelperKt.a(IconType.IC_SCHEDULE_CLOCK, composerStartRestartGroup, 6);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ImageKt.Image(painterA, "", SizeKt.m828size3ABfNKs(companion2, ChaloThemeHelper.a().h), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.UPDATE_COMMUTE_TIME, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 0, 131066);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            ChaloCardComposeItemsKt.e(null, StringResourcesHelperKt.c(StringEnum.UPDATE, new Object[0], composerStartRestartGroup, 6), ChaloTypographyKt.i(ChaloTheme.e(composerStartRestartGroup, 0)), 0L, null, function0, composerStartRestartGroup, (i2 << 15) & 458752, 25);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gb(function0, modifier, i));
        }
    }

    public static final void b(RidePreferenceBannerState bannerState, Function1 onToggleSaveRide, Function1 onUpdateTime, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2 = modifier;
        Intrinsics.i(bannerState, "bannerState");
        Intrinsics.i(onToggleSaveRide, "onToggleSaveRide");
        Intrinsics.i(onUpdateTime, "onUpdateTime");
        Composer composerStartRestartGroup = composer.startRestartGroup(247224665);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(bannerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onToggleSaveRide) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onUpdateTime) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(247224665, i2, -1, "app.chalo.home.ui.chalobus.RidePreferenceBannerUI (RidePreferenceBannerUI.kt:44)");
            }
            if (bannerState instanceof RidePreferenceBannerState.SaveRideEligible) {
                composerStartRestartGroup.startReplaceGroup(-798605577);
                RidePreferenceBannerState.SaveRideEligible saveRideEligible = (RidePreferenceBannerState.SaveRideEligible) bannerState;
                c(saveRideEligible.f3302a, onToggleSaveRide, modifier, saveRideEligible.b, saveRideEligible.c, saveRideEligible.d, composerStartRestartGroup, (i2 & 112) | ((i2 >> 3) & 896));
                modifier2 = modifier;
                composerStartRestartGroup.endReplaceGroup();
            } else if (bannerState instanceof RidePreferenceBannerState.TimeAutoSet) {
                composerStartRestartGroup.startReplaceGroup(-798215349);
                d(modifier2, composerStartRestartGroup, (i2 >> 9) & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else if (bannerState instanceof RidePreferenceBannerState.ConfirmTimeUpdate) {
                composerStartRestartGroup.startReplaceGroup(-798091132);
                boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new p01(15, onUpdateTime, bannerState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                a((i2 >> 6) & 112, composerStartRestartGroup, modifier2, (Function0) objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!bannerState.equals(RidePreferenceBannerState.Hidden.f3301a)) {
                    throw pk0.p(composerStartRestartGroup, 1359709446);
                }
                composerStartRestartGroup.startReplaceGroup(-797885571);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ey0(i, 6, bannerState, onToggleSaveRide, onUpdateTime, modifier2));
        }
    }

    public static final void c(boolean z, Function1 function1, Modifier modifier, String str, String str2, String str3, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(434452778);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(434452778, i2, -1, "app.chalo.home.ui.chalobus.SaveRideEligibleBanner (RidePreferenceBannerUI.kt:82)");
            }
            int i3 = i2;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).N0, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Painter painterA = PainterResourceHelperKt.a(z ? IconType.ACKNOWLEDGEMENT_PASS_TICKET : IconType.STAR_WITH_BLACK_BACKGROUND, composerStartRestartGroup, 0);
            Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(companion3, ChaloThemeHelper.a().W);
            int i6 = Painter.$stable | 48;
            ImageKt.Image(painterA, (String) null, modifierM828size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i6, 120);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SAVE_THIS_RIDE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium(), composerStartRestartGroup, 1572864, 0, 131002);
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            SwitchKt.Switch(z, function1, SizeKt.m814height3ABfNKs(PaddingKt.m788paddingqDBjuR0$default(companion3, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 0.0f, 0.0f, 14, null), ChaloThemeHelper.a().i), null, false, null, null, composerStartRestartGroup, i3 & WebSocketProtocol.PAYLOAD_SHORT, 120);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.B(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SAVE_RIDE_AUTO_SELECT_DESCRIPTION, new Object[0], composerStartRestartGroup, 6), PaddingKt.m788paddingqDBjuR0$default(companion3, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, 0.0f, 13, null), ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 0, 131064);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            DividerKt.m1950HorizontalDivider9IZ8Weo(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloThemeHelper.a().b), ChaloThemeHelper.a().b, ChaloColorTokenKt.c(ChaloColorToken.LightGray.f9814a), composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            IntrinsicSize intrinsicSize = IntrinsicSize.Min;
            Modifier modifierHeight = IntrinsicKt.height(companion3, intrinsicSize);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
            OriginDestinationSideIndicatorKt.a(SizeKt.fillMaxHeight(companion3, 0.8f), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).c, composerStartRestartGroup, 6, 0);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl4, Integer.valueOf(i8), composerM3915constructorimpl4));
            String strH0 = StringsKt.h0(str, ",");
            UITextStyle uITextStyle = UITextStyle.BodySmall;
            TextStyle textStyleF = ChaloThemeKt.f(uITextStyle, composerStartRestartGroup, 6);
            ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
            TextKt.m2623TextNvy7gAk(strH0, null, ChaloColorTokenKt.c(almostBlackColor), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleF, composerStartRestartGroup, 0, 0, 131066);
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringsKt.h0(str2, ","), null, ChaloColorTokenKt.c(almostBlackColor), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloThemeKt.f(uITextStyle, composerStartRestartGroup, 6), composerStartRestartGroup, 0, 0, 131066);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            Modifier modifierHeight2 = IntrinsicKt.height(companion3, intrinsicSize);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight2);
            Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl5, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
            Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl5, Integer.valueOf(i9), composerM3915constructorimpl5));
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_SCHEDULE_CLOCK, composerStartRestartGroup, 6), (String) null, SizeKt.m828size3ABfNKs(companion3, ChaloThemeHelper.a().h), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i6, 120);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(str3, null, ChaloColorTokenKt.c(almostBlackColor), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloThemeKt.f(uITextStyle, composerStartRestartGroup, 6), composerStartRestartGroup, (i3 >> 15) & 14, 0, 131066);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wc(z, function1, modifier, str, str2, str3, i, 4));
        }
    }

    public static final void d(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248129476);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248129476, i2, -1, "app.chalo.home.ui.chalobus.TimeAutoSetBanner (RidePreferenceBannerUI.kt:179)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).A0, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_SCHEDULE_CLOCK, composerStartRestartGroup, 6), "", SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloThemeHelper.a().h), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TIME_AUTO_SET_COMMUTE_PREFERENCES, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composer2, 0, 0, 131066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 23));
        }
    }
}
