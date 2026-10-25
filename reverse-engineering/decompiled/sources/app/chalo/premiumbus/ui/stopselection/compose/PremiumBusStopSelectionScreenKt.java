package app.chalo.premiumbus.ui.stopselection.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.TextAlign;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.premiumbus.compose.TitleWithVerticalCardsSheetContentKt;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModelKt;
import app.chalo.premiumbus.ui.stopselection.FromAndToStopCardData;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.dialog.DatePickerUIState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.ar0;
import defpackage.bu0;
import defpackage.c0;
import defpackage.dq;
import defpackage.dw0;
import defpackage.er;
import defpackage.ew0;
import defpackage.g2;
import defpackage.gw0;
import defpackage.hw0;
import defpackage.i41;
import defpackage.ju0;
import defpackage.kb;
import defpackage.ll;
import defpackage.pk0;
import defpackage.sn0;
import defpackage.t20;
import defpackage.u6;
import defpackage.w8;
import defpackage.wm0;
import defpackage.zv0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusStopSelectionScreenKt {
    public static final void a(Function0 onOkayBtnClick, Composer composer, int i) {
        int i2;
        Function0 function0;
        Composer composer2;
        Intrinsics.i(onOkayBtnClick, "onOkayBtnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1662461897);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(onOkayBtnClick) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1662461897, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.NewRouteSuggestionSuccessBottomSheetContent (PremiumBusStopSelectionScreen.kt:678)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.ACKNOWLEDGEMENT_PASS_TICKET, composerStartRestartGroup, 6), "", (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 108);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.SUGGESTION_NOTED_TITLE, new Object[0], composerStartRestartGroup, 6);
            TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
            long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            TextKt.m2623TextNvy7gAk(strC, null, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion3.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleF, composerStartRestartGroup, 0, 0, 130042);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SUGGESTION_NOTED_DESC, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion3.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 130042);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            String strC2 = StringResourcesHelperKt.c(StringEnum.OKAY_RUNNING_CASE, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                function0 = onOkayBtnClick;
                objRememberedValue = new ar0(function0, 15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                function0 = onOkayBtnClick;
            }
            composer2 = composerStartRestartGroup;
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC2, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue, composer2, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function0 = onOkayBtnClick;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 13, function0));
        }
    }

    public static final void b(Modifier modifier, String str, TextStyle textStyle, String labelText, TextStyle textStyle2, Function0 onClick, Composer composer, int i, int i2) {
        int i3;
        TextStyle textStyleF;
        TextStyle textStyleL;
        Composer composer2;
        TextStyle textStyle3;
        TextStyle textStyle4;
        Object textFieldValue;
        Intrinsics.i(labelText, "labelText");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-640274421);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                textStyleF = textStyle;
                int i4 = composerStartRestartGroup.changed(textStyleF) ? 256 : 128;
                i3 |= i4;
            } else {
                textStyleF = textStyle;
            }
            i3 |= i4;
        } else {
            textStyleF = textStyle;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(labelText) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                textStyleL = textStyle2;
                int i5 = composerStartRestartGroup.changed(textStyleL) ? 16384 : 8192;
                i3 |= i5;
            } else {
                textStyleL = textStyle2;
            }
            i3 |= i5;
        } else {
            textStyleL = textStyle2;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
                    i3 &= -897;
                }
                if ((i2 & 16) != 0) {
                    textStyleL = ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0));
                    i3 &= -57345;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
            }
            TextStyle textStyle5 = textStyleF;
            int i6 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-640274421, i6, -1, "app.chalo.premiumbus.ui.stopselection.compose.PBStopSelectionField (PremiumBusStopSelectionScreen.kt:453)");
            }
            boolean z = (i6 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                textFieldValue = new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null);
                composerStartRestartGroup.updateRememberedValue(textFieldValue);
            } else {
                textFieldValue = objRememberedValue;
            }
            TextFieldValue textFieldValue2 = (TextFieldValue) textFieldValue;
            TextStyle textStyle6 = textStyleL;
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifier, RippleEffectKt.b(composerStartRestartGroup), RippleEffectKt.a(composerStartRestartGroup), false, null, null, onClick, 28, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new zv0(13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            ChaloTextFieldKt.a(textFieldValue2, (Function1) objRememberedValue2, modifierM295clickableO2vRcR0$default, false, true, textStyle5, ComposableLambdaKt.rememberComposableLambda(1988507242, true, new ll(labelText, textStyle6, 2), composerStartRestartGroup, 54), null, null, null, false, null, null, null, false, 0, null, null, null, null, composer2, ((i6 << 9) & 458752) | 1600560, 0, 1048448);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle4 = textStyle6;
            textStyle3 = textStyle5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            textStyle3 = textStyleF;
            textStyle4 = textStyleL;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w8(modifier, str, textStyle3, labelText, textStyle4, onClick, i, i2, 3));
        }
    }

    public static final void c(PremiumBusStopSelectionViewState viewState, TimeUtilsContract timeUtilsContract, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(viewState, "viewState");
        DatePickerUIState datePickerUIState = viewState.m;
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-734259050);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(timeUtilsContract) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-734259050, i3, -1, "app.chalo.premiumbus.ui.stopselection.compose.PbSlotSelectionScreen (PremiumBusStopSelectionScreen.kt:260)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Boolean bool = viewState.f7986a;
            if (Intrinsics.d(bool, Boolean.TRUE)) {
                composerStartRestartGroup.startReplaceGroup(-539146659);
                PremiumBusLandingScreenKt.a(viewState, sendIntent, SizeKt.fillMaxWidth$default(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112));
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else if (Intrinsics.d(bool, Boolean.FALSE)) {
                composerStartRestartGroup.startReplaceGroup(-538837465);
                String str = viewState.l;
                if (str == null) {
                    str = "";
                }
                composer2 = composerStartRestartGroup;
                PremiumBusLandingScreenKt.d(null, sendIntent, false, false, str, 0L, composer2, (i3 >> 3) & 112, 45);
                i(viewState, timeUtilsContract, sendIntent, BackgroundKt.m264backgroundbw27NRU$default(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), ChaloTheme.a(composer2, 0).A, null, 2, null), composer2, i3 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                composer2.endReplaceGroup();
            } else {
                composer2 = composerStartRestartGroup;
                if (bool != null) {
                    throw pk0.p(composer2, 813890703);
                }
                composer2.startReplaceGroup(-538309132);
                composer2.endReplaceGroup();
            }
            if (datePickerUIState != null) {
                composer2.startReplaceGroup(-538244590);
                ChaloDatePickerKt.b(datePickerUIState, composer2, 0);
            } else {
                composer2.startReplaceGroup(-551661514);
            }
            composer2.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 24, viewState, timeUtilsContract, sendIntent));
        }
    }

    public static final void d(String str, String str2, Function1 onStopSelectionFieldClicked, Function0 onSubmitBtnClick, Function0 onCancelBtnClick, Function0 onCloseBottomSheet, Composer composer, int i) {
        int i2;
        Intrinsics.i(onStopSelectionFieldClicked, "onStopSelectionFieldClicked");
        Intrinsics.i(onSubmitBtnClick, "onSubmitBtnClick");
        Intrinsics.i(onCancelBtnClick, "onCancelBtnClick");
        Intrinsics.i(onCloseBottomSheet, "onCloseBottomSheet");
        Composer composerStartRestartGroup = composer.startRestartGroup(1595434625);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onStopSelectionFieldClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSubmitBtnClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCancelBtnClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCloseBottomSheet) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1595434625, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusNewRouteSuggestionBottomSheet (PremiumBusStopSelectionScreen.kt:583)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 0.0f, 13, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM788paddingqDBjuR0$default);
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
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            int i5 = i2;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SUGGEST_STOPS, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0))), composerStartRestartGroup, 0, 0, 131066);
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h);
            boolean z = (458752 & i5) == 131072;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ar0(onCloseBottomSheet, 16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_CLOSE, composerStartRestartGroup, 6), "", ClickableKt.m299clickableoSLSa3U$default(modifierM828size3ABfNKs, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, composerStartRestartGroup, Painter.$stable | 48, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            String str3 = str == null ? "" : str;
            TextStyle textStyleK = ChaloTypographyKt.k(ChaloTheme.e(composerStartRestartGroup, 0));
            String strC = StringResourcesHelperKt.c(StringEnum.PICKUP_STOP, new Object[0], composerStartRestartGroup, 6);
            TextStyle textStyleD = ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0));
            Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            int i6 = i5 & 896;
            boolean z2 = i6 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ju0(onStopSelectionFieldClicked, 26);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            b(modifierM786paddingVpY3zN4$default2, str3, textStyleK, strC, textStyleD, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            String str4 = str2 == null ? "" : str2;
            TextStyle textStyleK2 = ChaloTypographyKt.k(ChaloTheme.e(composerStartRestartGroup, 0));
            String strC2 = StringResourcesHelperKt.c(StringEnum.DROPOFF_STOP, new Object[0], composerStartRestartGroup, 6);
            TextStyle textStyleD2 = ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0));
            Modifier modifierM786paddingVpY3zN4$default3 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            boolean z3 = i6 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new ju0(onStopSelectionFieldClicked, 27);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            b(modifierM786paddingVpY3zN4$default3, str4, textStyleK2, strC2, textStyleD2, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            e(onSubmitBtnClick, onCancelBtnClick, composerStartRestartGroup, (i5 >> 9) & WebSocketProtocol.PAYLOAD_SHORT);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g2(str, str2, onStopSelectionFieldClicked, onSubmitBtnClick, onCancelBtnClick, onCloseBottomSheet, i));
        }
    }

    public static final void e(Function0 function0, Function0 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-168777718);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-168777718, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusNewRouteSuggestionBottomSheetCta (PremiumBusStopSelectionScreen.kt:652)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strC = StringResourcesHelperKt.c(StringEnum.SUBMIT_SMALL, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ar0(function0, 17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i4 = i2;
            ChaloFilledButtonKt.g(modifierM786paddingVpY3zN4$default, strC, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, 0, TypedValues.PositionType.TYPE_CURVE_FIT);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            String strC2 = StringResourcesHelperKt.c(StringEnum.CANCEL_SMALL, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            boolean z2 = (i4 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ar0(function1, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ChaloFilledButtonKt.k(strC2, modifierM786paddingVpY3zN4$default2, 0L, null, null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 28);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new t20(function0, function1, i, 4));
        }
    }

    public static final void f(Function0 function0, Function0 onExploreRoutesClick, Composer composer, int i) {
        int i2;
        Function0 function1;
        Function0 onBtnClick = function0;
        Intrinsics.i(onBtnClick, "onBtnClick");
        Intrinsics.i(onExploreRoutesClick, "onExploreRoutesClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(59522272);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(onBtnClick) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onExploreRoutesClick) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(59522272, i3, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusNoOriginDestinationPairBottomSheet (PremiumBusStopSelectionScreen.kt:522)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterA = PainterResourceHelperKt.a(IconType.IC_NO_OD_PAIR, composerStartRestartGroup, 6);
            StringEnum stringEnum = StringEnum.NO_OD_PAIR_AVAILABLE_MSG;
            ImageKt.Image(painterA, StringResourcesHelperKt.c(stringEnum, new Object[0], composerStartRestartGroup, 6), SizeKt.m835widthInVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).z, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24576, 104);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(stringEnum, new Object[0], composerStartRestartGroup, 6), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 48, 0, 130040);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            onBtnClick = function0;
            ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), StringResourcesHelperKt.c(StringEnum.OKAY_RUNNING_CASE, new Object[0], composerStartRestartGroup, 6), null, 0L, null, true, 0.0f, null, 0L, onBtnClick, composerStartRestartGroup, ((i3 << 27) & 1879048192) | 196614, 476);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.EXPLORE_AVAILABLE_ROUTE, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                function1 = onExploreRoutesClick;
                objRememberedValue = new ar0(function1, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                function1 = onExploreRoutesClick;
            }
            ChaloFilledButtonKt.k(strC, modifierFillMaxWidth$default, 0L, null, null, (Function0) objRememberedValue, composerStartRestartGroup, 48, 28);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function1 = onExploreRoutesClick;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t20(onBtnClick, function1, i, 3));
        }
    }

    public static final void g(List list, TimeUtilsContract timeUtilsContract, Function1 sendIntent, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-863774600);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(timeUtilsContract) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-863774600, i3, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusRecentStopsListSection (PremiumBusStopSelectionScreen.kt:420)");
            }
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (list == null || !(!list.isEmpty())) {
                composerStartRestartGroup.startReplaceGroup(-442205948);
            } else {
                composerStartRestartGroup.startReplaceGroup(-424260730);
                boolean z = (i3 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new sn0(sendIntent, 22);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                h(list, timeUtilsContract, (Function1) objRememberedValue, null, composerStartRestartGroup, i3 & WebSocketProtocol.PAYLOAD_SHORT);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ew0(list, timeUtilsContract, sendIntent, modifier2, i, 0));
        }
    }

    public static final void h(List recentOriginDestinationsList, TimeUtilsContract timeUtilsContract, Function1 onCardClick, Modifier modifier, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(recentOriginDestinationsList, "recentOriginDestinationsList");
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        Intrinsics.i(onCardClick, "onCardClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1285170479);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(recentOriginDestinationsList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(timeUtilsContract) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCardClick) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1285170479, i3, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusRecentStopsListUI (PremiumBusStopSelectionScreen.kt:483)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Throwable th = null;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.RECENT_STOPS_TITLE, new Object[0], composerStartRestartGroup, 6), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 48, 0, 131064);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m672spacedBy0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).g), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            composerStartRestartGroup.startReplaceGroup(524731212);
            int i6 = 0;
            for (Object obj : recentOriginDestinationsList) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    Throwable th2 = th;
                    CollectionsKt.z0();
                    throw th2;
                }
                PBOriginDestinationAppModel pBOriginDestinationAppModel = (PBOriginDestinationAppModel) obj;
                FromAndToStopCardData fromAndToStopCardDataA = PBOriginDestinationAppModelKt.a(pBOriginDestinationAppModel, timeUtilsContract);
                Modifier modifierD = pk0.d("PL_Stop_Card_", i6, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, th));
                TextStyle textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0));
                long j = ChaloTheme.a(composerStartRestartGroup, 0).t;
                boolean zChangedInstance = ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(pBOriginDestinationAppModel);
                Throwable th3 = th;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new gw0(onCardClick, pBOriginDestinationAppModel, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                FromAndToStopCardKt.a(fromAndToStopCardDataA, (Function0) objRememberedValue, modifierD, 0.0f, null, j, textStyleG, composerStartRestartGroup, 0);
                i6 = i7;
                th = th3;
            }
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ew0(recentOriginDestinationsList, timeUtilsContract, onCardClick, modifier2, i, 1));
        }
    }

    public static final void i(PremiumBusStopSelectionViewState viewState, TimeUtilsContract timeUtilsContract, Function1 sendIntent, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-185758585);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(timeUtilsContract) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-185758585, i3, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionContent (PremiumBusStopSelectionScreen.kt:308)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion2, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            PlotlineComposeWidgetKt.a(6, 0, composerStartRestartGroup, BackgroundKt.m264backgroundbw27NRU$default(companion2, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), "pbPlaceholderTop");
            if (viewState.b) {
                composerStartRestartGroup.startReplaceGroup(1095805761);
                composer3 = composerStartRestartGroup;
                ChaloLoadingDialogKt.b(StringResourcesHelperKt.c(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], composerStartRestartGroup, 6), false, null, composer3, 0, 6);
            } else {
                composer3 = composerStartRestartGroup;
                composer3.startReplaceGroup(1081583333);
            }
            composer3.endReplaceGroup();
            j(viewState, sendIntent, composer3, (i3 & 14) | ((i3 >> 3) & 112));
            PlotlineComposeWidgetKt.a(6, 2, composer3, null, "pbPlaceholderBottom");
            Composer composer4 = composer3;
            g(viewState.g, timeUtilsContract, sendIntent, null, composer4, i3 & 1008);
            composer2 = composer4;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(i, 27, viewState, timeUtilsContract, sendIntent, modifier));
        }
    }

    public static final void j(PremiumBusStopSelectionViewState premiumBusStopSelectionViewState, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-455221024);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(premiumBusStopSelectionViewState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-455221024, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionContentUI (PremiumBusStopSelectionScreen.kt:347)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierA = app.chalo.compose.components.PlotlineComposeWidgetKt.a(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), "PL_Enter_Detail_Section");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            int i4 = i2;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PB_STOP_SELECTION_HEADING, new Object[0], composerStartRestartGroup, 6), PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0))), composerStartRestartGroup, 0, 0, 131064);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).j), composerStartRestartGroup, 0);
            String str = premiumBusStopSelectionViewState.d;
            String str2 = str == null ? "" : str;
            String strC = StringResourcesHelperKt.c(StringEnum.FROM_STOP_HEADING, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierA2 = app.chalo.compose.components.PlotlineComposeWidgetKt.a(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), "PL_Pick-up_Location");
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ju0(function1, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            b(modifierA2, str2, null, strC, null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 20);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            String str3 = premiumBusStopSelectionViewState.e;
            String str4 = str3 == null ? "" : str3;
            String strC2 = StringResourcesHelperKt.c(StringEnum.TO_STOP_HEADING, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierA3 = app.chalo.compose.components.PlotlineComposeWidgetKt.a(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), "PL_Drop-off_Location");
            boolean z2 = i5 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ju0(function1, 24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            b(modifierA3, str4, null, strC2, null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 20);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            String strC3 = StringResourcesHelperKt.c(StringEnum.PROCEED, new Object[0], composerStartRestartGroup, 6);
            boolean z3 = premiumBusStopSelectionViewState.c;
            Modifier modifierA4 = app.chalo.compose.components.PlotlineComposeWidgetKt.a(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), "PL_Proceed");
            boolean z4 = i5 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new ju0(function1, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            function2 = function1;
            ChaloFilledButtonKt.g(modifierA4, strC3, null, 0L, null, z3, 0.0f, null, 0L, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 476);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(premiumBusStopSelectionViewState, function2, i, 16));
        }
    }

    public static final void k(int i, SheetState bottomSheetState, Composer composer, PremiumBusStopSelectionViewState viewState, TimeUtilsContract timeUtilsContract, Function1 sendIntent) {
        int i2;
        SheetState sheetState;
        PremiumBusStopSelectionViewState premiumBusStopSelectionViewState;
        TimeUtilsContract timeUtilsContract2;
        Function1 function1;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(711690483);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(timeUtilsContract) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomSheetState) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(711690483, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreen (PremiumBusStopSelectionScreen.kt:83)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i4 = i2 << 3;
            sheetState = bottomSheetState;
            premiumBusStopSelectionViewState = viewState;
            timeUtilsContract2 = timeUtilsContract;
            function1 = sendIntent;
            l((i4 & 7168) | (i2 & 14) | ((i2 >> 6) & 112) | (i4 & 896), sheetState, composerStartRestartGroup, premiumBusStopSelectionViewState, timeUtilsContract2, function1);
            c(premiumBusStopSelectionViewState, timeUtilsContract2, function1, composerStartRestartGroup, i2 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            sheetState = bottomSheetState;
            premiumBusStopSelectionViewState = viewState;
            timeUtilsContract2 = timeUtilsContract;
            function1 = sendIntent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new dw0(premiumBusStopSelectionViewState, timeUtilsContract2, function1, sheetState, i));
        }
    }

    public static final void l(int i, SheetState bottomSheetState, Composer composer, PremiumBusStopSelectionViewState viewState, TimeUtilsContract timeUtilsContract, Function1 sendIntent) {
        int i2;
        Composer composer2;
        boolean z;
        Intrinsics.i(viewState, "viewState");
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType = viewState.f;
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1309434801);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomSheetState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(timeUtilsContract) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1309434801, i3, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenBottomSheetHandler (PremiumBusStopSelectionScreen.kt:107)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | ((i3 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new PremiumBusStopSelectionScreenKt$PremiumBusStopSelectionScreenBottomSheetHandler$1$1(viewState, bottomSheetState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(pBStopSelectionScreenBottomSheetType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.PremiumBusDateAndTimePickerBottomSheet) {
                z = false;
            } else {
                if (!(pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.MultipleOriginDestinationSelection) && !(pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) && !Intrinsics.d(pBStopSelectionScreenBottomSheetType, PBStopSelectionScreenBottomSheetType.NewRouteSuggestionSubmitSuccess.f7958a) && !Intrinsics.d(pBStopSelectionScreenBottomSheetType, PBStopSelectionScreenBottomSheetType.NoOriginDestinationPairsAvailable.f7959a) && !Intrinsics.d(pBStopSelectionScreenBottomSheetType, PBStopSelectionScreenBottomSheetType.NoProductFoundBottomSheet.f7960a) && !(pBStopSelectionScreenBottomSheetType instanceof PBStopSelectionScreenBottomSheetType.PremiumPassSavingsFaqsBottomSheet) && pBStopSelectionScreenBottomSheetType != null) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            }
            if (pBStopSelectionScreenBottomSheetType != null) {
                composerStartRestartGroup.startReplaceGroup(1817171797);
                boolean z2 = (i3 & 7168) == 2048;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ju0(sendIntent, 22);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composer2 = composerStartRestartGroup;
                ChaloRoundedBottomSheetKt.a(bottomSheetState, (Function0) objRememberedValue2, z, false, false, ComposableLambdaKt.rememberComposableLambda(400393326, true, new c0(pBStopSelectionScreenBottomSheetType, sendIntent, viewState, timeUtilsContract, 14), composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 24);
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(1811233747);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new dw0(viewState, bottomSheetState, timeUtilsContract, sendIntent, i));
        }
    }

    public static final void m(final String str, String str2, final TimeUtilsContract timeUtilsContract, final List list, final Function1 onCardClick, final Function1 onBookNowClick, final Function1 onViewStopsClick, final Function0 onNewRouteSuggestionClick, Composer composer, int i) {
        int i2;
        String str3;
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        Intrinsics.i(onCardClick, "onCardClick");
        Intrinsics.i(onBookNowClick, "onBookNowClick");
        Intrinsics.i(onViewStopsClick, "onViewStopsClick");
        Intrinsics.i(onNewRouteSuggestionClick, "onNewRouteSuggestionClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1186118876);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(timeUtilsContract) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCardClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBookNowClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onViewStopsClick) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNewRouteSuggestionClick) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1186118876, i3, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumMultipleOriginDestinationBottomSheet (PremiumBusStopSelectionScreen.kt:727)");
            }
            final String str4 = str3;
            TitleWithVerticalCardsSheetContentKt.a(StringResourcesHelperKt.c(StringEnum.SELECT_PICKUP_AND_DROP, new Object[0], composerStartRestartGroup, 6), list, ComposableLambdaKt.rememberComposableLambda(327780489, true, new Function4() { // from class: fw0
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    PBOriginDestinationAppModel item = (PBOriginDestinationAppModel) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    Composer composer2 = (Composer) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    Intrinsics.i(item, "item");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(327780489, iIntValue2, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumMultipleOriginDestinationBottomSheet.<anonymous> (PremiumBusStopSelectionScreen.kt:732)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierC = hq0.c("PL_Pickup_Drop_Stop_Card_", iIntValue, companion);
                    Function1 function1 = onCardClick;
                    boolean zChanged = composer2.changed(function1) | composer2.changedInstance(item);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new gw0(function1, item, 1);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierC, false, null, null, null, (Function0) objRememberedValue, 15, null);
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    float f = ChaloTheme.c(composer2, 0).b;
                    int i5 = CardDefaults.$stable;
                    CardKt.Card(modifierM299clickableoSLSa3U$default, RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composer2, 0).f), cardDefaults.m1694cardColorsro_MJ88(ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), 0L, 0L, 0L, composer2, i5 << 12, 14), cardDefaults.m1695cardElevationaqJV_2Y(f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, i5 << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(-817653855, true, new hl0(item, timeUtilsContract, str, str4, onBookNowClick, onViewStopsClick), composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
                    if (iIntValue == list.size() - 1) {
                        composer2.startReplaceGroup(577682676);
                        PremiumBusStopSelectionScreenKt.o(onNewRouteSuggestionClick, composer2, 0);
                    } else {
                        composer2.startReplaceGroup(547488335);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 112) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new er(str, str2, timeUtilsContract, list, onCardClick, onBookNowClick, onViewStopsClick, onNewRouteSuggestionClick, i, 4));
        }
    }

    public static final void n(int i, Composer composer, Modifier modifier, Function0 onBookClick, Function0 onViewStopClick) {
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(onBookClick, "onBookClick");
        Intrinsics.i(onViewStopClick, "onViewStopClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1888820306);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBookClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onViewStopClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1888820306, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumStopSelectionCardCta (PremiumBusStopSelectionScreen.kt:791)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.VIEW_STOPS, new Object[0], composerStartRestartGroup, 6), ClickableKt.m295clickableO2vRcR0$default(PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), RippleEffectKt.b(composerStartRestartGroup), null, false, null, null, onViewStopClick, 28, null), ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131064);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            ChaloFilledButtonKt.k(StringResourcesHelperKt.c(StringEnum.BOOK_RIDE, new Object[0], composerStartRestartGroup, 6), i41.a(rowScopeInstance, PaddingKt.m788paddingqDBjuR0$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).g, 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, ChaloTheme.d(composerStartRestartGroup, 0).b, null, onBookClick, composer2, ((i2 << 12) & 458752) | 24576, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new hw0(modifier2, onBookClick, onViewStopClick, i, 0));
        }
    }

    public static final void o(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        Function0 function1;
        Function0 onClick = function0;
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(57317532);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(57317532, i2, -1, "app.chalo.premiumbus.ui.stopselection.compose.SuggestAStopComposable (PremiumBusStopSelectionScreen.kt:830)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).l, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i5 = i2;
            i3 = 14;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CANT_FIND_STOP, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131070);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.SUGGEST_A_STOP_BTN_TEXT, new Object[0], composerStartRestartGroup, 6);
            boolean z = (i5 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                function1 = function0;
                objRememberedValue = new ar0(function1, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                function1 = function0;
            }
            composer2 = composerStartRestartGroup;
            onClick = function1;
            TextKt.m2623TextNvy7gAk(strC, PaddingKt.m786paddingVpY3zN4$default(ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131064);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i3 = 14;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, i3, onClick));
        }
    }
}
