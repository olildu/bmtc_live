package defpackage;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.saveable.serialization.SerializableSaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.serialization.SavedStateConfiguration;
import app.chalo.ads.BindNativeAdResult;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.homescreen.data.model.app.SearchCardAppModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.ReportProblemKt;
import app.chalo.livetracking.ui.routedetailsscreen.ReportProblemAckUIState;
import app.chalo.livetracking.ui.routedetailsscreen.ReportProblemCtaUIState;
import app.chalo.livetracking.ui.routedetailsscreen.ReportProblemDialogSpecs;
import app.chalo.livetracking.ui.routedetailsscreen.ReportProblemDialogUIState;
import app.chalo.livetracking.ui.routedetailsscreen.ReportProblemTagTextUIState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteAvailabilityDialogUISpecs;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteAvailabilityDialogUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteNativeAdUIState;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsFooterKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsUiState;
import app.chalo.ridehailing.feedback.RideFeedbackHeaderUIState;
import app.chalo.ridehailing.feedback.RideUserFeedbackScreenKt;
import app.chalo.sos.SendSosConfirmationDialog;
import app.chalo.sos.SendSosConfirmationDialogUISpecs;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.webview.WebViewScreenComponent;
import app.chalo.webview.WebViewScreenDataState;
import app.chalo.webview.WebViewScreenIntent;
import coil3.compose.SingletonAsyncImageKt;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zt0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20231a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zt0(int i, Object obj, Object obj2) {
        this.f20231a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        Composer composer;
        int i;
        Composer composer2;
        int i2 = this.f20231a;
        Unit unit = Unit.f17538a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                PremiumBusFareDetailsContent premiumBusFareDetailsContent = (PremiumBusFareDetailsContent) obj4;
                PremiumBusFareDetailsUiState premiumBusFareDetailsUiState = (PremiumBusFareDetailsUiState) obj3;
                Composer composer3 = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1013989445, iIntValue, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFreshPurchaseFareDetailsScreen.<anonymous> (PremiumBusFreshPurchaseFareDetailsScreen.kt:51)");
                    }
                    if (premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.FreshPurchase) {
                        composer3.startReplaceGroup(1254641535);
                        PremiumBusFareDetailsFooterKt.a(((PremiumBusFareDetailsContent.FreshPurchase) premiumBusFareDetailsContent).f, premiumBusFareDetailsUiState.f.f, null, composer3, 0);
                    } else {
                        composer3.startReplaceGroup(1251977085);
                    }
                    composer3.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 1:
                Modifier modifier = (Modifier) obj4;
                ReportProblemDialogUIState reportProblemDialogUIState = (ReportProblemDialogUIState) obj3;
                Composer composer4 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1208649924, iIntValue2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.ReportProblemDialog.<anonymous> (ReportProblem.kt:220)");
                    }
                    ReportProblemDialogSpecs reportProblemDialogSpecs = reportProblemDialogUIState.f4819a;
                    ReportProblemAckUIState reportProblemAckUIState = reportProblemDialogUIState.b;
                    BaseTextFieldUIState.TextFieldUIState textFieldUIState = reportProblemDialogUIState.e;
                    Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifier, ChaloColorTokenKt.c(reportProblemDialogSpecs.f), null, 2, null), reportProblemDialogSpecs.g);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer4, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierC);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (reportProblemAckUIState != null) {
                        composer4.startReplaceGroup(415219905);
                        ReportProblemKt.a(reportProblemAckUIState, composer4, 0);
                        composer4.endReplaceGroup();
                        composer = composer4;
                    } else {
                        composer4.startReplaceGroup(415328932);
                        boolean zChanged = composer4.changed(textFieldUIState != null ? textFieldUIState.f10099a : null);
                        Object objRememberedValue = composer4.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            if (textFieldUIState == null || (str = textFieldUIState.f10099a) == null) {
                                str = "";
                            }
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange((textFieldUIState == null || (str2 = textFieldUIState.f10099a) == null) ? 0 : str2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                            composer4.updateRememberedValue(objRememberedValue);
                        }
                        MutableState mutableState = (MutableState) objRememberedValue;
                        if (reportProblemDialogUIState.c == null) {
                            composer4.startReplaceGroup(415716214);
                            composer4.endReplaceGroup();
                            composer = composer4;
                        } else {
                            composer4.startReplaceGroup(415716215);
                            composer = composer4;
                            TextKt.c(reportProblemDialogUIState.c, null, null, null, composer, 0, 14);
                            ChaloSpacersKt.a(reportProblemDialogSpecs.b, composer, 0);
                            composer.endReplaceGroup();
                        }
                        List list = reportProblemDialogUIState.d;
                        if (list == null) {
                            composer.startReplaceGroup(415922240);
                            composer.endReplaceGroup();
                            i = 0;
                        } else {
                            composer.startReplaceGroup(415922241);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ReportProblemKt.e((ReportProblemTagTextUIState) it.next(), null, composer, 0);
                                ChaloSpacersKt.a(reportProblemDialogSpecs.d, composer, 0);
                            }
                            i = 0;
                            composer.endReplaceGroup();
                        }
                        ChaloSpacersKt.a(reportProblemDialogSpecs.c, composer, i);
                        if (textFieldUIState == null) {
                            composer.startReplaceGroup(416189677);
                        } else {
                            composer.startReplaceGroup(416189678);
                            ChaloTextFieldKt.b(textFieldUIState, textFieldUIState.f10099a.length() == 0 ? new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null) : (TextFieldValue) mutableState.getValue(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, null, null, composer, 384, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
                        }
                        composer.endReplaceGroup();
                        ChaloSpacersKt.a(reportProblemDialogSpecs.e, composer, 0);
                        ReportProblemCtaUIState reportProblemCtaUIState = reportProblemDialogUIState.f;
                        if (reportProblemCtaUIState == null) {
                            composer.startReplaceGroup(416581641);
                        } else {
                            composer.startReplaceGroup(416581642);
                            ReportProblemKt.c(reportProblemCtaUIState, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48);
                        }
                        composer.endReplaceGroup();
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 2:
                RideFeedbackHeaderUIState rideFeedbackHeaderUIState = (RideFeedbackHeaderUIState) obj4;
                ImageUIState imageUIState = (ImageUIState) obj3;
                Composer composer5 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1192055530, iIntValue3, -1, "app.chalo.ridehailing.feedback.RideFeedbackHeader.<anonymous>.<anonymous>.<anonymous> (RideUserFeedbackScreen.kt:194)");
                    }
                    RideUserFeedbackScreenKt.a(rideFeedbackHeaderUIState.d, imageUIState, composer5, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 3:
                Modifier modifier2 = (Modifier) obj4;
                RouteAvailabilityDialogUIState routeAvailabilityDialogUIState = (RouteAvailabilityDialogUIState) obj3;
                Composer composer6 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1969275611, iIntValue4, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteAvailabilityDialog.<anonymous> (RouteAvailabilityBanner.kt:156)");
                    }
                    RouteAvailabilityDialogUISpecs routeAvailabilityDialogUISpecs = routeAvailabilityDialogUIState.e;
                    Modifier modifierC2 = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m833width3ABfNKs(modifier2, routeAvailabilityDialogUISpecs.e), ChaloColorTokenKt.c(routeAvailabilityDialogUISpecs.f), null, 2, null), routeAvailabilityDialogUISpecs.g);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer6, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer6, modifierC2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor2);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer6);
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ImageUrlUIState imageUrlUIState = routeAvailabilityDialogUIState.f4916a;
                    if (imageUrlUIState == null) {
                        composer6.startReplaceGroup(942491764);
                    } else {
                        composer6.startReplaceGroup(942491765);
                        String str3 = imageUrlUIState.f10037a;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        boolean zChanged2 = composer6.changed(imageUrlUIState);
                        Object objRememberedValue2 = composer6.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new l31(imageUrlUIState, 0);
                            composer6.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function0 = (Function0) objRememberedValue2;
                        boolean zChanged3 = composer6.changed(imageUrlUIState);
                        Object objRememberedValue3 = composer6.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new z21(imageUrlUIState, 4);
                            composer6.updateRememberedValue(objRememberedValue3);
                        }
                        SingletonAsyncImageKt.a(str3, null, ComposeUtilsKt.c(companion3, function0, (Function1) objRememberedValue3), null, composer6, 48, 2040);
                        ChaloSpacersKt.a(routeAvailabilityDialogUISpecs.f4915a, composer6, 0);
                    }
                    composer6.endReplaceGroup();
                    TextUIState textUIState = routeAvailabilityDialogUIState.b;
                    if (textUIState == null) {
                        composer6.startReplaceGroup(943104417);
                    } else {
                        composer6.startReplaceGroup(943104418);
                        TextKt.c(textUIState, null, null, null, composer6, 0, 14);
                        ChaloSpacersKt.a(routeAvailabilityDialogUISpecs.b, composer6, 0);
                    }
                    composer6.endReplaceGroup();
                    TextUIState textUIState2 = routeAvailabilityDialogUIState.c;
                    if (textUIState2 == null) {
                        composer6.startReplaceGroup(943277118);
                    } else {
                        composer6.startReplaceGroup(943277119);
                        TextKt.c(textUIState2, null, null, null, composer6, 0, 14);
                        ChaloSpacersKt.a(routeAvailabilityDialogUISpecs.c, composer6, 0);
                    }
                    composer6.endReplaceGroup();
                    TextUIState textUIState3 = routeAvailabilityDialogUIState.d;
                    if (textUIState3 == null) {
                        composer6.startReplaceGroup(943445665);
                        composer6.endReplaceGroup();
                        composer2 = composer6;
                    } else {
                        composer6.startReplaceGroup(943445666);
                        composer2 = composer6;
                        TextKt.c(textUIState3, null, null, null, composer2, 0, 14);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 4:
                float f = RouteDetailsStopsListUIStateFactory.c;
                ((Function1) obj4).invoke(new RouteDetailsIntent.NativeAdFailedToLoad(((RouteDetailsStopUiModel) obj3).f4410a, ((Integer) obj).intValue(), (BindNativeAdResult.Failed) obj2));
                return unit;
            case 5:
                SearchCardAppModel searchCardAppModel = (SearchCardAppModel) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer7 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-57318540, iIntValue5, -1, "app.chalo.home.ui.common.SearchCardUI.<anonymous>.<anonymous> (SearchCardUI.kt:89)");
                    }
                    String str4 = searchCardAppModel.c;
                    ContentScale fit = ContentScale.INSTANCE.getFit();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    boolean zChanged4 = composer7.changed(mutableState2);
                    Object objRememberedValue4 = composer7.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new xq0(mutableState2, 10);
                        composer7.updateRememberedValue(objRememberedValue4);
                    }
                    SingletonSubcomposeAsyncImageKt.a(str4, null, modifierFillMaxSize$default, null, null, null, null, (Function1) objRememberedValue4, null, fit, composer7, 432, 48, 62968);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 6:
                return SelectionContainerKt.SelectionContainer$lambda$9$0$0((Function2) obj4, (SelectionManager) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return SerializableSaverKt.serializableSaver$lambda$0((KSerializer) obj4, (SavedStateConfiguration) obj3, (SaverScope) obj, obj2);
            case 8:
                Integer num = (Integer) obj;
                num.getClass();
                BindNativeAdResult.Failed failedResult = (BindNativeAdResult.Failed) obj2;
                Intrinsics.i(failedResult, "failedResult");
                ((MutableState) obj3).setValue(Boolean.FALSE);
                ((RouteNativeAdUIState) obj4).e.invoke(num, failedResult);
                return unit;
            case 9:
                SendSosConfirmationDialogUISpecs sendSosConfirmationDialogUISpecs = (SendSosConfirmationDialogUISpecs) obj4;
                SendSosConfirmationDialog sendSosConfirmationDialog = (SendSosConfirmationDialog) obj3;
                Composer composer8 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!composer8.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    composer8.skipToGroupEnd();
                    return unit;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(617834050, iIntValue6, -1, "app.chalo.sos.SendSosConfirmationDialog.<anonymous> (SosScreenUI.kt:317)");
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierC3 = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), ChaloColorTokenKt.c(sendSosConfirmationDialogUISpecs.f), ChaloThemeKt.d(sendSosConfirmationDialogUISpecs.g)), sendSosConfirmationDialogUISpecs.b);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion5 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top, companion5.getStart(), composer8, 0);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composer8.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer8, modifierC3);
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                if (composer8.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer8.startReusableNode();
                if (composer8.getInserting()) {
                    composer8.createNode(constructor3);
                } else {
                    composer8.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer8);
                pk0.v(companion6, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                CommonImageKt.a(sendSosConfirmationDialog.f, ChaloThemeKt.c(ColumnScopeInstance.INSTANCE.align(companion4, companion5.getEnd()), sendSosConfirmationDialogUISpecs.c), false, composer8, 0, 4);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getCenterVertically(), composer8, 48);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                int i6 = (int) ((currentCompositeKeyHashCode4 >>> 32) ^ currentCompositeKeyHashCode4);
                CompositionLocalMap currentCompositionLocalMap4 = composer8.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer8, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                if (composer8.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer8.startReusableNode();
                if (composer8.getInserting()) {
                    composer8.createNode(constructor4);
                } else {
                    composer8.useNode();
                }
                Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer8);
                pk0.v(companion6, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                CommonImageKt.a(sendSosConfirmationDialog.c, null, false, composer8, 0, 6);
                ChaloSpacersKt.w(composer8, 0);
                TextKt.c(sendSosConfirmationDialog.d, null, null, null, composer8, 0, 14);
                composer8.endNode();
                Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(companion4, sendSosConfirmationDialogUISpecs.d), 0.0f, 1, null), ChaloColorTokenKt.c(sendSosConfirmationDialogUISpecs.h), ChaloThemeKt.d(sendSosConfirmationDialogUISpecs.i));
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getTop(), composer8, 0);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                int i7 = (int) ((currentCompositeKeyHashCode5 >>> 32) ^ currentCompositeKeyHashCode5);
                CompositionLocalMap currentCompositionLocalMap5 = composer8.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer8, modifierM263backgroundbw27NRU);
                Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                if (composer8.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer8.startReusableNode();
                if (composer8.getInserting()) {
                    composer8.createNode(constructor5);
                } else {
                    composer8.useNode();
                }
                Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer8);
                pk0.v(companion6, composerM3915constructorimpl5, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl5, Integer.valueOf(i7), composerM3915constructorimpl5));
                TextKt.c(sendSosConfirmationDialog.e, ChaloThemeKt.c(companion4, sendSosConfirmationDialogUISpecs.j), null, null, composer8, 0, 12);
                composer8.endNode();
                ChaloFilledButtonKt.a(6, 0, composer8, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), sendSosConfirmationDialog.g);
                ChaloSpacersKt.a(sendSosConfirmationDialogUISpecs.e, composer8, 0);
                if (!b3.s(6, 0, composer8, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), sendSosConfirmationDialog.h)) {
                    return unit;
                }
                ComposerKt.traceEventEnd();
                return unit;
            case 10:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0((TextFieldSelectionManager) obj4, (CoroutineScope) obj3, (TextContextMenuBuilderScope) obj, (Context) obj2);
            case 11:
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0((TextFieldSelectionState) obj4, (CoroutineScope) obj3, (TextContextMenuBuilderScope) obj, (Context) obj2);
            case 12:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj4;
                List selectedItems = (List) obj;
                String userFeedbackText = (String) obj2;
                Intrinsics.i(selectedItems, "selectedItems");
                Intrinsics.i(userFeedbackText, "userFeedbackText");
                ((MutableState) obj3).setValue(userFeedbackText);
                snapshotStateList.clear();
                snapshotStateList.addAll(selectedItems);
                return unit;
            case 13:
                Function2 function2 = (Function2) obj4;
                MutableIntState mutableIntState = (MutableIntState) obj3;
                Integer num2 = (Integer) obj;
                num2.intValue();
                Integer num3 = (Integer) obj2;
                int iIntValue7 = num3.intValue();
                mutableIntState.setIntValue(iIntValue7 >= 0 ? iIntValue7 : 0);
                if (function2 != null) {
                    function2.invoke(num2, num3);
                }
                return unit;
            default:
                ((WebViewScreenComponent) obj4).F0(new WebViewScreenIntent.WebViewLoadErrorReceivedIntent((Integer) obj, ((WebViewScreenDataState) obj3).f11106a, (String) obj2));
                return unit;
        }
    }
}
