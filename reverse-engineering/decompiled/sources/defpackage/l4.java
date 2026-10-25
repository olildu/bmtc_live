package defpackage;

import android.content.Context;
import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.ScrollNode;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListState$prefetchScope$1;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.layout.Placeable;
import app.chalo.home.ui.chalobus.ChaloBusComponent;
import app.chalo.home.ui.chalobus.ChaloBusViewIntent;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.chalobus.RidePreferenceBannerState;
import app.chalo.home.ui.chalobus.SelectedDateAndTime;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel;
import app.chalo.livetracking.stoptripplannerresult.StopBasedTripPlannerResultsBottomSheetType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsMapStopMarkerInfo;
import app.chalo.network.interceptor.TimeoutInterceptor;
import app.chalo.ridehailing.feedback.RatingReaction;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.vault.dao.WalletDaoImpl;
import app.chalo.vault.mapper.WalletTransactionEntityMapperKt;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import io.ktor.client.engine.okhttp.OkHttpConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalTime;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18278a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l4(int i, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        this.f18278a = 6;
        this.b = i;
        this.c = objectRef;
        this.d = objectRef2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RidePreferenceBannerState saveRideEligible;
        switch (this.f18278a) {
            case 0:
                Context context = (Context) this.c;
                TimeoutInterceptor timeoutInterceptor = (TimeoutInterceptor) this.d;
                OkHttpConfig create = (OkHttpConfig) obj;
                Intrinsics.i(create, "$this$create");
                create.f16628a = new ej0(13, create.f16628a, new k4(context, timeoutInterceptor, this.b));
                return Unit.f17538a;
            case 1:
                ChaloBusComponent chaloBusComponent = (ChaloBusComponent) this.c;
                ChaloBusViewIntent.OnTimeChangeIntent onTimeChangeIntent = (ChaloBusViewIntent.OnTimeChangeIntent) this.d;
                ChaloBusViewState it = (ChaloBusViewState) obj;
                Intrinsics.i(it, "it");
                SelectedDateAndTime selectedDateAndTime = it.l;
                TimeUtilsContract timeUtilsContract = chaloBusComponent.x;
                int i = onTimeChangeIntent.b;
                int i2 = this.b;
                long jF = timeUtilsContract.f(i2, i);
                RidePreferenceBannerState confirmTimeUpdate = it.w;
                Long l = it.x;
                if (confirmTimeUpdate instanceof RidePreferenceBannerState.SaveRideEligible) {
                    RidePreferenceBannerState.SaveRideEligible saveRideEligible2 = (RidePreferenceBannerState.SaveRideEligible) confirmTimeUpdate;
                    String time = timeUtilsContract.l(jF);
                    boolean z = saveRideEligible2.f3302a;
                    String fromStopName = saveRideEligible2.b;
                    String toStopName = saveRideEligible2.c;
                    Intrinsics.i(fromStopName, "fromStopName");
                    Intrinsics.i(toStopName, "toStopName");
                    Intrinsics.i(time, "time");
                    saveRideEligible = new RidePreferenceBannerState.SaveRideEligible(z, fromStopName, toStopName, time, jF);
                } else {
                    boolean z2 = confirmTimeUpdate instanceof RidePreferenceBannerState.ConfirmTimeUpdate;
                    RidePreferenceBannerState.TimeAutoSet timeAutoSet = RidePreferenceBannerState.TimeAutoSet.f3303a;
                    if (z2) {
                        if (l == null || l.longValue() != jF) {
                            confirmTimeUpdate = new RidePreferenceBannerState.ConfirmTimeUpdate(jF, ((RidePreferenceBannerState.ConfirmTimeUpdate) confirmTimeUpdate).b);
                        } else {
                            saveRideEligible = timeAutoSet;
                        }
                    } else if (!Intrinsics.d(confirmTimeUpdate, RidePreferenceBannerState.Hidden.f3301a)) {
                        if (!Intrinsics.d(confirmTimeUpdate, timeAutoSet)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (l != null && l.longValue() != jF) {
                            confirmTimeUpdate = new RidePreferenceBannerState.ConfirmTimeUpdate(jF, l.longValue());
                        }
                    }
                    saveRideEligible = confirmTimeUpdate;
                }
                return ChaloBusViewState.a(it, null, false, 0, null, null, null, null, null, false, null, selectedDateAndTime != null ? new SelectedDateAndTime(new LocalDateTime(selectedDateAndTime.f3305a.a(), new LocalTime(i2, onTimeChangeIntent.b, 0, 0)), selectedDateAndTime.b) : null, null, null, null, null, null, null, null, false, null, false, saveRideEligible, null, null, null, 251650047);
            case 2:
                return ImeEditCommand_androidKt.setComposingText$lambda$0((String) this.c, (List) this.d, this.b, (TextFieldBuffer) obj);
            case 3:
                return LazyListState$prefetchScope$1.schedulePrefetch$lambda$1((Function1) this.c, this.b, (LazyListMeasureResult) this.d, (LazyLayoutPrefetchState.PrefetchResultScope) obj);
            case 4:
                n4 n4Var = (n4) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                RatingReaction rating = (RatingReaction) obj;
                Intrinsics.i(rating, "rating");
                n4Var.invoke(arrayList.get(this.b), rating);
                return Unit.f17538a;
            case 5:
                return RecomposeScopeImpl.end$lambda$0$1((RecomposeScopeImpl) this.c, this.b, (MutableObjectIntMap) this.d, (Composition) obj);
            case 6:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.c;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.d;
                RouteDetailsDataState it2 = (RouteDetailsDataState) obj;
                Intrinsics.i(it2, "it");
                List list = it2.B;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
                int i3 = 0;
                for (Object obj2 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    RouteDetailsMapStopMarkerInfo routeDetailsMapStopMarkerInfo = (RouteDetailsMapStopMarkerInfo) obj2;
                    arrayList2.add(i3 == this.b ? RouteDetailsMapStopMarkerInfo.a(routeDetailsMapStopMarkerInfo, (StopEtaStatus) objectRef.element, (StopEtaUiModel) objectRef2.element, null, true, 1907) : RouteDetailsMapStopMarkerInfo.a(routeDetailsMapStopMarkerInfo, StopEtaStatus.ETA_NOT_AVAILABLE, StopEtaUiModel.NotAvailable.f4416a, null, false, 1907));
                    i3 = i4;
                }
                return RouteDetailsDataState.a(it2, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, arrayList2, null, false, false, null, null, false, null, false, null, false, -268435457, 127);
            case 7:
                return ScrollNode.measure_3p2s80s$lambda$0((ScrollNode) this.c, this.b, (Placeable) this.d, (Placeable.PlacementScope) obj);
            case 8:
                TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = (TripPlannerItineraryAppResponseModel) this.c;
                TripPlannerLegAppModel.Bus bus = (TripPlannerLegAppModel.Bus) this.d;
                StopTripPlannerResultsDataState it3 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it3, "it");
                return StopTripPlannerResultsDataState.a(it3, null, null, null, null, null, null, null, null, null, null, new StopBasedTripPlannerResultsBottomSheetType.TrackingNotAvailableForLeg(tripPlannerItineraryAppResponseModel, bus, this.b), false, null, false, null, false, null, 520191);
            default:
                WalletDaoImpl walletDaoImpl = (WalletDaoImpl) this.c;
                WalletTransactionEntity walletTransactionEntity = (WalletTransactionEntity) this.d;
                walletDaoImpl.A().b0(WalletTransactionEntityMapperKt.a(walletTransactionEntity));
                walletDaoImpl.z().a0(this.b, walletTransactionEntity.d, walletTransactionEntity.c);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ l4(Object obj, int i, Object obj2, int i2) {
        this.f18278a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ l4(Object obj, Object obj2, int i, int i2) {
        this.f18278a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
