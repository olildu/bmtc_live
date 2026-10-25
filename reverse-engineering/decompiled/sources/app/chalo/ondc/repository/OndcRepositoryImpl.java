package app.chalo.ondc.repository;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.contract.BasicInfoContract;
import app.chalo.instantticket.data.exception.InvalidFareResponseDataException;
import app.chalo.instantticket.data.model.api.response.FareBreakupApiModel;
import app.chalo.instantticket.data.model.api.response.FetchMobileTicketFareResponseApiModel;
import app.chalo.instantticket.data.model.api.response.FetchMobileTicketFareResponseApiModelKt;
import app.chalo.instantticket.data.model.app.request.PassengerDetailData;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.metro.dao.ondc.OndcMetroTicketEntity;
import app.chalo.metro.dao.ondc.OndcMetroTicketEntityKt;
import app.chalo.metro.data.api.MetroLineStopListApiModel;
import app.chalo.metro.data.app.MetroLineStopListAppModel;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.models.ondc.OndcTicketReceiptApiModel;
import app.chalo.models.ondc.OndcTicketReceiptAppModel;
import app.chalo.models.ondc.OndcTicketReceiptAppModelKt;
import app.chalo.models.ondc.OndcTicketReceiptEntity;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.models.ordercreation.CreateOrderResponseApiModelKt;
import app.chalo.ondc.dao.OndcTicketEntity;
import app.chalo.ondc.dao.OndcTicketEntityKt;
import app.chalo.ondc.error.InvalidMetroLineStopListDataException;
import app.chalo.ondc.error.OndcBookingInvalidResponseException;
import app.chalo.ondc.error.OndcBookingReceiptInvalidResponseException;
import app.chalo.ondc.local.OndcLocalDataSource;
import app.chalo.ondc.model.api.request.ONDCFetchFareRequestApiModel;
import app.chalo.ondc.model.api.request.OndcBookingRequestApiModel;
import app.chalo.ondc.model.api.request.OndcConfirmBookingApiModel;
import app.chalo.ondc.model.api.request.OndcCustomerInfoApiModel;
import app.chalo.ondc.model.api.request.OndcFarePassengerDetailApiModel;
import app.chalo.ondc.model.api.request.OndcOrderRequestApiModel;
import app.chalo.ondc.model.api.response.OndcBookingResponseApiModel;
import app.chalo.ondc.model.api.response.OndcMetroRouteSearchApiModel;
import app.chalo.ondc.model.api.response.OndcMetroRouteSearchResponseApiModel;
import app.chalo.ondc.model.api.response.OndcRouteSearchResultApiModel;
import app.chalo.ondc.model.app.OndcMetroRouteSearchAppModel;
import app.chalo.ondc.model.app.OndcMetroRouteSearchResultAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketAppModelKt;
import app.chalo.ondc.model.app.OndcRouteSearchResultAppModel;
import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.ondc.model.app.OndcTicketAppModelKt;
import app.chalo.ondc.model.app.request.ONDCFetchFareRequestAppModel;
import app.chalo.ondc.model.app.request.OndcBookingRequestAppModel;
import app.chalo.ondc.model.app.request.OndcOrderRequestAppModel;
import app.chalo.ondc.model.app.response.OndcBookingAppModel;
import app.chalo.ondc.remote.OndcRemoteDataSource;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationAdditionalRouteInfoApiModel;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationApiModel;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationApiModelKt;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationStopApiModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAdditionalRouteInfoAppModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ondc/repository/OndcRepositoryImpl;", "Lapp/chalo/ondc/repository/OndcRepository;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcRepositoryImpl implements OndcRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OndcRemoteDataSource f6783a;
    public final OndcLocalDataSource b;
    public final UserProfileDetailsProvider c;
    public final CityProvider d;
    public final BasicInfoContract e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/ondc/repository/OndcRepositoryImpl$Companion;", "", "", "PARAM_FROM_STOP_ID", "Ljava/lang/String;", "PARAM_TO_STOP_ID", "PARAM_TRANSIT_MODE", "PARAM_ROUTE_ID", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6784a;

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
            f6784a = iArr;
        }
    }

    public OndcRepositoryImpl(OndcRemoteDataSource ondcRemoteDataSource, OndcLocalDataSource ondcLocalDataSource, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider, BasicInfoContract basicInfoContract) {
        this.f6783a = ondcRemoteDataSource;
        this.b = ondcLocalDataSource;
        this.c = userProfileDetailsProvider;
        this.d = cityProvider;
        this.e = basicInfoContract;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [app.chalo.ondc.repository.OndcRepositoryImpl$getOndcTicketReceiptFlow$$inlined$map$1] */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final OndcRepositoryImpl$getOndcTicketReceiptFlow$$inlined$map$1 a(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        final Flow flowA = this.b.a(bookingId);
        return new Flow<OndcTicketReceiptAppModel>() { // from class: app.chalo.ondc.repository.OndcRepositoryImpl$getOndcTicketReceiptFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.ondc.repository.OndcRepositoryImpl$getOndcTicketReceiptFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f6798a;

                /* JADX INFO: renamed from: app.chalo.ondc.repository.OndcRepositoryImpl$getOndcTicketReceiptFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.ondc.repository.OndcRepositoryImpl$getOndcTicketReceiptFlow$$inlined$map$1$2", f = "OndcRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f6798a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        OndcTicketReceiptEntity ondcTicketReceiptEntity = (OndcTicketReceiptEntity) obj;
                        OndcTicketReceiptAppModel ondcTicketReceiptAppModel = ondcTicketReceiptEntity != null ? new OndcTicketReceiptAppModel(ondcTicketReceiptEntity.f5631a, ondcTicketReceiptEntity.b, ondcTicketReceiptEntity.c, ondcTicketReceiptEntity.e, ondcTicketReceiptEntity.d, ondcTicketReceiptEntity.i, ondcTicketReceiptEntity.f, ondcTicketReceiptEntity.g, ondcTicketReceiptEntity.j, ondcTicketReceiptEntity.k, ondcTicketReceiptEntity.l, ondcTicketReceiptEntity.m) : null;
                        anonymousClass1.label = 1;
                        if (this.f6798a.emit(ondcTicketReceiptAppModel, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowA.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object b(String str, ContinuationImpl continuationImpl) throws OndcBookingReceiptInvalidResponseException {
        OndcRepositoryImpl$fetchOndcTicketReceipt$1 ondcRepositoryImpl$fetchOndcTicketReceipt$1;
        if (continuationImpl instanceof OndcRepositoryImpl$fetchOndcTicketReceipt$1) {
            ondcRepositoryImpl$fetchOndcTicketReceipt$1 = (OndcRepositoryImpl$fetchOndcTicketReceipt$1) continuationImpl;
            int i = ondcRepositoryImpl$fetchOndcTicketReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRepositoryImpl$fetchOndcTicketReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRepositoryImpl$fetchOndcTicketReceipt$1 = new OndcRepositoryImpl$fetchOndcTicketReceipt$1(this, continuationImpl);
            }
        } else {
            ondcRepositoryImpl$fetchOndcTicketReceipt$1 = new OndcRepositoryImpl$fetchOndcTicketReceipt$1(this, continuationImpl);
        }
        Object objB = ondcRepositoryImpl$fetchOndcTicketReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRepositoryImpl$fetchOndcTicketReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ondcRepositoryImpl$fetchOndcTicketReceipt$1.label = 1;
            objB = this.f6783a.b(str, ondcRepositoryImpl$fetchOndcTicketReceipt$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        OndcTicketReceiptAppModel ondcTicketReceiptAppModelA = OndcTicketReceiptAppModelKt.a((OndcTicketReceiptApiModel) objB);
        if (ondcTicketReceiptAppModelA != null) {
            return ondcTicketReceiptAppModelA;
        }
        throw new OndcBookingReceiptInvalidResponseException("Invalid receipt response");
    }

    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object c(ArrayList arrayList, Continuation continuation) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(OndcMetroTicketAppModelKt.b((OndcMetroTicketAppModel) obj));
        }
        Object objM = this.b.m(arrayList2, continuation);
        return objM == CoroutineSingletons.COROUTINE_SUSPENDED ? objM : Unit.f17538a;
    }

    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object d(OndcTicketAppModel ondcTicketAppModel, ContinuationImpl continuationImpl) {
        Object objJ = this.b.j(OndcTicketAppModelKt.a(ondcTicketAppModel), continuationImpl);
        return objJ == CoroutineSingletons.COROUTINE_SUSPENDED ? objJ : Unit.f17538a;
    }

    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object e(String str, String str2, String str3, Continuation continuation) {
        return this.f6783a.g(str, (ContinuationImpl) continuation);
    }

    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object f(Continuation continuation) {
        Object objG = this.b.g(continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object g(String str, String str2, String str3, Continuation continuation) {
        return this.f6783a.f(str, (ContinuationImpl) continuation);
    }

    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object h(Continuation continuation) {
        Object objH = this.b.h(continuation);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object i(OndcBookingRequestAppModel ondcBookingRequestAppModel, ContinuationImpl continuationImpl) throws OndcBookingInvalidResponseException {
        OndcRepositoryImpl$createBooking$1 ondcRepositoryImpl$createBooking$1;
        ArrayList arrayList;
        if (continuationImpl instanceof OndcRepositoryImpl$createBooking$1) {
            ondcRepositoryImpl$createBooking$1 = (OndcRepositoryImpl$createBooking$1) continuationImpl;
            int i = ondcRepositoryImpl$createBooking$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRepositoryImpl$createBooking$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRepositoryImpl$createBooking$1 = new OndcRepositoryImpl$createBooking$1(this, continuationImpl);
            }
        } else {
            ondcRepositoryImpl$createBooking$1 = new OndcRepositoryImpl$createBooking$1(this, continuationImpl);
        }
        Object objJ = ondcRepositoryImpl$createBooking$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRepositoryImpl$createBooking$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            Intrinsics.i(ondcBookingRequestAppModel, "<this>");
            String str = ondcBookingRequestAppModel.f6777a;
            String str2 = ondcBookingRequestAppModel.b;
            List<PassengerDetailData> list = ondcBookingRequestAppModel.c;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
            for (PassengerDetailData passengerDetailData : list) {
                arrayList2.add(new OndcFarePassengerDetailApiModel(passengerDetailData.f3888a, passengerDetailData.b, passengerDetailData.c));
            }
            OndcBookingRequestApiModel ondcBookingRequestApiModel = new OndcBookingRequestApiModel(str, str2, arrayList2, ondcBookingRequestAppModel.d, new OndcCustomerInfoApiModel(ondcBookingRequestAppModel.e, ondcBookingRequestAppModel.f, ondcBookingRequestAppModel.g), ondcBookingRequestAppModel.h, ondcBookingRequestAppModel.i);
            ondcRepositoryImpl$createBooking$1.label = 1;
            objJ = this.f6783a.j(ondcBookingRequestApiModel, ondcRepositoryImpl$createBooking$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        OndcBookingResponseApiModel ondcBookingResponseApiModel = (OndcBookingResponseApiModel) objJ;
        String str3 = ondcBookingResponseApiModel.f6750a;
        OndcBookingAppModel ondcBookingAppModel = null;
        if (str3 != null) {
            List list2 = ondcBookingResponseApiModel.b;
            if (list2 != null) {
                List<FareBreakupApiModel> list3 = list2;
                arrayList = new ArrayList(CollectionsKt.v(list3, 10));
                for (FareBreakupApiModel fareBreakupApiModel : list3) {
                    arrayList.add(new FareBreakupAppModel(fareBreakupApiModel.f3861a, FetchMobileTicketFareResponseApiModelKt.a(fareBreakupApiModel.b), fareBreakupApiModel.c));
                }
            } else {
                arrayList = null;
            }
            Integer num = ondcBookingResponseApiModel.c;
            if (num != null) {
                int iIntValue = num.intValue();
                List list4 = ondcBookingResponseApiModel.d;
                if (list4 == null) {
                    list4 = EmptyList.f17557a;
                }
                ondcBookingAppModel = new OndcBookingAppModel(str3, arrayList, iIntValue, list4);
            }
        }
        if (ondcBookingAppModel != null) {
            return ondcBookingAppModel;
        }
        throw new OndcBookingInvalidResponseException("Invalid booking response");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object j(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        OndcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1 ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1;
        if (continuationImpl instanceof OndcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1) {
            ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1 = (OndcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1) continuationImpl;
            int i = ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1 = new OndcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1(this, continuationImpl);
            }
        } else {
            ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1 = new OndcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1(this, continuationImpl);
        }
        Object objC = ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1.L$0 = userBookingsStatusType;
            ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1.label = 1;
            objC = this.e.c(ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userBookingsStatusType = (UserBookingsStatusType) ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$1.L$0;
            ResultKt.b(objC);
        }
        final OndcRepositoryImpl$getAllOndcMetroTicketsAsFlow$$inlined$map$1 ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$$inlined$map$1 = new OndcRepositoryImpl$getAllOndcMetroTicketsAsFlow$$inlined$map$1(this.b.k(y(), z()), userBookingsStatusType, ((Number) objC).longValue());
        return new Flow<List<? extends OndcMetroTicketAppModel>>() { // from class: app.chalo.ondc.repository.OndcRepositoryImpl$getAllOndcMetroTicketsAsFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.ondc.repository.OndcRepositoryImpl$getAllOndcMetroTicketsAsFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f6788a;

                /* JADX INFO: renamed from: app.chalo.ondc.repository.OndcRepositoryImpl$getAllOndcMetroTicketsAsFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.ondc.repository.OndcRepositoryImpl$getAllOndcMetroTicketsAsFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "OndcRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f6788a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            arrayList.add(OndcMetroTicketEntityKt.a((OndcMetroTicketEntity) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f6788a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = ondcRepositoryImpl$getAllOndcMetroTicketsAsFlow$$inlined$map$1.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object k(String str, ContinuationImpl continuationImpl) {
        OndcRepositoryImpl$getOndcTicket$1 ondcRepositoryImpl$getOndcTicket$1;
        if (continuationImpl instanceof OndcRepositoryImpl$getOndcTicket$1) {
            ondcRepositoryImpl$getOndcTicket$1 = (OndcRepositoryImpl$getOndcTicket$1) continuationImpl;
            int i = ondcRepositoryImpl$getOndcTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRepositoryImpl$getOndcTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRepositoryImpl$getOndcTicket$1 = new OndcRepositoryImpl$getOndcTicket$1(this, continuationImpl);
            }
        } else {
            ondcRepositoryImpl$getOndcTicket$1 = new OndcRepositoryImpl$getOndcTicket$1(this, continuationImpl);
        }
        Object objI = ondcRepositoryImpl$getOndcTicket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRepositoryImpl$getOndcTicket$1.label;
        if (i2 == 0) {
            ResultKt.b(objI);
            String strZ = z();
            ondcRepositoryImpl$getOndcTicket$1.label = 1;
            objI = this.b.i(str, strZ, ondcRepositoryImpl$getOndcTicket$1);
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objI);
        }
        OndcTicketEntity ondcTicketEntity = (OndcTicketEntity) objI;
        if (ondcTicketEntity != null) {
            return OndcTicketEntityKt.a(ondcTicketEntity);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object l(String str, String str2, String str3, String str4, ChaloTransitMode chaloTransitMode, boolean z, ContinuationImpl continuationImpl) {
        OndcRepositoryImpl$fetchRoutesForSelectedStops$1 ondcRepositoryImpl$fetchRoutesForSelectedStops$1;
        if (continuationImpl instanceof OndcRepositoryImpl$fetchRoutesForSelectedStops$1) {
            ondcRepositoryImpl$fetchRoutesForSelectedStops$1 = (OndcRepositoryImpl$fetchRoutesForSelectedStops$1) continuationImpl;
            int i = ondcRepositoryImpl$fetchRoutesForSelectedStops$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRepositoryImpl$fetchRoutesForSelectedStops$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRepositoryImpl$fetchRoutesForSelectedStops$1 = new OndcRepositoryImpl$fetchRoutesForSelectedStops$1(this, continuationImpl);
            }
        } else {
            ondcRepositoryImpl$fetchRoutesForSelectedStops$1 = new OndcRepositoryImpl$fetchRoutesForSelectedStops$1(this, continuationImpl);
        }
        Object objA = ondcRepositoryImpl$fetchRoutesForSelectedStops$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRepositoryImpl$fetchRoutesForSelectedStops$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("fromStopId", str);
            linkedHashMap.put("toStopId", str2);
            linkedHashMap.put("transitMode", chaloTransitMode.getMode());
            if (str3 != null && !StringsKt.F(str3)) {
                linkedHashMap.put("routeId", str3);
            }
            ondcRepositoryImpl$fetchRoutesForSelectedStops$1.Z$0 = z;
            ondcRepositoryImpl$fetchRoutesForSelectedStops$1.label = 1;
            objA = this.f6783a.a(linkedHashMap, str4, ondcRepositoryImpl$fetchRoutesForSelectedStops$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = ondcRepositoryImpl$fetchRoutesForSelectedStops$1.Z$0;
            ResultKt.b(objA);
        }
        OndcRouteSearchResultApiModel ondcRouteSearchResultApiModel = (OndcRouteSearchResultApiModel) objA;
        String str5 = ondcRouteSearchResultApiModel.b;
        List<OriginDestinationApiModel> list = ondcRouteSearchResultApiModel.f6760a;
        ArrayList arrayList = new ArrayList();
        for (OriginDestinationApiModel originDestinationApiModel : list) {
            OriginDestinationAppModel originDestinationAppModelA = z ? originDestinationApiModel.a(true, true, true, true, (31 & 16) == 0) : originDestinationApiModel.a(false, false, false, false, true);
            if (originDestinationAppModelA != null) {
                arrayList.add(originDestinationAppModelA);
            }
        }
        return new OndcRouteSearchResultAppModel(arrayList, str5);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [app.chalo.ondc.repository.OndcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1] */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final OndcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1 m(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        final Flow flowO = this.b.o(bookingId, z());
        return new Flow<OndcMetroTicketAppModel>() { // from class: app.chalo.ondc.repository.OndcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.ondc.repository.OndcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f6794a;

                /* JADX INFO: renamed from: app.chalo.ondc.repository.OndcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.ondc.repository.OndcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1$2", f = "OndcRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f6794a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        OndcMetroTicketEntity ondcMetroTicketEntity = (OndcMetroTicketEntity) obj;
                        OndcMetroTicketAppModel ondcMetroTicketAppModelA = ondcMetroTicketEntity != null ? OndcMetroTicketEntityKt.a(ondcMetroTicketEntity) : null;
                        anonymousClass1.label = 1;
                        if (this.f6794a.emit(ondcMetroTicketAppModelA, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowO.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object n(ArrayList arrayList, Continuation continuation) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(OndcTicketAppModelKt.a((OndcTicketAppModel) obj));
        }
        Object objF = this.b.f(arrayList2, continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object o(String str, String str2, ChaloTransitMode chaloTransitMode, ContinuationImpl continuationImpl) throws InvalidMetroLineStopListDataException {
        OndcRepositoryImpl$fetchMetroLineStops$1 ondcRepositoryImpl$fetchMetroLineStops$1;
        MetroLineStopListAppModel metroLineStopListAppModel;
        if (continuationImpl instanceof OndcRepositoryImpl$fetchMetroLineStops$1) {
            ondcRepositoryImpl$fetchMetroLineStops$1 = (OndcRepositoryImpl$fetchMetroLineStops$1) continuationImpl;
            int i = ondcRepositoryImpl$fetchMetroLineStops$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRepositoryImpl$fetchMetroLineStops$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRepositoryImpl$fetchMetroLineStops$1 = new OndcRepositoryImpl$fetchMetroLineStops$1(this, continuationImpl);
            }
        } else {
            ondcRepositoryImpl$fetchMetroLineStops$1 = new OndcRepositoryImpl$fetchMetroLineStops$1(this, continuationImpl);
        }
        Object objH = ondcRepositoryImpl$fetchMetroLineStops$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRepositoryImpl$fetchMetroLineStops$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            ondcRepositoryImpl$fetchMetroLineStops$1.label = 1;
            objH = this.f6783a.h(str, str2, chaloTransitMode, ondcRepositoryImpl$fetchMetroLineStops$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        MetroLineStopListApiModel metroLineStopListApiModel = (MetroLineStopListApiModel) objH;
        Intrinsics.i(metroLineStopListApiModel, "<this>");
        List list = metroLineStopListApiModel.f5408a;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StopAppModel stopAppModelA = ((OriginDestinationStopApiModel) it.next()).a(ChaloTransitMode.METRO);
            if (stopAppModelA == null) {
                metroLineStopListAppModel = null;
                if (metroLineStopListAppModel != null) {
                    return metroLineStopListAppModel;
                }
                throw new InvalidMetroLineStopListDataException("Invalid metro line stops");
            }
            arrayList.add(stopAppModelA);
        }
        metroLineStopListAppModel = new MetroLineStopListAppModel(arrayList);
        if (metroLineStopListAppModel != null) {
            return metroLineStopListAppModel;
        }
        throw new InvalidMetroLineStopListDataException("Invalid metro line stops");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object p(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        OndcRepositoryImpl$getAllOndcTicketsAsFlow$1 ondcRepositoryImpl$getAllOndcTicketsAsFlow$1;
        if (continuationImpl instanceof OndcRepositoryImpl$getAllOndcTicketsAsFlow$1) {
            ondcRepositoryImpl$getAllOndcTicketsAsFlow$1 = (OndcRepositoryImpl$getAllOndcTicketsAsFlow$1) continuationImpl;
            int i = ondcRepositoryImpl$getAllOndcTicketsAsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRepositoryImpl$getAllOndcTicketsAsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRepositoryImpl$getAllOndcTicketsAsFlow$1 = new OndcRepositoryImpl$getAllOndcTicketsAsFlow$1(this, continuationImpl);
            }
        } else {
            ondcRepositoryImpl$getAllOndcTicketsAsFlow$1 = new OndcRepositoryImpl$getAllOndcTicketsAsFlow$1(this, continuationImpl);
        }
        Object objC = ondcRepositoryImpl$getAllOndcTicketsAsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRepositoryImpl$getAllOndcTicketsAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            ondcRepositoryImpl$getAllOndcTicketsAsFlow$1.L$0 = userBookingsStatusType;
            ondcRepositoryImpl$getAllOndcTicketsAsFlow$1.label = 1;
            objC = this.e.c(ondcRepositoryImpl$getAllOndcTicketsAsFlow$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userBookingsStatusType = (UserBookingsStatusType) ondcRepositoryImpl$getAllOndcTicketsAsFlow$1.L$0;
            ResultKt.b(objC);
        }
        final OndcRepositoryImpl$getAllOndcTicketsAsFlow$$inlined$map$1 ondcRepositoryImpl$getAllOndcTicketsAsFlow$$inlined$map$1 = new OndcRepositoryImpl$getAllOndcTicketsAsFlow$$inlined$map$1(this.b.e(y(), z()), userBookingsStatusType, ((Number) objC).longValue());
        return new Flow<List<? extends OndcTicketAppModel>>() { // from class: app.chalo.ondc.repository.OndcRepositoryImpl$getAllOndcTicketsAsFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.ondc.repository.OndcRepositoryImpl$getAllOndcTicketsAsFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f6792a;

                /* JADX INFO: renamed from: app.chalo.ondc.repository.OndcRepositoryImpl$getAllOndcTicketsAsFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.ondc.repository.OndcRepositoryImpl$getAllOndcTicketsAsFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "OndcRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f6792a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            arrayList.add(OndcTicketEntityKt.a((OndcTicketEntity) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f6792a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = ondcRepositoryImpl$getAllOndcTicketsAsFlow$$inlined$map$1.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object q(String str, Continuation continuation) {
        return this.f6783a.d(new OndcConfirmBookingApiModel(str), (ContinuationImpl) continuation);
    }

    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object r(OndcMetroTicketAppModel ondcMetroTicketAppModel, Continuation continuation) {
        Object objL = this.b.l(OndcMetroTicketAppModelKt.b(ondcMetroTicketAppModel), continuation);
        return objL == CoroutineSingletons.COROUTINE_SUSPENDED ? objL : Unit.f17538a;
    }

    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object s(OndcTicketReceiptAppModel ondcTicketReceiptAppModel, ContinuationImpl continuationImpl) {
        Object objC = this.b.c(new OndcTicketReceiptEntity(ondcTicketReceiptAppModel.f5630a, ondcTicketReceiptAppModel.b, ondcTicketReceiptAppModel.c, ondcTicketReceiptAppModel.e, ondcTicketReceiptAppModel.d, ondcTicketReceiptAppModel.g, ondcTicketReceiptAppModel.h, "", ondcTicketReceiptAppModel.f, ondcTicketReceiptAppModel.i, ondcTicketReceiptAppModel.j, ondcTicketReceiptAppModel.k, ondcTicketReceiptAppModel.l), continuationImpl);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object t(String str, ChaloTransitMode chaloTransitMode, ContinuationImpl continuationImpl) {
        OndcRepositoryImpl$fetchMetroLines$1 ondcRepositoryImpl$fetchMetroLines$1;
        String str2;
        OriginDestinationStopApiModel originDestinationStopApiModel;
        ChaloTransitMode chaloTransitMode2;
        StopAppModel stopAppModelA;
        OriginDestinationStopApiModel originDestinationStopApiModel2;
        StopAppModel stopAppModelA2;
        if (continuationImpl instanceof OndcRepositoryImpl$fetchMetroLines$1) {
            ondcRepositoryImpl$fetchMetroLines$1 = (OndcRepositoryImpl$fetchMetroLines$1) continuationImpl;
            int i = ondcRepositoryImpl$fetchMetroLines$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRepositoryImpl$fetchMetroLines$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRepositoryImpl$fetchMetroLines$1 = new OndcRepositoryImpl$fetchMetroLines$1(this, continuationImpl);
            }
        } else {
            ondcRepositoryImpl$fetchMetroLines$1 = new OndcRepositoryImpl$fetchMetroLines$1(this, continuationImpl);
        }
        Object objI = ondcRepositoryImpl$fetchMetroLines$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRepositoryImpl$fetchMetroLines$1.label;
        if (i2 == 0) {
            ResultKt.b(objI);
            String mode = chaloTransitMode.getMode();
            ondcRepositoryImpl$fetchMetroLines$1.label = 1;
            objI = this.f6783a.i(str, mode, ondcRepositoryImpl$fetchMetroLines$1);
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objI);
        }
        OndcMetroRouteSearchResponseApiModel ondcMetroRouteSearchResponseApiModel = (OndcMetroRouteSearchResponseApiModel) objI;
        Intrinsics.i(ondcMetroRouteSearchResponseApiModel, "<this>");
        List<OndcMetroRouteSearchApiModel> list = ondcMetroRouteSearchResponseApiModel.f6754a;
        ArrayList arrayList = new ArrayList();
        for (OndcMetroRouteSearchApiModel ondcMetroRouteSearchApiModel : list) {
            Intrinsics.i(ondcMetroRouteSearchApiModel, "<this>");
            ChaloTransitMode.Companion companion = ChaloTransitMode.INSTANCE;
            String str3 = ondcMetroRouteSearchApiModel.h;
            if (str3 == null) {
                str3 = "";
            }
            ChaloTransitMode chaloTransitModeB = ChaloTransitMode.Companion.b(companion, str3);
            OriginDestinationAdditionalRouteInfoApiModel originDestinationAdditionalRouteInfoApiModel = ondcMetroRouteSearchApiModel.i;
            OndcMetroRouteSearchAppModel ondcMetroRouteSearchAppModel = null;
            OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModelA = originDestinationAdditionalRouteInfoApiModel != null ? OriginDestinationApiModelKt.a(chaloTransitModeB, originDestinationAdditionalRouteInfoApiModel) : null;
            String str4 = ondcMetroRouteSearchApiModel.f6752a;
            if (str4 != null && (str2 = ondcMetroRouteSearchApiModel.b) != null && (originDestinationStopApiModel = ondcMetroRouteSearchApiModel.d) != null && (stopAppModelA = originDestinationStopApiModel.a((chaloTransitMode2 = ChaloTransitMode.BUS))) != null && (originDestinationStopApiModel2 = ondcMetroRouteSearchApiModel.c) != null && (stopAppModelA2 = originDestinationStopApiModel2.a(chaloTransitMode2)) != null) {
                List list2 = ondcMetroRouteSearchApiModel.e;
                if (list2 == null) {
                    list2 = EmptyList.f17557a;
                }
                List list3 = list2;
                String str5 = ondcMetroRouteSearchApiModel.f;
                RouteNamingSchemeType.Companion companion2 = RouteNamingSchemeType.INSTANCE;
                String str6 = ondcMetroRouteSearchApiModel.g;
                companion2.getClass();
                ondcMetroRouteSearchAppModel = new OndcMetroRouteSearchAppModel(str4, str2, stopAppModelA, stopAppModelA2, list3, str5, RouteNamingSchemeType.Companion.a(str6), chaloTransitModeB, originDestinationAdditionalRouteInfoAppModelA);
            }
            if (ondcMetroRouteSearchAppModel != null) {
                arrayList.add(ondcMetroRouteSearchAppModel);
            }
        }
        return new OndcMetroRouteSearchResultAppModel(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object u(ONDCFetchFareRequestAppModel oNDCFetchFareRequestAppModel, ContinuationImpl continuationImpl) throws InvalidFareResponseDataException {
        OndcRepositoryImpl$getMobileTicketFare$1 ondcRepositoryImpl$getMobileTicketFare$1;
        if (continuationImpl instanceof OndcRepositoryImpl$getMobileTicketFare$1) {
            ondcRepositoryImpl$getMobileTicketFare$1 = (OndcRepositoryImpl$getMobileTicketFare$1) continuationImpl;
            int i = ondcRepositoryImpl$getMobileTicketFare$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRepositoryImpl$getMobileTicketFare$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRepositoryImpl$getMobileTicketFare$1 = new OndcRepositoryImpl$getMobileTicketFare$1(this, continuationImpl);
            }
        } else {
            ondcRepositoryImpl$getMobileTicketFare$1 = new OndcRepositoryImpl$getMobileTicketFare$1(this, continuationImpl);
        }
        Object objE = ondcRepositoryImpl$getMobileTicketFare$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRepositoryImpl$getMobileTicketFare$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            ONDCFetchFareRequestApiModel oNDCFetchFareRequestApiModel = new ONDCFetchFareRequestApiModel(oNDCFetchFareRequestAppModel.f6775a, oNDCFetchFareRequestAppModel.b, oNDCFetchFareRequestAppModel.c, oNDCFetchFareRequestAppModel.d, oNDCFetchFareRequestAppModel.e, oNDCFetchFareRequestAppModel.f, oNDCFetchFareRequestAppModel.g);
            ondcRepositoryImpl$getMobileTicketFare$1.label = 1;
            objE = this.f6783a.e(oNDCFetchFareRequestApiModel, ondcRepositoryImpl$getMobileTicketFare$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        if (!FetchMobileTicketFareResponseApiModelKt.b((FetchMobileTicketFareResponseApiModel) objE)) {
            objE = null;
        }
        FetchMobileTicketFareResponseApiModel fetchMobileTicketFareResponseApiModel = (FetchMobileTicketFareResponseApiModel) objE;
        if (fetchMobileTicketFareResponseApiModel != null) {
            return FetchMobileTicketFareResponseApiModelKt.d(fetchMobileTicketFareResponseApiModel);
        }
        throw new InvalidFareResponseDataException("Invalid fare response");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object v(String str, ContinuationImpl continuationImpl) {
        OndcRepositoryImpl$getOndcMetroTicket$1 ondcRepositoryImpl$getOndcMetroTicket$1;
        if (continuationImpl instanceof OndcRepositoryImpl$getOndcMetroTicket$1) {
            ondcRepositoryImpl$getOndcMetroTicket$1 = (OndcRepositoryImpl$getOndcMetroTicket$1) continuationImpl;
            int i = ondcRepositoryImpl$getOndcMetroTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRepositoryImpl$getOndcMetroTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRepositoryImpl$getOndcMetroTicket$1 = new OndcRepositoryImpl$getOndcMetroTicket$1(this, continuationImpl);
            }
        } else {
            ondcRepositoryImpl$getOndcMetroTicket$1 = new OndcRepositoryImpl$getOndcMetroTicket$1(this, continuationImpl);
        }
        Object objN = ondcRepositoryImpl$getOndcMetroTicket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRepositoryImpl$getOndcMetroTicket$1.label;
        if (i2 == 0) {
            ResultKt.b(objN);
            String strZ = z();
            ondcRepositoryImpl$getOndcMetroTicket$1.label = 1;
            objN = this.b.n(str, strZ, ondcRepositoryImpl$getOndcMetroTicket$1);
            if (objN == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objN);
        }
        OndcMetroTicketEntity ondcMetroTicketEntity = (OndcMetroTicketEntity) objN;
        if (ondcMetroTicketEntity != null) {
            return OndcMetroTicketEntityKt.a(ondcMetroTicketEntity);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final Object w(OndcOrderRequestAppModel ondcOrderRequestAppModel, ContinuationImpl continuationImpl) {
        OndcRepositoryImpl$createOrder$1 ondcRepositoryImpl$createOrder$1;
        if (continuationImpl instanceof OndcRepositoryImpl$createOrder$1) {
            ondcRepositoryImpl$createOrder$1 = (OndcRepositoryImpl$createOrder$1) continuationImpl;
            int i = ondcRepositoryImpl$createOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRepositoryImpl$createOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRepositoryImpl$createOrder$1 = new OndcRepositoryImpl$createOrder$1(this, continuationImpl);
            }
        } else {
            ondcRepositoryImpl$createOrder$1 = new OndcRepositoryImpl$createOrder$1(this, continuationImpl);
        }
        Object objC = ondcRepositoryImpl$createOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRepositoryImpl$createOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            OndcOrderRequestApiModel ondcOrderRequestApiModel = new OndcOrderRequestApiModel(ondcOrderRequestAppModel.f6778a, ondcOrderRequestAppModel.b);
            ondcRepositoryImpl$createOrder$1.label = 1;
            objC = this.f6783a.c(ondcOrderRequestApiModel, ondcRepositoryImpl$createOrder$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        return CreateOrderResponseApiModelKt.a((CreateOrderResponseApiModel) objC);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [app.chalo.ondc.repository.OndcRepositoryImpl$getOndcTicketAsFlow$$inlined$map$1] */
    @Override // app.chalo.ondc.repository.OndcRepository
    public final OndcRepositoryImpl$getOndcTicketAsFlow$$inlined$map$1 x(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        final Flow flowB = this.b.b(bookingId, z());
        return new Flow<OndcTicketAppModel>() { // from class: app.chalo.ondc.repository.OndcRepositoryImpl$getOndcTicketAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.ondc.repository.OndcRepositoryImpl$getOndcTicketAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f6796a;

                /* JADX INFO: renamed from: app.chalo.ondc.repository.OndcRepositoryImpl$getOndcTicketAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.ondc.repository.OndcRepositoryImpl$getOndcTicketAsFlow$$inlined$map$1$2", f = "OndcRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f6796a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        OndcTicketEntity ondcTicketEntity = (OndcTicketEntity) obj;
                        OndcTicketAppModel ondcTicketAppModelA = ondcTicketEntity != null ? OndcTicketEntityKt.a(ondcTicketEntity) : null;
                        anonymousClass1.label = 1;
                        if (this.f6796a.emit(ondcTicketAppModelA, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowB.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    public final String y() {
        String strB = CityProviderKt.b(this.d);
        if (strB == null) {
            return "";
        }
        String lowerCase = strB.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final String z() {
        String strM = this.c.m();
        return strM == null ? "" : strM;
    }
}
