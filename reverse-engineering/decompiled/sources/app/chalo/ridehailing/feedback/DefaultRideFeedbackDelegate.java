package app.chalo.ridehailing.feedback;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.features.freshchat.InitiateFreshChatCustomerSupportUseCase;
import app.chalo.features.reportproblem.ReportProblemFeatureProblem;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.ridefeedback.data.RideFeedbackRepository;
import app.chalo.ridefeedback.data.app.RideFeedbackBookingData;
import app.chalo.ridefeedback.data.app.RideFeedbackFillStatus;
import app.chalo.ridefeedback.data.app.RideFeedbackRequestAppModel;
import app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueEntity;
import app.chalo.ridefeedback.domain.GetPostRideFeedbackDataUseCase;
import app.chalo.ridefeedback.domain.RideFeedbackSubmissionGate;
import app.chalo.ridefeedback.domain.SubmitRideFeedbackUseCase;
import app.chalo.ridehailing.data.app.RideHailingRemoteConfigAppModel;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.RideUserFeedbackScreenArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.utils.SystemHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/DefaultRideFeedbackDelegate;", "Lapp/chalo/ridehailing/feedback/BaseRideFeedbackDelegate;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultRideFeedbackDelegate extends BaseRideFeedbackDelegate {
    public final RideUserFeedbackScreenArgs.Default h;
    public final DefaultRideFeedbackUIStateFactory i;
    public final GetPostRideFeedbackDataUseCase j;
    public final SubmitRideFeedbackUseCase k;
    public final RideFeedbackRepository l;
    public final RideFeedbackSubmissionGate m;
    public final SystemHelper n;
    public final StringProvider o;
    public final KotlinToastManager p;
    public final ChaloNavigationManager q;
    public final InitiateFreshChatCustomerSupportUseCase r;
    public final RideFeedbackUserPropertiesFactory s;
    public final AnalyticsContract t;
    public final boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultRideFeedbackDelegate(RideUserFeedbackScreenArgs.Default args, DefaultRideFeedbackUIStateFactory defaultRideFeedbackUIStateFactory, GetPostRideFeedbackDataUseCase getPostRideFeedbackDataUseCase, SubmitRideFeedbackUseCase submitRideFeedbackUseCase, RideFeedbackRepository rideFeedbackRepository, RideFeedbackSubmissionGate rideFeedbackSubmissionGate, SystemHelper systemHelper, StringProvider stringProvider, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, InitiateFreshChatCustomerSupportUseCase initiateFreshChatCustomerSupportUseCase, RideFeedbackUserPropertiesFactory rideFeedbackUserPropertiesFactory, AnalyticsContract analyticsContract) {
        super(stringProvider, kotlinToastManager, chaloNavigationManager, analyticsContract, Source.POST_RIDE_FEEDBACK_SCREEN);
        Intrinsics.i(args, "args");
        this.h = args;
        this.i = defaultRideFeedbackUIStateFactory;
        this.j = getPostRideFeedbackDataUseCase;
        this.k = submitRideFeedbackUseCase;
        this.l = rideFeedbackRepository;
        this.m = rideFeedbackSubmissionGate;
        this.n = systemHelper;
        this.o = stringProvider;
        this.p = kotlinToastManager;
        this.q = chaloNavigationManager;
        this.r = initiateFreshChatCustomerSupportUseCase;
        this.s = rideFeedbackUserPropertiesFactory;
        this.t = analyticsContract;
        this.u = args.f;
    }

    public static final Object l(DefaultRideFeedbackDelegate defaultRideFeedbackDelegate, RideFeedbackDataState rideFeedbackDataState, RideFeedbackBookingData rideFeedbackBookingData, CoroutineScope coroutineScope, Continuation continuation) {
        RideFeedbackFillStatus rideFeedbackFillStatus;
        String str;
        defaultRideFeedbackDelegate.getClass();
        List list = rideFeedbackDataState.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            rideFeedbackFillStatus = !rideFeedbackDataState.e.isEmpty() ? RideFeedbackFillStatus.PARTIAL : RideFeedbackFillStatus.PARTIAL;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((UserFeedbackRatingData) it.next()).c) {
                    }
                } else if (!rideFeedbackDataState.e.isEmpty() && ((str = rideFeedbackDataState.c) == null || StringsKt.F(str))) {
                    rideFeedbackFillStatus = RideFeedbackFillStatus.NOT_FILLED;
                }
            }
        }
        if (rideFeedbackFillStatus == RideFeedbackFillStatus.NOT_FILLED) {
            Object objC = defaultRideFeedbackDelegate.l.c(rideFeedbackBookingData.f9067a, RideFeedbackFillStatus.DISMISSED, rideFeedbackBookingData.b, rideFeedbackBookingData.c, (ContinuationImpl) continuation);
            if (objC == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objC;
            }
        } else {
            Object objO = defaultRideFeedbackDelegate.o(coroutineScope, defaultRideFeedbackDelegate.m(rideFeedbackDataState, rideFeedbackBookingData, true), (ContinuationImpl) continuation);
            if (objO == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objO;
            }
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.ridehailing.feedback.RideFeedbackFlowDelegate
    public final void a(ContextScope coroutineScope) {
        RideFeedbackBookingData rideFeedbackBookingData;
        Intrinsics.i(coroutineScope, "coroutineScope");
        BaseRideFeedbackDelegate.h(this, "ride feedback need help clicked");
        ReportProblemFeatureProblem reportProblemFeatureProblem = new ReportProblemFeatureProblem("", "", "postRideFeedbackSupport", "chat", EmptyList.f17557a);
        LinkedHashMap linkedHashMapA = this.s.a();
        BookingContext bookingContext = ((RideFeedbackDataState) this.g.getValue()).f9141a;
        BookingContext.Default r1 = bookingContext instanceof BookingContext.Default ? (BookingContext.Default) bookingContext : null;
        this.r.a(reportProblemFeatureProblem, MapsKt.l(linkedHashMapA, (r1 == null || (rideFeedbackBookingData = r1.f9131a) == null) ? MapsKt.d() : MapsKt.i(new Pair("postRideFeedbackTripId", rideFeedbackBookingData.d), new Pair("postRideFeedbackFromStop", rideFeedbackBookingData.f), new Pair("postRideFeedbackToStop", rideFeedbackBookingData.g), new Pair("postRideFeedbackRouteId", rideFeedbackBookingData.e), new Pair("userPropertyBookingId", rideFeedbackBookingData.f9067a))));
    }

    @Override // app.chalo.ridehailing.feedback.RideFeedbackFlowDelegate
    public final void b(ContextScope coroutineScope) {
        RideFeedbackBookingData rideFeedbackBookingData;
        String str;
        Intrinsics.i(coroutineScope, "coroutineScope");
        BookingContext bookingContext = ((RideFeedbackDataState) this.g.getValue()).f9141a;
        BookingContext.Default r4 = bookingContext instanceof BookingContext.Default ? (BookingContext.Default) bookingContext : null;
        if (r4 == null || (rideFeedbackBookingData = r4.f9131a) == null || (str = rideFeedbackBookingData.f9067a) == null) {
            return;
        }
        BaseRideFeedbackDelegate.h(this, "ride feedback trip details clicked");
        ChaloNavigationManagerKt.e(this.q, new TripSummaryArgs.TicketSummaryScreen(Source.POST_RIDE_FEEDBACK_SCREEN, new BookingsRequestType.PremiumBusTicketType(str)), null, 6);
    }

    @Override // app.chalo.ridehailing.feedback.RideFeedbackFlowDelegate
    public final void c(ContextScope coroutineScope) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.i(coroutineScope, "coroutineScope");
        if (((RideFeedbackDataState) this.g.getValue()).d) {
            return;
        }
        BaseRideFeedbackDelegate.h(this, "ride feedback skip clicked");
        do {
            mutableStateFlow = this.f;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, RideFeedbackDataState.a((RideFeedbackDataState) value, null, null, true, null, null, 55)));
        BuildersKt.d(coroutineScope, null, null, new DefaultRideFeedbackDelegate$onSkipUserFeedbackCtaClick$2(this, coroutineScope, null), 3);
    }

    @Override // app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate
    public final Object d(RideFeedbackDataState rideFeedbackDataState, Function1 function1, ContinuationImpl continuationImpl) {
        return this.i.c(rideFeedbackDataState, function1, continuationImpl);
    }

    @Override // app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate
    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getU() {
        return this.u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate
    public final Object g(ContinuationImpl continuationImpl) {
        DefaultRideFeedbackDelegate$loadInitialData$1 defaultRideFeedbackDelegate$loadInitialData$1;
        RideFeedbackBookingData rideFeedbackBookingData;
        if (continuationImpl instanceof DefaultRideFeedbackDelegate$loadInitialData$1) {
            defaultRideFeedbackDelegate$loadInitialData$1 = (DefaultRideFeedbackDelegate$loadInitialData$1) continuationImpl;
            int i = defaultRideFeedbackDelegate$loadInitialData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultRideFeedbackDelegate$loadInitialData$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultRideFeedbackDelegate$loadInitialData$1 = new DefaultRideFeedbackDelegate$loadInitialData$1(this, continuationImpl);
            }
        } else {
            defaultRideFeedbackDelegate$loadInitialData$1 = new DefaultRideFeedbackDelegate$loadInitialData$1(this, continuationImpl);
        }
        Object obj = defaultRideFeedbackDelegate$loadInitialData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultRideFeedbackDelegate$loadInitialData$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Json json = ChaloJson.b;
            RideUserFeedbackScreenArgs.Default r2 = this.h;
            String str = r2.c;
            json.getClass();
            RideFeedbackBookingData rideFeedbackBookingData2 = (RideFeedbackBookingData) json.b(str, RideFeedbackBookingData.INSTANCE.serializer());
            String str2 = r2.d;
            String str3 = r2.e;
            defaultRideFeedbackDelegate$loadInitialData$1.L$0 = rideFeedbackBookingData2;
            defaultRideFeedbackDelegate$loadInitialData$1.label = 1;
            Object objA = this.j.a(str2, str3, defaultRideFeedbackDelegate$loadInitialData$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            rideFeedbackBookingData = rideFeedbackBookingData2;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rideFeedbackBookingData = (RideFeedbackBookingData) defaultRideFeedbackDelegate$loadInitialData$1.L$0;
            ResultKt.b(obj);
        }
        RideHailingRemoteConfigAppModel rideHailingRemoteConfigAppModel = (RideHailingRemoteConfigAppModel) obj;
        List list = rideHailingRemoteConfigAppModel != null ? rideHailingRemoteConfigAppModel.c : null;
        if (list == null) {
            list = EmptyList.f17557a;
        }
        BookingContext.Default r4 = new BookingContext.Default(rideFeedbackBookingData);
        Integer num = rideFeedbackBookingData.j;
        if (num != null) {
            List<UserFeedbackRatingData> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (UserFeedbackRatingData userFeedbackRatingData : list2) {
                arrayList.add(UserFeedbackRatingData.a(userFeedbackRatingData, userFeedbackRatingData.b.getId() == num.intValue(), null, 11));
            }
            list = arrayList;
        }
        return new RideFeedbackDataState(r4, list, 60);
    }

    @Override // app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate
    public final Map i() {
        Object objA;
        RideUserFeedbackScreenArgs.Default r0 = this.h;
        try {
            Json json = ChaloJson.b;
            String str = r0.c;
            json.getClass();
            objA = (RideFeedbackBookingData) json.b(str, RideFeedbackBookingData.INSTANCE.serializer());
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (objA instanceof Result.Failure) {
            objA = null;
        }
        RideFeedbackBookingData rideFeedbackBookingData = (RideFeedbackBookingData) objA;
        MapBuilder mapBuilder = new MapBuilder();
        if (rideFeedbackBookingData != null) {
            mapBuilder.put("bookingId", rideFeedbackBookingData.f9067a);
        }
        mapBuilder.put("productType", r0.d);
        mapBuilder.put("productSubType", r0.e);
        return mapBuilder.h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate
    public final Object j(RideFeedbackDataState rideFeedbackDataState, CoroutineScope coroutineScope, ContinuationImpl continuationImpl) {
        DefaultRideFeedbackDelegate$submitFeedback$1 defaultRideFeedbackDelegate$submitFeedback$1;
        RideFeedbackBookingData rideFeedbackBookingData;
        RideFeedbackDataState rideFeedbackDataState2;
        RideFeedbackBookingData rideFeedbackBookingData2;
        RideFeedbackRequestAppModel rideFeedbackRequestAppModel;
        MutableStateFlow mutableStateFlow;
        Object value;
        if (continuationImpl instanceof DefaultRideFeedbackDelegate$submitFeedback$1) {
            defaultRideFeedbackDelegate$submitFeedback$1 = (DefaultRideFeedbackDelegate$submitFeedback$1) continuationImpl;
            int i = defaultRideFeedbackDelegate$submitFeedback$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultRideFeedbackDelegate$submitFeedback$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultRideFeedbackDelegate$submitFeedback$1 = new DefaultRideFeedbackDelegate$submitFeedback$1(this, continuationImpl);
            }
        } else {
            defaultRideFeedbackDelegate$submitFeedback$1 = new DefaultRideFeedbackDelegate$submitFeedback$1(this, continuationImpl);
        }
        Object obj = defaultRideFeedbackDelegate$submitFeedback$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultRideFeedbackDelegate$submitFeedback$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            BookingContext bookingContext = rideFeedbackDataState.f9141a;
            BookingContext.Default r11 = bookingContext instanceof BookingContext.Default ? (BookingContext.Default) bookingContext : null;
            if (r11 != null && (rideFeedbackBookingData = r11.f9131a) != null) {
                List list = rideFeedbackDataState.b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!((UserFeedbackRatingData) it.next()).c);
                    RideFeedbackRequestAppModel rideFeedbackRequestAppModelM = m(rideFeedbackDataState, rideFeedbackBookingData, false);
                    defaultRideFeedbackDelegate$submitFeedback$1.L$0 = rideFeedbackDataState;
                    defaultRideFeedbackDelegate$submitFeedback$1.L$1 = rideFeedbackBookingData;
                    defaultRideFeedbackDelegate$submitFeedback$1.L$2 = rideFeedbackRequestAppModelM;
                    defaultRideFeedbackDelegate$submitFeedback$1.label = 1;
                    if (o(coroutineScope, rideFeedbackRequestAppModelM, defaultRideFeedbackDelegate$submitFeedback$1) == obj2) {
                        return obj2;
                    }
                    rideFeedbackDataState2 = rideFeedbackDataState;
                    rideFeedbackBookingData2 = rideFeedbackBookingData;
                    rideFeedbackRequestAppModel = rideFeedbackRequestAppModelM;
                }
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rideFeedbackRequestAppModel = (RideFeedbackRequestAppModel) defaultRideFeedbackDelegate$submitFeedback$1.L$2;
        rideFeedbackBookingData2 = (RideFeedbackBookingData) defaultRideFeedbackDelegate$submitFeedback$1.L$1;
        rideFeedbackDataState2 = (RideFeedbackDataState) defaultRideFeedbackDelegate$submitFeedback$1.L$0;
        ResultKt.b(obj);
        List list2 = rideFeedbackDataState2.b;
        Integer num = rideFeedbackRequestAppModel.f;
        int iB = RideFeedbackContractKt.b(num != null ? num.intValue() : 0, list2);
        ArrayList arrayListC0 = CollectionsKt.c0(rideFeedbackRequestAppModel.h, CollectionsKt.T(rideFeedbackRequestAppModel.g));
        MapBuilder mapBuilder = new MapBuilder();
        Integer num2 = rideFeedbackRequestAppModel.f;
        if (num2 != null) {
            mapBuilder.put("selectedRating", Integer.valueOf(num2.intValue()));
        }
        mapBuilder.put("maxRating", Integer.valueOf(iB));
        mapBuilder.put("selectedFeedbackTags", arrayListC0);
        String str = rideFeedbackRequestAppModel.i;
        if (str != null) {
            mapBuilder.put("textFeedback", str);
        }
        mapBuilder.put("bookingId", rideFeedbackBookingData2.f9067a);
        RideUserFeedbackScreenArgs.Default r0 = this.h;
        mapBuilder.put("productType", r0.d);
        mapBuilder.put("productSubType", r0.e);
        mapBuilder.put("punchTsInMillis", Long.valueOf(rideFeedbackBookingData2.h));
        mapBuilder.put("feedbackSubmittedTsMillis", Long.valueOf(rideFeedbackRequestAppModel.k));
        AnalyticsContractImplKt.b(this.t, "ride feedback submitted", Source.POST_RIDE_FEEDBACK_SCREEN, mapBuilder.h(), false, 24);
        do {
            mutableStateFlow = this.f;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, RideFeedbackDataState.a((RideFeedbackDataState) value, null, null, false, null, RideFeedbackStep.THANK_YOU, 23)));
        return Unit.f17538a;
    }

    public final RideFeedbackRequestAppModel m(RideFeedbackDataState rideFeedbackDataState, RideFeedbackBookingData rideFeedbackBookingData, boolean z) {
        Object next;
        UserFeedbackReasonData userFeedbackReasonData;
        RatingReaction ratingReaction;
        String string;
        Object next2;
        List list = rideFeedbackDataState.b;
        Set set = rideFeedbackDataState.e;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((UserFeedbackRatingData) next).c);
        UserFeedbackRatingData userFeedbackRatingData = (UserFeedbackRatingData) next;
        if (userFeedbackRatingData != null) {
            Iterator it2 = userFeedbackRatingData.d.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((UserFeedbackReasonData) next2).c);
            userFeedbackReasonData = (UserFeedbackReasonData) next2;
        } else {
            userFeedbackReasonData = null;
        }
        String str = rideFeedbackDataState.c;
        String str2 = (str == null || (string = StringsKt.u0(str).toString()) == null || !RideFeedbackContractKt.a(userFeedbackReasonData, set)) ? null : string;
        String str3 = rideFeedbackBookingData.f9067a;
        String str4 = rideFeedbackBookingData.b;
        String str5 = rideFeedbackBookingData.c;
        RideUserFeedbackScreenArgs.Default r1 = this.h;
        return new RideFeedbackRequestAppModel(str3, str4, str5, r1.d, r1.e, (userFeedbackRatingData == null || (ratingReaction = userFeedbackRatingData.b) == null) ? null : Integer.valueOf(ratingReaction.getId()), userFeedbackReasonData != null ? userFeedbackReasonData.b : null, CollectionsKt.D0(set), str2, z, this.n.j());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object n(long j, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        DefaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1 defaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1;
        if (continuationImpl instanceof DefaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1) {
            defaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1 = (DefaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1) continuationImpl;
            int i = defaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1 = new DefaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1(this, continuationImpl);
            }
        } else {
            defaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1 = new DefaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1(this, continuationImpl);
        }
        DefaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1 defaultRideFeedbackDelegate$markFeedbackCompleteQuietly$2 = defaultRideFeedbackDelegate$markFeedbackCompleteQuietly$1;
        Object obj = defaultRideFeedbackDelegate$markFeedbackCompleteQuietly$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultRideFeedbackDelegate$markFeedbackCompleteQuietly$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                RideFeedbackRepository rideFeedbackRepository = this.l;
                defaultRideFeedbackDelegate$markFeedbackCompleteQuietly$2.label = 1;
                if (rideFeedbackRepository.d(j, str, str2, str3, defaultRideFeedbackDelegate$markFeedbackCompleteQuietly$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(CoroutineScope coroutineScope, RideFeedbackRequestAppModel rideFeedbackRequestAppModel, ContinuationImpl continuationImpl) {
        DefaultRideFeedbackDelegate$queueAndSubmitFeedback$1 defaultRideFeedbackDelegate$queueAndSubmitFeedback$1;
        if (continuationImpl instanceof DefaultRideFeedbackDelegate$queueAndSubmitFeedback$1) {
            defaultRideFeedbackDelegate$queueAndSubmitFeedback$1 = (DefaultRideFeedbackDelegate$queueAndSubmitFeedback$1) continuationImpl;
            int i = defaultRideFeedbackDelegate$queueAndSubmitFeedback$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultRideFeedbackDelegate$queueAndSubmitFeedback$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultRideFeedbackDelegate$queueAndSubmitFeedback$1 = new DefaultRideFeedbackDelegate$queueAndSubmitFeedback$1(this, continuationImpl);
            }
        } else {
            defaultRideFeedbackDelegate$queueAndSubmitFeedback$1 = new DefaultRideFeedbackDelegate$queueAndSubmitFeedback$1(this, continuationImpl);
        }
        Object obj = defaultRideFeedbackDelegate$queueAndSubmitFeedback$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultRideFeedbackDelegate$queueAndSubmitFeedback$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            defaultRideFeedbackDelegate$queueAndSubmitFeedback$1.L$0 = coroutineScope;
            defaultRideFeedbackDelegate$queueAndSubmitFeedback$1.L$1 = rideFeedbackRequestAppModel;
            defaultRideFeedbackDelegate$queueAndSubmitFeedback$1.label = 1;
            if (p(rideFeedbackRequestAppModel, defaultRideFeedbackDelegate$queueAndSubmitFeedback$1) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rideFeedbackRequestAppModel = (RideFeedbackRequestAppModel) defaultRideFeedbackDelegate$queueAndSubmitFeedback$1.L$1;
            coroutineScope = (CoroutineScope) defaultRideFeedbackDelegate$queueAndSubmitFeedback$1.L$0;
            ResultKt.b(obj);
        }
        BuildersKt.d(coroutineScope, null, null, new DefaultRideFeedbackDelegate$queueAndSubmitFeedback$2(this, rideFeedbackRequestAppModel, null), 3);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object p(RideFeedbackRequestAppModel rideFeedbackRequestAppModel, ContinuationImpl continuationImpl) {
        DefaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1 defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1;
        RideFeedbackRequestAppModel rideFeedbackRequestAppModel2 = rideFeedbackRequestAppModel;
        if (continuationImpl instanceof DefaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1) {
            defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1 = (DefaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1) continuationImpl;
            int i = defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1 = new DefaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1(this, continuationImpl);
            }
        } else {
            defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1 = new DefaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1(this, continuationImpl);
        }
        DefaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1 defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$2 = defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$1;
        Object obj = defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$2.label;
        Object obj3 = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$2.L$0 = rideFeedbackRequestAppModel2;
            defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$2.label = 1;
            Object objB = this.l.b(new RideFeedbackOfflineQueueEntity(rideFeedbackRequestAppModel2.f9069a, rideFeedbackRequestAppModel2.b, rideFeedbackRequestAppModel2.c, rideFeedbackRequestAppModel2.d, rideFeedbackRequestAppModel2.e, rideFeedbackRequestAppModel2.f, rideFeedbackRequestAppModel2.g, rideFeedbackRequestAppModel2.h, rideFeedbackRequestAppModel2.i, rideFeedbackRequestAppModel2.j, rideFeedbackRequestAppModel2.k), defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$2);
            if (objB != obj2) {
                objB = obj3;
            }
            if (objB != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj3;
        }
        rideFeedbackRequestAppModel2 = (RideFeedbackRequestAppModel) defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$2.L$0;
        ResultKt.b(obj);
        String str = rideFeedbackRequestAppModel2.f9069a;
        long j = rideFeedbackRequestAppModel2.k;
        String str2 = rideFeedbackRequestAppModel2.b;
        String str3 = rideFeedbackRequestAppModel2.c;
        defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$2.L$0 = null;
        defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$2.label = 2;
        return n(j, str, str2, str3, defaultRideFeedbackDelegate$queueOfflineFeedbackAndCompletePrompt$2) == obj2 ? obj2 : obj3;
    }
}
