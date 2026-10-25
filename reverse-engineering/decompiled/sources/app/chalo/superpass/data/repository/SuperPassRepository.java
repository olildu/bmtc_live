package app.chalo.superpass.data.repository;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.contract.BasicInfoContract;
import app.chalo.datastore.LocalDataStore;
import app.chalo.domain.GetCityIdsInClusterProductHistoryUseCase;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.models.products.SuperPassRideBookingAppModel;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.superpass.data.dao.SuperPassBookingsDao;
import app.chalo.superpass.data.dao.SuperPassDao;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.superpass.data.models.entities.SuperPassProofProperties;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPass;
import app.chalo.superpass.data.parser.SuperPassJsonParser;
import app.chalo.utils.CollectionUtilsKt;
import app.chalo.utils.SystemHelper;
import defpackage.g61;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/superpass/data/repository/SuperPassRepository;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f9594a;
    public final SuperPassDao b;
    public final SuperPassBookingsDao c;
    public final CityProvider d;
    public final SystemHelper e;
    public final CoroutineContextProvider f;
    public final BasicInfoContract g;
    public final GetCityIdsInClusterProductHistoryUseCase h;
    public final Lazy i = LazyKt.b(new g61(this, 23));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/repository/SuperPassRepository$Companion;", "", "", "PASS_STATUS_DATA_STORE", "Ljava/lang/String;", "LEGACY_PREFS_PASS_STATUS_STORE", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9595a;

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
            f9595a = iArr;
        }
    }

    public SuperPassRepository(LocalDataStore localDataStore, SuperPassDao superPassDao, SuperPassBookingsDao superPassBookingsDao, CityProvider cityProvider, SystemHelper systemHelper, CoroutineContextProvider coroutineContextProvider, BasicInfoContract basicInfoContract, GetCityIdsInClusterProductHistoryUseCase getCityIdsInClusterProductHistoryUseCase) {
        this.f9594a = localDataStore;
        this.b = superPassDao;
        this.c = superPassBookingsDao;
        this.d = cityProvider;
        this.e = systemHelper;
        this.f = coroutineContextProvider;
        this.g = basicInfoContract;
        this.h = getCityIdsInClusterProductHistoryUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r5.b.H(r2, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof app.chalo.superpass.data.repository.SuperPassRepository$createFreshEntryInRideBasedSuperPassRideDetailsRoomPostPurchase$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.superpass.data.repository.SuperPassRepository$createFreshEntryInRideBasedSuperPassRideDetailsRoomPostPurchase$1 r0 = (app.chalo.superpass.data.repository.SuperPassRepository$createFreshEntryInRideBasedSuperPassRideDetailsRoomPostPurchase$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.superpass.data.repository.SuperPassRepository$createFreshEntryInRideBasedSuperPassRideDetailsRoomPostPurchase$1 r0 = new app.chalo.superpass.data.repository.SuperPassRepository$createFreshEntryInRideBasedSuperPassRideDetailsRoomPostPurchase$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.b(r7)
            goto L4c
        L3a:
            kotlin.ResultKt.b(r7)
            r0.L$0 = r6
            r0.label = r4
            app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetails$Companion r7 = app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetails.g
            app.chalo.contract.BasicInfoContract r2 = r5.g
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L4c
            goto L60
        L4c:
            app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetails r7 = (app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetails) r7
            app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetailsRoom r2 = new app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetailsRoom
            r2.<init>(r6, r7)
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            app.chalo.superpass.data.dao.SuperPassDao r6 = r5.b
            java.lang.Object r6 = r6.H(r2, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.data.repository.SuperPassRepository.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(Continuation continuation) throws Throwable {
        Object objG = BuildersKt.g((CoroutineContext) this.i.getValue(), new SuperPassRepository$deleteSuperPassProductData$2(this, null), continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        if (r14 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0120, code lost:
    
        if (r14 == r0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.models.BookableSuperPassConfiguration r12, app.chalo.superpass.data.models.entities.SuperPassUserDetails r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.data.repository.SuperPassRepository.c(app.chalo.models.BookableSuperPassConfiguration, app.chalo.superpass.data.models.entities.SuperPassUserDetails, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        SuperPassRepository$getAllRelevantMagicSuperPassesAsFlow$1 superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1;
        final UserBookingsStatusType userBookingsStatusType2;
        SuperPassDao superPassDao;
        if (continuationImpl instanceof SuperPassRepository$getAllRelevantMagicSuperPassesAsFlow$1) {
            superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1 = (SuperPassRepository$getAllRelevantMagicSuperPassesAsFlow$1) continuationImpl;
            int i = superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1 = new SuperPassRepository$getAllRelevantMagicSuperPassesAsFlow$1(this, continuationImpl);
            }
        } else {
            superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1 = new SuperPassRepository$getAllRelevantMagicSuperPassesAsFlow$1(this, continuationImpl);
        }
        Object obj = superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1.L$0 = userBookingsStatusType;
            SuperPassDao superPassDao2 = this.b;
            superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1.L$1 = superPassDao2;
            superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1.label = 1;
            Object objL = l(superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1);
            if (objL == obj2) {
                return obj2;
            }
            userBookingsStatusType2 = userBookingsStatusType;
            superPassDao = superPassDao2;
            obj = objL;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassDao = (SuperPassDao) superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1.L$1;
            userBookingsStatusType2 = (UserBookingsStatusType) superPassRepository$getAllRelevantMagicSuperPassesAsFlow$1.L$0;
            ResultKt.b(obj);
        }
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1U = superPassDao.u((List) obj);
        return new Flow<List<? extends MagicSuperPass>>() { // from class: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantMagicSuperPassesAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantMagicSuperPassesAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9597a;
                public final /* synthetic */ UserBookingsStatusType b;
                public final /* synthetic */ SuperPassRepository c;

                /* JADX INFO: renamed from: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantMagicSuperPassesAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantMagicSuperPassesAsFlow$$inlined$map$1$2", f = "SuperPassRepository.kt", l = {54, 54, EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION, EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION, 50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, UserBookingsStatusType userBookingsStatusType, SuperPassRepository superPassRepository) {
                    this.f9597a = flowCollector;
                    this.b = userBookingsStatusType;
                    this.c = superPassRepository;
                }

                /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
                /* JADX WARN: Code duplicated, block: B:32:0x00e8  */
                /* JADX WARN: Code duplicated, block: B:36:0x010a  */
                /* JADX WARN: Code duplicated, block: B:39:0x0117  */
                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x010a -> B:37:0x010f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0175 -> B:55:0x017a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object r18, kotlin.coroutines.Continuation r19) {
                    /*
                        Method dump skipped, instruction units count: 414
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantMagicSuperPassesAsFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowQuery$mapToList$$inlined$map$1U.collect(new AnonymousClass2(flowCollector, userBookingsStatusType2, this), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        SuperPassRepository$getAllRelevantPendingSuperPassesAsFlow$1 superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1;
        final UserBookingsStatusType userBookingsStatusType2;
        SuperPassDao superPassDao;
        if (continuationImpl instanceof SuperPassRepository$getAllRelevantPendingSuperPassesAsFlow$1) {
            superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1 = (SuperPassRepository$getAllRelevantPendingSuperPassesAsFlow$1) continuationImpl;
            int i = superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1 = new SuperPassRepository$getAllRelevantPendingSuperPassesAsFlow$1(this, continuationImpl);
            }
        } else {
            superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1 = new SuperPassRepository$getAllRelevantPendingSuperPassesAsFlow$1(this, continuationImpl);
        }
        Object obj = superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1.L$0 = userBookingsStatusType;
            SuperPassDao superPassDao2 = this.b;
            superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1.L$1 = superPassDao2;
            superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1.label = 1;
            Object objL = l(superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1);
            if (objL == obj2) {
                return obj2;
            }
            userBookingsStatusType2 = userBookingsStatusType;
            superPassDao = superPassDao2;
            obj = objL;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassDao = (SuperPassDao) superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1.L$1;
            userBookingsStatusType2 = (UserBookingsStatusType) superPassRepository$getAllRelevantPendingSuperPassesAsFlow$1.L$0;
            ResultKt.b(obj);
        }
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1G = superPassDao.G((List) obj);
        return new Flow<List<? extends PendingSuperPass>>() { // from class: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantPendingSuperPassesAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantPendingSuperPassesAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9599a;
                public final /* synthetic */ UserBookingsStatusType b;

                /* JADX INFO: renamed from: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantPendingSuperPassesAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantPendingSuperPassesAsFlow$$inlined$map$1$2", f = "SuperPassRepository.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, UserBookingsStatusType userBookingsStatusType) {
                    this.f9599a = flowCollector;
                    this.b = userBookingsStatusType;
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
                        int i3 = SuperPassRepository.WhenMappings.f9595a[this.b.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                arrayList = new ArrayList();
                                for (T t : list) {
                                    if (((PendingSuperPass) t).f9583a.f == SuperPassStatus.PAYMENT_PROCESSING) {
                                        arrayList.add(t);
                                    }
                                }
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                arrayList = new ArrayList();
                                for (T t2 : list) {
                                    if (((PendingSuperPass) t2).f9583a.f == SuperPassStatus.PAYMENT_FAILED) {
                                        arrayList.add(t2);
                                    }
                                }
                            }
                            list = arrayList;
                        }
                        anonymousClass1.label = 1;
                        if (this.f9599a.emit(list, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowQuery$mapToList$$inlined$map$1G.collect(new AnonymousClass2(flowCollector, userBookingsStatusType2), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        SuperPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1 superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1;
        final UserBookingsStatusType userBookingsStatusType2;
        SuperPassDao superPassDao;
        if (continuationImpl instanceof SuperPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1) {
            superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1 = (SuperPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1) continuationImpl;
            int i = superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1 = new SuperPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1(this, continuationImpl);
            }
        } else {
            superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1 = new SuperPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1(this, continuationImpl);
        }
        Object obj = superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1.L$0 = userBookingsStatusType;
            SuperPassDao superPassDao2 = this.b;
            superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1.L$1 = superPassDao2;
            superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1.label = 1;
            Object objL = l(superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1);
            if (objL == obj2) {
                return obj2;
            }
            userBookingsStatusType2 = userBookingsStatusType;
            superPassDao = superPassDao2;
            obj = objL;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassDao = (SuperPassDao) superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1.L$1;
            userBookingsStatusType2 = (UserBookingsStatusType) superPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$1.L$0;
            ResultKt.b(obj);
        }
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1E = superPassDao.e((List) obj);
        return new Flow<List<? extends RideBasedSuperPass>>() { // from class: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9601a;
                public final /* synthetic */ UserBookingsStatusType b;
                public final /* synthetic */ SuperPassRepository c;

                /* JADX INFO: renamed from: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$$inlined$map$1$2", f = "SuperPassRepository.kt", l = {54, 54, EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION, EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION, 50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, UserBookingsStatusType userBookingsStatusType, SuperPassRepository superPassRepository) {
                    this.f9601a = flowCollector;
                    this.b = userBookingsStatusType;
                    this.c = superPassRepository;
                }

                /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
                /* JADX WARN: Code duplicated, block: B:32:0x00e8  */
                /* JADX WARN: Code duplicated, block: B:36:0x010a  */
                /* JADX WARN: Code duplicated, block: B:39:0x0117  */
                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x010a -> B:37:0x010f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0175 -> B:55:0x017a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object r18, kotlin.coroutines.Continuation r19) {
                    /*
                        Method dump skipped, instruction units count: 414
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantRideBasedSuperPassesAsFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowQuery$mapToList$$inlined$map$1E.collect(new AnonymousClass2(flowCollector, userBookingsStatusType2, this), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        SuperPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1 superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1;
        final UserBookingsStatusType userBookingsStatusType2;
        SuperPassDao superPassDao;
        if (continuationImpl instanceof SuperPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1) {
            superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1 = (SuperPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1) continuationImpl;
            int i = superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1 = new SuperPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1(this, continuationImpl);
            }
        } else {
            superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1 = new SuperPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1(this, continuationImpl);
        }
        Object obj = superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1.L$0 = userBookingsStatusType;
            SuperPassDao superPassDao2 = this.b;
            superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1.L$1 = superPassDao2;
            superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1.label = 1;
            Object objL = l(superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1);
            if (objL == obj2) {
                return obj2;
            }
            userBookingsStatusType2 = userBookingsStatusType;
            superPassDao = superPassDao2;
            obj = objL;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassDao = (SuperPassDao) superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1.L$1;
            userBookingsStatusType2 = (UserBookingsStatusType) superPassRepository$getAllRelevantSuperPassApplicationsAsFlow$1.L$0;
            ResultKt.b(obj);
        }
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1T = superPassDao.t((List) obj);
        return new Flow<List<? extends SuperPassApplication>>() { // from class: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantSuperPassApplicationsAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantSuperPassApplicationsAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9603a;
                public final /* synthetic */ UserBookingsStatusType b;

                /* JADX INFO: renamed from: app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantSuperPassApplicationsAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.superpass.data.repository.SuperPassRepository$getAllRelevantSuperPassApplicationsAsFlow$$inlined$map$1$2", f = "SuperPassRepository.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, UserBookingsStatusType userBookingsStatusType) {
                    this.f9603a = flowCollector;
                    this.b = userBookingsStatusType;
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
                        Object obj3 = (List) obj;
                        int i3 = SuperPassRepository.WhenMappings.f9595a[this.b.ordinal()];
                        if (i3 != 1 && i3 != 2) {
                            if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            obj3 = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f9603a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowQuery$mapToList$$inlined$map$1T.collect(new AnonymousClass2(flowCollector, userBookingsStatusType2), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ContinuationImpl continuationImpl) {
        SuperPassRepository$getAllRideBasedSuperPasses$1 superPassRepository$getAllRideBasedSuperPasses$1;
        SuperPassDao superPassDao;
        if (continuationImpl instanceof SuperPassRepository$getAllRideBasedSuperPasses$1) {
            superPassRepository$getAllRideBasedSuperPasses$1 = (SuperPassRepository$getAllRideBasedSuperPasses$1) continuationImpl;
            int i = superPassRepository$getAllRideBasedSuperPasses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$getAllRideBasedSuperPasses$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$getAllRideBasedSuperPasses$1 = new SuperPassRepository$getAllRideBasedSuperPasses$1(this, continuationImpl);
            }
        } else {
            superPassRepository$getAllRideBasedSuperPasses$1 = new SuperPassRepository$getAllRideBasedSuperPasses$1(this, continuationImpl);
        }
        Object obj = superPassRepository$getAllRideBasedSuperPasses$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$getAllRideBasedSuperPasses$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            SuperPassDao superPassDao2 = this.b;
            superPassRepository$getAllRideBasedSuperPasses$1.L$0 = superPassDao2;
            superPassRepository$getAllRideBasedSuperPasses$1.label = 1;
            Object objL = l(superPassRepository$getAllRideBasedSuperPasses$1);
            if (objL == obj2) {
                return obj2;
            }
            superPassDao = superPassDao2;
            obj = objL;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassDao = (SuperPassDao) superPassRepository$getAllRideBasedSuperPasses$1.L$0;
            ResultKt.b(obj);
        }
        return superPassDao.e((List) obj);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132 A[LOOP:1: B:60:0x012c->B:62:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable i(ContinuationImpl continuationImpl) {
        SuperPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1 superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1;
        SuperPassDao superPassDao;
        List list;
        Object objL;
        List list2;
        List<SuperPass> listV0;
        List list3;
        HashSet hashSet;
        ArrayList arrayList;
        boolean zIsEmpty;
        List listSubList;
        ArrayList arrayList2;
        Iterator it;
        String lowerCase;
        List list4;
        if (continuationImpl instanceof SuperPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1) {
            superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1 = (SuperPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1) continuationImpl;
            int i = superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1 = new SuperPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1(this, continuationImpl);
            }
        } else {
            superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1 = new SuperPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1(this, continuationImpl);
        }
        Object objL2 = superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.label;
        SuperPassDao superPassDao2 = this.b;
        if (i2 == 0) {
            ResultKt.b(objL2);
            superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$0 = superPassDao2;
            superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.label = 1;
            objL2 = l(superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1);
            if (objL2 != coroutineSingletons) {
                superPassDao = superPassDao2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            superPassDao = (SuperPassDao) superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$0;
            ResultKt.b(objL2);
        } else {
            if (i2 == 2) {
                ResultKt.b(objL2);
                list = (List) objL2;
                superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$0 = list;
                superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$1 = superPassDao2;
                superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.label = 3;
                objL = l(superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1);
                if (objL != coroutineSingletons) {
                    list2 = list;
                    objL2 = objL;
                    superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$0 = list2;
                    superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$1 = null;
                    superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.label = 4;
                    objL2 = superPassDao2.r((List) objL2, superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1);
                    if (objL2 != coroutineSingletons) {
                        listV0 = list2;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                superPassDao2 = (SuperPassDao) superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$1;
                list2 = (List) superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$0;
                ResultKt.b(objL2);
                superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$0 = list2;
                superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$1 = null;
                superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.label = 4;
                objL2 = superPassDao2.r((List) objL2, superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1);
                if (objL2 != coroutineSingletons) {
                    listV0 = list2;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listV0 = (List) superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$0;
            ResultKt.b(objL2);
        }
        list3 = (List) objL2;
        if (listV0 == null) {
            list4 = list3 != null ? list3 : null;
            if (list4 == null) {
                listV0 = new ArrayList();
            } else {
                listV0 = list4;
            }
        } else if (list3 != null) {
            listV0 = CollectionsKt.v0(new SuperPassRepository$combineAndSortLists$$inlined$sortedByDescending$1(), CollectionsKt.c0(list3, listV0));
        }
        hashSet = new HashSet();
        arrayList = new ArrayList();
        for (SuperPass superPass : listV0) {
            lowerCase = StringsKt.u0(superPass.getC().c.c).toString().toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            if (hashSet.contains(lowerCase) && lowerCase.length() != 0) {
                hashSet.add(lowerCase);
                arrayList.add(superPass);
            }
        }
        zIsEmpty = arrayList.isEmpty();
        listSubList = arrayList;
        if (!zIsEmpty) {
            listSubList = arrayList.subList(0, Math.min(5, arrayList.size()));
        }
        List list5 = listSubList;
        arrayList2 = new ArrayList(CollectionsKt.v(list5, 10));
        it = list5.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SuperPass) it.next()).getC().c);
        }
        return arrayList2;
        superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$0 = null;
        superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.label = 2;
        objL2 = superPassDao.x((List) objL2, superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1);
        if (objL2 != coroutineSingletons) {
            list = (List) objL2;
            superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$0 = list;
            superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$1 = superPassDao2;
            superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.label = 3;
            objL = l(superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1);
            if (objL != coroutineSingletons) {
                list2 = list;
                objL2 = objL;
                superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$0 = list2;
                superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.L$1 = null;
                superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1.label = 4;
                objL2 = superPassDao2.r((List) objL2, superPassRepository$getAllUniquelyNamedSuperPassUserDetailsSortedByDateForCurrentCity$1);
                if (objL2 != coroutineSingletons) {
                    listV0 = list2;
                    list3 = (List) objL2;
                    if (listV0 == null) {
                        if (list3 != null) {
                        }
                        if (list4 == null) {
                            listV0 = new ArrayList();
                        } else {
                            listV0 = list4;
                        }
                    } else if (list3 != null) {
                        listV0 = CollectionsKt.v0(new SuperPassRepository$combineAndSortLists$$inlined$sortedByDescending$1(), CollectionsKt.c0(list3, listV0));
                    }
                    hashSet = new HashSet();
                    arrayList = new ArrayList();
                    while (r0.hasNext()) {
                        lowerCase = StringsKt.u0(superPass.getC().c.c).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.h(lowerCase, "toLowerCase(...)");
                        if (hashSet.contains(lowerCase)) {
                        }
                    }
                    zIsEmpty = arrayList.isEmpty();
                    listSubList = arrayList;
                    if (!zIsEmpty) {
                        listSubList = arrayList.subList(0, Math.min(5, arrayList.size()));
                    }
                    List list6 = listSubList;
                    arrayList2 = new ArrayList(CollectionsKt.v(list6, 10));
                    it = list6.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((SuperPass) it.next()).getC().c);
                    }
                    return arrayList2;
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b8 A[PHI: r2 r3 r11 r13 r14
      0x00b8: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v16 java.lang.Object) binds: [B:29:0x00b5, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r3v1 app.chalo.superpass.data.dao.SuperPassDao) = (r3v0 app.chalo.superpass.data.dao.SuperPassDao), (r3v8 app.chalo.superpass.data.dao.SuperPassDao) binds: [B:29:0x00b5, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r11v5 long) = (r11v4 long), (r11v10 long) binds: [B:29:0x00b5, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v13 java.lang.String) binds: [B:29:0x00b5, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r14v9 java.util.List) = (r14v8 java.util.List), (r14v20 java.util.List) binds: [B:29:0x00b5, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00df A[LOOP:0: B:36:0x00d9->B:38:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[LOOP:1: B:40:0x00fa->B:42:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0147  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable j(SuperPassUserDetails superPassUserDetails, long j, ContinuationImpl continuationImpl) {
        SuperPassRepository$getAllValidSubmittedProofsForUser$1 superPassRepository$getAllValidSubmittedProofsForUser$1;
        SuperPassUserDetails superPassUserDetails2;
        String str;
        SuperPassDao superPassDao;
        long j2;
        SuperPassUserDetails superPassUserDetails3;
        List list;
        String str2;
        Object objL;
        Object objS;
        List<MagicSuperPass> list2;
        HashMap map;
        HashMap map2;
        Iterator it;
        String str3;
        SuperPassProofProperties superPassProofProperties;
        long j3;
        if (continuationImpl instanceof SuperPassRepository$getAllValidSubmittedProofsForUser$1) {
            superPassRepository$getAllValidSubmittedProofsForUser$1 = (SuperPassRepository$getAllValidSubmittedProofsForUser$1) continuationImpl;
            int i = superPassRepository$getAllValidSubmittedProofsForUser$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$getAllValidSubmittedProofsForUser$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$getAllValidSubmittedProofsForUser$1 = new SuperPassRepository$getAllValidSubmittedProofsForUser$1(this, continuationImpl);
            }
        } else {
            superPassRepository$getAllValidSubmittedProofsForUser$1 = new SuperPassRepository$getAllValidSubmittedProofsForUser$1(this, continuationImpl);
        }
        Object objQ = superPassRepository$getAllValidSubmittedProofsForUser$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$getAllValidSubmittedProofsForUser$1.label;
        SuperPassDao superPassDao2 = this.b;
        if (i2 == 0) {
            ResultKt.b(objQ);
            String str4 = superPassUserDetails.c;
            superPassRepository$getAllValidSubmittedProofsForUser$1.L$0 = superPassUserDetails;
            superPassRepository$getAllValidSubmittedProofsForUser$1.L$1 = superPassDao2;
            superPassRepository$getAllValidSubmittedProofsForUser$1.L$2 = str4;
            superPassRepository$getAllValidSubmittedProofsForUser$1.J$0 = j;
            superPassRepository$getAllValidSubmittedProofsForUser$1.label = 1;
            Object objL2 = l(superPassRepository$getAllValidSubmittedProofsForUser$1);
            if (objL2 != coroutineSingletons) {
                superPassUserDetails2 = superPassUserDetails;
                str = str4;
                objQ = objL2;
                superPassDao = superPassDao2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            j = superPassRepository$getAllValidSubmittedProofsForUser$1.J$0;
            str = (String) superPassRepository$getAllValidSubmittedProofsForUser$1.L$2;
            superPassDao = (SuperPassDao) superPassRepository$getAllValidSubmittedProofsForUser$1.L$1;
            superPassUserDetails2 = (SuperPassUserDetails) superPassRepository$getAllValidSubmittedProofsForUser$1.L$0;
            ResultKt.b(objQ);
        } else {
            if (i2 == 2) {
                j2 = superPassRepository$getAllValidSubmittedProofsForUser$1.J$0;
                superPassUserDetails3 = (SuperPassUserDetails) superPassRepository$getAllValidSubmittedProofsForUser$1.L$0;
                ResultKt.b(objQ);
                list = (List) objQ;
                str2 = superPassUserDetails3.c;
                superPassRepository$getAllValidSubmittedProofsForUser$1.L$0 = list;
                superPassRepository$getAllValidSubmittedProofsForUser$1.L$1 = superPassDao2;
                superPassRepository$getAllValidSubmittedProofsForUser$1.L$2 = str2;
                superPassRepository$getAllValidSubmittedProofsForUser$1.J$0 = j2;
                superPassRepository$getAllValidSubmittedProofsForUser$1.label = 3;
                objL = l(superPassRepository$getAllValidSubmittedProofsForUser$1);
                if (objL != coroutineSingletons) {
                    superPassRepository$getAllValidSubmittedProofsForUser$1.L$0 = list;
                    superPassRepository$getAllValidSubmittedProofsForUser$1.L$1 = null;
                    superPassRepository$getAllValidSubmittedProofsForUser$1.L$2 = null;
                    superPassRepository$getAllValidSubmittedProofsForUser$1.J$0 = j2;
                    superPassRepository$getAllValidSubmittedProofsForUser$1.label = 4;
                    objS = superPassDao2.s(str2, (List) objL, superPassRepository$getAllValidSubmittedProofsForUser$1);
                    if (objS != coroutineSingletons) {
                        List list3 = list;
                        objQ = objS;
                        list2 = list3;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                j2 = superPassRepository$getAllValidSubmittedProofsForUser$1.J$0;
                str2 = (String) superPassRepository$getAllValidSubmittedProofsForUser$1.L$2;
                superPassDao2 = (SuperPassDao) superPassRepository$getAllValidSubmittedProofsForUser$1.L$1;
                List list4 = (List) superPassRepository$getAllValidSubmittedProofsForUser$1.L$0;
                ResultKt.b(objQ);
                objL = objQ;
                list = list4;
                superPassRepository$getAllValidSubmittedProofsForUser$1.L$0 = list;
                superPassRepository$getAllValidSubmittedProofsForUser$1.L$1 = null;
                superPassRepository$getAllValidSubmittedProofsForUser$1.L$2 = null;
                superPassRepository$getAllValidSubmittedProofsForUser$1.J$0 = j2;
                superPassRepository$getAllValidSubmittedProofsForUser$1.label = 4;
                objS = superPassDao2.s(str2, (List) objL, superPassRepository$getAllValidSubmittedProofsForUser$1);
                if (objS != coroutineSingletons) {
                    List list5 = list;
                    objQ = objS;
                    list2 = list5;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = superPassRepository$getAllValidSubmittedProofsForUser$1.J$0;
            list2 = (List) superPassRepository$getAllValidSubmittedProofsForUser$1.L$0;
            ResultKt.b(objQ);
        }
        List<RideBasedSuperPass> list6 = (List) objQ;
        map = new HashMap();
        for (MagicSuperPass magicSuperPass : list2) {
            map.put(new Long(magicSuperPass.b.b), magicSuperPass.c.d);
        }
        for (RideBasedSuperPass rideBasedSuperPass : list6) {
            map.put(new Long(rideBasedSuperPass.g.b), rideBasedSuperPass.h.d);
        }
        CollectionUtilsKt.c(map);
        map2 = new HashMap();
        it = map.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Map) ((Map.Entry) it.next()).getValue()).entrySet()) {
                str3 = (String) entry.getKey();
                superPassProofProperties = (SuperPassProofProperties) entry.getValue();
                if (superPassProofProperties.b.length() > 0) {
                    j3 = superPassProofProperties.c;
                    if (j3 != -1 || (j3 != 0 && j2 < j3)) {
                        map2.put(str3, superPassProofProperties);
                    }
                }
            }
        }
        return map2;
        superPassRepository$getAllValidSubmittedProofsForUser$1.L$0 = superPassUserDetails2;
        superPassRepository$getAllValidSubmittedProofsForUser$1.L$1 = null;
        superPassRepository$getAllValidSubmittedProofsForUser$1.L$2 = null;
        superPassRepository$getAllValidSubmittedProofsForUser$1.J$0 = j;
        superPassRepository$getAllValidSubmittedProofsForUser$1.label = 2;
        objQ = superPassDao.q(str, (List) objQ, superPassRepository$getAllValidSubmittedProofsForUser$1);
        if (objQ != coroutineSingletons) {
            j2 = j;
            superPassUserDetails3 = superPassUserDetails2;
            list = (List) objQ;
            str2 = superPassUserDetails3.c;
            superPassRepository$getAllValidSubmittedProofsForUser$1.L$0 = list;
            superPassRepository$getAllValidSubmittedProofsForUser$1.L$1 = superPassDao2;
            superPassRepository$getAllValidSubmittedProofsForUser$1.L$2 = str2;
            superPassRepository$getAllValidSubmittedProofsForUser$1.J$0 = j2;
            superPassRepository$getAllValidSubmittedProofsForUser$1.label = 3;
            objL = l(superPassRepository$getAllValidSubmittedProofsForUser$1);
            if (objL != coroutineSingletons) {
                superPassRepository$getAllValidSubmittedProofsForUser$1.L$0 = list;
                superPassRepository$getAllValidSubmittedProofsForUser$1.L$1 = null;
                superPassRepository$getAllValidSubmittedProofsForUser$1.L$2 = null;
                superPassRepository$getAllValidSubmittedProofsForUser$1.J$0 = j2;
                superPassRepository$getAllValidSubmittedProofsForUser$1.label = 4;
                objS = superPassDao2.s(str2, (List) objL, superPassRepository$getAllValidSubmittedProofsForUser$1);
                if (objS != coroutineSingletons) {
                    List list7 = list;
                    objQ = objS;
                    list2 = list7;
                    List<RideBasedSuperPass> list8 = (List) objQ;
                    map = new HashMap();
                    while (r13.hasNext()) {
                        map.put(new Long(magicSuperPass.b.b), magicSuperPass.c.d);
                    }
                    while (r13.hasNext()) {
                        map.put(new Long(rideBasedSuperPass.g.b), rideBasedSuperPass.h.d);
                    }
                    CollectionUtilsKt.c(map);
                    map2 = new HashMap();
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        while (r0.hasNext()) {
                            str3 = (String) entry.getKey();
                            superPassProofProperties = (SuperPassProofProperties) entry.getValue();
                            if (superPassProofProperties.b.length() > 0) {
                                j3 = superPassProofProperties.c;
                                if (j3 != -1) {
                                }
                                map2.put(str3, superPassProofProperties);
                            }
                        }
                    }
                    return map2;
                }
            }
        }
        return coroutineSingletons;
    }

    public final String k() {
        String lowerCase;
        String strB = CityProviderKt.b(this.d);
        if (strB != null) {
            lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        Intrinsics.f(lowerCase);
        return lowerCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(ContinuationImpl continuationImpl) {
        SuperPassRepository$getCityCluster$1 superPassRepository$getCityCluster$1;
        if (continuationImpl instanceof SuperPassRepository$getCityCluster$1) {
            superPassRepository$getCityCluster$1 = (SuperPassRepository$getCityCluster$1) continuationImpl;
            int i = superPassRepository$getCityCluster$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$getCityCluster$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$getCityCluster$1 = new SuperPassRepository$getCityCluster$1(this, continuationImpl);
            }
        } else {
            superPassRepository$getCityCluster$1 = new SuperPassRepository$getCityCluster$1(this, continuationImpl);
        }
        Object objA = superPassRepository$getCityCluster$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$getCityCluster$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            String strK = k();
            superPassRepository$getCityCluster$1.label = 1;
            objA = this.h.a(strK, superPassRepository$getCityCluster$1);
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
        return list.isEmpty() ? CollectionsKt.R(k()) : list;
    }

    public final Object m(String str, ContinuationImpl continuationImpl) {
        return FlowKt.v(this.b.D(str), continuationImpl);
    }

    public final Object n(String str, ContinuationImpl continuationImpl) {
        return FlowKt.v(this.b.I(str), continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(UserBookingsStatusType userBookingsStatusType, ContinuationImpl continuationImpl) {
        SuperPassRepository$getSuperPassBookedRides$2 superPassRepository$getSuperPassBookedRides$2;
        final UserBookingsStatusType userBookingsStatusType2;
        SuperPassRepository superPassRepository;
        if (continuationImpl instanceof SuperPassRepository$getSuperPassBookedRides$2) {
            superPassRepository$getSuperPassBookedRides$2 = (SuperPassRepository$getSuperPassBookedRides$2) continuationImpl;
            int i = superPassRepository$getSuperPassBookedRides$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$getSuperPassBookedRides$2.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$getSuperPassBookedRides$2 = new SuperPassRepository$getSuperPassBookedRides$2(this, continuationImpl);
            }
        } else {
            superPassRepository$getSuperPassBookedRides$2 = new SuperPassRepository$getSuperPassBookedRides$2(this, continuationImpl);
        }
        Object objL = superPassRepository$getSuperPassBookedRides$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$getSuperPassBookedRides$2.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            superPassRepository$getSuperPassBookedRides$2.L$0 = userBookingsStatusType;
            superPassRepository$getSuperPassBookedRides$2.L$1 = this;
            superPassRepository$getSuperPassBookedRides$2.label = 1;
            objL = l(superPassRepository$getSuperPassBookedRides$2);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
            userBookingsStatusType2 = userBookingsStatusType;
            superPassRepository = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassRepository = (SuperPassRepository) superPassRepository$getSuperPassBookedRides$2.L$1;
            userBookingsStatusType2 = (UserBookingsStatusType) superPassRepository$getSuperPassBookedRides$2.L$0;
            ResultKt.b(objL);
        }
        final SuperPassRepository$getSuperPassBookedRides$$inlined$mapFlowWithMappedListItems$1 superPassRepository$getSuperPassBookedRides$$inlined$mapFlowWithMappedListItems$1 = new SuperPassRepository$getSuperPassBookedRides$$inlined$mapFlowWithMappedListItems$1(superPassRepository.c.d());
        return FlowKt.z(new Flow<List<? extends SuperPassRideBookingAppModel>>() { // from class: app.chalo.superpass.data.repository.SuperPassRepository$getSuperPassBookedRides$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: app.chalo.superpass.data.repository.SuperPassRepository$getSuperPassBookedRides$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9607a;
                public final /* synthetic */ UserBookingsStatusType b;

                /* JADX INFO: renamed from: app.chalo.superpass.data.repository.SuperPassRepository$getSuperPassBookedRides$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.superpass.data.repository.SuperPassRepository$getSuperPassBookedRides$$inlined$mapNotNull$1$2", f = "SuperPassRepository.kt", l = {71}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, UserBookingsStatusType userBookingsStatusType) {
                    this.f9607a = flowCollector;
                    this.b = userBookingsStatusType;
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
                        for (SuperPassRideBookingAppModel superPassRideBookingAppModel : (List) obj) {
                            int i3 = SuperPassRepository.WhenMappings.f9595a[this.b.ordinal()];
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    superPassRideBookingAppModel = null;
                                } else if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            if (superPassRideBookingAppModel != null) {
                                arrayList.add(superPassRideBookingAppModel);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (this.f9607a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = superPassRepository$getSuperPassBookedRides$$inlined$mapFlowWithMappedListItems$1.collect(new AnonymousClass2(flowCollector, userBookingsStatusType2), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, this.f.getDefault());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(ContinuationImpl continuationImpl) {
        SuperPassRepository$getSuperPassCount$1 superPassRepository$getSuperPassCount$1;
        int i;
        if (continuationImpl instanceof SuperPassRepository$getSuperPassCount$1) {
            superPassRepository$getSuperPassCount$1 = (SuperPassRepository$getSuperPassCount$1) continuationImpl;
            int i2 = superPassRepository$getSuperPassCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superPassRepository$getSuperPassCount$1.label = i2 - Integer.MIN_VALUE;
            } else {
                superPassRepository$getSuperPassCount$1 = new SuperPassRepository$getSuperPassCount$1(this, continuationImpl);
            }
        } else {
            superPassRepository$getSuperPassCount$1 = new SuperPassRepository$getSuperPassCount$1(this, continuationImpl);
        }
        Object objG = superPassRepository$getSuperPassCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = superPassRepository$getSuperPassCount$1.label;
        CoroutineContextProvider coroutineContextProvider = this.f;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.b(objG);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = superPassRepository$getSuperPassCount$1.I$0;
                ResultKt.b(objG);
            }
            return new Integer(((Number) objG).intValue() + i);
        }
        ResultKt.b(objG);
        DefaultIoScheduler defaultIoSchedulerB = coroutineContextProvider.b();
        SuperPassRepository$getSuperPassCount$lMagicSuperPassesCount$1 superPassRepository$getSuperPassCount$lMagicSuperPassesCount$1 = new SuperPassRepository$getSuperPassCount$lMagicSuperPassesCount$1(this, null);
        superPassRepository$getSuperPassCount$1.label = 1;
        objG = BuildersKt.g(defaultIoSchedulerB, superPassRepository$getSuperPassCount$lMagicSuperPassesCount$1, superPassRepository$getSuperPassCount$1);
        if (objG != coroutineSingletons) {
        }
        return coroutineSingletons;
        int iIntValue = ((Number) objG).intValue();
        DefaultIoScheduler defaultIoSchedulerB2 = coroutineContextProvider.b();
        SuperPassRepository$getSuperPassCount$lRideBasedSuperPassesCount$1 superPassRepository$getSuperPassCount$lRideBasedSuperPassesCount$1 = new SuperPassRepository$getSuperPassCount$lRideBasedSuperPassesCount$1(this, null);
        superPassRepository$getSuperPassCount$1.I$0 = iIntValue;
        superPassRepository$getSuperPassCount$1.label = 2;
        Object objG2 = BuildersKt.g(defaultIoSchedulerB2, superPassRepository$getSuperPassCount$lRideBasedSuperPassesCount$1, superPassRepository$getSuperPassCount$1);
        if (objG2 != coroutineSingletons) {
            i = iIntValue;
            objG = objG2;
            return new Integer(((Number) objG).intValue() + i);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(JsonObject jsonObject, ContinuationImpl continuationImpl) throws Throwable {
        SuperPassRepository$insertOrUpdatePassInPassTable$1 superPassRepository$insertOrUpdatePassInPassTable$1;
        Object obj;
        if (continuationImpl instanceof SuperPassRepository$insertOrUpdatePassInPassTable$1) {
            superPassRepository$insertOrUpdatePassInPassTable$1 = (SuperPassRepository$insertOrUpdatePassInPassTable$1) continuationImpl;
            int i = superPassRepository$insertOrUpdatePassInPassTable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$insertOrUpdatePassInPassTable$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$insertOrUpdatePassInPassTable$1 = new SuperPassRepository$insertOrUpdatePassInPassTable$1(this, continuationImpl);
            }
        } else {
            superPassRepository$insertOrUpdatePassInPassTable$1 = new SuperPassRepository$insertOrUpdatePassInPassTable$1(this, continuationImpl);
        }
        Object objG = superPassRepository$insertOrUpdatePassInPassTable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$insertOrUpdatePassInPassTable$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            if (jsonObject != null) {
                CoroutineContext coroutineContext = (CoroutineContext) this.i.getValue();
                SuperPassRepository$insertOrUpdatePassInPassTable$2 superPassRepository$insertOrUpdatePassInPassTable$2 = new SuperPassRepository$insertOrUpdatePassInPassTable$2(jsonObject, null);
                superPassRepository$insertOrUpdatePassInPassTable$1.label = 1;
                objG = BuildersKt.g(coroutineContext, superPassRepository$insertOrUpdatePassInPassTable$2, superPassRepository$insertOrUpdatePassInPassTable$1);
                if (objG != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                obj = (MagicSuperPass) superPassRepository$insertOrUpdatePassInPassTable$1.L$0;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = (RideBasedSuperPass) superPassRepository$insertOrUpdatePassInPassTable$1.L$0;
            }
            ResultKt.b(objG);
            return obj;
        }
        ResultKt.b(objG);
        Pair pair = (Pair) objG;
        MagicSuperPass magicSuperPass = (MagicSuperPass) pair.getFirst();
        RideBasedSuperPass rideBasedSuperPass = (RideBasedSuperPass) pair.getSecond();
        Object obj2 = Unit.f17538a;
        SuperPassDao superPassDao = this.b;
        if (magicSuperPass == null) {
            if (rideBasedSuperPass != null) {
                superPassRepository$insertOrUpdatePassInPassTable$1.L$0 = rideBasedSuperPass;
                superPassRepository$insertOrUpdatePassInPassTable$1.label = 3;
                Object objH = superPassDao.h(rideBasedSuperPass, superPassRepository$insertOrUpdatePassInPassTable$1);
                if (objH == coroutineSingletons) {
                    obj2 = objH;
                }
                if (obj2 != coroutineSingletons) {
                    return rideBasedSuperPass;
                }
            }
            return null;
        }
        superPassRepository$insertOrUpdatePassInPassTable$1.L$0 = magicSuperPass;
        superPassRepository$insertOrUpdatePassInPassTable$1.label = 2;
        Object objV = superPassDao.v(magicSuperPass, superPassRepository$insertOrUpdatePassInPassTable$1);
        if (objV == coroutineSingletons) {
            obj2 = objV;
        }
        if (obj2 != coroutineSingletons) {
            return magicSuperPass;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(JsonArray jsonArray, ContinuationImpl continuationImpl) throws Throwable {
        SuperPassRepository$updatePendingSuperPassTableSynchronously$1 superPassRepository$updatePendingSuperPassTableSynchronously$1;
        List list;
        if (continuationImpl instanceof SuperPassRepository$updatePendingSuperPassTableSynchronously$1) {
            superPassRepository$updatePendingSuperPassTableSynchronously$1 = (SuperPassRepository$updatePendingSuperPassTableSynchronously$1) continuationImpl;
            int i = superPassRepository$updatePendingSuperPassTableSynchronously$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$updatePendingSuperPassTableSynchronously$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$updatePendingSuperPassTableSynchronously$1 = new SuperPassRepository$updatePendingSuperPassTableSynchronously$1(this, continuationImpl);
            }
        } else {
            superPassRepository$updatePendingSuperPassTableSynchronously$1 = new SuperPassRepository$updatePendingSuperPassTableSynchronously$1(this, continuationImpl);
        }
        Object objG = superPassRepository$updatePendingSuperPassTableSynchronously$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$updatePendingSuperPassTableSynchronously$1.label;
        Unit unit = Unit.f17538a;
        SuperPassDao superPassDao = this.b;
        if (i2 == 0) {
            ResultKt.b(objG);
            if (jsonArray == null || jsonArray.f18186a.size() == 0) {
                String strK = k();
                superPassRepository$updatePendingSuperPassTableSynchronously$1.label = 1;
                if (superPassDao.a(strK, superPassRepository$updatePendingSuperPassTableSynchronously$1) != coroutineSingletons) {
                    return unit;
                }
            } else {
                DefaultScheduler defaultScheduler = this.f.getDefault();
                SuperPassRepository$updatePendingSuperPassTableSynchronously$lPendingSuperPassList$1 superPassRepository$updatePendingSuperPassTableSynchronously$lPendingSuperPassList$1 = new SuperPassRepository$updatePendingSuperPassTableSynchronously$lPendingSuperPassList$1(jsonArray, null);
                superPassRepository$updatePendingSuperPassTableSynchronously$1.label = 2;
                objG = BuildersKt.g(defaultScheduler, superPassRepository$updatePendingSuperPassTableSynchronously$lPendingSuperPassList$1, superPassRepository$updatePendingSuperPassTableSynchronously$1);
                if (objG != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objG);
            return unit;
        }
        if (i2 == 2) {
            ResultKt.b(objG);
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objG);
                return unit;
            }
            list = (List) superPassRepository$updatePendingSuperPassTableSynchronously$1.L$0;
            ResultKt.b(objG);
        }
        superPassRepository$updatePendingSuperPassTableSynchronously$1.L$0 = null;
        superPassRepository$updatePendingSuperPassTableSynchronously$1.label = 4;
        if (superPassDao.n(list, superPassRepository$updatePendingSuperPassTableSynchronously$1) != coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
        list = (List) objG;
        String strK2 = k();
        superPassRepository$updatePendingSuperPassTableSynchronously$1.L$0 = list;
        superPassRepository$updatePendingSuperPassTableSynchronously$1.label = 3;
        if (superPassDao.a(strK2, superPassRepository$updatePendingSuperPassTableSynchronously$1) != coroutineSingletons) {
            superPassRepository$updatePendingSuperPassTableSynchronously$1.L$0 = null;
            superPassRepository$updatePendingSuperPassTableSynchronously$1.label = 4;
            if (superPassDao.n(list, superPassRepository$updatePendingSuperPassTableSynchronously$1) != coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(JsonArray jsonArray, ContinuationImpl continuationImpl) {
        SuperPassRepository$updateSuperPassApplicationTableSynchronously$1 superPassRepository$updateSuperPassApplicationTableSynchronously$1;
        List listE;
        if (continuationImpl instanceof SuperPassRepository$updateSuperPassApplicationTableSynchronously$1) {
            superPassRepository$updateSuperPassApplicationTableSynchronously$1 = (SuperPassRepository$updateSuperPassApplicationTableSynchronously$1) continuationImpl;
            int i = superPassRepository$updateSuperPassApplicationTableSynchronously$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$updateSuperPassApplicationTableSynchronously$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$updateSuperPassApplicationTableSynchronously$1 = new SuperPassRepository$updateSuperPassApplicationTableSynchronously$1(this, continuationImpl);
            }
        } else {
            superPassRepository$updateSuperPassApplicationTableSynchronously$1 = new SuperPassRepository$updateSuperPassApplicationTableSynchronously$1(this, continuationImpl);
        }
        Object obj = superPassRepository$updateSuperPassApplicationTableSynchronously$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$updateSuperPassApplicationTableSynchronously$1.label;
        Unit unit = Unit.f17538a;
        SuperPassDao superPassDao = this.b;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (jsonArray == null || jsonArray.f18186a.size() == 0) {
                String strK = k();
                superPassRepository$updateSuperPassApplicationTableSynchronously$1.label = 1;
                if (superPassDao.j(strK, superPassRepository$updateSuperPassApplicationTableSynchronously$1) != coroutineSingletons) {
                    return unit;
                }
            } else {
                SuperPassJsonParser superPassJsonParser = SuperPassJsonParser.f9587a;
                listE = SuperPassJsonParser.e(jsonArray);
                String strK2 = k();
                superPassRepository$updateSuperPassApplicationTableSynchronously$1.L$0 = listE;
                superPassRepository$updateSuperPassApplicationTableSynchronously$1.label = 2;
                if (superPassDao.j(strK2, superPassRepository$updateSuperPassApplicationTableSynchronously$1) != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(obj);
            return unit;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        listE = (List) superPassRepository$updateSuperPassApplicationTableSynchronously$1.L$0;
        ResultKt.b(obj);
        superPassRepository$updateSuperPassApplicationTableSynchronously$1.L$0 = null;
        superPassRepository$updateSuperPassApplicationTableSynchronously$1.label = 3;
        if (superPassDao.A(listE, superPassRepository$updateSuperPassApplicationTableSynchronously$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[PHI: r6
      0x0084: PHI (r6v7 kotlin.Pair) = (r6v6 kotlin.Pair), (r6v9 kotlin.Pair) binds: [B:30:0x0081, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0094 A[PHI: r6
      0x0094: PHI (r6v10 kotlin.Pair) = (r6v7 kotlin.Pair), (r6v12 kotlin.Pair) binds: [B:33:0x0091, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6 A[PHI: r6
      0x00a6: PHI (r6v13 kotlin.Pair) = (r6v10 kotlin.Pair), (r6v18 kotlin.Pair) binds: [B:36:0x00a3, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(JsonArray jsonArray, ContinuationImpl continuationImpl) {
        SuperPassRepository$updateSuperPassTableSynchronously$1 superPassRepository$updateSuperPassTableSynchronously$1;
        String strK;
        Pair pair;
        String strK2;
        String strK3;
        List list;
        List list2;
        if (continuationImpl instanceof SuperPassRepository$updateSuperPassTableSynchronously$1) {
            superPassRepository$updateSuperPassTableSynchronously$1 = (SuperPassRepository$updateSuperPassTableSynchronously$1) continuationImpl;
            int i = superPassRepository$updateSuperPassTableSynchronously$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassRepository$updateSuperPassTableSynchronously$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassRepository$updateSuperPassTableSynchronously$1 = new SuperPassRepository$updateSuperPassTableSynchronously$1(this, continuationImpl);
            }
        } else {
            superPassRepository$updateSuperPassTableSynchronously$1 = new SuperPassRepository$updateSuperPassTableSynchronously$1(this, continuationImpl);
        }
        Object objF = superPassRepository$updateSuperPassTableSynchronously$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepository$updateSuperPassTableSynchronously$1.label;
        Unit unit = Unit.f17538a;
        SuperPassDao superPassDao = this.b;
        switch (i2) {
            case 0:
                ResultKt.b(objF);
                if (jsonArray == null || jsonArray.f18186a.size() == 0) {
                    String strK4 = k();
                    superPassRepository$updateSuperPassTableSynchronously$1.label = 1;
                    if (superPassDao.c(strK4, superPassRepository$updateSuperPassTableSynchronously$1) != obj) {
                        strK = k();
                        superPassRepository$updateSuperPassTableSynchronously$1.label = 2;
                        if (superPassDao.f(strK, superPassRepository$updateSuperPassTableSynchronously$1) != obj) {
                            return unit;
                        }
                    }
                } else {
                    SuperPassJsonParser superPassJsonParser = SuperPassJsonParser.f9587a;
                    superPassRepository$updateSuperPassTableSynchronously$1.label = 3;
                    objF = superPassJsonParser.f(jsonArray, superPassRepository$updateSuperPassTableSynchronously$1);
                    if (objF != obj) {
                        pair = (Pair) objF;
                        strK2 = k();
                        superPassRepository$updateSuperPassTableSynchronously$1.L$0 = pair;
                        superPassRepository$updateSuperPassTableSynchronously$1.label = 4;
                        if (superPassDao.c(strK2, superPassRepository$updateSuperPassTableSynchronously$1) != obj) {
                            strK3 = k();
                            superPassRepository$updateSuperPassTableSynchronously$1.L$0 = pair;
                            superPassRepository$updateSuperPassTableSynchronously$1.label = 5;
                            if (superPassDao.f(strK3, superPassRepository$updateSuperPassTableSynchronously$1) != obj) {
                                list = (List) pair.d();
                                superPassRepository$updateSuperPassTableSynchronously$1.L$0 = pair;
                                superPassRepository$updateSuperPassTableSynchronously$1.label = 6;
                                if (superPassDao.m(list, superPassRepository$updateSuperPassTableSynchronously$1) != obj) {
                                    list2 = (List) pair.e();
                                    superPassRepository$updateSuperPassTableSynchronously$1.L$0 = null;
                                    superPassRepository$updateSuperPassTableSynchronously$1.label = 7;
                                    if (superPassDao.B(list2, superPassRepository$updateSuperPassTableSynchronously$1) == obj) {
                                        return unit;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                ResultKt.b(objF);
                strK = k();
                superPassRepository$updateSuperPassTableSynchronously$1.label = 2;
                if (superPassDao.f(strK, superPassRepository$updateSuperPassTableSynchronously$1) != obj) {
                    return obj;
                }
                return unit;
            case 2:
                ResultKt.b(objF);
                return unit;
            case 3:
                ResultKt.b(objF);
                pair = (Pair) objF;
                strK2 = k();
                superPassRepository$updateSuperPassTableSynchronously$1.L$0 = pair;
                superPassRepository$updateSuperPassTableSynchronously$1.label = 4;
                if (superPassDao.c(strK2, superPassRepository$updateSuperPassTableSynchronously$1) != obj) {
                    strK3 = k();
                    superPassRepository$updateSuperPassTableSynchronously$1.L$0 = pair;
                    superPassRepository$updateSuperPassTableSynchronously$1.label = 5;
                    if (superPassDao.f(strK3, superPassRepository$updateSuperPassTableSynchronously$1) != obj) {
                        list = (List) pair.d();
                        superPassRepository$updateSuperPassTableSynchronously$1.L$0 = pair;
                        superPassRepository$updateSuperPassTableSynchronously$1.label = 6;
                        if (superPassDao.m(list, superPassRepository$updateSuperPassTableSynchronously$1) != obj) {
                            list2 = (List) pair.e();
                            superPassRepository$updateSuperPassTableSynchronously$1.L$0 = null;
                            superPassRepository$updateSuperPassTableSynchronously$1.label = 7;
                            if (superPassDao.B(list2, superPassRepository$updateSuperPassTableSynchronously$1) == obj) {
                                return unit;
                            }
                        }
                    }
                }
                return obj;
            case 4:
                pair = (Pair) superPassRepository$updateSuperPassTableSynchronously$1.L$0;
                ResultKt.b(objF);
                strK3 = k();
                superPassRepository$updateSuperPassTableSynchronously$1.L$0 = pair;
                superPassRepository$updateSuperPassTableSynchronously$1.label = 5;
                if (superPassDao.f(strK3, superPassRepository$updateSuperPassTableSynchronously$1) != obj) {
                    list = (List) pair.d();
                    superPassRepository$updateSuperPassTableSynchronously$1.L$0 = pair;
                    superPassRepository$updateSuperPassTableSynchronously$1.label = 6;
                    if (superPassDao.m(list, superPassRepository$updateSuperPassTableSynchronously$1) != obj) {
                        list2 = (List) pair.e();
                        superPassRepository$updateSuperPassTableSynchronously$1.L$0 = null;
                        superPassRepository$updateSuperPassTableSynchronously$1.label = 7;
                        if (superPassDao.B(list2, superPassRepository$updateSuperPassTableSynchronously$1) == obj) {
                            return unit;
                        }
                    }
                }
                return obj;
            case 5:
                pair = (Pair) superPassRepository$updateSuperPassTableSynchronously$1.L$0;
                ResultKt.b(objF);
                list = (List) pair.d();
                superPassRepository$updateSuperPassTableSynchronously$1.L$0 = pair;
                superPassRepository$updateSuperPassTableSynchronously$1.label = 6;
                if (superPassDao.m(list, superPassRepository$updateSuperPassTableSynchronously$1) != obj) {
                    list2 = (List) pair.e();
                    superPassRepository$updateSuperPassTableSynchronously$1.L$0 = null;
                    superPassRepository$updateSuperPassTableSynchronously$1.label = 7;
                    if (superPassDao.B(list2, superPassRepository$updateSuperPassTableSynchronously$1) == obj) {
                        return unit;
                    }
                }
                return obj;
            case 6:
                pair = (Pair) superPassRepository$updateSuperPassTableSynchronously$1.L$0;
                ResultKt.b(objF);
                list2 = (List) pair.e();
                superPassRepository$updateSuperPassTableSynchronously$1.L$0 = null;
                superPassRepository$updateSuperPassTableSynchronously$1.label = 7;
                if (superPassDao.B(list2, superPassRepository$updateSuperPassTableSynchronously$1) == obj) {
                    return obj;
                }
                return unit;
            case 7:
                ResultKt.b(objF);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
