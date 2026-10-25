package app.chalo.ridehailing.feedback;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.datastore.LocalDataStore;
import app.chalo.features.freshchat.InitiateFreshChatCustomerSupportUseCase;
import app.chalo.features.reportproblem.ReportProblemFeatureProblem;
import app.chalo.location.LatLng;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.ridefeedback.domain.GetPostRideFeedbackDataUseCase;
import app.chalo.ridehailing.data.RideHailingRepository;
import app.chalo.ridehailing.data.app.RideHailingBookingDriverDetailsAppModel;
import app.chalo.ridehailing.data.app.RideHailingBookingWaypointAppModel;
import app.chalo.ridehailing.data.app.RideHailingRemoteConfigAppModel;
import app.chalo.ridehailing.data.app.RideHailingRemoteConfigModel;
import app.chalo.ridehailing.data.app.RideHailingVehicleDetailsAppModel;
import app.chalo.ridehailing.data.manager.RideHailingStaticTripDetails;
import app.chalo.ridehailing.domain.SubmitRideHailingBookingFeedbackUseCase;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.RideUserFeedbackScreenArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.utils.SystemHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ridehailing/feedback/AutoRideFeedbackDelegate;", "Lapp/chalo/ridehailing/feedback/BaseRideFeedbackDelegate;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoRideFeedbackDelegate extends BaseRideFeedbackDelegate {
    public static final Preferences.Key u = PreferencesKeys.stringKey("lastAutoRideBookingFeedback");
    public final RideUserFeedbackScreenArgs.Auto h;
    public final RideFeedbackUIStateFactory i;
    public final RideFeedbackUserPropertiesFactory j;
    public final InitiateFreshChatCustomerSupportUseCase k;
    public final ChaloNavigationManager l;
    public final SubmitRideHailingBookingFeedbackUseCase m;
    public final LocalDataStore n;
    public final GetPostRideFeedbackDataUseCase o;
    public final RideHailingRepository p;
    public final StringProvider q;
    public final KotlinToastManager r;
    public final AnalyticsContract s;
    public final SystemHelper t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ridehailing/feedback/AutoRideFeedbackDelegate$Companion;", "", "", "LAST_AUTO_RIDE_BOOKING_FEEDBACK", "Ljava/lang/String;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoRideFeedbackDelegate(RideUserFeedbackScreenArgs.Auto args, RideFeedbackUIStateFactory rideFeedbackUIStateFactory, RideFeedbackUserPropertiesFactory rideFeedbackUserPropertiesFactory, InitiateFreshChatCustomerSupportUseCase initiateFreshChatCustomerSupportUseCase, ChaloNavigationManager chaloNavigationManager, SubmitRideHailingBookingFeedbackUseCase submitRideHailingBookingFeedbackUseCase, LocalDataStore localDataStore, GetPostRideFeedbackDataUseCase getPostRideFeedbackDataUseCase, RideHailingRepository rideHailingRepository, StringProvider stringProvider, KotlinToastManager kotlinToastManager, AnalyticsContract analyticsContract, SystemHelper systemHelper) {
        super(stringProvider, kotlinToastManager, chaloNavigationManager, analyticsContract, Source.RIDE_HAILING_USER_FEEDBACK_SCREEN);
        Intrinsics.i(args, "args");
        this.h = args;
        this.i = rideFeedbackUIStateFactory;
        this.j = rideFeedbackUserPropertiesFactory;
        this.k = initiateFreshChatCustomerSupportUseCase;
        this.l = chaloNavigationManager;
        this.m = submitRideHailingBookingFeedbackUseCase;
        this.n = localDataStore;
        this.o = getPostRideFeedbackDataUseCase;
        this.p = rideHailingRepository;
        this.q = stringProvider;
        this.r = kotlinToastManager;
        this.s = analyticsContract;
        this.t = systemHelper;
    }

    @Override // app.chalo.ridehailing.feedback.RideFeedbackFlowDelegate
    public final void a(ContextScope coroutineScope) {
        Map mapD;
        RideHailingStaticTripDetails rideHailingStaticTripDetails;
        String str;
        Intrinsics.i(coroutineScope, "coroutineScope");
        BaseRideFeedbackDelegate.h(this, "ride feedback need help clicked");
        ReportProblemFeatureProblem reportProblemFeatureProblem = new ReportProblemFeatureProblem("", "", "rideHailingAutoSupport", "chat", EmptyList.f17557a);
        LinkedHashMap linkedHashMapA = this.j.a();
        BookingContext bookingContext = ((RideFeedbackDataState) this.g.getValue()).f9141a;
        BookingContext.Auto auto = bookingContext instanceof BookingContext.Auto ? (BookingContext.Auto) bookingContext : null;
        if (auto == null || (rideHailingStaticTripDetails = auto.f9130a) == null) {
            mapD = MapsKt.d();
        } else {
            RideHailingVehicleDetailsAppModel rideHailingVehicleDetailsAppModel = rideHailingStaticTripDetails.e;
            RideHailingBookingWaypointAppModel rideHailingBookingWaypointAppModel = rideHailingStaticTripDetails.c;
            RideHailingBookingWaypointAppModel rideHailingBookingWaypointAppModel2 = rideHailingStaticTripDetails.b;
            Pair pair = new Pair("rideHailingTripId", rideHailingStaticTripDetails.f9125a);
            String str2 = rideHailingBookingWaypointAppModel2.f9112a;
            LatLng latLng = rideHailingBookingWaypointAppModel2.c;
            Pair pair2 = new Pair("rideHailingPickupName", str2);
            Pair pair3 = new Pair("rideHailingPickupLocationLat", String.valueOf(latLng.f5134a));
            Pair pair4 = new Pair("rideHailingPickupLocationLong", String.valueOf(latLng.b));
            String str3 = rideHailingBookingWaypointAppModel.f9112a;
            LatLng latLng2 = rideHailingBookingWaypointAppModel.c;
            Pair pair5 = new Pair("rideHailingDropoffName", str3);
            Pair pair6 = new Pair("rideHailingDropoffLocationLat", String.valueOf(latLng2.f5134a));
            Pair pair7 = new Pair("rideHailingDropoffLocationLong", String.valueOf(latLng2.b));
            RideHailingBookingDriverDetailsAppModel rideHailingBookingDriverDetailsAppModel = rideHailingStaticTripDetails.d;
            Pair pair8 = new Pair("rideHailingDriverName", rideHailingBookingDriverDetailsAppModel.f9107a);
            Pair pair9 = new Pair("rideHailingDriverPhone", rideHailingBookingDriverDetailsAppModel.c);
            Pair pair10 = new Pair("rideHailingVehicleCategory", rideHailingVehicleDetailsAppModel.f9117a.name());
            String str4 = rideHailingVehicleDetailsAppModel.b;
            if (str4 == null) {
                str4 = "";
                str = str4;
            } else {
                str = "";
            }
            Pair pair11 = new Pair("rideHailingVehicleName", str4);
            Pair pair12 = new Pair("rideHailingVehicleRegistrationNumber", rideHailingVehicleDetailsAppModel.e);
            Pair pair13 = new Pair("rideHailingRideAmount", String.valueOf(rideHailingStaticTripDetails.g));
            String str5 = rideHailingStaticTripDetails.h;
            mapD = MapsKt.i(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, new Pair("rideHailingPaymentMode", str5 == null ? str : str5));
        }
        this.k.a(reportProblemFeatureProblem, MapsKt.l(linkedHashMapA, mapD));
    }

    @Override // app.chalo.ridehailing.feedback.RideFeedbackFlowDelegate
    public final void b(ContextScope coroutineScope) {
        RideHailingStaticTripDetails rideHailingStaticTripDetails;
        String str;
        Intrinsics.i(coroutineScope, "coroutineScope");
        BookingContext bookingContext = ((RideFeedbackDataState) this.g.getValue()).f9141a;
        BookingContext.Auto auto = bookingContext instanceof BookingContext.Auto ? (BookingContext.Auto) bookingContext : null;
        if (auto == null || (rideHailingStaticTripDetails = auto.f9130a) == null || (str = rideHailingStaticTripDetails.f9125a) == null) {
            return;
        }
        BaseRideFeedbackDelegate.h(this, "ride feedback trip details clicked");
        ChaloNavigationManagerKt.e(this.l, new TripSummaryArgs.RideReceiptScreen(Source.RIDE_HAILING_USER_FEEDBACK_SCREEN, str), null, 6);
    }

    @Override // app.chalo.ridehailing.feedback.RideFeedbackFlowDelegate
    public final void c(ContextScope coroutineScope) {
        Intrinsics.i(coroutineScope, "coroutineScope");
        BaseRideFeedbackDelegate.h(this, "ride feedback skip clicked");
        BuildersKt.d(coroutineScope, null, null, new AutoRideFeedbackDelegate$onSkipUserFeedbackCtaClick$1(this, null), 3);
    }

    @Override // app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate
    public final Object d(RideFeedbackDataState rideFeedbackDataState, Function1 function1, ContinuationImpl continuationImpl) {
        return this.i.b(rideFeedbackDataState, function1, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate
    public final Object g(ContinuationImpl continuationImpl) {
        AutoRideFeedbackDelegate$loadInitialData$1 autoRideFeedbackDelegate$loadInitialData$1;
        BookingContext.Auto auto;
        if (continuationImpl instanceof AutoRideFeedbackDelegate$loadInitialData$1) {
            autoRideFeedbackDelegate$loadInitialData$1 = (AutoRideFeedbackDelegate$loadInitialData$1) continuationImpl;
            int i = autoRideFeedbackDelegate$loadInitialData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                autoRideFeedbackDelegate$loadInitialData$1.label = i - Integer.MIN_VALUE;
            } else {
                autoRideFeedbackDelegate$loadInitialData$1 = new AutoRideFeedbackDelegate$loadInitialData$1(this, continuationImpl);
            }
        } else {
            autoRideFeedbackDelegate$loadInitialData$1 = new AutoRideFeedbackDelegate$loadInitialData$1(this, continuationImpl);
        }
        Object obj = autoRideFeedbackDelegate$loadInitialData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = autoRideFeedbackDelegate$loadInitialData$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Json json = ChaloJson.b;
            String str = this.h.c;
            json.getClass();
            BookingContext.Auto auto2 = new BookingContext.Auto((RideHailingStaticTripDetails) json.b(str, RideHailingStaticTripDetails.INSTANCE.serializer()));
            RideHailingRemoteConfigModel.INSTANCE.getClass();
            RideHailingRemoteConfigModel rideHailingRemoteConfigModel = RideHailingRemoteConfigModel.e;
            String str2 = rideHailingRemoteConfigModel.f9115a;
            String str3 = rideHailingRemoteConfigModel.b;
            autoRideFeedbackDelegate$loadInitialData$1.L$0 = auto2;
            autoRideFeedbackDelegate$loadInitialData$1.label = 1;
            Object objA = this.o.a(str2, str3, autoRideFeedbackDelegate$loadInitialData$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            auto = auto2;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            auto = (BookingContext.Auto) autoRideFeedbackDelegate$loadInitialData$1.L$0;
            ResultKt.b(obj);
        }
        RideHailingRemoteConfigAppModel rideHailingRemoteConfigAppModel = (RideHailingRemoteConfigAppModel) obj;
        List list = rideHailingRemoteConfigAppModel != null ? rideHailingRemoteConfigAppModel.c : null;
        if (list == null) {
            list = EmptyList.f17557a;
        }
        return new RideFeedbackDataState(auto, list, 60);
    }

    @Override // app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate
    public final Map i() {
        Object objA;
        try {
            Json json = ChaloJson.b;
            String str = this.h.c;
            json.getClass();
            objA = (RideHailingStaticTripDetails) json.b(str, RideHailingStaticTripDetails.INSTANCE.serializer());
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (objA instanceof Result.Failure) {
            objA = null;
        }
        RideHailingStaticTripDetails rideHailingStaticTripDetails = (RideHailingStaticTripDetails) objA;
        MapBuilder mapBuilder = new MapBuilder();
        if (rideHailingStaticTripDetails != null) {
            mapBuilder.put("bookingId", rideHailingStaticTripDetails.f9125a);
        }
        RideHailingRemoteConfigModel.INSTANCE.getClass();
        RideHailingRemoteConfigModel rideHailingRemoteConfigModel = RideHailingRemoteConfigModel.e;
        mapBuilder.put("productType", rideHailingRemoteConfigModel.f9115a);
        mapBuilder.put("productSubType", rideHailingRemoteConfigModel.b);
        return mapBuilder.h();
    }

    /* JADX WARN: Code duplicated, block: B:114:0x021d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0220  */
    /* JADX WARN: Code duplicated, block: B:118:0x0255  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02b1, code lost:
    
        if (r22.n.c(r1, r3) == r4) goto L121;
     */
    @Override // app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(app.chalo.ridehailing.feedback.RideFeedbackDataState r23, kotlinx.coroutines.CoroutineScope r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ridehailing.feedback.AutoRideFeedbackDelegate.j(app.chalo.ridehailing.feedback.RideFeedbackDataState, kotlinx.coroutines.CoroutineScope, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
