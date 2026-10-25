package defpackage;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import app.chalo.constants.Source;
import app.chalo.core.navigation.superpass.SuperPassParentComponent;
import app.chalo.home.ui.history.uistate.tabheader.HeaderAndIconContainerUiState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableState;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent;
import app.chalo.livetracking.search.uistate.NearestStopItemUIState;
import app.chalo.livetracking.search.uistate.RecentLocationPairUIState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultIntent;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent;
import app.chalo.livetracking.stoptripplannerresult.uistate.RefreshNudgeUiState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.FromStopAndBusIconUIState;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.onboarding.splash.orchestrator.SplashOperations;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerUIState;
import app.chalo.premiumbus.ui.slotselectionlist.SlotCardUIState;
import app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListComponent;
import app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListViewIntent;
import app.chalo.productactivation.ui.uistate.StepBasedRouteDetailsSectionUIState;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedContractKt;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedRestoredState;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargedProofImageUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewUIState;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadUIState;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.sos.SosScreenComponent;
import app.chalo.sos.SosScreenIntent;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.usecase.ChaloCustomDateFormat;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.utils.CoroutineUtils;
import app.chalo.utils.CoroutineUtils$getCoroutineExceptionHandler$$inlined$CoroutineExceptionHandler$1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g61 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15705a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g61(Object obj, int i) {
        this.f15705a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1;
        LinkedHashMap linkedHashMap;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$2;
        int i = this.f15705a;
        Unit unit = Unit.f17538a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return SearchBarState.currentValue_delegate$lambda$0((SearchBarState) obj);
            case 1:
                return SeekableTransitionState.recalculateTotalDurationNanos$lambda$0((SeekableTransitionState) obj);
            case 2:
                UiEventHandler uiEventHandler = ((PremiumBusSlotSelectionDateAndTimePickerUIState) obj).j.h;
                if (uiEventHandler != null) {
                    uiEventHandler.a();
                }
                return unit;
            case 3:
                SerialDescriptorImpl serialDescriptorImpl = (SerialDescriptorImpl) obj;
                return Integer.valueOf(PluginGeneratedSerialDescriptorKt.a(serialDescriptorImpl, serialDescriptorImpl.k));
            case 4:
                return ShaderBrushSpan.shaderState$lambda$0((ShaderBrushSpan) obj);
            case 5:
                return Boolean.valueOf(((FromStopAndBusIconUIState) obj).e.b != null);
            case 6:
                return SliderState.gestureEndAction$lambda$1((SliderState) obj);
            case 7:
                ((SlotSelectionListComponent) obj).G0(SlotSelectionListViewIntent.ConfirmButtonClickIntent.f7924a);
                return unit;
            case 8:
                ((SlotCardUIState) obj).d.a();
                return unit;
            case 9:
                return SnapshotStateObserver.sendNotifications$lambda$0((SnapshotStateObserver) obj);
            case 10:
                ((SosScreenComponent) obj).F0(SosScreenIntent.BackClickedIntent.f9408a);
                return unit;
            case 11:
                SplashOperations splashOperations = (SplashOperations) obj;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("firstSeen", FormatTimeInMillisToGivenFormatUseCase.a(splashOperations.q, splashOperations.p.j() - ((long) 19800000), ChaloCustomDateFormat.DATE_AND_TIME_WITH_YEAR_MONTH_DAY_ORDER_FORMAT, 4));
                return linkedHashMap2;
            case 12:
                ((StepBasedRouteDetailsSectionUIState) obj).b.d.a();
                return unit;
            case 13:
                ((app.chalo.uistate.multimodal.StepBasedRouteDetailsSectionUIState) obj).b.d.a();
                return unit;
            case 14:
                String str = ((StopBasedMetroLandingScreenComponent) obj).A;
                if (str != null) {
                    return new ResultStateKeeperMeta(str);
                }
                return null;
            case 15:
                ((StopTripPlannerResultsComponent) obj).N0(StopTripPlannerResultIntent.OnBackPressed.f4545a);
                return unit;
            case 16:
                ((RefreshNudgeUiState) obj).d.a();
                return unit;
            case 17:
                return ((StopBasedTripPlannerSearchComponent) obj).m.getG();
            case 18:
                ((NearestStopItemUIState) obj).g.a();
                return unit;
            case 19:
                ((RecentLocationPairUIState) obj).d.a();
                return unit;
            case 20:
                SuperPassParentComponent superPassParentComponent = (SuperPassParentComponent) obj;
                return ParametersHolderKt.a(superPassParentComponent.d, superPassParentComponent.e);
            case 21:
                EnlargedProofImageUIState enlargedProofImageUIState = ((SuperPassProofOverviewUIState) obj).d;
                if (enlargedProofImageUIState != null && (uiEventHandler$Companion$fromLambda$1 = enlargedProofImageUIState.f8460a.c) != null) {
                    uiEventHandler$Companion$fromLambda$1.a();
                }
                return unit;
            case 22:
                Set set = SuperPassPurchaseSharedViewModel.G;
                SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) ((SuperPassPurchaseSharedViewModel) obj).f.getValue();
                SuperPassPurchaseSharedState superPassPurchaseSharedState2 = SuperPassPurchaseSharedContractKt.f8345a;
                Intrinsics.i(superPassPurchaseSharedState, "<this>");
                Source source = superPassPurchaseSharedState.f8359a;
                AgencyInfoAppModel agencyInfoAppModel = superPassPurchaseSharedState.c;
                String str2 = superPassPurchaseSharedState.d;
                PassApplicationActionRequired passApplicationActionRequired = superPassPurchaseSharedState.e;
                PassApplicationRejectionReasons passApplicationRejectionReasons = superPassPurchaseSharedState.f;
                String str3 = superPassPurchaseSharedState.g;
                SuperPassUserDetails superPassUserDetails = superPassPurchaseSharedState.h;
                BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
                Long l = superPassPurchaseSharedState.j;
                long j = superPassPurchaseSharedState.k;
                boolean z = superPassPurchaseSharedState.l;
                SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = superPassPurchaseSharedState.m;
                PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType = superPassPurchaseSharedState.n;
                List list = superPassPurchaseSharedState.o;
                Map map = superPassPurchaseSharedState.p;
                if (map != null) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.g(map.size()));
                    for (Iterator it = map.entrySet().iterator(); it.hasNext(); it = it) {
                        Map.Entry entry = (Map.Entry) it.next();
                        linkedHashMap3.put(entry.getKey(), ((ProofUploadDetails) entry.getValue()).a());
                    }
                    linkedHashMap = linkedHashMap3;
                } else {
                    linkedHashMap = null;
                }
                return new SuperPassPurchaseSharedRestoredState(source, agencyInfoAppModel, str2, passApplicationActionRequired, passApplicationRejectionReasons, str3, superPassUserDetails, bookableSuperPassConfiguration, l, j, z, superPassPurchaseStopsInfo, postPassPurchaseSuccessFlowType, list, linkedHashMap, superPassPurchaseSharedState.q);
            case 23:
                DefaultIoScheduler defaultIoSchedulerB = ((SuperPassRepository) obj).f.b();
                Object obj2 = CoroutineUtils.f10423a;
                return defaultIoSchedulerB.plus(new CoroutineUtils$getCoroutineExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.f17717a));
            case 24:
                EnlargedProofImageUIState enlargedProofImageUIState2 = ((SuperPassUserProofUploadUIState) obj).h;
                if (enlargedProofImageUIState2 != null && (uiEventHandler$Companion$fromLambda$2 = enlargedProofImageUIState2.f8460a.c) != null) {
                    uiEventHandler$Companion$fromLambda$2.a();
                }
                return unit;
            case 25:
                return ((SwipeableState) obj).c();
            case 26:
                ((HeaderAndIconContainerUiState) obj).d.a();
                return unit;
            case 27:
                return Boolean.valueOf(TextAnnotatedStringNode.applySemantics$lambda$3((TextAnnotatedStringNode) obj));
            case 28:
                return TextContextMenuToolbarHandlerNode.derivedData_delegate$lambda$0((TextContextMenuToolbarHandlerNode) obj);
            default:
                return ((TextFieldColors) obj).textSelectionColors;
        }
    }
}
