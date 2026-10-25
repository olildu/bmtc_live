package defpackage;

import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.IndicatorLineNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.appUpdate.ForceAppUpdateDataState;
import app.chalo.home.PendingRideFeedbackStickyBannerUIState;
import app.chalo.home.SnackBarState;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.ui.base.HomeScreenFragmentViewIntent;
import app.chalo.home.ui.base.HomeScreenFragmentViewState;
import app.chalo.home.ui.base.RideHailingUserFeedbackData;
import app.chalo.home.ui.compose.UserProfilingChaloBusStickyBannerUIState;
import app.chalo.home.ui.compose.UserProfilingHomeStickyBannerUIState;
import app.chalo.home.ui.home.HomeScreenBottomSheetType;
import app.chalo.home.ui.home.HomeScreenViewState;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessState;
import app.chalo.multimodalticket.data.model.app.GroupTicketLegFareDetailAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryResponseAppModel;
import app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryDataState;
import app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryViewIntent;
import app.chalo.multimodalticket.ui.GroupTicketJourneySelectionMode;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionBottomSheetDataStateType;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import app.chalo.scenes.args.UpdateType;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import app.chalo.walletframework.wallet.data.model.WalletStatus;
import in.juspay.hypersdk.services.HyperPaymentsServices;
import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.HttpRequestLifecycleKt;
import io.ktor.client.plugins.HttpRequestRetryKt;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.Attributes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import okio.ForwardingFileSystem;
import okio.Path;
import org.json.JSONObject;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e40 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15516a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e40(Object obj, int i) {
        this.f15516a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IOException {
        GroupTicketLegFareDetailAppModel groupTicketLegFareDetailAppModel;
        List list;
        int i = this.f15516a;
        Object obj2 = null;
        Unit unit = Unit.f17538a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return FlowLayoutKt.placeHelper_BmaY500$lambda$2((MutableVector) obj3, (Placeable.PlacementScope) obj);
            case 1:
                UpdateType updateType = (UpdateType) obj3;
                Intrinsics.i((ForceAppUpdateDataState) obj, "it");
                Intrinsics.i(updateType, "updateType");
                return new ForceAppUpdateDataState(updateType);
            case 2:
                Path it = (Path) obj;
                int i2 = ForwardingFileSystem.f18620a;
                Intrinsics.i(it, "it");
                return ((ForwardingFileSystem) obj3).onPathResult(it, "listRecursively");
            case 3:
                GroupTicketLegSelectionDataState it2 = (GroupTicketLegSelectionDataState) obj;
                Intrinsics.i(it2, "it");
                return GroupTicketLegSelectionDataState.a(it2, null, false, new GroupTicketLegSelectionBottomSheetDataStateType.ErrorType(((ProductBookingDataSourceError) obj3).f8097a), null, null, null, 0, null, 249);
            case 4:
                GroupTicketLegSelectionDataState it3 = (GroupTicketLegSelectionDataState) obj;
                Intrinsics.i(it3, "it");
                return GroupTicketLegSelectionDataState.a(it3, (GroupTicketJourneySelectionMode) obj3, false, null, null, null, null, 0, null, 254);
            case 5:
                GroupTicketSummaryViewIntent groupTicketSummaryViewIntent = (GroupTicketSummaryViewIntent) obj3;
                GroupTicketSummaryDataState it4 = (GroupTicketSummaryDataState) obj;
                Intrinsics.i(it4, "it");
                Set set = it4.d;
                GroupTicketSummaryResponseAppModel groupTicketSummaryResponseAppModel = it4.c;
                if (groupTicketSummaryResponseAppModel == null) {
                    return it4;
                }
                ArrayList arrayList = groupTicketSummaryResponseAppModel.b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj4 = arrayList.get(i3);
                    i3++;
                    if (((GroupTicketLegFareDetailAppModel) obj4).f5860a == ((GroupTicketSummaryViewIntent.OnLegFareRowClicked) groupTicketSummaryViewIntent).f5906a) {
                        obj2 = obj4;
                        groupTicketLegFareDetailAppModel = (GroupTicketLegFareDetailAppModel) obj2;
                        if (groupTicketLegFareDetailAppModel != null || (list = groupTicketLegFareDetailAppModel.c) == null || !(!list.isEmpty())) {
                            return it4;
                        }
                        int i4 = ((GroupTicketSummaryViewIntent.OnLegFareRowClicked) groupTicketSummaryViewIntent).f5906a;
                        return GroupTicketSummaryDataState.a(it4, null, null, null, set.contains(Integer.valueOf(i4)) ? SetsKt.b(set, Integer.valueOf(i4)) : SetsKt.f(set, Integer.valueOf(i4)), false, false, false, false, false, TypedValues.PositionType.TYPE_PERCENT_WIDTH);
                    }
                }
                groupTicketLegFareDetailAppModel = (GroupTicketLegFareDetailAppModel) obj2;
                return groupTicketLegFareDetailAppModel != null ? it4 : it4;
            case 6:
                GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs = ((GroupTicketSummaryViewIntent.InitialisationIntent) obj3).f5903a;
                return GroupTicketSummaryDataState.a((GroupTicketSummaryDataState) obj, groupTicketBookingSummaryArgs.f, groupTicketBookingSummaryArgs, null, null, false, false, false, false, false, TypedValues.PositionType.TYPE_CURVE_FIT);
            case 7:
                HomeScreenFragmentViewIntent.RideHailingUserFeedbackBottomsheetUserCommentChangedIntent rideHailingUserFeedbackBottomsheetUserCommentChangedIntent = (HomeScreenFragmentViewIntent.RideHailingUserFeedbackBottomsheetUserCommentChangedIntent) obj3;
                HomeScreenFragmentViewState it5 = (HomeScreenFragmentViewState) obj;
                Intrinsics.i(it5, "it");
                RideHailingUserFeedbackData rideHailingUserFeedbackData = it5.k;
                return HomeScreenFragmentViewState.a(it5, null, null, null, null, null, null, null, null, rideHailingUserFeedbackData != null ? RideHailingUserFeedbackData.a(rideHailingUserFeedbackData, null, rideHailingUserFeedbackBottomsheetUserCommentChangedIntent.f3220a, 3) : null, null, null, null, false, 31743);
            case 8:
                HomeScreenFragmentViewState it6 = (HomeScreenFragmentViewState) obj;
                Intrinsics.i(it6, "it");
                return HomeScreenFragmentViewState.a(it6, null, null, null, null, null, null, null, null, null, null, (UserProfilingChaloBusStickyBannerUIState) obj3, null, false, 28671);
            case 9:
                HomeScreenFragmentViewState it7 = (HomeScreenFragmentViewState) obj;
                Intrinsics.i(it7, "it");
                return HomeScreenFragmentViewState.a(it7, null, null, null, null, null, null, null, null, (RideHailingUserFeedbackData) obj3, null, null, null, false, 31743);
            case 10:
                HomeScreenFragmentViewState it8 = (HomeScreenFragmentViewState) obj;
                Intrinsics.i(it8, "it");
                return HomeScreenFragmentViewState.a(it8, null, null, null, null, null, null, null, null, null, (UserProfilingHomeStickyBannerUIState) obj3, null, null, false, 30719);
            case 11:
                HomeScreenFragmentViewState it9 = (HomeScreenFragmentViewState) obj;
                Intrinsics.i(it9, "it");
                return HomeScreenFragmentViewState.a(it9, null, null, null, null, null, null, null, null, null, null, null, (PendingRideFeedbackStickyBannerUIState) obj3, false, 24575);
            case 12:
                return HomeScreenFragmentViewState.a((HomeScreenFragmentViewState) obj, null, null, null, null, null, (SnackBarState) obj3, null, null, null, null, null, null, false, 32703);
            case 13:
                HomeScreenViewState it10 = (HomeScreenViewState) obj;
                Intrinsics.i(it10, "it");
                return HomeScreenViewState.a(it10, null, null, null, null, HomeScreenBottomSheetType.PremiumBusInAppCommunicationBottomSheet.f3534a, null, null, (PremiumBusInAppCommunicationBottomSheetData) obj3, false, null, null, null, null, null, null, false, false, false, 523999);
            case 14:
                HomeScreenViewState it11 = (HomeScreenViewState) obj;
                Intrinsics.i(it11, "it");
                return HomeScreenViewState.a(it11, null, null, null, null, null, null, null, null, false, ((PremiumReserveTicketPostBookingActionState) obj3).f7473a, null, null, null, null, null, false, false, false, 523135);
            case 15:
                PremiumBusBookingCardData premiumBusBookingCardData = (PremiumBusBookingCardData) obj3;
                HomeScreenViewState it12 = (HomeScreenViewState) obj;
                Intrinsics.i(it12, "it");
                return HomeScreenViewState.a(it12, null, null, null, null, null, null, premiumBusBookingCardData, null, false, premiumBusBookingCardData.d, null, null, null, null, null, false, false, false, 523135);
            case 16:
                HomeScreenViewState it13 = (HomeScreenViewState) obj;
                Intrinsics.i(it13, "it");
                return HomeScreenViewState.a(it13, null, null, null, null, null, null, null, null, false, null, null, null, (TitoRideDataAppModel) obj3, null, null, false, false, false, 516095);
            case 17:
                ((HomeScreenInfoHelper) obj3).d(!((Boolean) obj).booleanValue());
                return unit;
            case 18:
                HttpClient httpClient = (HttpClient) obj3;
                if (((Throwable) obj) != null) {
                    CoroutineScopeKt.b(httpClient.f16610a, null);
                } else {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = HttpClient.l;
                }
                return unit;
            case 19:
                HttpClientPlugin httpClientPlugin = (HttpClientPlugin) obj3;
                HttpClient scope = (HttpClient) obj;
                Intrinsics.i(scope, "scope");
                Attributes attributes = (Attributes) scope.i.g(HttpClientPluginKt.f16655a, new e80(11));
                Object obj5 = scope.k.b.get(httpClientPlugin.getC());
                Intrinsics.f(obj5);
                Object objA = httpClientPlugin.a((Function1) obj5);
                httpClientPlugin.b(objA, scope);
                attributes.a(httpClientPlugin.getC(), objA);
                return unit;
            case 20:
                ((HttpClientEngine) obj3).close();
                return unit;
            case 21:
                CompletableJob completableJob = (CompletableJob) obj3;
                Throwable th = (Throwable) obj;
                Logger logger = HttpRequestLifecycleKt.f16661a;
                if (th != null) {
                    logger.b("Cancelling request because engine Job failed with error: " + th);
                    JobKt.c(completableJob, "Engine failed", th);
                } else {
                    logger.b("Cancelling request because engine Job completed");
                    ((JobImpl) completableJob).complete();
                }
                return unit;
            case 22:
                Logger logger2 = HttpRequestLifecycleKt.f16661a;
                ((DisposableHandle) obj3).dispose();
                return unit;
            case 23:
                Throwable th2 = (Throwable) obj;
                Logger logger3 = HttpRequestRetryKt.f16663a;
                Job job = ((HttpRequestBuilder) obj3).e;
                Intrinsics.g(job, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
                CompletableJob completableJob2 = (CompletableJob) job;
                if (th2 == null) {
                    completableJob2.complete();
                } else {
                    completableJob2.c(th2);
                }
                return unit;
            case 24:
                Logger logger4 = HttpTimeoutKt.f16672a;
                ((JobSupport) ((Job) obj3)).cancel(null);
                return unit;
            case 25:
                return ((HyperPaymentsServices) obj3).lambda$process$6((JSONObject) obj);
            case 26:
                return IconKt.Icon$lambda$12$lambda$11((ColorProducer) obj3, (CacheDrawScope) obj);
            case 27:
                return IconKt.Icon$lambda$12$lambda$11$lambda$10((GraphicsLayer) obj3, (ContentDrawScope) obj);
            case 28:
                return IndicatorLineNode.drawWithCacheModifierNode$lambda$3((IndicatorLineNode) obj3, (CacheDrawScope) obj);
            default:
                InstantTicketWalletAccessState it14 = (InstantTicketWalletAccessState) obj;
                Intrinsics.i(it14, "it");
                return InstantTicketWalletAccessState.a(it14, null, false, false, null, null, false, (WalletStatus) obj3, null, false, false, null, false, false, 8127);
        }
    }
}
