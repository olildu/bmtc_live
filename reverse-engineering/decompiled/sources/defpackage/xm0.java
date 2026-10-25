package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.Scrollable2DNode;
import androidx.compose.foundation.gestures.ScrollableNode;
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
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.android.AndroidDependencyFactory;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.TncDialogUIKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.constants.Source;
import app.chalo.core.compose.ComposableSingletons$NetworkInspectorScreenKt;
import app.chalo.core.networkinspector.NetworkInspectorComponent;
import app.chalo.data.GridWidgetCardData;
import app.chalo.data.GridWidgetItemData;
import app.chalo.home.ui.regularbus.RegularBusProductItemData;
import app.chalo.home.ui.savedplacesandrides.ConfirmationDialogUIState;
import app.chalo.homescreen.data.model.app.SearchCardAppModel;
import app.chalo.livetracking.ui.routedetailsscreen.TimeTableSectionHeaderUIState;
import app.chalo.login.ui.userconsent.UserConsentComponent;
import app.chalo.login.ui.userconsent.UserConsentIntent;
import app.chalo.login.ui.userconsent.UserConsentRequiredDialogUIState;
import app.chalo.plotline.PlotlineXmlWidgetView;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsCommonViewsKt;
import app.chalo.premiumbus.ui.faredetails.contract.PassUpsellOfferCardUiState;
import app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionComposablesKt;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionViewState;
import app.chalo.ridehailing.feedback.RideFeedbackHeaderUIState;
import app.chalo.ridehailing.feedback.RideFeedbackToolbarUIState;
import app.chalo.ridehailing.feedback.RideUserFeedbackScreenKt;
import app.chalo.stoptripdetails.ui.StopTripDetailsViewState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.dialog.ButtonContainerUIState;
import app.chalo.uistate.dialog.TermTextUIState;
import app.chalo.uistate.dialog.TnCDialogUISpecs;
import app.chalo.uistate.dialog.TnCDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.text.TextUIState;
import com.android.volley.toolbox.HttpHeaderParser;
import io.ktor.client.engine.UtilsKt;
import io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpRequest$lambda$0$$inlined$forEachHeader$1;
import io.ktor.http.HttpHeaders;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLParserKt;
import io.ktor.util.StringValuesBuilderImpl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.datetime.internal.format.FieldSign;
import kotlinx.datetime.internal.format.SignedFormatStructure;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import so.plotline.plotline_kmp.Plotline_androidKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xm0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20035a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xm0(Object obj, int i) {
        this.f20035a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:190:0x06ae  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        Modifier modifier;
        Job job;
        int i2 = this.f20035a;
        int i3 = 2;
        Unit unit = Unit.f17538a;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                NetworkInspectorComponent networkInspectorComponent = (NetworkInspectorComponent) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(623757677, iIntValue, -1, "app.chalo.core.compose.NetworkInspectorScreen.<anonymous>.<anonymous> (NetworkInspectorScreen.kt:68)");
                    }
                    boolean zChangedInstance = composer.changedInstance(networkInspectorComponent);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new um0(networkInspectorComponent, i3);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$NetworkInspectorScreenKt.b, composer, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 1:
                MutableFloatState mutableFloatState = (MutableFloatState) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1164982752, iIntValue2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMapAndTicketDetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewPremiumBusReserveTicketActivationScreen.kt:404)");
                    }
                    if (mutableFloatState.getFloatValue() == 1.0f) {
                        composer2.startReplaceGroup(1610190306);
                    } else {
                        composer2.startReplaceGroup(1629620889);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer2, 48);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                        ChaloSpacersKt.o(composer2, 0);
                        SpacerKt.Spacer(BackgroundKt.m263backgroundbw27NRU(SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer2, 0).f), ChaloTheme.b(composer2, 0).n), ChaloTheme.a(composer2, 0).r0, ChaloTheme.d(composer2, 0).f), composer2, 0);
                        ChaloSpacersKt.m(composer2, 0);
                        composer2.endNode();
                    }
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 2:
                ((PaymentMainComponent) obj3).t.k((String) obj, "installed_upi_app", false, false, "mainPaymentScreen", vo1.s("uri", (String) obj2));
                return unit;
            case 3:
                PlotlineXmlWidgetView plotlineXmlWidgetView = (PlotlineXmlWidgetView) obj3;
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i5 = PlotlineXmlWidgetView.b;
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1394598334, iIntValue3, -1, "app.chalo.plotline.PlotlineXmlWidgetView.updateContent.<anonymous> (PlotlineXmlWidgetView.kt:68)");
                    }
                    Plotline_androidKt.b(plotlineXmlWidgetView.f6844a, composer3, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 4:
                PassUpsellOfferCardUiState passUpsellOfferCardUiState = (PassUpsellOfferCardUiState) obj3;
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1737756054, iIntValue4, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusPassUpsellOfferCard.<anonymous> (PremiumBusFareDetailsCommonViews.kt:60)");
                    }
                    PremiumBusFareDetailsCommonViewsKt.c(passUpsellOfferCardUiState.f7562a, null, composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 5:
                PremiumBusSeatSelectionViewState premiumBusSeatSelectionViewState = (PremiumBusSeatSelectionViewState) obj3;
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1023713803, iIntValue5, -1, "app.chalo.premiumbus.ui.seatselection.compose.SeatSelectionMainScreen.<anonymous>.<anonymous> (PremiumBusSeatSelectionMainScreen.kt:311)");
                    }
                    PremiumBusSeatSelectionComposablesKt.a(premiumBusSeatSelectionViewState.m, composer5, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 6:
                RegularBusProductItemData regularBusProductItemData = (RegularBusProductItemData) obj3;
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(941899785, iIntValue6, -1, "app.chalo.home.ui.regularbus.compose.MeasureItemHeights.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegularBusScreenUI.kt:1459)");
                    }
                    Modifier modifierHeight = IntrinsicKt.height(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer6, 0).K), IntrinsicSize.Max);
                    GridWidgetCardData gridWidgetCardData = regularBusProductItemData.f3633a;
                    String str = gridWidgetCardData.b;
                    long jA = ChaloColorToken_androidKt.a(Color.INSTANCE, gridWidgetCardData.d, Color.INSTANCE.m4640getTransparent0d7_KjU());
                    GridWidgetCardData gridWidgetCardData2 = regularBusProductItemData.f3633a;
                    GridWidgetItemData gridWidgetItemData = gridWidgetCardData2.f2348a;
                    ChaloWidgetCardKt.c(modifierHeight, Color.m4595boximpl(jA), str, gridWidgetItemData.c, gridWidgetItemData.f2349a, gridWidgetItemData.b, gridWidgetCardData2.c, false, composer6, 4096, 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 7:
                RideFeedbackToolbarUIState rideFeedbackToolbarUIState = (RideFeedbackToolbarUIState) obj3;
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-506337492, iIntValue7, -1, "app.chalo.ridehailing.feedback.RideUserFeedbackFormScreen.<anonymous>.<anonymous>.<anonymous> (RideUserFeedbackScreen.kt:96)");
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM672spacedBy0680j_4 = Arrangement.INSTANCE.m672spacedBy0680j_4(Dp.m7278constructorimpl(4));
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM672spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer7, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer7, companion3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor2);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ChaloTextViewKt.a(null, rideFeedbackToolbarUIState.f9153a, null, null, composer7, 0, 13);
                    ChaloTextViewKt.a(null, rideFeedbackToolbarUIState.b, null, null, composer7, 0, 13);
                    composer7.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 8:
                RideFeedbackHeaderUIState rideFeedbackHeaderUIState = (RideFeedbackHeaderUIState) obj3;
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-183326661, iIntValue8, -1, "app.chalo.ridehailing.feedback.RideFeedbackHeader.<anonymous>.<anonymous> (RideUserFeedbackScreen.kt:187)");
                    }
                    RideUserFeedbackScreenKt.n(rideFeedbackHeaderUIState.b, rideFeedbackHeaderUIState.c, composer8, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 9:
                TimeTableSectionHeaderUIState timeTableSectionHeaderUIState = (TimeTableSectionHeaderUIState) obj3;
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (composer9.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-762265224, iIntValue9, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.TimeTableHeading.<anonymous> (RouteTimeTable.kt:77)");
                    }
                    Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(timeTableSectionHeaderUIState.d), null, 2, null), timeTableSectionHeaderUIState.e);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer9, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer9, 0);
                    int i7 = (int) ((currentCompositeKeyHashCode3 >>> 32) ^ currentCompositeKeyHashCode3);
                    CompositionLocalMap currentCompositionLocalMap3 = composer9.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer9, modifierC);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    if (composer9.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer9.startReusableNode();
                    if (composer9.getInserting()) {
                        composer9.createNode(constructor3);
                    } else {
                        composer9.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer9);
                    pk0.v(companion5, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    TextUIState.StyledTextUIState styledTextUIState = timeTableSectionHeaderUIState.f4891a;
                    if (styledTextUIState == null) {
                        composer9.startReplaceGroup(-1757641997);
                        composer9.endReplaceGroup();
                        i = 0;
                        modifier = null;
                    } else {
                        composer9.startReplaceGroup(-1757641996);
                        i = 0;
                        modifier = null;
                        TextKt.b(null, styledTextUIState, composer9, 0, 1);
                        composer9.endReplaceGroup();
                    }
                    TextUIState.StyledTextUIState styledTextUIState2 = timeTableSectionHeaderUIState.b;
                    if (styledTextUIState2 == null) {
                        composer9.startReplaceGroup(-1757542797);
                    } else {
                        composer9.startReplaceGroup(-1757542796);
                        TextKt.b(modifier, styledTextUIState2, composer9, i, 1);
                    }
                    composer9.endReplaceGroup();
                    composer9.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 10:
                int iIntValue10 = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                CoroutineContext.Key key = element.getKey();
                CoroutineContext.Element element2 = ((SafeCollector) obj3).collectContext.get(key);
                if (key == Job.Key.f17732a) {
                    Job job2 = (Job) element2;
                    Job parent = (Job) element;
                    while (true) {
                        if (parent == null) {
                            job = null;
                        } else if (parent != job2 && (parent instanceof ScopeCoroutine)) {
                            ChildHandle childHandle = (ChildHandle) JobSupport.b.get((ScopeCoroutine) parent);
                            parent = childHandle != null ? childHandle.getParent() : null;
                        } else {
                            job = parent;
                        }
                    }
                    if (job != job2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + job + ", expected child of " + job2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (job2 != null) {
                        iIntValue10++;
                    }
                } else if (element != element2) {
                    iIntValue10 = Integer.MIN_VALUE;
                } else {
                    iIntValue10++;
                }
                return Integer.valueOf(iIntValue10);
            case 11:
                ConfirmationDialogUIState confirmationDialogUIState = (ConfirmationDialogUIState) obj3;
                Composer composer10 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (composer10.shouldExecute((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1269982314, iIntValue11, -1, "app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesScreenConfirmationDialog.<anonymous> (SavedPlacesAndRidesScreen.kt:280)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Color.INSTANCE.m4642getWhite0d7_KjU(), ChaloTheme.d(composer10, 0).g), ChaloTheme.b(composer10, 0).h, ChaloTheme.b(composer10, 0).h, ChaloTheme.b(composer10, 0).h, ChaloTheme.b(composer10, 0).i);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(top, companion7.getStart(), composer10, 0);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer10, 0);
                    int i8 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer10.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer10, modifierM787paddingqDBjuR0);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                    if (composer10.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer10.startReusableNode();
                    if (composer10.getInserting()) {
                        composer10.createNode(constructor4);
                    } else {
                        composer10.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer10);
                    pk0.v(companion8, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl4, Integer.valueOf(i8), composerM3915constructorimpl4));
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion7.getCenterVertically(), composer10, 48);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer10, 0);
                    int i9 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer10.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer10, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                    if (composer10.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer10.startReusableNode();
                    if (composer10.getInserting()) {
                        composer10.createNode(constructor5);
                    } else {
                        composer10.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer10);
                    pk0.v(companion8, composerM3915constructorimpl5, measurePolicyRowMeasurePolicy, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl5, Integer.valueOf(i9), composerM3915constructorimpl5));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ChaloTextViewKt.a(null, confirmationDialogUIState.f3673a, null, null, composer10, 0, 13);
                    SpacerKt.Spacer(i41.a(rowScopeInstance, companion6, 1.0f, false, 2, null), composer10, 0);
                    CommonImageKt.a(confirmationDialogUIState.d, null, false, composer10, 0, 6);
                    composer10.endNode();
                    ChaloSpacersKt.h(composer10, 0);
                    ChaloFilledButtonKt.a(6, 0, composer10, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), confirmationDialogUIState.b);
                    ChaloSpacersKt.n(composer10, 0);
                    if (b3.s(6, 0, composer10, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), confirmationDialogUIState.c)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 12:
                return Boolean.valueOf(Scrollable2DNode.setScrollSemanticsActions$lambda$0((Scrollable2DNode) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            case 13:
                return Boolean.valueOf(ScrollableNode.setScrollSemanticsActions$lambda$0((ScrollableNode) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            case 14:
                SearchCardAppModel searchCardAppModel = (SearchCardAppModel) obj3;
                Composer composer11 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (composer11.shouldExecute((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1675021586, iIntValue12, -1, "app.chalo.home.ui.common.SearchCardUI.<anonymous>.<anonymous> (SearchCardUI.kt:63)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer11, 0);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0);
                    int i10 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer11.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer11, companion9);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion10.getConstructor();
                    if (composer11.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor6);
                    } else {
                        composer11.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer11);
                    pk0.v(companion10, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy5, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion10, composerM3915constructorimpl6, Integer.valueOf(i10), composerM3915constructorimpl6));
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    if (StringsKt.F(searchCardAppModel.f3809a)) {
                        composer11.startReplaceGroup(-885068950);
                    } else {
                        composer11.startReplaceGroup(-882358155);
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(searchCardAppModel.f3809a, null, ChaloTheme.a(composer11, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composer11, 0).getHeadlineMedium()), composer11, 0, 0, 131066);
                    }
                    composer11.endReplaceGroup();
                    if (StringsKt.F(searchCardAppModel.b)) {
                        composer11.startReplaceGroup(-885068950);
                    } else {
                        composer11.startReplaceGroup(-882075838);
                        if (StringsKt.F(searchCardAppModel.f3809a)) {
                            composer11.startReplaceGroup(-885068950);
                        } else {
                            composer11.startReplaceGroup(-882034143);
                            ChaloSpacersKt.t(composer11, 0);
                        }
                        composer11.endReplaceGroup();
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(searchCardAppModel.b, null, ChaloTheme.a(composer11, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer11, 0).getBodySmall(), composer11, 0, 0, 131066);
                    }
                    composer11.endReplaceGroup();
                    composer11.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 15:
                return Integer.valueOf(SelectionRegistrarImpl.sort$lambda$0((LayoutCoordinates) obj3, (Selectable) obj, (Selectable) obj2));
            case 16:
                String name = (String) obj;
                Intrinsics.i(name, "name");
                AnalyticsContractImplKt.b((AnalyticsContract) ((Scope) obj3).d(Reflection.a(AnalyticsContract.class), null, null), name, Source.PLOTLINE, (Map) obj2, false, 8);
                return unit;
            case 17:
                AndroidDependencyFactory androidDependencyFactory = (AndroidDependencyFactory) obj3;
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return androidDependencyFactory;
            case 18:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                for (FieldSign fieldSign : ((SignedFormatStructure) obj3).b) {
                    fieldSign.getF17976a().c(obj, Boolean.valueOf(zBooleanValue != Intrinsics.d(fieldSign.getF17976a().f18013a.get(obj), Boolean.TRUE)));
                }
                return unit;
            case 19:
                return SliderKt.awaitSlop_8vUncbI$lambda$49((Ref.FloatRef) obj3, (PointerInputChange) obj, ((Float) obj2).floatValue());
            case 20:
                return SnapshotStateObserver.applyObserver$lambda$0((SnapshotStateObserver) obj3, (Set) obj, (Snapshot) obj2);
            case 21:
                StopTripDetailsViewState stopTripDetailsViewState = (StopTripDetailsViewState) obj3;
                Composer composer12 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (composer12.shouldExecute((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1026833606, iIntValue13, -1, "app.chalo.stoptripdetails.ui.StopDetailScreenToolBar.<anonymous> (StopTripDetailsScreen.kt:303)");
                    }
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(stopTripDetailsViewState.c, PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, ChaloTheme.b(composer12, 0).c, 0.0f, 11, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composer12, 0)), composer12, 0, 24960, 110588);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 22:
                String name2 = (String) obj;
                List values = (List) obj2;
                Intrinsics.i(name2, "name");
                Intrinsics.i(values, "values");
                ((StringValuesBuilderImpl) obj3).d(values, name2);
                return unit;
            case 23:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.dragAndDropNode$lambda$1((TextFieldDecoratorModifierNode) obj3, (ClipEntry) obj, (ClipMetadata) obj2));
            case 24:
                TnCDialogUIState tnCDialogUIState = (TnCDialogUIState) obj3;
                Composer composer13 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (composer13.shouldExecute((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1744248964, iIntValue14, -1, "app.chalo.compose.components.dialogs.TnCDialog.<anonymous> (TncDialogUI.kt:46)");
                    }
                    Modifier.Companion companion11 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null);
                    TnCDialogUISpecs tnCDialogUISpecs = tnCDialogUIState.f10014a;
                    DividerUIState dividerUIState = tnCDialogUIState.f;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m263backgroundbw27NRU(modifierFillMaxWidth$default3, ChaloColorTokenKt.c(tnCDialogUISpecs.f10013a), ChaloThemeKt.d(tnCDialogUISpecs.b)), ScrollKt.rememberScrollState(0, composer13, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), UiAlignmentKt.a(tnCDialogUISpecs.c), composer13, 0);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer13, 0);
                    int i11 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer13.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer13, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion12.getConstructor();
                    if (composer13.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer13.startReusableNode();
                    if (composer13.getInserting()) {
                        composer13.createNode(constructor7);
                    } else {
                        composer13.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer13);
                    pk0.v(companion12, composerM3915constructorimpl7, measurePolicyColumnMeasurePolicy6, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl7, Integer.valueOf(i11), composerM3915constructorimpl7));
                    ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion11, tnCDialogUISpecs.d), composer13, 0);
                    TextKt.c(tnCDialogUIState.c, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null), tnCDialogUISpecs.e), null, null, composer13, 0, 12);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion11, tnCDialogUISpecs.f), composer13, 0);
                    composer13.startReplaceGroup(739986236);
                    Iterator it2 = tnCDialogUIState.d.iterator();
                    while (it2.hasNext()) {
                        TncDialogUIKt.b((TermTextUIState) it2.next(), ChaloThemeKt.c(Modifier.INSTANCE, tnCDialogUISpecs.g), composer13, 0);
                    }
                    composer13.endReplaceGroup();
                    Modifier.Companion companion13 = Modifier.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion13, tnCDialogUISpecs.h), composer13, 0);
                    if (dividerUIState == null) {
                        composer13.startReplaceGroup(1465095879);
                    } else {
                        composer13.startReplaceGroup(1465095880);
                        DividerUIStateKt.a(SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), dividerUIState, composer13, 6, 0);
                    }
                    composer13.endReplaceGroup();
                    ButtonContainerUIState buttonContainerUIState = tnCDialogUIState.e;
                    if (buttonContainerUIState == null) {
                        composer13.startReplaceGroup(1465310182);
                    } else {
                        composer13.startReplaceGroup(1465310183);
                        TncDialogUIKt.a(buttonContainerUIState, null, composer13, 0);
                    }
                    composer13.endReplaceGroup();
                    composer13.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            case 25:
                String key2 = (String) obj;
                List values2 = (List) obj2;
                List list = URLParserKt.f16809a;
                Intrinsics.i(key2, "key");
                Intrinsics.i(values2, "values");
                ((URLBuilder) obj3).i.d(values2, key2);
                return unit;
            case 26:
                ((UserConsentComponent) obj3).L0(UserConsentIntent.WebViewErrorReceivedIntent.f5357a);
                return unit;
            case 27:
                UserConsentRequiredDialogUIState userConsentRequiredDialogUIState = (UserConsentRequiredDialogUIState) obj3;
                Composer composer14 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (composer14.shouldExecute((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1349712620, iIntValue15, -1, "app.chalo.login.ui.userconsent.UserConsentRequiredDialog.<anonymous>.<anonymous>.<anonymous> (UserConsentScreen.kt:165)");
                    }
                    CommonImageKt.a(userConsentRequiredDialogUIState.f5361a.f9923a, null, false, composer14, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 28:
                OkHttpEngineKt$convertToOkHttpRequest$lambda$0$$inlined$forEachHeader$1 okHttpEngineKt$convertToOkHttpRequest$lambda$0$$inlined$forEachHeader$1 = (OkHttpEngineKt$convertToOkHttpRequest$lambda$0$$inlined$forEachHeader$1) obj3;
                String key3 = (String) obj;
                List values3 = (List) obj2;
                Set set = UtilsKt.f16623a;
                Intrinsics.i(key3, "key");
                Intrinsics.i(values3, "values");
                List list2 = HttpHeaders.f16799a;
                if (!"Content-Length".equals(key3) && !HttpHeaderParser.HEADER_CONTENT_TYPE.equals(key3)) {
                    if (UtilsKt.f16623a.contains(key3)) {
                        Iterator it3 = values3.iterator();
                        while (it3.hasNext()) {
                            okHttpEngineKt$convertToOkHttpRequest$lambda$0$$inlined$forEachHeader$1.invoke(key3, (String) it3.next());
                        }
                    } else {
                        okHttpEngineKt$convertToOkHttpRequest$lambda$0$$inlined$forEachHeader$1.invoke(key3, CollectionsKt.O(values3, "Cookie".equals(key3) ? "; " : ",", null, null, null, 62));
                    }
                }
                return unit;
            default:
                return WrapContentElement.Companion.size$lambda$0((Alignment) obj3, (IntSize) obj, (LayoutDirection) obj2);
        }
    }
}
