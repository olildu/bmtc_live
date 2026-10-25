package app.chalo.home.domain;

import androidx.media3.common.C;
import app.chalo.contract.BasicInfoContract;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketEntityKt;
import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.models.products.SuperPassRideBookingAppModel;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPass;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.walletframework.quickpay.domain.GetAllQuickPaysUseCase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/GetAllRequestedBookedProductsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetAllRequestedBookedProductsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f2999a;
    public final GetAllQuickPaysUseCase b;
    public final InstantTicketRepository c;
    public final PremiumBusRepository d;
    public final OndcRepository e;
    public final MetroRepository f;
    public final CityProvider g;
    public final CheckIsUserLoggedInUseCase h;
    public final CoroutineContextProvider i;
    public final TicketRepository j;
    public final BasicInfoContract k;
    public final MTicketUtilsHelper l;
    public final GetWalletSetupConfigurationUseCase m;
    public final MultiModalGroupTicketRepository n;
    public final UserProfileDetailsProvider o;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3000a;

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
            f3000a = iArr;
        }
    }

    public GetAllRequestedBookedProductsUseCase(SuperPassRepository superPassRepository, GetAllQuickPaysUseCase getAllQuickPaysUseCase, InstantTicketRepository instantTicketRepository, PremiumBusRepository premiumBusRepository, OndcRepository ondcRepository, MetroRepository metroRepository, CityProvider cityProvider, CheckIsUserLoggedInUseCase checkIsUserLoggedInUseCase, CoroutineContextProvider coroutineContextProvider, TicketRepository ticketRepository, BasicInfoContract basicInfoContract, MTicketUtilsHelper mTicketUtilsHelper, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, MultiModalGroupTicketRepository multiModalGroupTicketRepository, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f2999a = superPassRepository;
        this.b = getAllQuickPaysUseCase;
        this.c = instantTicketRepository;
        this.d = premiumBusRepository;
        this.e = ondcRepository;
        this.f = metroRepository;
        this.g = cityProvider;
        this.h = checkIsUserLoggedInUseCase;
        this.i = coroutineContextProvider;
        this.j = ticketRepository;
        this.k = basicInfoContract;
        this.l = mTicketUtilsHelper;
        this.m = getWalletSetupConfigurationUseCase;
        this.n = multiModalGroupTicketRepository;
        this.o = userProfileDetailsProvider;
    }

    public static /* synthetic */ Object l(GetAllRequestedBookedProductsUseCase getAllRequestedBookedProductsUseCase, Set set, UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl, int i) {
        if ((i & 1) != 0) {
            set = UserBookingsRequestType.Companion.a();
        }
        Set set2 = set;
        if ((i & 2) != 0) {
            userBookingsStatusType = UserBookingsStatusType.ALL;
        }
        return getAllRequestedBookedProductsUseCase.k(set2, userBookingsStatusType, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        GetAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1 getAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1;
        if (continuationImpl instanceof GetAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1) {
            getAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1 = (GetAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1) continuationImpl;
            int i = getAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1 = new GetAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1(this, continuationImpl);
            }
        } else {
            getAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1 = new GetAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1(this, continuationImpl);
        }
        Object objE = getAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            getAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1.label = 1;
            objE = this.c.e(userBookingsStatusType, getAllRequestedBookedProductsUseCase$getInstantTicketsFlow$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        final Flow flow = (Flow) objE;
        return new Flow<List<? extends ChaloUserBookingType.TicketBooking.InstantTicketBooking>>() { // from class: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getInstantTicketsFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getInstantTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3006a;

                /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getInstantTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getInstantTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {50}, m = "emit", v = 1)
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
                    this.f3006a = flowCollector;
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
                            arrayList.add(new ChaloUserBookingType.TicketBooking.InstantTicketBooking(InstantTicketEntityKt.a((InstantTicketEntity) it.next()), null));
                        }
                        anonymousClass1.label = 1;
                        if (this.f3006a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        GetAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1 getAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1;
        if (continuationImpl instanceof GetAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1) {
            getAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1 = (GetAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1) continuationImpl;
            int i = getAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1 = new GetAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1(this, continuationImpl);
            }
        } else {
            getAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1 = new GetAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1(this, continuationImpl);
        }
        Object objD = getAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            getAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1.label = 1;
            objD = this.f2999a.d(userBookingsStatusType, getAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        final Flow flow = (Flow) objD;
        return new Flow<List<? extends ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking>>() { // from class: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3008a;

                /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMagicSuperPassFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {50}, m = "emit", v = 1)
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
                    this.f3008a = flowCollector;
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
                            arrayList.add(new ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking((MagicSuperPass) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f3008a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        GetAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1 getAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1;
        if (continuationImpl instanceof GetAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1) {
            getAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1 = (GetAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1) continuationImpl;
            int i = getAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1 = new GetAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1(this, continuationImpl);
            }
        } else {
            getAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1 = new GetAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1(this, continuationImpl);
        }
        Object objF = getAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            getAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1.label = 1;
            objF = this.f.f(userBookingsStatusType, getAllRequestedBookedProductsUseCase$getMetroTicketsFlow$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        final Flow flow = (Flow) objF;
        return new Flow<List<? extends ChaloUserBookingType.TicketBooking.MetroTicketBooking>>() { // from class: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMetroTicketsFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMetroTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3010a;

                /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMetroTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMetroTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {50}, m = "emit", v = 1)
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
                    this.f3010a = flowCollector;
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
                            arrayList.add(new ChaloUserBookingType.TicketBooking.MetroTicketBooking((MetroTicketAppModel) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f3010a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1 getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1;
        UserBookingsStatusType userBookingsStatusType2;
        if (continuationImpl instanceof GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1) {
            getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1 = (GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1) continuationImpl;
            int i = getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1 = new GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1(this, continuationImpl);
            }
        } else {
            getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1 = new GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1(this, continuationImpl);
        }
        Object objK = getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objK);
            getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.L$0 = str;
            getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.L$1 = userBookingsStatusType;
            getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.label = 1;
            objK = this.o.k(getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1);
            if (objK != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            userBookingsStatusType = (UserBookingsStatusType) getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.L$1;
            str = (String) getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.L$0;
            ResultKt.b(objK);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userBookingsStatusType2 = (UserBookingsStatusType) getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.L$0;
            ResultKt.b(objK);
        }
        final GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1 getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1 = new GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1(this, userBookingsStatusType2, (Flow) objK);
        return new Flow<List<? extends ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking>>() { // from class: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3016a;

                /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {50}, m = "emit", v = 1)
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
                    this.f3016a = flowCollector;
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
                            arrayList.add(new ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking((MultiModalGroupTicketAppModel) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f3016a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
        String str2 = (String) objK;
        if (str2 == null) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
        }
        getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.L$0 = userBookingsStatusType;
        getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.L$1 = null;
        getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1.label = 2;
        objK = this.n.f(str2, str, getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$1);
        if (objK != coroutineSingletons) {
            userBookingsStatusType2 = userBookingsStatusType;
            final GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1 getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$2 = new GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1(this, userBookingsStatusType2, (Flow) objK);
            return new Flow<List<? extends ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking>>() { // from class: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$mapFlowWithMappedListItems$1

                /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f3016a;

                    /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {50}, m = "emit", v = 1)
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
                        this.f3016a = flowCollector;
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
                                arrayList.add(new ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking((MultiModalGroupTicketAppModel) it.next()));
                            }
                            anonymousClass1.label = 1;
                            if (this.f3016a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                    Object objCollect = getAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$2.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        GetAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1 getAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1;
        if (continuationImpl instanceof GetAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1) {
            getAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1 = (GetAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1) continuationImpl;
            int i = getAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1 = new GetAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1(this, continuationImpl);
            }
        } else {
            getAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1 = new GetAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1(this, continuationImpl);
        }
        Object objJ = getAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            getAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1.label = 1;
            objJ = this.e.j(userBookingsStatusType, getAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        final Flow flow = (Flow) objJ;
        return new Flow<List<? extends ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking>>() { // from class: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3018a;

                /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getOndcMetroTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {50}, m = "emit", v = 1)
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
                    this.f3018a = flowCollector;
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
                            arrayList.add(new ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking((OndcMetroTicketAppModel) it.next(), null));
                        }
                        anonymousClass1.label = 1;
                        if (this.f3018a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        GetAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1 getAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1;
        if (continuationImpl instanceof GetAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1) {
            getAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1 = (GetAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1) continuationImpl;
            int i = getAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1 = new GetAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1(this, continuationImpl);
            }
        } else {
            getAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1 = new GetAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1(this, continuationImpl);
        }
        Object objP = getAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objP);
            getAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1.label = 1;
            objP = this.e.p(userBookingsStatusType, getAllRequestedBookedProductsUseCase$getOndcTicketsFlow$1);
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        final Flow flow = (Flow) objP;
        return new Flow<List<? extends ChaloUserBookingType.TicketBooking.OndcTicketBooking>>() { // from class: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getOndcTicketsFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getOndcTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3020a;

                /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getOndcTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getOndcTicketsFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {50}, m = "emit", v = 1)
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
                    this.f3020a = flowCollector;
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
                            arrayList.add(new ChaloUserBookingType.TicketBooking.OndcTicketBooking((OndcTicketAppModel) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f3020a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        GetAllRequestedBookedProductsUseCase$getPassRidesFlow$1 getAllRequestedBookedProductsUseCase$getPassRidesFlow$1;
        if (continuationImpl instanceof GetAllRequestedBookedProductsUseCase$getPassRidesFlow$1) {
            getAllRequestedBookedProductsUseCase$getPassRidesFlow$1 = (GetAllRequestedBookedProductsUseCase$getPassRidesFlow$1) continuationImpl;
            int i = getAllRequestedBookedProductsUseCase$getPassRidesFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllRequestedBookedProductsUseCase$getPassRidesFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllRequestedBookedProductsUseCase$getPassRidesFlow$1 = new GetAllRequestedBookedProductsUseCase$getPassRidesFlow$1(this, continuationImpl);
            }
        } else {
            getAllRequestedBookedProductsUseCase$getPassRidesFlow$1 = new GetAllRequestedBookedProductsUseCase$getPassRidesFlow$1(this, continuationImpl);
        }
        Object objO = getAllRequestedBookedProductsUseCase$getPassRidesFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAllRequestedBookedProductsUseCase$getPassRidesFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objO);
            getAllRequestedBookedProductsUseCase$getPassRidesFlow$1.label = 1;
            objO = this.f2999a.o(userBookingsStatusType, getAllRequestedBookedProductsUseCase$getPassRidesFlow$1);
            if (objO == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objO);
        }
        final Flow flow = (Flow) objO;
        return FlowKt.z(new Flow<List<? extends ChaloUserBookingType.TicketBooking.PassRideBooking>>() { // from class: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getPassRidesFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getPassRidesFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3022a;

                /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getPassRidesFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getPassRidesFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {50}, m = "emit", v = 1)
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
                    this.f3022a = flowCollector;
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
                            arrayList.add(new ChaloUserBookingType.TicketBooking.PassRideBooking((SuperPassRideBookingAppModel) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f3022a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, this.i.getDefault());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        GetAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1 getAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1;
        if (continuationImpl instanceof GetAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1) {
            getAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1 = (GetAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1) continuationImpl;
            int i = getAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1 = new GetAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1(this, continuationImpl);
            }
        } else {
            getAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1 = new GetAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1(this, continuationImpl);
        }
        Object objE = getAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            getAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1.label = 1;
            objE = this.f2999a.e(userBookingsStatusType, getAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        final Flow flow = (Flow) objE;
        return new Flow<List<? extends ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking>>() { // from class: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3024a;

                /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getPendingSuperPassFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {50}, m = "emit", v = 1)
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
                    this.f3024a = flowCollector;
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
                            arrayList.add(new ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking((PendingSuperPass) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f3024a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        GetAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1 getAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1;
        if (continuationImpl instanceof GetAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1) {
            getAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1 = (GetAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1) continuationImpl;
            int i = getAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1 = new GetAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1(this, continuationImpl);
            }
        } else {
            getAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1 = new GetAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1(this, continuationImpl);
        }
        Object objF = getAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            getAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1.label = 1;
            objF = this.f2999a.f(userBookingsStatusType, getAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        final Flow flow = (Flow) objF;
        return new Flow<List<? extends ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking>>() { // from class: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3032a;

                /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getRideBasedSuperPassFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {50}, m = "emit", v = 1)
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
                    this.f3032a = flowCollector;
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
                            arrayList.add(new ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking((RideBasedSuperPass) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f3032a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        GetAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1 getAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1;
        if (continuationImpl instanceof GetAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1) {
            getAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1 = (GetAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1) continuationImpl;
            int i = getAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1 = new GetAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1(this, continuationImpl);
            }
        } else {
            getAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1 = new GetAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1(this, continuationImpl);
        }
        Object objG = getAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            getAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1.label = 1;
            objG = this.f2999a.g(userBookingsStatusType, getAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        final Flow flow = (Flow) objG;
        return new Flow<List<? extends ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking>>() { // from class: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3034a;

                /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getSuperPassApplicationsFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {50}, m = "emit", v = 1)
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
                    this.f3034a = flowCollector;
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
                            arrayList.add(new ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking((SuperPassApplication) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f3034a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x0289  */
    /* JADX WARN: Code duplicated, block: B:103:0x028e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0296  */
    /* JADX WARN: Code duplicated, block: B:106:0x029b  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:120:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x0155  */
    /* JADX WARN: Code duplicated, block: B:59:0x0173  */
    /* JADX WARN: Code duplicated, block: B:62:0x0193  */
    /* JADX WARN: Code duplicated, block: B:64:0x0197  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01be  */
    /* JADX WARN: Code duplicated, block: B:72:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x022b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0234  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x023e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0242  */
    /* JADX WARN: Code duplicated, block: B:84:0x024a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0254  */
    /* JADX WARN: Code duplicated, block: B:88:0x0258  */
    /* JADX WARN: Code duplicated, block: B:90:0x0260  */
    /* JADX WARN: Code duplicated, block: B:93:0x026a  */
    /* JADX WARN: Code duplicated, block: B:94:0x026d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0275  */
    /* JADX WARN: Code duplicated, block: B:99:0x027e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x02d2 -> B:124:0x02d7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(java.util.Set r21, app.chalo.models.UserBookingsStatusType r22, long r23, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase.k(java.util.Set, app.chalo.models.UserBookingsStatusType, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x008d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a0 -> B:32:0x00a4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(java.util.Set r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase.m(java.util.Set, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
