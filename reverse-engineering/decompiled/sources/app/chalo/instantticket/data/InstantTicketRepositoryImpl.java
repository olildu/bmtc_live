package app.chalo.instantticket.data;

import app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteLegacySpecialFeature;
import app.chalo.citydata.data.model.app.RouteLiveDetailsAppModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureAppModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureType;
import app.chalo.citydata.data.model.app.RouteTripTimingAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.contract.BasicInfoContract;
import app.chalo.domain.GetCityIdsInClusterProductHistoryUseCase;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import app.chalo.instantticket.data.exception.InvalidFareResponseDataException;
import app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketReceipt;
import app.chalo.instantticket.data.model.api.request.FareRequestFilters;
import app.chalo.instantticket.data.model.api.request.FareRequestFiltersApiModel;
import app.chalo.instantticket.data.model.api.request.FetchMobileTicketFareRequestApiModel;
import app.chalo.instantticket.data.model.api.request.InstantTicketOrderRequestApiModel;
import app.chalo.instantticket.data.model.api.request.InstantTicketOrderRequestPassengerDetail;
import app.chalo.instantticket.data.model.api.request.ValidateFareRequestPassengerDetail;
import app.chalo.instantticket.data.model.api.request.ValidateInstantTicketFareRequestApiModel;
import app.chalo.instantticket.data.model.api.response.FetchMobileTicketFareResponseApiModel;
import app.chalo.instantticket.data.model.api.response.FetchMobileTicketFareResponseApiModelKt;
import app.chalo.instantticket.data.model.api.response.InstantMobileTicketResponseApiModel;
import app.chalo.instantticket.data.model.api.response.InstantMobileTicketResponseApiModelKt;
import app.chalo.instantticket.data.model.api.response.InstantTicketResponseApiModel;
import app.chalo.instantticket.data.model.api.response.ValidateInstantTicketFareResponseApiModel;
import app.chalo.instantticket.data.model.api.response.ValidateInstantTicketFareResponseAppModel;
import app.chalo.instantticket.data.model.app.InstantTicketTripDetails;
import app.chalo.instantticket.data.model.app.request.FetchMobileTicketFareRequestAppModel;
import app.chalo.instantticket.data.model.app.request.InstantTicketOrderFarePassengerDetail;
import app.chalo.instantticket.data.model.app.request.InstantTicketOrderRequestAppModel;
import app.chalo.instantticket.data.model.app.request.PassengerDetailData;
import app.chalo.instantticket.data.model.app.request.ValidateInstantTicketFareRequestAppModel;
import app.chalo.instantticket.data.remotesource.InstantTicketRemoteDataSource;
import app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel;
import app.chalo.livetracking.universalsearch.data.model.api.RoutesDetailApiModel;
import app.chalo.livetracking.universalsearch.data.model.api.StopsInfoApiModel;
import app.chalo.livetracking.universalsearch.data.model.app.AutoCompleteResultAppModelKt;
import app.chalo.livetracking.utils.TrackingUtils;
import app.chalo.location.LatLng;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.models.ordercreation.CreateOrderResponseApiModelKt;
import app.chalo.premiumbus.data.models.app.PremiumBusChangeSeatsRequestAppModelKt;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.usecase.GetDistinctIdUseCase;
import app.chalo.utils.BaseMobileTicketConverters;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.adjust.sdk.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/InstantTicketRepositoryImpl;", "Lapp/chalo/instantticket/data/InstantTicketRepository;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketRepositoryImpl implements InstantTicketRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstantTicketRemoteDataSource f3835a;
    public final InstantTicketLocalDataSource b;
    public final CoroutineContextProvider c;
    public final CityProvider d;
    public final UserProfileDetailsProvider e;
    public final BasicInfoContract f;
    public final TimeUtilsContract g;
    public final GetDistinctIdUseCase h;
    public final LanguageFeature i;
    public final GetCityIdsInClusterProductHistoryUseCase j;
    public final BaseMobileTicketConverters k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3836a;

        static {
            int[] iArr = new int[UserBookingsStatusType.values().length];
            try {
                iArr[UserBookingsStatusType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserBookingsStatusType.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserBookingsStatusType.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3836a = iArr;
        }
    }

    public InstantTicketRepositoryImpl(InstantTicketRemoteDataSource instantTicketRemoteDataSource, InstantTicketLocalDataSource instantTicketLocalDataSource, CoroutineContextProvider coroutineContextProvider, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract, GetDistinctIdUseCase getDistinctIdUseCase, LanguageFeature languageFeature, GetCityIdsInClusterProductHistoryUseCase getCityIdsInClusterProductHistoryUseCase, BaseMobileTicketConverters baseMobileTicketConverters) {
        this.f3835a = instantTicketRemoteDataSource;
        this.b = instantTicketLocalDataSource;
        this.c = coroutineContextProvider;
        this.d = cityProvider;
        this.e = userProfileDetailsProvider;
        this.f = basicInfoContract;
        this.g = timeUtilsContract;
        this.h = getDistinctIdUseCase;
        this.i = languageFeature;
        this.j = getCityIdsInClusterProductHistoryUseCase;
        this.k = baseMobileTicketConverters;
    }

    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Flow a(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        return this.b.a(bookingId);
    }

    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Object b(InstantTicketReceipt instantTicketReceipt, Continuation continuation) {
        Object objB = this.b.b(instantTicketReceipt, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Object c(String str, ContinuationImpl continuationImpl) {
        String strM = this.e.m();
        if (strM == null) {
            strM = "";
        }
        return this.b.k(str, strM, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Object d(String str, ContinuationImpl continuationImpl) {
        InstantTicketRepositoryImpl$fetchInstantTicketReceipt$1 instantTicketRepositoryImpl$fetchInstantTicketReceipt$1;
        if (continuationImpl instanceof InstantTicketRepositoryImpl$fetchInstantTicketReceipt$1) {
            instantTicketRepositoryImpl$fetchInstantTicketReceipt$1 = (InstantTicketRepositoryImpl$fetchInstantTicketReceipt$1) continuationImpl;
            int i = instantTicketRepositoryImpl$fetchInstantTicketReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRepositoryImpl$fetchInstantTicketReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRepositoryImpl$fetchInstantTicketReceipt$1 = new InstantTicketRepositoryImpl$fetchInstantTicketReceipt$1(this, continuationImpl);
            }
        } else {
            instantTicketRepositoryImpl$fetchInstantTicketReceipt$1 = new InstantTicketRepositoryImpl$fetchInstantTicketReceipt$1(this, continuationImpl);
        }
        Object objD = instantTicketRepositoryImpl$fetchInstantTicketReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRepositoryImpl$fetchInstantTicketReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            instantTicketRepositoryImpl$fetchInstantTicketReceipt$1.label = 1;
            objD = this.f3835a.d(str, instantTicketRepositoryImpl$fetchInstantTicketReceipt$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        return ((List) objD).get(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Object e(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        InstantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1 instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1;
        final UserBookingsStatusType userBookingsStatusType2;
        InstantTicketLocalDataSource instantTicketLocalDataSource;
        if (continuationImpl instanceof InstantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1) {
            instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1 = (InstantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1) continuationImpl;
            int i = instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1 = new InstantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1(this, continuationImpl);
            }
        } else {
            instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1 = new InstantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1(this, continuationImpl);
        }
        Object obj = instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1.L$0 = userBookingsStatusType;
            InstantTicketLocalDataSource instantTicketLocalDataSource2 = this.b;
            instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1.L$1 = instantTicketLocalDataSource2;
            instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1.label = 1;
            Object objO = o(instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1);
            if (objO == obj2) {
                return obj2;
            }
            userBookingsStatusType2 = userBookingsStatusType;
            instantTicketLocalDataSource = instantTicketLocalDataSource2;
            obj = objO;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            instantTicketLocalDataSource = (InstantTicketLocalDataSource) instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1.L$1;
            userBookingsStatusType2 = (UserBookingsStatusType) instantTicketRepositoryImpl$getAllInstantTicketsAsFlow$1.L$0;
            ResultKt.b(obj);
        }
        List list = (List) obj;
        String strM = this.e.m();
        if (strM == null) {
            strM = "";
        }
        final Flow flowG = instantTicketLocalDataSource.g(strM, list);
        return FlowKt.z(new Flow<List<? extends InstantTicketEntity>>() { // from class: app.chalo.instantticket.data.InstantTicketRepositoryImpl$getAllInstantTicketsAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.instantticket.data.InstantTicketRepositoryImpl$getAllInstantTicketsAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3838a;
                public final /* synthetic */ UserBookingsStatusType b;
                public final /* synthetic */ InstantTicketRepositoryImpl c;

                /* JADX INFO: renamed from: app.chalo.instantticket.data.InstantTicketRepositoryImpl$getAllInstantTicketsAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.instantticket.data.InstantTicketRepositoryImpl$getAllInstantTicketsAsFlow$$inlined$map$1$2", f = "InstantTicketRepositoryImpl.kt", l = {56, 60, 50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, UserBookingsStatusType userBookingsStatusType, InstantTicketRepositoryImpl instantTicketRepositoryImpl) {
                    this.f3838a = flowCollector;
                    this.b = userBookingsStatusType;
                    this.c = instantTicketRepositoryImpl;
                }

                /* JADX WARN: Code duplicated, block: B:25:0x0092  */
                /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
                /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
                /* JADX WARN: Code duplicated, block: B:59:0x0129  */
                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
                
                    if (r15 == r2) goto L62;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
                
                    if (r15 == r2) goto L62;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x013e, code lost:
                
                    if (r3.emit(r14, r1) == r2) goto L62;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a9 -> B:28:0x00ad). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0105 -> B:49:0x0108). Please report as a decompilation issue!!! */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
                    /*
                        Method dump skipped, instruction units count: 324
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.data.InstantTicketRepositoryImpl$getAllInstantTicketsAsFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowG.collect(new AnonymousClass2(flowCollector, userBookingsStatusType2, this), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, this.c.getDefault());
    }

    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Object f(Continuation continuation) {
        Object objF = this.b.f(continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Object g(ValidateInstantTicketFareRequestAppModel validateInstantTicketFareRequestAppModel, ContinuationImpl continuationImpl) {
        InstantTicketRepositoryImpl$validateInstantTicketFare$1 instantTicketRepositoryImpl$validateInstantTicketFare$1;
        if (continuationImpl instanceof InstantTicketRepositoryImpl$validateInstantTicketFare$1) {
            instantTicketRepositoryImpl$validateInstantTicketFare$1 = (InstantTicketRepositoryImpl$validateInstantTicketFare$1) continuationImpl;
            int i = instantTicketRepositoryImpl$validateInstantTicketFare$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRepositoryImpl$validateInstantTicketFare$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRepositoryImpl$validateInstantTicketFare$1 = new InstantTicketRepositoryImpl$validateInstantTicketFare$1(this, continuationImpl);
            }
        } else {
            instantTicketRepositoryImpl$validateInstantTicketFare$1 = new InstantTicketRepositoryImpl$validateInstantTicketFare$1(this, continuationImpl);
        }
        Object objF = instantTicketRepositoryImpl$validateInstantTicketFare$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRepositoryImpl$validateInstantTicketFare$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            Intrinsics.i(validateInstantTicketFareRequestAppModel, "<this>");
            String str = validateInstantTicketFareRequestAppModel.f3889a;
            long j = validateInstantTicketFareRequestAppModel.b;
            List<PassengerDetailData> list = validateInstantTicketFareRequestAppModel.c;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (PassengerDetailData passengerDetailData : list) {
                arrayList.add(new ValidateFareRequestPassengerDetail(passengerDetailData.f3888a, passengerDetailData.b));
            }
            ValidateInstantTicketFareRequestApiModel validateInstantTicketFareRequestApiModel = new ValidateInstantTicketFareRequestApiModel(str, j, arrayList, new InstantTicketTripDetails(validateInstantTicketFareRequestAppModel.e, validateInstantTicketFareRequestAppModel.f, validateInstantTicketFareRequestAppModel.d, null, null, null));
            instantTicketRepositoryImpl$validateInstantTicketFare$1.label = 1;
            objF = this.f3835a.f(validateInstantTicketFareRequestApiModel, instantTicketRepositoryImpl$validateInstantTicketFare$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        ValidateInstantTicketFareResponseApiModel validateInstantTicketFareResponseApiModel = (ValidateInstantTicketFareResponseApiModel) objF;
        Intrinsics.i(validateInstantTicketFareResponseApiModel, "<this>");
        return new ValidateInstantTicketFareResponseAppModel(validateInstantTicketFareResponseApiModel.f3877a, validateInstantTicketFareResponseApiModel.b);
    }

    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Flow h(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        String strM = this.e.m();
        if (strM == null) {
            strM = "";
        }
        return this.b.i(bookingId, strM);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0127  */
    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:51:0x0142  */
    /* JADX WARN: Code duplicated, block: B:53:0x014a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0161 A[LOOP:1: B:54:0x015b->B:56:0x0161, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0172  */
    /* JADX WARN: Code duplicated, block: B:61:0x017d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:65:0x018d  */
    /* JADX WARN: Code duplicated, block: B:70:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01df A[LOOP:2: B:77:0x01d9->B:79:0x01df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0208  */
    /* JADX WARN: Code duplicated, block: B:85:0x0216 A[LOOP:3: B:83:0x0210->B:85:0x0216, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x022b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0234  */
    /* JADX WARN: Code duplicated, block: B:93:0x0289  */
    /* JADX WARN: Code duplicated, block: B:98:0x028c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.util.ArrayList] */
    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Serializable i(AutoCompleteResultApiRequestModel.Default r41, ContinuationImpl continuationImpl) {
        InstantTicketRepositoryImpl$fetchRouteDetails$1 instantTicketRepositoryImpl$fetchRouteDetails$1;
        InstantTicketRemoteDataSource instantTicketRemoteDataSource;
        String strName;
        String str;
        InstantTicketRepositoryImpl instantTicketRepositoryImpl;
        Object obj;
        InstantTicketRepositoryImpl instantTicketRepositoryImpl2;
        ArrayList arrayList;
        Iterator it;
        RoutesDetailApiModel routesDetailApiModel;
        String str2;
        String str3;
        ChaloTransitMode.Companion companion;
        String str4;
        ChaloTransitMode chaloTransitModeB;
        List list;
        ?? arrayList2;
        ?? r16;
        String str5;
        String str6;
        StopsInfoApiModel stopsInfoApiModel;
        String str7;
        String str8;
        StopAppModel stopAppModel;
        String str9;
        String str10;
        String str11;
        List list2;
        List list3;
        ArrayList arrayList3;
        Iterator it2;
        LiveSeatAvailabilityApplicable yes;
        RouteAppModel routeAppModel;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        AutoCompleteResultApiRequestModel.Default r1 = r41;
        if (continuationImpl instanceof InstantTicketRepositoryImpl$fetchRouteDetails$1) {
            instantTicketRepositoryImpl$fetchRouteDetails$1 = (InstantTicketRepositoryImpl$fetchRouteDetails$1) continuationImpl;
            int i = instantTicketRepositoryImpl$fetchRouteDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRepositoryImpl$fetchRouteDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRepositoryImpl$fetchRouteDetails$1 = new InstantTicketRepositoryImpl$fetchRouteDetails$1(this, continuationImpl);
            }
        } else {
            instantTicketRepositoryImpl$fetchRouteDetails$1 = new InstantTicketRepositoryImpl$fetchRouteDetails$1(this, continuationImpl);
        }
        Object objE = instantTicketRepositoryImpl$fetchRouteDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRepositoryImpl$fetchRouteDetails$1.label;
        RouteAppModel routeAppModel2 = null;
        if (i2 == 0) {
            ResultKt.b(objE);
            instantTicketRepositoryImpl$fetchRouteDetails$1.L$0 = r1;
            instantTicketRepositoryImpl$fetchRouteDetails$1.L$1 = this;
            instantTicketRemoteDataSource = this.f3835a;
            instantTicketRepositoryImpl$fetchRouteDetails$1.L$2 = instantTicketRemoteDataSource;
            instantTicketRepositoryImpl$fetchRouteDetails$1.label = 1;
            String str12 = r1.h;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("str", str12);
            String strA = this.h.a(false);
            String str13 = strA == null ? "" : strA;
            BasicInfoContract basicInfoContract = this.f;
            String deviceId = basicInfoContract.getDeviceId();
            Language language = (Language) this.i.getE().getValue();
            if (language == null || (strName = language.name()) == null) {
                strName = "ENGLISH";
            }
            String str14 = strName;
            int iH = basicInfoContract.h();
            String strB = CityProviderKt.b(this.d);
            if (strB != null) {
                String upperCase = strB.toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase, "toUpperCase(...)");
                str = upperCase;
            } else {
                str = "";
            }
            linkedHashMap.put(Constants.REFERRER_API_META, String.valueOf(TrackingUtils.e(iH, basicInfoContract.getF(), str13, deviceId, str14, str, basicInfoContract.getG())));
            linkedHashMap.put("day", this.g.y(r1.o, null));
            linkedHashMap.put("station_type", "bus");
            linkedHashMap.put("mticket_enabled", String.valueOf(r1.s));
            if (linkedHashMap != coroutineSingletons) {
                instantTicketRepositoryImpl = this;
                obj = linkedHashMap;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            InstantTicketRemoteDataSource instantTicketRemoteDataSource2 = (InstantTicketRemoteDataSource) instantTicketRepositoryImpl$fetchRouteDetails$1.L$2;
            instantTicketRepositoryImpl = (InstantTicketRepositoryImpl) instantTicketRepositoryImpl$fetchRouteDetails$1.L$1;
            AutoCompleteResultApiRequestModel.Default r9 = (AutoCompleteResultApiRequestModel.Default) instantTicketRepositoryImpl$fetchRouteDetails$1.L$0;
            ResultKt.b(objE);
            instantTicketRemoteDataSource = instantTicketRemoteDataSource2;
            r1 = r9;
            obj = objE;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            instantTicketRepositoryImpl2 = (InstantTicketRepositoryImpl) instantTicketRepositoryImpl$fetchRouteDetails$1.L$0;
            ResultKt.b(objE);
        }
        instantTicketRepositoryImpl2.getClass();
        arrayList = new ArrayList();
        it = ((List) objE).iterator();
        while (it.hasNext()) {
            routesDetailApiModel = (RoutesDetailApiModel) it.next();
            str2 = routesDetailApiModel.f4985a;
            if (str2 == null && (str3 = routesDetailApiModel.b) != null) {
                companion = ChaloTransitMode.INSTANCE;
                str4 = routesDetailApiModel.c;
                if (str4 == null) {
                    it2 = it;
                    routeAppModel = routeAppModel2;
                } else {
                    chaloTransitModeB = ChaloTransitMode.Companion.b(companion, str4);
                    list = routesDetailApiModel.u;
                    if (list != null) {
                        List list4 = list;
                        arrayList2 = new ArrayList(CollectionsKt.v(list4, 10));
                        it5 = list4.iterator();
                        while (it5.hasNext()) {
                            arrayList2.add(AutoCompleteResultAppModelKt.a((StopsInfoApiModel) it5.next()));
                        }
                    } else {
                        arrayList2 = EmptyList.f17557a;
                    }
                    r16 = arrayList2;
                    str5 = routesDetailApiModel.d;
                    str6 = routesDetailApiModel.e;
                    stopsInfoApiModel = routesDetailApiModel.v;
                    if (stopsInfoApiModel != null) {
                        stopAppModel = AutoCompleteResultAppModelKt.a(stopsInfoApiModel);
                    } else {
                        str7 = routesDetailApiModel.f;
                        if (str7 == null) {
                            str8 = "";
                        } else {
                            str8 = str7;
                        }
                        stopAppModel = new StopAppModel("", str8, new LatLng(0.0d, 0.0d), ChaloTransitMode.BUS, "", null);
                    }
                    str9 = routesDetailApiModel.g;
                    if (str9 == null) {
                        it2 = it;
                        routeAppModel = routeAppModel2;
                    } else {
                        boolean z = routesDetailApiModel.q;
                        boolean z2 = routesDetailApiModel.z;
                        String str15 = routesDetailApiModel.D;
                        RouteNamingSchemeType.Companion companion2 = RouteNamingSchemeType.INSTANCE;
                        String str16 = routesDetailApiModel.E;
                        companion2.getClass();
                        RouteNamingSchemeType routeNamingSchemeTypeA = RouteNamingSchemeType.Companion.a(str16);
                        boolean z3 = routesDetailApiModel.n;
                        str10 = routesDetailApiModel.o;
                        if (str10 == null) {
                            str11 = "";
                        } else {
                            str11 = str10;
                        }
                        list2 = routesDetailApiModel.h;
                        list3 = routesDetailApiModel.i;
                        arrayList3 = new ArrayList();
                        if (list2 != null) {
                            it4 = list2.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(new RouteSpecialFeatureAppModel(((RouteLegacySpecialFeature) it4.next()).name(), RouteSpecialFeatureType.LEGACY));
                                it = it;
                                str6 = str6;
                                str5 = str5;
                            }
                        }
                        it2 = it;
                        String str17 = str5;
                        String str18 = str6;
                        if (list3 != null) {
                            it3 = list3.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(new RouteSpecialFeatureAppModel((String) it3.next(), RouteSpecialFeatureType.NEW));
                            }
                        }
                        if (routesDetailApiModel.y) {
                            yes = new LiveSeatAvailabilityApplicable.Yes(0);
                        } else {
                            yes = LiveSeatAvailabilityApplicable.No.INSTANCE;
                        }
                        LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable = yes;
                        TimeTableStatus.Companion companion3 = TimeTableStatus.INSTANCE;
                        int i3 = routesDetailApiModel.A;
                        companion3.getClass();
                        TimeTableStatus timeTableStatusA = TimeTableStatus.Companion.a(i3);
                        int i4 = routesDetailApiModel.B;
                        EmptyList emptyList = EmptyList.f17557a;
                        routeAppModel = new RouteAppModel(-1, str2, str3, chaloTransitModeB, (List) r16, str17, str18, stopAppModel, new RouteTripTimingAppModel(timeTableStatusA, i4, emptyList, emptyList), str9, z3, z, str11, arrayList3, liveSeatAvailabilityApplicable, new RouteLiveDetailsAppModel(String.valueOf(routesDetailApiModel.p), routesDetailApiModel.l, routesDetailApiModel.m, routesDetailApiModel.s, routesDetailApiModel.t), z2, (List) null, str15, routeNamingSchemeTypeA, 131072);
                    }
                }
            } else {
                it2 = it;
                routeAppModel = routeAppModel2;
            }
            if (routeAppModel != null) {
                arrayList.add(routeAppModel);
            }
            it = it2;
            routeAppModel2 = null;
        }
        return arrayList;
        String upperCase2 = r1.k.toUpperCase(Locale.ROOT);
        Intrinsics.h(upperCase2, "toUpperCase(...)");
        instantTicketRepositoryImpl$fetchRouteDetails$1.L$0 = instantTicketRepositoryImpl;
        instantTicketRepositoryImpl$fetchRouteDetails$1.L$1 = null;
        instantTicketRepositoryImpl$fetchRouteDetails$1.L$2 = null;
        instantTicketRepositoryImpl$fetchRouteDetails$1.label = 2;
        objE = instantTicketRemoteDataSource.e(upperCase2, (Map) obj, instantTicketRepositoryImpl$fetchRouteDetails$1);
        if (objE != coroutineSingletons) {
            instantTicketRepositoryImpl2 = instantTicketRepositoryImpl;
            instantTicketRepositoryImpl2.getClass();
            arrayList = new ArrayList();
            it = ((List) objE).iterator();
            while (it.hasNext()) {
                routesDetailApiModel = (RoutesDetailApiModel) it.next();
                str2 = routesDetailApiModel.f4985a;
                if (str2 == null) {
                    it2 = it;
                    routeAppModel = routeAppModel2;
                } else {
                    companion = ChaloTransitMode.INSTANCE;
                    str4 = routesDetailApiModel.c;
                    if (str4 == null) {
                        it2 = it;
                        routeAppModel = routeAppModel2;
                    } else {
                        chaloTransitModeB = ChaloTransitMode.Companion.b(companion, str4);
                        list = routesDetailApiModel.u;
                        if (list != null) {
                            List list5 = list;
                            arrayList2 = new ArrayList(CollectionsKt.v(list5, 10));
                            it5 = list5.iterator();
                            while (it5.hasNext()) {
                                arrayList2.add(AutoCompleteResultAppModelKt.a((StopsInfoApiModel) it5.next()));
                            }
                        } else {
                            arrayList2 = EmptyList.f17557a;
                        }
                        r16 = arrayList2;
                        str5 = routesDetailApiModel.d;
                        str6 = routesDetailApiModel.e;
                        stopsInfoApiModel = routesDetailApiModel.v;
                        if (stopsInfoApiModel != null) {
                            stopAppModel = AutoCompleteResultAppModelKt.a(stopsInfoApiModel);
                        } else {
                            str7 = routesDetailApiModel.f;
                            if (str7 == null) {
                                str8 = "";
                            } else {
                                str8 = str7;
                            }
                            stopAppModel = new StopAppModel("", str8, new LatLng(0.0d, 0.0d), ChaloTransitMode.BUS, "", null);
                        }
                        str9 = routesDetailApiModel.g;
                        if (str9 == null) {
                            it2 = it;
                            routeAppModel = routeAppModel2;
                        } else {
                            boolean z4 = routesDetailApiModel.q;
                            boolean z5 = routesDetailApiModel.z;
                            String str19 = routesDetailApiModel.D;
                            RouteNamingSchemeType.Companion companion4 = RouteNamingSchemeType.INSTANCE;
                            String str110 = routesDetailApiModel.E;
                            companion4.getClass();
                            RouteNamingSchemeType routeNamingSchemeTypeA2 = RouteNamingSchemeType.Companion.a(str110);
                            boolean z6 = routesDetailApiModel.n;
                            str10 = routesDetailApiModel.o;
                            if (str10 == null) {
                                str11 = "";
                            } else {
                                str11 = str10;
                            }
                            list2 = routesDetailApiModel.h;
                            list3 = routesDetailApiModel.i;
                            arrayList3 = new ArrayList();
                            if (list2 != null) {
                                it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    arrayList3.add(new RouteSpecialFeatureAppModel(((RouteLegacySpecialFeature) it4.next()).name(), RouteSpecialFeatureType.LEGACY));
                                    it = it;
                                    str6 = str6;
                                    str5 = str5;
                                }
                            }
                            it2 = it;
                            String str111 = str5;
                            String str112 = str6;
                            if (list3 != null) {
                                it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(new RouteSpecialFeatureAppModel((String) it3.next(), RouteSpecialFeatureType.NEW));
                                }
                            }
                            if (routesDetailApiModel.y) {
                                yes = new LiveSeatAvailabilityApplicable.Yes(0);
                            } else {
                                yes = LiveSeatAvailabilityApplicable.No.INSTANCE;
                            }
                            LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable2 = yes;
                            TimeTableStatus.Companion companion5 = TimeTableStatus.INSTANCE;
                            int i5 = routesDetailApiModel.A;
                            companion5.getClass();
                            TimeTableStatus timeTableStatusA2 = TimeTableStatus.Companion.a(i5);
                            int i6 = routesDetailApiModel.B;
                            EmptyList emptyList2 = EmptyList.f17557a;
                            routeAppModel = new RouteAppModel(-1, str2, str3, chaloTransitModeB, (List) r16, str111, str112, stopAppModel, new RouteTripTimingAppModel(timeTableStatusA2, i6, emptyList2, emptyList2), str9, z6, z4, str11, arrayList3, liveSeatAvailabilityApplicable2, new RouteLiveDetailsAppModel(String.valueOf(routesDetailApiModel.p), routesDetailApiModel.l, routesDetailApiModel.m, routesDetailApiModel.s, routesDetailApiModel.t), z5, (List) null, str19, routeNamingSchemeTypeA2, 131072);
                        }
                    }
                }
                if (routeAppModel != null) {
                    arrayList.add(routeAppModel);
                }
                it = it2;
                routeAppModel2 = null;
            }
            return arrayList;
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Object j(long j, String str, Continuation continuation) {
        Object objC = this.b.c(j, str, continuation);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Object k(FetchMobileTicketFareRequestAppModel fetchMobileTicketFareRequestAppModel, ContinuationImpl continuationImpl) throws InvalidFareResponseDataException {
        InstantTicketRepositoryImpl$getMobileTicketFare$1 instantTicketRepositoryImpl$getMobileTicketFare$1;
        FareRequestFiltersApiModel fareRequestFiltersApiModel;
        ArrayList arrayList;
        if (continuationImpl instanceof InstantTicketRepositoryImpl$getMobileTicketFare$1) {
            instantTicketRepositoryImpl$getMobileTicketFare$1 = (InstantTicketRepositoryImpl$getMobileTicketFare$1) continuationImpl;
            int i = instantTicketRepositoryImpl$getMobileTicketFare$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRepositoryImpl$getMobileTicketFare$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRepositoryImpl$getMobileTicketFare$1 = new InstantTicketRepositoryImpl$getMobileTicketFare$1(this, continuationImpl);
            }
        } else {
            instantTicketRepositoryImpl$getMobileTicketFare$1 = new InstantTicketRepositoryImpl$getMobileTicketFare$1(this, continuationImpl);
        }
        Object objA = instantTicketRepositoryImpl$getMobileTicketFare$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRepositoryImpl$getMobileTicketFare$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            Intrinsics.i(fetchMobileTicketFareRequestAppModel, "<this>");
            String str = fetchMobileTicketFareRequestAppModel.f3885a;
            String str2 = fetchMobileTicketFareRequestAppModel.d;
            String str3 = fetchMobileTicketFareRequestAppModel.c;
            String str4 = fetchMobileTicketFareRequestAppModel.b;
            FareRequestFilters fareRequestFilters = fetchMobileTicketFareRequestAppModel.e;
            Intrinsics.i(fareRequestFilters, "<this>");
            if (fareRequestFilters instanceof FareRequestFilters.InstantTicketFilter) {
                fareRequestFiltersApiModel = new FareRequestFiltersApiModel(((FareRequestFilters.InstantTicketFilter) fareRequestFilters).b, (String) null, (String) null, (String) null, 14);
            } else if (fareRequestFilters instanceof FareRequestFilters.PremiumReserveTicketFilter) {
                FareRequestFilters.PremiumReserveTicketFilter premiumReserveTicketFilter = (FareRequestFilters.PremiumReserveTicketFilter) fareRequestFilters;
                fareRequestFiltersApiModel = new FareRequestFiltersApiModel(premiumReserveTicketFilter.b, premiumReserveTicketFilter.c, premiumReserveTicketFilter.d, (String) null, 8);
            } else {
                if (!(fareRequestFilters instanceof FareRequestFilters.OndcTicketFilter)) {
                    throw new NoWhenBranchMatchedException();
                }
                fareRequestFiltersApiModel = new FareRequestFiltersApiModel((String) null, (String) null, (String) null, ((FareRequestFilters.OndcTicketFilter) fareRequestFilters).b, 7);
            }
            FareRequestFiltersApiModel fareRequestFiltersApiModel2 = fareRequestFiltersApiModel;
            List list = fetchMobileTicketFareRequestAppModel.f;
            if (list != null) {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(PremiumBusChangeSeatsRequestAppModelKt.a((SeatInfoAppModel) it.next()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            FetchMobileTicketFareRequestApiModel fetchMobileTicketFareRequestApiModel = new FetchMobileTicketFareRequestApiModel(str, str2, fareRequestFiltersApiModel2, str4, str3, arrayList, fetchMobileTicketFareRequestAppModel.g, fetchMobileTicketFareRequestAppModel.h);
            instantTicketRepositoryImpl$getMobileTicketFare$1.label = 1;
            objA = this.f3835a.a(fetchMobileTicketFareRequestApiModel, instantTicketRepositoryImpl$getMobileTicketFare$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        FetchMobileTicketFareResponseApiModel fetchMobileTicketFareResponseApiModel = (FetchMobileTicketFareResponseApiModel) (FetchMobileTicketFareResponseApiModelKt.b((FetchMobileTicketFareResponseApiModel) objA) ? objA : null);
        if (fetchMobileTicketFareResponseApiModel != null) {
            return FetchMobileTicketFareResponseApiModelKt.d(fetchMobileTicketFareResponseApiModel);
        }
        throw new InvalidFareResponseDataException("Invalid fare response");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Object l(InstantTicketOrderRequestAppModel instantTicketOrderRequestAppModel, ContinuationImpl continuationImpl) {
        InstantTicketRepositoryImpl$createInstantTicketOrder$1 instantTicketRepositoryImpl$createInstantTicketOrder$1;
        if (continuationImpl instanceof InstantTicketRepositoryImpl$createInstantTicketOrder$1) {
            instantTicketRepositoryImpl$createInstantTicketOrder$1 = (InstantTicketRepositoryImpl$createInstantTicketOrder$1) continuationImpl;
            int i = instantTicketRepositoryImpl$createInstantTicketOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRepositoryImpl$createInstantTicketOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRepositoryImpl$createInstantTicketOrder$1 = new InstantTicketRepositoryImpl$createInstantTicketOrder$1(this, continuationImpl);
            }
        } else {
            instantTicketRepositoryImpl$createInstantTicketOrder$1 = new InstantTicketRepositoryImpl$createInstantTicketOrder$1(this, continuationImpl);
        }
        Object objB = instantTicketRepositoryImpl$createInstantTicketOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRepositoryImpl$createInstantTicketOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            Intrinsics.i(instantTicketOrderRequestAppModel, "<this>");
            String str = instantTicketOrderRequestAppModel.f3887a;
            long j = instantTicketOrderRequestAppModel.b;
            InstantTicketTripDetails instantTicketTripDetails = instantTicketOrderRequestAppModel.d;
            List<InstantTicketOrderFarePassengerDetail> list = instantTicketOrderRequestAppModel.c;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (InstantTicketOrderFarePassengerDetail instantTicketOrderFarePassengerDetail : list) {
                arrayList.add(new InstantTicketOrderRequestPassengerDetail(instantTicketOrderFarePassengerDetail.f3886a, instantTicketOrderFarePassengerDetail.b));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            InstantTicketOrderRequestApiModel instantTicketOrderRequestApiModel = new InstantTicketOrderRequestApiModel(str, j, instantTicketTripDetails, arrayList, instantTicketOrderRequestAppModel.e);
            instantTicketRepositoryImpl$createInstantTicketOrder$1.label = 1;
            objB = this.f3835a.b(instantTicketOrderRequestApiModel, instantTicketRepositoryImpl$createInstantTicketOrder$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return CreateOrderResponseApiModelKt.a((CreateOrderResponseApiModel) objB);
    }

    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Object m(ArrayList arrayList, Continuation continuation) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            InstantTicketResponseApiModel instantTicketResponseApiModelA = this.k.a((JsonObject) obj);
            InstantTicketEntity instantTicketEntityB = instantTicketResponseApiModelA != null ? InstantMobileTicketResponseApiModelKt.b(instantTicketResponseApiModelA) : null;
            if (instantTicketEntityB != null) {
                arrayList2.add(instantTicketEntityB);
            }
        }
        Object objH = this.b.h(arrayList2, continuation);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.instantticket.data.InstantTicketRepository
    public final Object n(String str, ContinuationImpl continuationImpl) {
        InstantTicketRepositoryImpl$fetchInstantTicketAndStore$1 instantTicketRepositoryImpl$fetchInstantTicketAndStore$1;
        if (continuationImpl instanceof InstantTicketRepositoryImpl$fetchInstantTicketAndStore$1) {
            instantTicketRepositoryImpl$fetchInstantTicketAndStore$1 = (InstantTicketRepositoryImpl$fetchInstantTicketAndStore$1) continuationImpl;
            int i = instantTicketRepositoryImpl$fetchInstantTicketAndStore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRepositoryImpl$fetchInstantTicketAndStore$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRepositoryImpl$fetchInstantTicketAndStore$1 = new InstantTicketRepositoryImpl$fetchInstantTicketAndStore$1(this, continuationImpl);
            }
        } else {
            instantTicketRepositoryImpl$fetchInstantTicketAndStore$1 = new InstantTicketRepositoryImpl$fetchInstantTicketAndStore$1(this, continuationImpl);
        }
        Object objC = instantTicketRepositoryImpl$fetchInstantTicketAndStore$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRepositoryImpl$fetchInstantTicketAndStore$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            instantTicketRepositoryImpl$fetchInstantTicketAndStore$1.label = 1;
            objC = this.f3835a.c(str, instantTicketRepositoryImpl$fetchInstantTicketAndStore$1);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return unit;
        }
        ResultKt.b(objC);
        InstantTicketResponseApiModel instantTicketResponseApiModel = (InstantTicketResponseApiModel) ((InstantMobileTicketResponseApiModel) objC).f3865a.get(0);
        if (InstantMobileTicketResponseApiModelKt.a(instantTicketResponseApiModel)) {
            InstantTicketEntity instantTicketEntityB = InstantMobileTicketResponseApiModelKt.b(instantTicketResponseApiModel);
            instantTicketRepositoryImpl$fetchInstantTicketAndStore$1.label = 2;
            if (this.b.d(instantTicketEntityB, instantTicketRepositoryImpl$fetchInstantTicketAndStore$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(ContinuationImpl continuationImpl) {
        InstantTicketRepositoryImpl$getCityCluster$1 instantTicketRepositoryImpl$getCityCluster$1;
        String lowerCase;
        if (continuationImpl instanceof InstantTicketRepositoryImpl$getCityCluster$1) {
            instantTicketRepositoryImpl$getCityCluster$1 = (InstantTicketRepositoryImpl$getCityCluster$1) continuationImpl;
            int i = instantTicketRepositoryImpl$getCityCluster$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRepositoryImpl$getCityCluster$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRepositoryImpl$getCityCluster$1 = new InstantTicketRepositoryImpl$getCityCluster$1(this, continuationImpl);
            }
        } else {
            instantTicketRepositoryImpl$getCityCluster$1 = new InstantTicketRepositoryImpl$getCityCluster$1(this, continuationImpl);
        }
        Object objA = instantTicketRepositoryImpl$getCityCluster$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRepositoryImpl$getCityCluster$1.label;
        String lowerCase2 = "";
        CityProvider cityProvider = this.d;
        if (i2 == 0) {
            ResultKt.b(objA);
            String strB = CityProviderKt.b(cityProvider);
            if (strB != null) {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = "";
            }
            instantTicketRepositoryImpl$getCityCluster$1.label = 1;
            objA = this.j.a(lowerCase, instantTicketRepositoryImpl$getCityCluster$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        List list = (List) objA;
        if (!list.isEmpty()) {
            return list;
        }
        String strB2 = CityProviderKt.b(cityProvider);
        if (strB2 != null) {
            lowerCase2 = strB2.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase2, "toLowerCase(...)");
        }
        return CollectionsKt.R(lowerCase2);
    }
}
