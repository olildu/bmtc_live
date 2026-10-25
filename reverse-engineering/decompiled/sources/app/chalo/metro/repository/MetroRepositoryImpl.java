package app.chalo.metro.repository;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.CurrencyRoundOffLogicKt;
import app.chalo.contract.BasicInfoContract;
import app.chalo.instantticket.data.model.api.response.FareBreakupApiModel;
import app.chalo.instantticket.data.model.api.response.FetchMobileTicketFareResponseApiModelKt;
import app.chalo.instantticket.data.model.app.request.PassengerDetailData;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.metro.dao.MetroTicketEntity;
import app.chalo.metro.dao.MetroTicketEntityKt;
import app.chalo.metro.data.api.MetroFarePassengerDetailApiModel;
import app.chalo.metro.data.api.MetroFinalFareResponseApiModel;
import app.chalo.metro.data.api.MetroLiveBookingStatusRequestApiModel;
import app.chalo.metro.data.api.MetroLiveBookingStatusResponseApiModel;
import app.chalo.metro.data.api.MetroTicketOrderRequestApiModel;
import app.chalo.metro.data.api.MetroTicketOrderRequestPassengerDetail;
import app.chalo.metro.data.api.MetroTicketTripDetails;
import app.chalo.metro.data.api.MetroTicketUpdateRequestApiModel;
import app.chalo.metro.data.api.TicketFinalFareRequestApiModel;
import app.chalo.metro.data.app.MetroFinalFareAppModel;
import app.chalo.metro.data.app.MetroLiveBookingStatusResponseAppModel;
import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.metro.data.app.MetroTicketAppModelKt;
import app.chalo.metro.data.app.MetroTicketOrderFarePassengerDetail;
import app.chalo.metro.data.app.MetroTicketOrderRequestAppModel;
import app.chalo.metro.data.app.MetroTicketStatus;
import app.chalo.metro.data.app.MetroTicketUpdateRequestAppModel;
import app.chalo.metro.data.app.TicketFinalFareRequestAppModel;
import app.chalo.metro.error.MetroInvalidFareResponseDataException;
import app.chalo.metro.local.MetroLocalDataSource;
import app.chalo.metro.remote.MetroRemoteDataSource;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.models.ordercreation.CreateOrderResponseApiModelKt;
import app.chalo.models.productbooking.ChaloTicketBookingMode;
import app.chalo.productbooking.common.data.models.api.request.TicketBookingFareRequestApiModel;
import app.chalo.productbooking.common.data.models.api.request.TicketBookingFareRequestApiModelKt;
import app.chalo.productbooking.common.data.models.api.request.TicketBookingTripDetailsApiModel;
import app.chalo.productbooking.common.data.models.api.response.TicketBookingFareResponseApiModel;
import app.chalo.productbooking.common.data.models.app.request.TicketBookingFareRequestAppModel;
import app.chalo.productbooking.common.data.models.app.response.TicketBookingFareAppModel;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.apache.commons.io.IOUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/repository/MetroRepositoryImpl;", "Lapp/chalo/metro/repository/MetroRepository;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroRepositoryImpl implements MetroRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetroRemoteDataSource f5453a;
    public final MetroLocalDataSource b;
    public final UserProfileDetailsProvider c;
    public final CityProvider d;
    public final BasicInfoContract e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5454a;

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
            f5454a = iArr;
        }
    }

    public MetroRepositoryImpl(MetroRemoteDataSource metroRemoteDataSource, MetroLocalDataSource metroLocalDataSource, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider, BasicInfoContract basicInfoContract) {
        this.f5453a = metroRemoteDataSource;
        this.b = metroLocalDataSource;
        this.c = userProfileDetailsProvider;
        this.d = cityProvider;
        this.e = basicInfoContract;
    }

    @Override // app.chalo.metro.repository.MetroRepository
    public final Object a(Continuation continuation) {
        Object objA = this.b.a(continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.metro.repository.MetroRepository
    public final Serializable b(MetroLiveBookingStatusRequestApiModel metroLiveBookingStatusRequestApiModel, ContinuationImpl continuationImpl) {
        MetroRepositoryImpl$getMetroLiveBookingStatus$1 metroRepositoryImpl$getMetroLiveBookingStatus$1;
        if (continuationImpl instanceof MetroRepositoryImpl$getMetroLiveBookingStatus$1) {
            metroRepositoryImpl$getMetroLiveBookingStatus$1 = (MetroRepositoryImpl$getMetroLiveBookingStatus$1) continuationImpl;
            int i = metroRepositoryImpl$getMetroLiveBookingStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroRepositoryImpl$getMetroLiveBookingStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                metroRepositoryImpl$getMetroLiveBookingStatus$1 = new MetroRepositoryImpl$getMetroLiveBookingStatus$1(this, continuationImpl);
            }
        } else {
            metroRepositoryImpl$getMetroLiveBookingStatus$1 = new MetroRepositoryImpl$getMetroLiveBookingStatus$1(this, continuationImpl);
        }
        Object objB = metroRepositoryImpl$getMetroLiveBookingStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroRepositoryImpl$getMetroLiveBookingStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            metroRepositoryImpl$getMetroLiveBookingStatus$1.label = 1;
            objB = this.f5453a.b(metroLiveBookingStatusRequestApiModel, metroRepositoryImpl$getMetroLiveBookingStatus$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        List<MetroLiveBookingStatusResponseApiModel> list = (List) objB;
        Intrinsics.i(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (MetroLiveBookingStatusResponseApiModel metroLiveBookingStatusResponseApiModel : list) {
            MetroTicketStatus.Companion companion = MetroTicketStatus.INSTANCE;
            String str = metroLiveBookingStatusResponseApiModel.b;
            companion.getClass();
            MetroTicketStatus metroTicketStatusA = MetroTicketStatus.Companion.a(str);
            MetroLiveBookingStatusResponseAppModel metroLiveBookingStatusResponseAppModel = metroTicketStatusA == null ? null : new MetroLiveBookingStatusResponseAppModel(metroLiveBookingStatusResponseApiModel.f5412a, metroTicketStatusA);
            if (metroLiveBookingStatusResponseAppModel != null) {
                arrayList.add(metroLiveBookingStatusResponseAppModel);
            }
        }
        return arrayList;
    }

    @Override // app.chalo.metro.repository.MetroRepository
    public final Object c(ArrayList arrayList, Continuation continuation) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(MetroTicketAppModelKt.b((MetroTicketAppModel) obj));
        }
        Object objE = this.b.e(arrayList2, continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [app.chalo.metro.repository.MetroRepositoryImpl$getMetroTicketAsFlow$$inlined$map$1] */
    @Override // app.chalo.metro.repository.MetroRepository
    public final MetroRepositoryImpl$getMetroTicketAsFlow$$inlined$map$1 d(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        String strM = this.c.m();
        if (strM == null) {
            strM = "";
        }
        final Flow flowC = this.b.c(bookingId, strM);
        return new Flow<MetroTicketAppModel>() { // from class: app.chalo.metro.repository.MetroRepositoryImpl$getMetroTicketAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.metro.repository.MetroRepositoryImpl$getMetroTicketAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5460a;

                /* JADX INFO: renamed from: app.chalo.metro.repository.MetroRepositoryImpl$getMetroTicketAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.metro.repository.MetroRepositoryImpl$getMetroTicketAsFlow$$inlined$map$1$2", f = "MetroRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f5460a = flowCollector;
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
                        MetroTicketEntity metroTicketEntity = (MetroTicketEntity) obj;
                        MetroTicketAppModel metroTicketAppModelA = metroTicketEntity != null ? MetroTicketEntityKt.a(metroTicketEntity) : null;
                        anonymousClass1.label = 1;
                        if (this.f5460a.emit(metroTicketAppModelA, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowC.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.metro.repository.MetroRepository
    public final Object e(MetroTicketAppModel metroTicketAppModel, Continuation continuation) {
        Object objF = this.b.f(MetroTicketAppModelKt.b(metroTicketAppModel), continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.metro.repository.MetroRepository
    public final Object f(final UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        MetroRepositoryImpl$getAllMetroTicketsAsFlow$1 metroRepositoryImpl$getAllMetroTicketsAsFlow$1;
        String lowerCase;
        if (continuationImpl instanceof MetroRepositoryImpl$getAllMetroTicketsAsFlow$1) {
            metroRepositoryImpl$getAllMetroTicketsAsFlow$1 = (MetroRepositoryImpl$getAllMetroTicketsAsFlow$1) continuationImpl;
            int i = metroRepositoryImpl$getAllMetroTicketsAsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroRepositoryImpl$getAllMetroTicketsAsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                metroRepositoryImpl$getAllMetroTicketsAsFlow$1 = new MetroRepositoryImpl$getAllMetroTicketsAsFlow$1(this, continuationImpl);
            }
        } else {
            metroRepositoryImpl$getAllMetroTicketsAsFlow$1 = new MetroRepositoryImpl$getAllMetroTicketsAsFlow$1(this, continuationImpl);
        }
        Object objC = metroRepositoryImpl$getAllMetroTicketsAsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroRepositoryImpl$getAllMetroTicketsAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            metroRepositoryImpl$getAllMetroTicketsAsFlow$1.L$0 = userBookingsStatusType;
            metroRepositoryImpl$getAllMetroTicketsAsFlow$1.label = 1;
            objC = this.e.c(metroRepositoryImpl$getAllMetroTicketsAsFlow$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userBookingsStatusType = (UserBookingsStatusType) metroRepositoryImpl$getAllMetroTicketsAsFlow$1.L$0;
            ResultKt.b(objC);
        }
        final long jLongValue = ((Number) objC).longValue();
        String strB = CityProviderKt.b(this.d);
        if (strB != null) {
            lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = "";
        }
        String strM = this.c.m();
        final MetroRepositoryImpl$getAllMetroTicketsAsFlow$$inlined$mapFlowWithMappedListItems$1 metroRepositoryImpl$getAllMetroTicketsAsFlow$$inlined$mapFlowWithMappedListItems$1 = new MetroRepositoryImpl$getAllMetroTicketsAsFlow$$inlined$mapFlowWithMappedListItems$1(this.b.d(lowerCase, strM != null ? strM : ""));
        return new Flow<List<? extends MetroTicketAppModel>>() { // from class: app.chalo.metro.repository.MetroRepositoryImpl$getAllMetroTicketsAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.metro.repository.MetroRepositoryImpl$getAllMetroTicketsAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5456a;
                public final /* synthetic */ UserBookingsStatusType b;
                public final /* synthetic */ long c;

                /* JADX INFO: renamed from: app.chalo.metro.repository.MetroRepositoryImpl$getAllMetroTicketsAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.metro.repository.MetroRepositoryImpl$getAllMetroTicketsAsFlow$$inlined$map$1$2", f = "MetroRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, UserBookingsStatusType userBookingsStatusType, long j) {
                    this.f5456a = flowCollector;
                    this.b = userBookingsStatusType;
                    this.c = j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    ArrayList arrayList;
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
                        List list = (List) obj;
                        int i3 = MetroRepositoryImpl.WhenMappings.f5454a[this.b.ordinal()];
                        if (i3 != 1) {
                            long j = this.c;
                            if (i3 == 2) {
                                arrayList = new ArrayList();
                                for (T t : list) {
                                    if (((MetroTicketAppModel) t).h(j)) {
                                        arrayList.add(t);
                                    }
                                }
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                arrayList = new ArrayList();
                                for (T t2 : list) {
                                    if (!((MetroTicketAppModel) t2).h(j)) {
                                        arrayList.add(t2);
                                    }
                                }
                            }
                            list = arrayList;
                        }
                        anonymousClass1.label = 1;
                        if (this.f5456a.emit(list, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = metroRepositoryImpl$getAllMetroTicketsAsFlow$$inlined$mapFlowWithMappedListItems$1.collect(new AnonymousClass2(flowCollector, userBookingsStatusType, jLongValue), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.metro.repository.MetroRepository
    public final Object g(MetroTicketOrderRequestAppModel metroTicketOrderRequestAppModel, ContinuationImpl continuationImpl) {
        MetroRepositoryImpl$createMetroTicketOrder$1 metroRepositoryImpl$createMetroTicketOrder$1;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        if (continuationImpl instanceof MetroRepositoryImpl$createMetroTicketOrder$1) {
            metroRepositoryImpl$createMetroTicketOrder$1 = (MetroRepositoryImpl$createMetroTicketOrder$1) continuationImpl;
            int i = metroRepositoryImpl$createMetroTicketOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroRepositoryImpl$createMetroTicketOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                metroRepositoryImpl$createMetroTicketOrder$1 = new MetroRepositoryImpl$createMetroTicketOrder$1(this, continuationImpl);
            }
        } else {
            metroRepositoryImpl$createMetroTicketOrder$1 = new MetroRepositoryImpl$createMetroTicketOrder$1(this, continuationImpl);
        }
        Object objG = metroRepositoryImpl$createMetroTicketOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroRepositoryImpl$createMetroTicketOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            Intrinsics.i(metroTicketOrderRequestAppModel, "<this>");
            String mode = metroTicketOrderRequestAppModel.f5433a.getMode();
            String mode2 = ChaloTransitMode.METRO.getMode();
            String str = metroTicketOrderRequestAppModel.b;
            long j = metroTicketOrderRequestAppModel.c;
            MetroTicketTripDetails metroTicketTripDetails = metroTicketOrderRequestAppModel.e;
            TicketBookingTripDetailsApiModel ticketBookingTripDetailsApiModel = new TicketBookingTripDetailsApiModel((metroTicketTripDetails == null || (stopAppModel2 = metroTicketTripDetails.f5420a) == null) ? null : TicketBookingFareRequestApiModelKt.a(stopAppModel2), (metroTicketTripDetails == null || (stopAppModel = metroTicketTripDetails.b) == null) ? null : TicketBookingFareRequestApiModelKt.a(stopAppModel), metroTicketTripDetails != null ? metroTicketTripDetails.c : null);
            List<MetroTicketOrderFarePassengerDetail> list = metroTicketOrderRequestAppModel.d;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (MetroTicketOrderFarePassengerDetail metroTicketOrderFarePassengerDetail : list) {
                arrayList.add(new MetroTicketOrderRequestPassengerDetail(metroTicketOrderFarePassengerDetail.f5432a, metroTicketOrderFarePassengerDetail.b));
            }
            MetroTicketOrderRequestApiModel metroTicketOrderRequestApiModel = new MetroTicketOrderRequestApiModel(mode, mode2, str, j, ticketBookingTripDetailsApiModel, arrayList.isEmpty() ? null : arrayList, metroTicketOrderRequestAppModel.f);
            metroRepositoryImpl$createMetroTicketOrder$1.label = 1;
            objG = this.f5453a.g(metroTicketOrderRequestApiModel, metroRepositoryImpl$createMetroTicketOrder$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        return CreateOrderResponseApiModelKt.a((CreateOrderResponseApiModel) objG);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.metro.repository.MetroRepository
    public final Object h(TicketFinalFareRequestAppModel ticketFinalFareRequestAppModel, ContinuationImpl continuationImpl) throws MetroInvalidFareResponseDataException {
        MetroRepositoryImpl$getMetroFinalFare$1 metroRepositoryImpl$getMetroFinalFare$1;
        ArrayList arrayList;
        if (continuationImpl instanceof MetroRepositoryImpl$getMetroFinalFare$1) {
            metroRepositoryImpl$getMetroFinalFare$1 = (MetroRepositoryImpl$getMetroFinalFare$1) continuationImpl;
            int i = metroRepositoryImpl$getMetroFinalFare$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroRepositoryImpl$getMetroFinalFare$1.label = i - Integer.MIN_VALUE;
            } else {
                metroRepositoryImpl$getMetroFinalFare$1 = new MetroRepositoryImpl$getMetroFinalFare$1(this, continuationImpl);
            }
        } else {
            metroRepositoryImpl$getMetroFinalFare$1 = new MetroRepositoryImpl$getMetroFinalFare$1(this, continuationImpl);
        }
        Object objD = metroRepositoryImpl$getMetroFinalFare$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroRepositoryImpl$getMetroFinalFare$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            Intrinsics.i(ticketFinalFareRequestAppModel, "<this>");
            MetroTicketTripDetails metroTicketTripDetails = ticketFinalFareRequestAppModel.f;
            String mode = ticketFinalFareRequestAppModel.f5436a.getMode();
            String mode2 = ticketFinalFareRequestAppModel.b.getMode();
            String str = ticketFinalFareRequestAppModel.c;
            String str2 = ticketFinalFareRequestAppModel.d;
            List<PassengerDetailData> list = ticketFinalFareRequestAppModel.e;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
            for (PassengerDetailData passengerDetailData : list) {
                arrayList2.add(new MetroFarePassengerDetailApiModel(passengerDetailData.f3888a, passengerDetailData.b, passengerDetailData.c));
            }
            TicketFinalFareRequestApiModel ticketFinalFareRequestApiModel = new TicketFinalFareRequestApiModel(mode, mode2, str, str2, arrayList2, new TicketBookingTripDetailsApiModel(TicketBookingFareRequestApiModelKt.a(metroTicketTripDetails.f5420a), TicketBookingFareRequestApiModelKt.a(metroTicketTripDetails.b), metroTicketTripDetails.c));
            metroRepositoryImpl$getMetroFinalFare$1.label = 1;
            objD = this.f5453a.d(ticketFinalFareRequestApiModel, metroRepositoryImpl$getMetroFinalFare$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        MetroFinalFareResponseApiModel metroFinalFareResponseApiModel = (MetroFinalFareResponseApiModel) objD;
        List list2 = metroFinalFareResponseApiModel.f5406a;
        MetroFinalFareAppModel metroFinalFareAppModel = null;
        if (list2 != null) {
            List<FareBreakupApiModel> list3 = list2;
            arrayList = new ArrayList(CollectionsKt.v(list3, 10));
            for (FareBreakupApiModel fareBreakupApiModel : list3) {
                arrayList.add(new FareBreakupAppModel(fareBreakupApiModel.f3861a, FetchMobileTicketFareResponseApiModelKt.a(fareBreakupApiModel.b), fareBreakupApiModel.c));
            }
        } else {
            arrayList = null;
        }
        Integer num = metroFinalFareResponseApiModel.b;
        if (num != null) {
            int iIntValue = num.intValue();
            List list4 = metroFinalFareResponseApiModel.c;
            if (list4 == null) {
                list4 = EmptyList.f17557a;
            }
            metroFinalFareAppModel = new MetroFinalFareAppModel(arrayList, list4, iIntValue);
        }
        if (metroFinalFareAppModel != null) {
            return metroFinalFareAppModel;
        }
        throw new MetroInvalidFareResponseDataException("Invalid fare response data");
    }

    @Override // app.chalo.metro.repository.MetroRepository
    public final Object i(String str, String str2, String str3, Continuation continuation) {
        return this.f5453a.e(str, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.metro.repository.MetroRepository
    public final Serializable j(TicketBookingFareRequestAppModel ticketBookingFareRequestAppModel, ContinuationImpl continuationImpl) {
        MetroRepositoryImpl$getTicketBookingFareDetails$1 metroRepositoryImpl$getTicketBookingFareDetails$1;
        ChaloTicketBookingMode chaloTicketBookingMode;
        TicketBookingFareAppModel ticketBookingFareAppModel;
        if (continuationImpl instanceof MetroRepositoryImpl$getTicketBookingFareDetails$1) {
            metroRepositoryImpl$getTicketBookingFareDetails$1 = (MetroRepositoryImpl$getTicketBookingFareDetails$1) continuationImpl;
            int i = metroRepositoryImpl$getTicketBookingFareDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroRepositoryImpl$getTicketBookingFareDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                metroRepositoryImpl$getTicketBookingFareDetails$1 = new MetroRepositoryImpl$getTicketBookingFareDetails$1(this, continuationImpl);
            }
        } else {
            metroRepositoryImpl$getTicketBookingFareDetails$1 = new MetroRepositoryImpl$getTicketBookingFareDetails$1(this, continuationImpl);
        }
        Object objF = metroRepositoryImpl$getTicketBookingFareDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroRepositoryImpl$getTicketBookingFareDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            Intrinsics.i(ticketBookingFareRequestAppModel, "<this>");
            TicketBookingFareRequestApiModel ticketBookingFareRequestApiModel = new TicketBookingFareRequestApiModel(ticketBookingFareRequestAppModel.f8231a, ticketBookingFareRequestAppModel.b.getMode(), new TicketBookingTripDetailsApiModel(TicketBookingFareRequestApiModelKt.a(ticketBookingFareRequestAppModel.c), TicketBookingFareRequestApiModelKt.a(ticketBookingFareRequestAppModel.d), null), ticketBookingFareRequestAppModel.e);
            metroRepositoryImpl$getTicketBookingFareDetails$1.label = 1;
            objF = this.f5453a.f(ticketBookingFareRequestApiModel, metroRepositoryImpl$getTicketBookingFareDetails$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        ArrayList arrayList = new ArrayList();
        for (TicketBookingFareResponseApiModel ticketBookingFareResponseApiModel : (Iterable) objF) {
            Intrinsics.i(ticketBookingFareResponseApiModel, "<this>");
            ChaloTicketBookingMode.Companion companion = ChaloTicketBookingMode.INSTANCE;
            String str = ticketBookingFareResponseApiModel.f8183a;
            companion.getClass();
            ChaloTicketBookingMode[] chaloTicketBookingModeArrValues = ChaloTicketBookingMode.values();
            int length = chaloTicketBookingModeArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    chaloTicketBookingMode = null;
                    break;
                }
                chaloTicketBookingMode = chaloTicketBookingModeArrValues[i3];
                if (StringsKt.x(chaloTicketBookingMode.getMode(), str, true)) {
                    break;
                }
                i3++;
            }
            if (chaloTicketBookingMode == null) {
                chaloTicketBookingMode = ChaloTicketBookingMode.Unknown;
            }
            ChaloTicketBookingMode chaloTicketBookingMode2 = chaloTicketBookingMode != ChaloTicketBookingMode.Unknown ? chaloTicketBookingMode : null;
            if (chaloTicketBookingMode2 == null) {
                ticketBookingFareAppModel = null;
            } else {
                List list = ticketBookingFareResponseApiModel.b;
                List listE = list != null ? FetchMobileTicketFareResponseApiModelKt.e(list) : EmptyList.f17557a;
                Integer num = ticketBookingFareResponseApiModel.c;
                CurrencyRoundOffLogic currencyRoundOffLogicA = CurrencyRoundOffLogicKt.a(num != null ? num.intValue() : 0);
                Integer num2 = ticketBookingFareResponseApiModel.d;
                int iIntValue = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
                String str2 = ticketBookingFareResponseApiModel.e;
                ticketBookingFareAppModel = new TicketBookingFareAppModel(chaloTicketBookingMode2, Integer.valueOf(iIntValue), currencyRoundOffLogicA, listE, str2 != null ? StringsKt.R(str2, "\\n", IOUtils.LINE_SEPARATOR_UNIX) : null);
            }
            if (ticketBookingFareAppModel != null) {
                arrayList.add(ticketBookingFareAppModel);
            }
        }
        return arrayList;
    }

    @Override // app.chalo.metro.repository.MetroRepository
    public final Object k(ArrayList arrayList, Continuation continuation) {
        Object objG = this.b.g(arrayList, continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.metro.repository.MetroRepository
    public final Object l(String str, ContinuationImpl continuationImpl) {
        MetroRepositoryImpl$getMetroTicket$1 metroRepositoryImpl$getMetroTicket$1;
        if (continuationImpl instanceof MetroRepositoryImpl$getMetroTicket$1) {
            metroRepositoryImpl$getMetroTicket$1 = (MetroRepositoryImpl$getMetroTicket$1) continuationImpl;
            int i = metroRepositoryImpl$getMetroTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroRepositoryImpl$getMetroTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                metroRepositoryImpl$getMetroTicket$1 = new MetroRepositoryImpl$getMetroTicket$1(this, continuationImpl);
            }
        } else {
            metroRepositoryImpl$getMetroTicket$1 = new MetroRepositoryImpl$getMetroTicket$1(this, continuationImpl);
        }
        Object objB = metroRepositoryImpl$getMetroTicket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroRepositoryImpl$getMetroTicket$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            String strM = this.c.m();
            if (strM == null) {
                strM = "";
            }
            metroRepositoryImpl$getMetroTicket$1.label = 1;
            objB = this.b.b(str, strM, metroRepositoryImpl$getMetroTicket$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        MetroTicketEntity metroTicketEntity = (MetroTicketEntity) objB;
        if (metroTicketEntity != null) {
            return MetroTicketEntityKt.a(metroTicketEntity);
        }
        return null;
    }

    @Override // app.chalo.metro.repository.MetroRepository
    public final Object m(MetroTicketUpdateRequestAppModel metroTicketUpdateRequestAppModel, Continuation continuation) {
        return this.f5453a.c(new MetroTicketUpdateRequestApiModel(metroTicketUpdateRequestAppModel.f5435a, metroTicketUpdateRequestAppModel.b.name()), (ContinuationImpl) continuation);
    }
}
