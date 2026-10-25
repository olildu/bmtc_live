package app.chalo.instantticket.ui.faredetails.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.ChaloAlertTextKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTncSectionKt;
import app.chalo.compose.components.ShadowElementKt;
import app.chalo.compose.components.dialogs.ChaloConfirmationDialogKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.data.ProductBookingBranding;
import app.chalo.data.ProductBookingBrandingKt;
import app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy;
import app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel;
import app.chalo.instantticket.ui.faredetails.FareDetailsScreenType;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsMainScreenKt;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.bp;
import defpackage.cb0;
import defpackage.d0;
import defpackage.d30;
import defpackage.dq;
import defpackage.e30;
import defpackage.f30;
import defpackage.fk;
import defpackage.h5;
import defpackage.i41;
import defpackage.ir;
import defpackage.kb;
import defpackage.nu;
import defpackage.pk0;
import defpackage.r1;
import defpackage.wb;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FareDetailsMainScreenKt {
    public static final void a(Modifier modifier, ApplicableRuleUxCopyAppModel.CheckoutScreen rule, Function0 onInfoIconClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(rule, "rule");
        Intrinsics.i(onInfoIconClick, "onInfoIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(588251578);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(rule) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onInfoIconClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(588251578, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.CouponSection (FareDetailsMainScreen.kt:297)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.OFFERS_AND_BENEFITS, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(BackgroundKt.background$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Brush.Companion.m4560linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).F0), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).G0)), 0L, 0L, 0, 14, (Object) null), ChaloTheme.d(composerStartRestartGroup, 0).g, 0.0f, 4, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).k);
            Painter painterA = PainterResourceHelperKt.a(IconType.IC_OFFER, composerStartRestartGroup, 6);
            int i5 = Painter.$stable | 48;
            ImageKt.Image(painterA, "", modifierM828size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i5, 120);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            Modifier modifierA = i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            pk0.v(companion2, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            TextKt.m2623TextNvy7gAk(rule.b, null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            Composer composer3 = composerStartRestartGroup;
            if (rule.c.length() > 0) {
                composer3.startReplaceGroup(-454836946);
                TextKt.m2623TextNvy7gAk(rule.c, null, ChaloTheme.a(composer3, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer3, 0)), composer3, 0, 0, 131066);
                composer3 = composer3;
            } else {
                composer3.startReplaceGroup(-469141896);
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            Painter painterA2 = PainterResourceHelperKt.a(IconType.IC_INFO_GREY, composer3, 6);
            ColorFilter colorFilterM4646tintxETnrds$default = ColorFilter.Companion.m4646tintxETnrds$default(ColorFilter.INSTANCE, ChaloColorTokenKt.c(ChaloColorToken.Black.f9759a), 0, 2, null);
            Modifier modifierM828size3ABfNKs2 = SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composer3, 0).h);
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue = composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fk(onInfoIconClick, 26);
                composer3.updateRememberedValue(objRememberedValue);
            }
            ImageKt.Image(painterA2, "", ClickableKt.m299clickableoSLSa3U$default(modifierM828size3ABfNKs2, false, null, null, null, (Function0) objRememberedValue, 15, null), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM4646tintxETnrds$default, composer3, i5, 56);
            composer2 = composer3;
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 6, modifier, rule, onInfoIconClick));
        }
    }

    public static final void b(FareDetailsViewState viewState, Function1 intentHandler, Composer composer, int i) {
        int i2;
        FareDetailsViewState fareDetailsViewState;
        Function1 function1;
        int i3;
        boolean z;
        int i4;
        Composer composer2;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer composer3;
        char c;
        String str;
        Intrinsics.i(viewState, "viewState");
        boolean z2 = viewState.f;
        FareDetailsScreenType fareDetailsScreenType = viewState.n;
        Intrinsics.i(intentHandler, "intentHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1581981248);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(intentHandler) ? 32 : 16;
        }
        int i9 = i2;
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1581981248, i9, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsMainScreen (FareDetailsMainScreen.kt:64)");
            }
            boolean zChanged = composerStartRestartGroup.changed(fareDetailsScreenType);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (fareDetailsScreenType == null) {
                    z = false;
                } else if (fareDetailsScreenType instanceof FareDetailsScreenType.ONDCTicket) {
                    z = true;
                } else {
                    if (!fareDetailsScreenType.equals(FareDetailsScreenType.InstantTicket.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
                objRememberedValue = Boolean.valueOf(z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
            if (viewState.e) {
                composerStartRestartGroup.startReplaceGroup(-126772735);
                String strC = StringResourcesHelperKt.c(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], composerStartRestartGroup, 6);
                i5 = 0;
                i4 = -130091998;
                composer2 = composerStartRestartGroup;
                i6 = 6;
                ChaloLoadingDialogKt.b(strC, false, null, composer2, 0, 6);
            } else {
                i4 = -130091998;
                composer2 = composerStartRestartGroup;
                i5 = 0;
                i6 = 6;
                composer2.startReplaceGroup(-130091998);
            }
            composer2.endReplaceGroup();
            if (!viewState.u || (str = viewState.v) == null || str.length() == 0) {
                i7 = i4;
                i8 = i9;
                composer3 = composer2;
                composer3.startReplaceGroup(i7);
            } else {
                composer2.startReplaceGroup(-126555580);
                String str2 = viewState.v;
                String strC2 = StringResourcesHelperKt.c(StringEnum.OK, new Object[i5], composer2, i6);
                int i10 = (i9 & 112) == 32 ? 1 : i5;
                Object objRememberedValue2 = composer2.rememberedValue();
                if (i10 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new bp(intentHandler, 27);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                int i11 = i4;
                composer3 = composer2;
                i8 = i9;
                i7 = i11;
                ChaloConfirmationDialogKt.b(null, str2, strC2, (Function0) objRememberedValue2, null, null, null, null, composer3, 0, 241);
            }
            composer3.endReplaceGroup();
            if (viewState.o) {
                composer3.startReplaceGroup(-126180418);
                String strC3 = StringResourcesHelperKt.c(StringEnum.PB_TICKET_THROUGH_PASS_UNCLEAR_STATUS_TITLE, new Object[0], composer3, 6);
                String strC4 = StringResourcesHelperKt.c(StringEnum.PB_TICKET_THROUGH_PASS_UNCLEAR_STATUS_SUBTITLE, new Object[0], composer3, 6);
                String strC5 = StringResourcesHelperKt.c(StringEnum.OK, new Object[0], composer3, 6);
                boolean z3 = (i8 & 112) == 32;
                Object objRememberedValue3 = composer3.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new d30(intentHandler, 0);
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                c = ' ';
                ChaloConfirmationDialogKt.b(strC3, strC4, strC5, (Function0) objRememberedValue3, null, null, new DialogProperties(false, false, false, 4, (DefaultConstructorMarker) null), null, composer3, 1572864, 176);
            } else {
                c = ' ';
                composer3.startReplaceGroup(i7);
            }
            composer3.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composer3, 0).t, null, 2, null), 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            int i12 = (int) ((currentCompositeKeyHashCode >>> c) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i12), composerM3915constructorimpl));
            Modifier.Companion companion4 = companion;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(dq.a(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            int i13 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c));
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i13), composerM3915constructorimpl2));
            SpacerKt.Spacer(PaddingKt.m786paddingVpY3zN4$default(SizeKt.m828size3ABfNKs(companion4, ChaloTheme.b(composer3, 0).g), ChaloTheme.b(composer3, 0).h, 0.0f, 2, null), composer3, 0);
            Composer composer4 = composer3;
            FareRouteAndStopDetailsViewKt.b(PaddingKt.m786paddingVpY3zN4$default(companion4, ChaloTheme.b(composer3, 0).h, 0.0f, 2, null), viewState.f3950a, viewState.g, viewState.b, viewState.c, viewState.l, viewState.t, viewState.w, zBooleanValue, composer4, 0, 0);
            composerStartRestartGroup = composer4;
            if (viewState.d) {
                composerStartRestartGroup.startReplaceGroup(-707632338);
                SpacerKt.Spacer(PaddingKt.m786paddingVpY3zN4$default(SizeKt.m828size3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, 0).i), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), composerStartRestartGroup, 0);
                FareDetailsShimmerViewKt.a(PaddingKt.m786paddingVpY3zN4$default(companion4, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                companion4 = companion4;
                i3 = 0;
                function1 = intentHandler;
            } else {
                composerStartRestartGroup.startReplaceGroup(-707222797);
                if (Intrinsics.d(fareDetailsScreenType, FareDetailsScreenType.InstantTicket.INSTANCE) || (fareDetailsScreenType instanceof FareDetailsScreenType.ONDCTicket)) {
                    composerStartRestartGroup.startReplaceGroup(-707076601);
                    if (z2 == 0) {
                        composerStartRestartGroup.startReplaceGroup(-706984159);
                        List list = viewState.h;
                        boolean z4 = viewState.m;
                        FareDetailsScreenType fareDetailsScreenType2 = viewState.n;
                        ApplicableRuleUxCopyAppModel.CheckoutScreen checkoutScreen = viewState.J;
                        ProductBookingBranding.Companion companion5 = ProductBookingBranding.INSTANCE;
                        i3 = 0;
                        e(null, list, z4, intentHandler, viewState.q, checkoutScreen, fareDetailsScreenType2, viewState.x, viewState.B, viewState.D, viewState.G, viewState.F, composerStartRestartGroup, (i8 << 6) & 7168, 0);
                        function1 = intentHandler;
                    } else {
                        i3 = 0;
                        function1 = intentHandler;
                        composerStartRestartGroup.startReplaceGroup(-713305586);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (fareDetailsScreenType != null) {
                        throw pk0.p(composerStartRestartGroup, 1778301679);
                    }
                    composerStartRestartGroup.startReplaceGroup(-705898260);
                    composerStartRestartGroup.endReplaceGroup();
                    companion4 = companion4;
                    i3 = 0;
                    function1 = intentHandler;
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (z2 == 0) {
                composerStartRestartGroup.startReplaceGroup(529705049);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, i3);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3);
                int i14 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier.Companion companion6 = companion4;
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion6);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i14), composerM3915constructorimpl3));
                ShadowElementKt.a(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), ChaloTheme.c(composerStartRestartGroup, i3).d), 0L, 0L, composerStartRestartGroup, 0, 6);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                CardElevation cardElevationM1695cardElevationaqJV_2Y = CardDefaults.INSTANCE.m1695cardElevationaqJV_2Y(ChaloTheme.c(composerStartRestartGroup, i3).f1917a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, CardDefaults.$stable << 18, 62);
                composerStartRestartGroup = composerStartRestartGroup;
                fareDetailsViewState = viewState;
                CardKt.Card(modifierFillMaxWidth$default, null, null, cardElevationM1695cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(-1108561238, true, new d0(28, fareDetailsViewState, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 22);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                fareDetailsViewState = viewState;
                if (z2) {
                    composerStartRestartGroup.startReplaceGroup(531100390);
                    int i15 = (i8 & 112) == 32 ? 1 : i3;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (i15 != 0 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new d30(function1, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    c((Function0) objRememberedValue4, composerStartRestartGroup, i3);
                } else {
                    composerStartRestartGroup.startReplaceGroup(522144056);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            fareDetailsViewState = viewState;
            function1 = intentHandler;
            i3 = 0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f30(fareDetailsViewState, function1, i, i3));
        }
    }

    public static final void c(Function0 onActionClicked, Composer composer, int i) {
        int i2;
        Function0 function0;
        Intrinsics.i(onActionClicked, "onActionClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1312420999);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onActionClicked) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1312420999, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsSnackBar (FareDetailsMainScreen.kt:465)");
            }
            String strC = StringResourcesHelperKt.c(StringEnum.FETCHING_MTICKET_DATA_FAILED, new Object[0], composerStartRestartGroup, 6);
            String upperCase = StringResourcesHelperKt.c(StringEnum.RETRY, new Object[0], composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
            Intrinsics.h(upperCase, "toUpperCase(...)");
            function0 = onActionClicked;
            ChaloSnackbarKt.a(null, strC, upperCase, function0, composerStartRestartGroup, (i2 << 9) & 7168, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function0 = onActionClicked;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 8, function0));
        }
    }

    public static final void d(Modifier modifier, List tncList, Function0 onPositiveBtnClick, Composer composer, int i) {
        int i2;
        Intrinsics.i(tncList, "tncList");
        Intrinsics.i(onPositiveBtnClick, "onPositiveBtnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1191812976);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(tncList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPositiveBtnClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1191812976, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsTncDialogue (FareDetailsMainScreen.kt:478)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wb(8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, new DialogProperties(false, false, false, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-229534311, true, new h5(4, modifier, onPositiveBtnClick, tncList), composerStartRestartGroup, 54), composerStartRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 7, modifier, tncList, onPositiveBtnClick));
        }
    }

    public static final void e(Modifier modifier, final List passengerFareDetailsUiModelList, final boolean z, final Function1 intentHandler, final boolean z2, final ApplicableRuleUxCopyAppModel.CheckoutScreen checkoutScreen, final FareDetailsScreenType screenType, final boolean z3, final String str, final ProductBookingBranding brandingType, final PassengerSelectionPolicy passengerSelectionPolicy, final String str2, Composer composer, final int i, final int i2) {
        boolean z4;
        int i3;
        int i4;
        final Modifier modifier2;
        Function1 function1;
        Modifier.Companion companion;
        int i5;
        Composer composer2;
        Intrinsics.i(passengerFareDetailsUiModelList, "passengerFareDetailsUiModelList");
        Intrinsics.i(intentHandler, "intentHandler");
        Intrinsics.i(screenType, "screenType");
        Intrinsics.i(brandingType, "brandingType");
        Intrinsics.i(passengerSelectionPolicy, "passengerSelectionPolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(2023391617);
        int i6 = i | 6;
        if ((i & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(passengerFareDetailsUiModelList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(intentHandler) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z4 = z2;
            i6 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
        } else {
            z4 = z2;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(checkoutScreen) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i6 |= composerStartRestartGroup.changed(screenType) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 = 32;
            i6 |= composerStartRestartGroup.changed(str) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            i3 = 32;
        }
        if ((i & 805306368) == 0) {
            i6 |= (i & 1073741824) == 0 ? composerStartRestartGroup.changed(brandingType) : composerStartRestartGroup.changedInstance(brandingType) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(passengerSelectionPolicy.ordinal()) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? i3 : 16;
        }
        if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true, i6 & 1)) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2023391617, i6, i4, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsViewContainer (FareDetailsMainScreen.kt:219)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, companion3.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> i3));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Modifier.Companion companion5 = companion2;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (checkoutScreen == null) {
                composerStartRestartGroup.startReplaceGroup(267949783);
                composerStartRestartGroup.endReplaceGroup();
                function1 = intentHandler;
            } else {
                composerStartRestartGroup.startReplaceGroup(267949784);
                Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(companion5, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
                boolean z5 = (i6 & 7168) == 2048;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    function1 = intentHandler;
                    objRememberedValue = new bp(function1, 28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    function1 = intentHandler;
                }
                a(modifierM264backgroundbw27NRU$default, checkoutScreen, (Function0) objRememberedValue, composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion5, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                companion5 = companion5;
                SpacerKt.Spacer(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(companion5, ChaloTheme.a(composerStartRestartGroup, 0).Y, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).f), 0.0f, 1, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str3 = (str2 == null || StringsKt.F(str2)) ? null : str2;
            if (str3 == null) {
                composerStartRestartGroup.startReplaceGroup(268685878);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                i5 = i4;
                companion = companion5;
            } else {
                composerStartRestartGroup.startReplaceGroup(268685879);
                companion = companion5;
                String str4 = str3;
                SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(PaddingKt.m788paddingqDBjuR0$default(companion5, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).i, 0.0f, 0.0f, 13, null), ChaloTheme.b(composerStartRestartGroup, 0).f), 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).Y, null, 2, null), composerStartRestartGroup, 0);
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> i3));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
                ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).i, composerStartRestartGroup, 0);
                i5 = i4;
                composer2 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.FARE_DETAILS_HEADING, new Object[0], composerStartRestartGroup, 6), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0))), composer2, 48, 0, 131068);
                ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).d, composerStartRestartGroup, 0);
                TextKt.m2623TextNvy7gAk(str4, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(ChaloColorToken.ShadyGray.f9851a), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 48, 0, 131064);
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            int i9 = i6 >> 3;
            ProductBookingBranding.Companion companion6 = ProductBookingBranding.INSTANCE;
            Modifier.Companion companion7 = companion;
            composerStartRestartGroup = composer2;
            f(passengerFareDetailsUiModelList, z, function1, screenType, companion7, z4, z3, str, brandingType, passengerSelectionPolicy, composerStartRestartGroup, ((i5 << 27) & 1879048192) | (i9 & 234881024) | (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | ((i6 >> 9) & 7168) | (458752 & (i6 << 3)) | (3670016 & i9) | (29360128 & i9));
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion7, ChaloTheme.b(composerStartRestartGroup, 0).u), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion7;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: b30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    FareDetailsMainScreenKt.e(modifier2, passengerFareDetailsUiModelList, z, intentHandler, z2, checkoutScreen, screenType, z3, str, brandingType, passengerSelectionPolicy, str2, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void f(final List passengerFareDetailsUiModelList, final boolean z, final Function1 intentChannel, final FareDetailsScreenType screenType, final Modifier modifier, final boolean z2, final boolean z3, final String str, ProductBookingBranding brandingType, final PassengerSelectionPolicy passengerSelectionPolicy, Composer composer, final int i) {
        int i2;
        ProductBookingBranding productBookingBranding;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        int i5;
        Intrinsics.i(passengerFareDetailsUiModelList, "passengerFareDetailsUiModelList");
        Intrinsics.i(intentChannel, "intentChannel");
        Intrinsics.i(screenType, "screenType");
        Intrinsics.i(brandingType, "brandingType");
        Intrinsics.i(passengerSelectionPolicy, "passengerSelectionPolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(-240378568);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(passengerFareDetailsUiModelList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(intentChannel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(screenType) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? composerStartRestartGroup.changed(brandingType) : composerStartRestartGroup.changedInstance(brandingType) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(passengerSelectionPolicy.ordinal()) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i2) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-240378568, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.PassengerAndFareBreakupSection (FareDetailsMainScreen.kt:379)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            boolean zChanged = ((i2 & 7168) == 2048) | composerStartRestartGroup.changed(passengerFareDetailsUiModelList);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (screenType instanceof FareDetailsScreenType.ONDCTicket) {
                    z4 = true;
                    z5 = true;
                } else {
                    if (!screenType.equals(FareDetailsScreenType.InstantTicket.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (passengerFareDetailsUiModelList.size() == 1) {
                        List list = passengerFareDetailsUiModelList;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z4 = true;
                                    z6 = false;
                                    break;
                                } else {
                                    z4 = true;
                                    if (((PassengerFareDetailsUiModel) it.next()).j > 1) {
                                        z6 = true;
                                        break;
                                    }
                                }
                            }
                        } else {
                            z6 = false;
                            z4 = true;
                        }
                        if (!z6) {
                            z5 = false;
                        }
                    } else {
                        z4 = true;
                    }
                    z5 = z4;
                }
                objRememberedValue = Boolean.valueOf(z5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                z4 = true;
            }
            if (((Boolean) objRememberedValue).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1589840561);
                Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).i, 0.0f, 0.0f, 13, null);
                int i7 = i2 & 896;
                boolean z7 = i7 == 256 ? z4 : false;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z7 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new nu(intentChannel, 6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                boolean z8 = i7 == 256 ? z4 : false;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z8 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new nu(intentChannel, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function1 function2 = (Function1) objRememberedValue3;
                boolean z9 = i7 == 256 ? z4 : false;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z9 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new nu(intentChannel, 8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                i4 = -1605852588;
                i3 = 6;
                PassengerDetailsViewKt.b(modifierM788paddingqDBjuR0$default, passengerFareDetailsUiModelList, z, passengerSelectionPolicy, function1, function2, (Function1) objRememberedValue4, composerStartRestartGroup, ((i2 >> 18) & 7168) | ((i2 << 3) & 1008));
            } else {
                i3 = 6;
                i4 = -1605852588;
                composerStartRestartGroup.startReplaceGroup(-1605852588);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(-1588756120);
                composerStartRestartGroup.endReplaceGroup();
                productBookingBranding = brandingType;
                i5 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1588756119);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                i5 = 0;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                productBookingBranding = brandingType;
                ChaloAlertTextKt.a(PaddingKt.m786paddingVpY3zN4$default(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), str, null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0.0f, 0.0f, composerStartRestartGroup, 0, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (z3) {
                composerStartRestartGroup.startReplaceGroup(-1588435703);
                FareBreakupSectionKt.c(passengerFareDetailsUiModelList, composerStartRestartGroup, i2 & 14);
            } else {
                composerStartRestartGroup.startReplaceGroup(i4);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-1588319825);
                SpacerKt.Spacer(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, i5).f), ChaloTheme.a(composerStartRestartGroup, i5).Y, null, 2, null), 0.0f, 1, null), composerStartRestartGroup, i5);
                int i8 = (i2 & 896) == 256 ? 1 : i5;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (i8 != 0 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new bp(intentChannel, 29);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                ChaloTncSectionKt.a(i5, composerStartRestartGroup, null, (Function0) objRememberedValue5);
            } else {
                composerStartRestartGroup.startReplaceGroup(i4);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (productBookingBranding.equals(ProductBookingBranding.None.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(i4);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1587817997);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, i5).l + ChaloTheme.b(composerStartRestartGroup, i5).d)), composerStartRestartGroup, i5);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                ProductBookingBranding.Companion companion4 = ProductBookingBranding.INSTANCE;
                ProductBookingBrandingKt.a(modifierFillMaxWidth$default, productBookingBranding, composerStartRestartGroup, i3 | ((i2 >> 21) & 112));
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, i5).h), composerStartRestartGroup, i5);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            productBookingBranding = brandingType;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ProductBookingBranding productBookingBranding2 = productBookingBranding;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: c30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    FareDetailsMainScreenKt.f(passengerFareDetailsUiModelList, z, intentChannel, screenType, modifier, z2, z3, str, productBookingBranding2, passengerSelectionPolicy, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void g(int i, int i2, Composer composer, Modifier modifier, String str) {
        Composer composer2;
        Modifier modifier2;
        String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2061408268);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2061408268, i3, -1, "app.chalo.instantticket.ui.faredetails.compose.TextItemWithCount (FareDetailsMainScreen.kt:527)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(cb0.h(i, CLConstants.DOT_SALT_DELIMETER), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
            TextStyle textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0));
            composer2 = composerStartRestartGroup;
            str2 = str;
            TextKt.m2623TextNvy7gAk(str2, null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleC, composer2, (i3 >> 6) & 14, 0, 131066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new e30(modifier2, i, str2, i2));
        }
    }
}
