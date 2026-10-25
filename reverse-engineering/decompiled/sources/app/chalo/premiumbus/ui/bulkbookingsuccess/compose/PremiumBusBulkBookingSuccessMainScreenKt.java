package app.chalo.premiumbus.ui.bulkbookingsuccess.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PassInfoUISpecs;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PassInfoUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationViewState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.RouteDetailInfoUISpec;
import app.chalo.premiumbus.ui.bulkbookingsuccess.RouteDetailInfoUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.SlotAndSeatInfoUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.SlotDatePillUISpecs;
import app.chalo.premiumbus.ui.bulkbookingsuccess.SlotDatePillUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.TermsAndConditionsBottomSheetUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.TermsAndConditionsUISpecs;
import app.chalo.premiumbus.ui.bulkbookingsuccess.TermsAndConditionsUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.text.TextUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.b3;
import defpackage.dq;
import defpackage.eq0;
import defpackage.gf;
import defpackage.kn0;
import defpackage.la0;
import defpackage.lf;
import defpackage.pk0;
import defpackage.r1;
import defpackage.t8;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationViewState;", "viewState", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusBulkBookingSuccessMainScreenKt {
    public static final void a(PassInfoUIState passInfoUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1654559448);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(passInfoUIState) : composerStartRestartGroup.changedInstance(passInfoUIState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1654559448, i2, -1, "app.chalo.premiumbus.ui.bulkbookingsuccess.compose.PassDataCard (PremiumBusBulkBookingSuccessMainScreen.kt:326)");
            }
            boolean zChanged = composerStartRestartGroup.changed(passInfoUIState.f7494a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = passInfoUIState.f7494a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PassInfoUISpecs passInfoUISpecs = (PassInfoUISpecs) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            ChaloPadding chaloPadding = passInfoUISpecs.f7493a;
            UIShape uIShape = passInfoUISpecs.f;
            Modifier modifierC = ChaloThemeKt.c(modifierFillMaxWidth$default, chaloPadding);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, passInfoUIState.b, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, passInfoUISpecs.c), composerStartRestartGroup, 0);
            Modifier modifierClip = ClipKt.clip(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(passInfoUISpecs.g), ChaloThemeKt.d(uIShape)), ChaloThemeKt.d(uIShape));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClip);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_PASS_BACKGROUND_BRUSH, composerStartRestartGroup, 6), (String) null, BoxScopeInstance.INSTANCE.align(companion, companion2.getBottomEnd()), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            Modifier modifierC2 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), passInfoUISpecs.b);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) ((currentCompositeKeyHashCode4 >>> 32) ^ currentCompositeKeyHashCode4);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
            ChaloTextViewKt.a(null, passInfoUIState.c, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, passInfoUISpecs.d), composerStartRestartGroup, 0);
            FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, companion2.getCenterVertically(), 0, 0, ComposableLambdaKt.rememberComposableLambda(-788021387, true, new la0(passInfoUIState, 17), composerStartRestartGroup, 54), composerStartRestartGroup, 1575942, 54);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, passInfoUISpecs.e), composerStartRestartGroup, 0);
            TextKt.c(passInfoUIState.f, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(passInfoUIState, i, 8));
        }
    }

    public static final void b(PremiumBusBulkBookingConfirmationViewState premiumBusBulkBookingConfirmationViewState, SheetState sheetState, Composer composer, int i) {
        ButtonUIState buttonUIState;
        TermsAndConditionsBottomSheetUIState termsAndConditionsBottomSheetUIState;
        List list;
        PassInfoUIState passInfoUIState;
        int i2;
        Continuation continuation;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1523308250);
        int i3 = (i & 6) == 0 ? i | (composerStartRestartGroup.changedInstance(premiumBusBulkBookingConfirmationViewState) ? 4 : 2) : i;
        int i4 = 16;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(sheetState) ? 32 : 16;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1523308250, i5, -1, "app.chalo.premiumbus.ui.bulkbookingsuccess.compose.PremiumBusBulkBookingConfirmationContent (PremiumBusBulkBookingSuccessMainScreen.kt:76)");
            }
            RouteDetailInfoUIState routeDetailInfoUIState = premiumBusBulkBookingConfirmationViewState.b;
            ButtonUIState buttonUIState2 = premiumBusBulkBookingConfirmationViewState.e;
            TermsAndConditionsBottomSheetUIState termsAndConditionsBottomSheetUIState2 = premiumBusBulkBookingConfirmationViewState.h;
            List list2 = premiumBusBulkBookingConfirmationViewState.c;
            PassInfoUIState passInfoUIState2 = premiumBusBulkBookingConfirmationViewState.d;
            if (termsAndConditionsBottomSheetUIState2 != null) {
                i2 = 32;
                composerStartRestartGroup.startReplaceGroup(-251234527);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(premiumBusBulkBookingConfirmationViewState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new kn0(premiumBusBulkBookingConfirmationViewState, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                passInfoUIState = passInfoUIState2;
                buttonUIState = buttonUIState2;
                termsAndConditionsBottomSheetUIState = termsAndConditionsBottomSheetUIState2;
                list = list2;
                ChaloRoundedBottomSheetKt.a(sheetState, (Function0) objRememberedValue, false, false, false, ComposableLambdaKt.rememberComposableLambda(-544596377, true, new la0(premiumBusBulkBookingConfirmationViewState, i4), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            } else {
                buttonUIState = buttonUIState2;
                termsAndConditionsBottomSheetUIState = termsAndConditionsBottomSheetUIState2;
                list = list2;
                passInfoUIState = passInfoUIState2;
                i2 = 32;
                composerStartRestartGroup.startReplaceGroup(-255139876);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> i2));
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(premiumBusBulkBookingConfirmationViewState.f7502a, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> i2));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            ChaloColorToken.LightGrey lightGrey = ChaloColorToken.LightGrey.f9815a;
            if (routeDetailInfoUIState == 0) {
                composerStartRestartGroup.startReplaceGroup(-1617089536);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1617089535);
                d(routeDetailInfoUIState, composerStartRestartGroup, 0);
                SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m786paddingVpY3zN4$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloThemeHelper.a().b), ChaloThemeHelper.a().h, 0.0f, 2, null), ChaloColorTokenKt.c(lightGrey), null, 2, null), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            List list3 = list;
            if (list3 == null) {
                composerStartRestartGroup.startReplaceGroup(-1616633681);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1616633680);
                f(0, composerStartRestartGroup, PaddingKt.m784padding3ABfNKs(companion, ChaloThemeHelper.a().h), list3);
            }
            composerStartRestartGroup.endReplaceGroup();
            PassInfoUIState passInfoUIState3 = passInfoUIState;
            if (passInfoUIState3 == null) {
                composerStartRestartGroup.startReplaceGroup(-1616380752);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1616380751);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).i, 5, null), ChaloColorTokenKt.c(lightGrey), null, 2, null), ChaloThemeHelper.a().f), composerStartRestartGroup, 0);
                UIShape.Rectangle rectangle = UIShape.f1926a;
                a(passInfoUIState3, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).i, 1, null), ChaloColorTokenKt.c(lightGrey), null, 2, null), ChaloThemeHelper.a().f), composerStartRestartGroup, 0);
            TermsAndConditionsUIState termsAndConditionsUIState = premiumBusBulkBookingConfirmationViewState.g;
            if (termsAndConditionsUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1615552494);
                composerStartRestartGroup.endReplaceGroup();
                continuation = null;
            } else {
                List list4 = termsAndConditionsUIState.c;
                Object obj = termsAndConditionsUIState.f7510a;
                composerStartRestartGroup.startReplaceGroup(-1615552493);
                boolean zChanged = composerStartRestartGroup.changed(obj);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue2;
                }
                TermsAndConditionsUISpecs termsAndConditionsUISpecs = (TermsAndConditionsUISpecs) obj;
                Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), termsAndConditionsUISpecs.f7509a);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> i2));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
                continuation = null;
                ChaloTextViewKt.a(null, termsAndConditionsUIState.b, null, null, composerStartRestartGroup, 0, 13);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, termsAndConditionsUISpecs.b), composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> i2));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
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
                pk0.v(companion3, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i9), composerM3915constructorimpl4));
                composerStartRestartGroup.startReplaceGroup(1121659760);
                int i10 = 0;
                for (Object obj2 : list4) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    ChaloTextViewKt.a(null, (TextUIState.ChaloTextUIState) obj2, null, null, composerStartRestartGroup, 0, 13);
                    if (i10 != CollectionsKt.K(list4)) {
                        composerStartRestartGroup.startReplaceGroup(805683610);
                        gf.r(Modifier.INSTANCE, termsAndConditionsUISpecs.c, composerStartRestartGroup, 0);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(798952053);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    i10 = i11;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                ChaloSpacersKt.f(composerStartRestartGroup, 0);
                TextKt.b(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), termsAndConditionsUISpecs.f7509a), termsAndConditionsUIState.d, composerStartRestartGroup, 0, 0);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (buttonUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1699824976);
                composerStartRestartGroup.endReplaceGroup();
                z = true;
            } else {
                composerStartRestartGroup.startReplaceGroup(1699824977);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, continuation), ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i12 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> i2));
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
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
                pk0.v(companion5, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy5, composerM3915constructorimpl5, currentCompositionLocalMap5);
                Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl5, Integer.valueOf(i12), composerM3915constructorimpl5));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                z = true;
                ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, continuation), buttonUIState);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            LoadingDialogUIState loadingDialogUIState = premiumBusBulkBookingConfirmationViewState.f;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-247377911);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -247377910, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(premiumBusBulkBookingConfirmationViewState) | ((i5 & 112) == i2 ? z : false);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new PremiumBusBulkBookingSuccessMainScreenKt$PremiumBusBulkBookingConfirmationContent$5$1(premiumBusBulkBookingConfirmationViewState, sheetState, continuation);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(termsAndConditionsBottomSheetUIState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(premiumBusBulkBookingConfirmationViewState, sheetState, i, 10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(889625071);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusBulkBookingConfirmationComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(889625071, i2, -1, "app.chalo.premiumbus.ui.bulkbookingsuccess.compose.PremiumBusBulkBookingConfirmationMainScreen (PremiumBusBulkBookingSuccessMainScreen.kt:62)");
            }
            b((PremiumBusBulkBookingConfirmationViewState) SubscribeAsStateKt.a(premiumBusBulkBookingConfirmationComponent.t0(), composerStartRestartGroup).getValue(), ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(premiumBusBulkBookingConfirmationComponent, i, 4));
        }
    }

    public static final void d(RouteDetailInfoUIState routeDetailInfoUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1274233965);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(routeDetailInfoUIState) : composerStartRestartGroup.changedInstance(routeDetailInfoUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1274233965, i2, -1, "app.chalo.premiumbus.ui.bulkbookingsuccess.compose.RouteDetailSection (PremiumBusBulkBookingSuccessMainScreen.kt:223)");
            }
            boolean zChanged = composerStartRestartGroup.changed(routeDetailInfoUIState.f7504a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = routeDetailInfoUIState.f7504a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            RouteDetailInfoUISpec routeDetailInfoUISpec = (RouteDetailInfoUISpec) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierHeight = IntrinsicKt.height(ChaloThemeKt.c(companion, routeDetailInfoUISpec.f7503a), IntrinsicSize.Min);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            FromAndToStopDetailViewKt.e(0.0f, routeDetailInfoUISpec.d, composerStartRestartGroup, 0, 1);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, routeDetailInfoUISpec.c), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, routeDetailInfoUIState.b, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, routeDetailInfoUISpec.b), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, routeDetailInfoUIState.c, null, null, composerStartRestartGroup, 0, 13);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(routeDetailInfoUIState, i, 9));
        }
    }

    public static final void e(SlotAndSeatInfoUIState slotAndSeatInfoUIState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2066107217);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(slotAndSeatInfoUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2066107217, i2, -1, "app.chalo.premiumbus.ui.bulkbookingsuccess.compose.SlotAndSeatInfoItem (PremiumBusBulkBookingSuccessMainScreen.kt:270)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            CommonImageKt.a(slotAndSeatInfoUIState.f7505a, null, false, composerStartRestartGroup, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, slotAndSeatInfoUIState.b, null, null, composerStartRestartGroup, 0, 13);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, slotAndSeatInfoUIState.g), composer2, 0);
            if (slotAndSeatInfoUIState.c == null) {
                composer2.startReplaceGroup(-514742404);
            } else {
                composer2.startReplaceGroup(-514742403);
                CommonImageKt.a(slotAndSeatInfoUIState.d, null, false, composer2, 0, 6);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composer2, 0).c), composer2, 0);
                ChaloTextViewKt.a(null, slotAndSeatInfoUIState.c, null, null, composer2, 0, 13);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            ChaloSpacersKt.o(composer2, 0);
            if (slotAndSeatInfoUIState.e.isEmpty()) {
                composer2.startReplaceGroup(-2022617120);
                TextUIState.ChaloTextUIState chaloTextUIState = slotAndSeatInfoUIState.f;
                if (chaloTextUIState == null) {
                    composer2.startReplaceGroup(-2022617121);
                } else {
                    composer2.startReplaceGroup(-2022617120);
                    Composer composer3 = composer2;
                    ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer3, 0, 13);
                    composer2 = composer3;
                }
                composer2.endReplaceGroup();
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-2023041014);
                Composer composer4 = composer2;
                FlowLayoutKt.FlowRow(null, arrangement.m672spacedBy0680j_4(ChaloTheme.b(composer2, 0).d), arrangement.m672spacedBy0680j_4(ChaloTheme.b(composer2, 0).f), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-1897833307, true, new la0(slotAndSeatInfoUIState, 18), composer2, 54), composer4, 1572864, 57);
                composer2 = composer4;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(slotAndSeatInfoUIState, i, 5));
        }
    }

    public static final void f(int i, Composer composer, Modifier modifier, List list) {
        Composer composerStartRestartGroup = composer.startRestartGroup(707168023);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(707168023, i2, -1, "app.chalo.premiumbus.ui.bulkbookingsuccess.compose.SlotAndSeatSection (PremiumBusBulkBookingSuccessMainScreen.kt:250)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            composerStartRestartGroup.startReplaceGroup(1637602153);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                e((SlotAndSeatInfoUIState) obj, composerStartRestartGroup, 0);
                if (i4 != CollectionsKt.K(list)) {
                    composerStartRestartGroup.startReplaceGroup(84486922);
                    ChaloSpacersKt.o(composerStartRestartGroup, 0);
                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloThemeHelper.a().b), ChaloColorTokenKt.c(ChaloColorToken.LightGray.f9814a), null, 2, null), composerStartRestartGroup, 0);
                    ChaloSpacersKt.o(composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(74564783);
                }
                composerStartRestartGroup.endReplaceGroup();
                i4 = i5;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lf(modifier, list, i, 2));
        }
    }

    public static final void g(SlotDatePillUIState slotDatePillUIState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(280254868);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(slotDatePillUIState) : composerStartRestartGroup.changedInstance(slotDatePillUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(280254868, i2, -1, "app.chalo.premiumbus.ui.bulkbookingsuccess.compose.SlotDatePill (PremiumBusBulkBookingSuccessMainScreen.kt:307)");
            }
            boolean zChanged = composerStartRestartGroup.changed(slotDatePillUIState.f7507a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = slotDatePillUIState.f7507a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SlotDatePillUISpecs slotDatePillUISpecs = (SlotDatePillUISpecs) objRememberedValue;
            Modifier modifierC = ChaloThemeKt.c(BorderUISpecKt.a(ClipKt.clip(Modifier.INSTANCE, ChaloThemeKt.d(slotDatePillUISpecs.c.c)), slotDatePillUISpecs.c), slotDatePillUISpecs.f7506a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(slotDatePillUISpecs.b), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, slotDatePillUIState.b, null, null, composerStartRestartGroup, 0, 13);
            CommonImageKt.a(slotDatePillUIState.c, null, false, composerStartRestartGroup, 0, 6);
            composer2 = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(slotDatePillUIState, i, 6));
        }
    }

    public static final void h(TermsAndConditionsBottomSheetUIState uiState, Composer composer, int i) {
        Intrinsics.i(uiState, "uiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-526096196);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(uiState) ? 4 : 2) | i : i;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526096196, i2, -1, "app.chalo.premiumbus.ui.bulkbookingsuccess.compose.TermsAndConditionsBottomSheet (PremiumBusBulkBookingSuccessMainScreen.kt:202)");
            }
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), uiState.f7508a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            ChaloTextViewKt.a(null, uiState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-995848940);
            ArrayList arrayList = uiState.d;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ChaloTextViewKt.a(null, (TextUIState.ChaloTextUIState) arrayList.get(i4), null, null, composerStartRestartGroup, 0, 13);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            if (b3.s(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), uiState.c)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(uiState, i, 7));
        }
    }
}
