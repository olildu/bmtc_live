package app.chalo.superpass.data.features;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.repository.DigitalTripReceiptRepository;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.utils.MobileTicketingConverters;
import defpackage.xx;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/features/DigitalTripReceiptFeature;", "Lapp/chalo/superpass/data/features/IDigitalTripReceiptFeature;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DigitalTripReceiptFeature implements IDigitalTripReceiptFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f9522a;
    public final DigitalTripReceiptRepository b;
    public final AnalyticsContract c;
    public final UserProfileDetailsProvider d;
    public final CrashlyticsLogger e;
    public final MTicketUtilsHelper f;
    public final Lazy g = LazyKt.b(new xx(this, 3));

    public DigitalTripReceiptFeature(CoroutineContextProvider coroutineContextProvider, DigitalTripReceiptRepository digitalTripReceiptRepository, AnalyticsContract analyticsContract, UserProfileDetailsProvider userProfileDetailsProvider, CrashlyticsLogger crashlyticsLogger, MTicketUtilsHelper mTicketUtilsHelper, MobileTicketingConverters mobileTicketingConverters) {
        this.f9522a = coroutineContextProvider;
        this.b = digitalTripReceiptRepository;
        this.c = analyticsContract;
        this.d = userProfileDetailsProvider;
        this.e = crashlyticsLogger;
        this.f = mTicketUtilsHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(DigitalTripReceiptFeature digitalTripReceiptFeature, SuperPass superPass, ContinuationImpl continuationImpl) {
        DigitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1 digitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1;
        Map map;
        digitalTripReceiptFeature.getClass();
        if (continuationImpl instanceof DigitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1) {
            digitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1 = (DigitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1) continuationImpl;
            int i = digitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                digitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                digitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1 = new DigitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1(digitalTripReceiptFeature, continuationImpl);
            }
        } else {
            digitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1 = new DigitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1(digitalTripReceiptFeature, continuationImpl);
        }
        Object obj = digitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = digitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("type", "superPass"));
            MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
            digitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1.L$0 = linkedHashMapK;
            digitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1.label = 1;
            if (mixpanelUtil.c(linkedHashMapK, superPass, digitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = linkedHashMapK;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map2 = (Map) digitalTripReceiptFeature$raiseSendSuperPassActivationTimeStampToBackendForVisualValidationEvent$1.L$0;
            ResultKt.b(obj);
            map = map2;
        }
        AnalyticsContract.DefaultImpls.a(digitalTripReceiptFeature.c, "sync superPass activation timeStamp with backend", "", map, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.features.IDigitalTripReceiptFeature
    public final void a() {
        if (((Boolean) this.d.getG().getValue()).booleanValue()) {
            BuildersKt.d((CoroutineScope) this.g.getValue(), null, null, new DigitalTripReceiptFeature$sendUnSyncedActivationTimeStampsToBackend$1(this, null), 3);
        }
    }

    @Override // app.chalo.superpass.data.features.IDigitalTripReceiptFeature
    public final void b(MTicket lMTicket, long j) {
        Intrinsics.i(lMTicket, "lMTicket");
        Pair pair = new Pair("type", "mTicket");
        Pair pair2 = new Pair("bookingId", lMTicket.f5615a);
        Pair pair3 = new Pair("passengerTypes", MobileTicketingConverters.j(lMTicket.h));
        Pair pair4 = new Pair("fare", Double.valueOf(this.f.i(lMTicket)));
        Pair pair5 = new Pair("startDate", Long.valueOf(lMTicket.i));
        Pair pair6 = new Pair("expiryDate", Long.valueOf(lMTicket.j));
        Pair pair7 = new Pair("city", lMTicket.d);
        Pair pair8 = new Pair("agency", lMTicket.e);
        RouteStopsInfo routeStopsInfo = lMTicket.f;
        Pair pair9 = new Pair("upTripRouteId", String.valueOf(routeStopsInfo != null ? routeStopsInfo.f1717a : null));
        Pair pair10 = new Pair("upTripStartStopId", String.valueOf(routeStopsInfo != null ? routeStopsInfo.c : null));
        Pair pair11 = new Pair("upTripEndStopId", String.valueOf(routeStopsInfo != null ? routeStopsInfo.e : null));
        Boolean bool = lMTicket.s;
        AnalyticsContract.DefaultImpls.a(this.c, "sync mTicket activation timeStamp with backend", "", MapsKt.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, new Pair("isFreeRide", String.valueOf(bool != null ? bool.booleanValue() : false))), null, false, 24);
        BuildersKt.d((CoroutineScope) this.g.getValue(), null, null, new DigitalTripReceiptFeature$sendMTicketActivationTimeStampToBackend$1(this, lMTicket, j, null), 3);
    }

    @Override // app.chalo.superpass.data.features.IDigitalTripReceiptFeature
    public final void c(RideBasedSuperPass lSuperPass, long j) {
        Intrinsics.i(lSuperPass, "lSuperPass");
        BuildersKt.d((CoroutineScope) this.g.getValue(), null, null, new DigitalTripReceiptFeature$sendSuperPassActivationTimeStampToBackend$1(this, lSuperPass, j, null), 3);
    }

    public final void e(SuperPass lSuperPass) {
        Intrinsics.i(lSuperPass, "lSuperPass");
        BuildersKt.d((CoroutineScope) this.g.getValue(), null, null, new DigitalTripReceiptFeature$fetchSuperPassTripReceipts$1(this, lSuperPass, null), 3);
    }
}
