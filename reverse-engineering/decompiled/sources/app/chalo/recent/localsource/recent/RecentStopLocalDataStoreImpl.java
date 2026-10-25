package app.chalo.recent.localsource.recent;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.contract.BasicInfoContract;
import app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao;
import app.chalo.recent.database.entities.RecentCityItineraryEntitiesKt;
import app.chalo.recent.database.entities.RecentStopEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.recent.model.ConvertToAppModelKt;
import app.chalo.recent.model.app.RecentStopAppModel;
import app.chalo.recent.model.app.RecentsAppModelKt;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/localsource/recent/RecentStopLocalDataStoreImpl;", "Lapp/chalo/recent/localsource/recent/RecentStopLocalDataStore;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentStopLocalDataStoreImpl implements RecentStopLocalDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentStopCityItineraryEntityDao f8982a;
    public final BasicInfoContract b;

    public RecentStopLocalDataStoreImpl(RecentStopCityItineraryEntityDao recentStopCityItineraryEntityDao, BasicInfoContract basicInfoContract) {
        this.f8982a = recentStopCityItineraryEntityDao;
        this.b = basicInfoContract;
    }

    @Override // app.chalo.recent.localsource.recent.RecentStopLocalDataStore
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = this.f8982a.a(str, str2, j, continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.localsource.recent.RecentStopLocalDataStore
    public final Object b(String str, String str2, String str3, Continuation continuation) {
        Object objB = this.f8982a.b(str, str2, str3, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.localsource.recent.RecentStopLocalDataStore
    public final Object c(RecentsSpecialStatus recentsSpecialStatus, String str, String str2, ContinuationImpl continuationImpl) {
        RecentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1 recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1;
        if (continuationImpl instanceof RecentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1) {
            recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1 = (RecentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1) continuationImpl;
            int i = recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1 = new RecentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1(this, continuationImpl);
            }
        } else {
            recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1 = new RecentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1(this, continuationImpl);
        }
        Object objF = recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.label;
        Unit unit = Unit.f17538a;
        RecentStopCityItineraryEntityDao recentStopCityItineraryEntityDao = this.f8982a;
        if (i2 == 0) {
            ResultKt.b(objF);
            recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.L$0 = recentsSpecialStatus;
            recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.L$1 = str;
            recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.L$2 = str2;
            recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.label = 1;
            objF = recentStopCityItineraryEntityDao.f(str, str2, recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1);
            if (objF != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
            return unit;
        }
        str2 = (String) recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.L$2;
        str = (String) recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.L$1;
        recentsSpecialStatus = (RecentsSpecialStatus) recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.L$0;
        ResultKt.b(objF);
        RecentStopEntity recentStopEntity = (RecentStopEntity) objF;
        if (recentStopEntity != null) {
            RecentsAppModelKt.b(RecentCityItineraryEntitiesKt.a(recentStopEntity.d), recentsSpecialStatus);
            RecentsSpecialEntityStatus recentsSpecialEntityStatusD = RecentsAppModelKt.d(recentsSpecialStatus);
            recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.L$0 = null;
            recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.L$1 = null;
            recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.L$2 = null;
            recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1.label = 2;
            if (recentStopCityItineraryEntityDao.c(recentsSpecialEntityStatusD, str, str2, recentStopLocalDataStoreImpl$updateSpecialStatusIfRequired$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getRecentStopCityItineraryForCity$$inlined$map$1] */
    @Override // app.chalo.recent.localsource.recent.RecentStopLocalDataStore
    public final RecentStopLocalDataStoreImpl$getRecentStopCityItineraryForCity$$inlined$map$1 d(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str) {
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1D = this.f8982a.d(recentsSpecialEntityStatus, str);
        return new Flow<List<? extends RecentStopAppModel>>() { // from class: app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getRecentStopCityItineraryForCity$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getRecentStopCityItineraryForCity$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8984a;

                /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getRecentStopCityItineraryForCity$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getRecentStopCityItineraryForCity$$inlined$map$1$2", f = "RecentStopLocalDataStoreImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f8984a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.collections.EmptyList] */
                /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object arrayList;
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
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(ConvertToAppModelKt.h((RecentStopEntity) it.next()));
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f8984a.emit(arrayList, anonymousClass1) == obj3) {
                            return obj3;
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
                Object objCollect = flowQuery$mapToList$$inlined$map$1D.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.recent.localsource.recent.RecentStopLocalDataStore
    public final Object e(RecentStopAppModel recentStopAppModel, boolean z, ContinuationImpl continuationImpl) {
        RecentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1 recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1;
        boolean z2;
        RecentStopEntity recentStopEntity;
        long jLongValue;
        int i;
        RecentStopAppModel recentStopAppModel2;
        int i2;
        RecentStopEntity recentStopEntity2;
        RecentStopAppModel recentStopAppModel3 = recentStopAppModel;
        if (continuationImpl instanceof RecentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1) {
            recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1 = (RecentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1) continuationImpl;
            int i3 = recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.label = i3 - Integer.MIN_VALUE;
            } else {
                recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1 = new RecentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1(this, continuationImpl);
            }
        } else {
            recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1 = new RecentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1(this, continuationImpl);
        }
        Object objF = recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.label;
        Unit unit = Unit.f17538a;
        RecentStopCityItineraryEntityDao recentStopCityItineraryEntityDao = this.f8982a;
        if (i4 == 0) {
            ResultKt.b(objF);
            String str = recentStopAppModel3.e;
            String str2 = recentStopAppModel3.f;
            recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$0 = recentStopAppModel3;
            z2 = z;
            recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.Z$0 = z2;
            recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.label = 1;
            objF = recentStopCityItineraryEntityDao.f(str, str2, recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1);
            if (objF != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            boolean z3 = recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.Z$0;
            RecentStopAppModel recentStopAppModel4 = (RecentStopAppModel) recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$0;
            ResultKt.b(objF);
            z2 = z3;
            recentStopAppModel3 = recentStopAppModel4;
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    ResultKt.b(objF);
                    return unit;
                }
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objF);
                return unit;
            }
            i2 = recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.I$0;
            recentStopEntity = (RecentStopEntity) recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$1;
            recentStopAppModel2 = (RecentStopAppModel) recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$0;
            ResultKt.b(objF);
        }
        jLongValue = ((Number) objF).longValue();
        i = i2;
        recentStopAppModel3 = recentStopAppModel2;
        long j = jLongValue;
        RecentsSpecialStatus recentsSpecialStatusA = RecentCityItineraryEntitiesKt.a(recentStopEntity.d);
        RecentsSpecialStatus recentsSpecialStatus = recentStopAppModel3.h;
        RecentsAppModelKt.b(recentsSpecialStatusA, recentsSpecialStatus);
        String stopId = recentStopAppModel3.e;
        String cityId = recentStopAppModel3.f;
        StopAppModel stopAppModel = recentStopAppModel3.g;
        String str3 = recentStopAppModel3.k;
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(cityId, "cityId");
        new RecentStopAppModel(stopId, cityId, stopAppModel, recentsSpecialStatus, j, i, str3);
        recentStopEntity2 = new RecentStopEntity(stopId, cityId, RecentsAppModelKt.e(stopAppModel), RecentsAppModelKt.d(recentsSpecialStatus), j, i, str3);
        recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$0 = null;
        recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$1 = null;
        recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.label = 3;
        if (recentStopCityItineraryEntityDao.g(recentStopEntity2, recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
        recentStopEntity = (RecentStopEntity) objF;
        if (recentStopEntity != null) {
            int i5 = recentStopEntity.f;
            if (z2) {
                i5++;
            }
            if (z2) {
                recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$0 = recentStopAppModel3;
                recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$1 = recentStopEntity;
                recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.I$0 = i5;
                recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.label = 2;
                Object objC = this.b.c(recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1);
                if (objC != coroutineSingletons) {
                    recentStopAppModel2 = recentStopAppModel3;
                    i2 = i5;
                    objF = objC;
                    jLongValue = ((Number) objF).longValue();
                    i = i2;
                    recentStopAppModel3 = recentStopAppModel2;
                    long j2 = jLongValue;
                    RecentsSpecialStatus recentsSpecialStatusA2 = RecentCityItineraryEntitiesKt.a(recentStopEntity.d);
                    RecentsSpecialStatus recentsSpecialStatus2 = recentStopAppModel3.h;
                    RecentsAppModelKt.b(recentsSpecialStatusA2, recentsSpecialStatus2);
                    String stopId2 = recentStopAppModel3.e;
                    String cityId2 = recentStopAppModel3.f;
                    StopAppModel stopAppModel2 = recentStopAppModel3.g;
                    String str4 = recentStopAppModel3.k;
                    Intrinsics.i(stopId2, "stopId");
                    Intrinsics.i(cityId2, "cityId");
                    new RecentStopAppModel(stopId2, cityId2, stopAppModel2, recentsSpecialStatus2, j2, i, str4);
                    recentStopEntity2 = new RecentStopEntity(stopId2, cityId2, RecentsAppModelKt.e(stopAppModel2), RecentsAppModelKt.d(recentsSpecialStatus2), j2, i, str4);
                    recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$0 = null;
                    recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$1 = null;
                    recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.label = 3;
                    if (recentStopCityItineraryEntityDao.g(recentStopEntity2, recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1) == coroutineSingletons) {
                        return unit;
                    }
                }
            } else {
                jLongValue = recentStopEntity.e;
                i = i5;
                long j3 = jLongValue;
                RecentsSpecialStatus recentsSpecialStatusA3 = RecentCityItineraryEntitiesKt.a(recentStopEntity.d);
                RecentsSpecialStatus recentsSpecialStatus3 = recentStopAppModel3.h;
                RecentsAppModelKt.b(recentsSpecialStatusA3, recentsSpecialStatus3);
                String stopId3 = recentStopAppModel3.e;
                String cityId3 = recentStopAppModel3.f;
                StopAppModel stopAppModel3 = recentStopAppModel3.g;
                String str5 = recentStopAppModel3.k;
                Intrinsics.i(stopId3, "stopId");
                Intrinsics.i(cityId3, "cityId");
                new RecentStopAppModel(stopId3, cityId3, stopAppModel3, recentsSpecialStatus3, j3, i, str5);
                recentStopEntity2 = new RecentStopEntity(stopId3, cityId3, RecentsAppModelKt.e(stopAppModel3), RecentsAppModelKt.d(recentsSpecialStatus3), j3, i, str5);
                recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$0 = null;
                recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$1 = null;
                recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.label = 3;
                if (recentStopCityItineraryEntityDao.g(recentStopEntity2, recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1) == coroutineSingletons) {
                    return unit;
                }
            }
        } else {
            RecentStopEntity recentStopEntity3 = new RecentStopEntity(recentStopAppModel3.e, recentStopAppModel3.f, RecentsAppModelKt.e(recentStopAppModel3.g), RecentsAppModelKt.d(recentStopAppModel3.h), recentStopAppModel3.i, recentStopAppModel3.j, recentStopAppModel3.k);
            recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.L$0 = null;
            recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1.label = 4;
            if (recentStopCityItineraryEntityDao.g(recentStopEntity3, recentStopLocalDataStoreImpl$insertOrUpdateStopRecent$1) != coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.recent.localsource.recent.RecentStopLocalDataStore
    public final Flow f(String str, final Set set) {
        if (set.isEmpty()) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
        }
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1E = this.f8982a.e(str);
        return new Flow<List<? extends RecentStopAppModel>>() { // from class: app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getStopRecentsFilteredByTransitModesAndSortedByAccessTimeForCity$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getStopRecentsFilteredByTransitModesAndSortedByAccessTimeForCity$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8986a;
                public final /* synthetic */ Set b;

                /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getStopRecentsFilteredByTransitModesAndSortedByAccessTimeForCity$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getStopRecentsFilteredByTransitModesAndSortedByAccessTimeForCity$$inlined$map$1$2", f = "RecentStopLocalDataStoreImpl.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, Set set) {
                    this.f8986a = flowCollector;
                    this.b = set;
                }

                /* JADX WARN: Code duplicated, block: B:28:0x008a  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.collections.EmptyList] */
                /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object arrayList;
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
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (T t : list) {
                                if (this.b.contains(((RecentStopEntity) t).c.d)) {
                                    arrayList2.add(t);
                                }
                            }
                            List listX0 = CollectionsKt.x0(arrayList2, 3);
                            if (listX0 != null) {
                                List list2 = listX0;
                                arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                                Iterator<T> it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(ConvertToAppModelKt.h((RecentStopEntity) it.next()));
                                }
                            } else {
                                arrayList = EmptyList.f17557a;
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f8986a.emit(arrayList, anonymousClass1) == obj3) {
                            return obj3;
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
                Object objCollect = flowQuery$mapToList$$inlined$map$1E.collect(new AnonymousClass2(flowCollector, set), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.recent.localsource.recent.RecentStopLocalDataStore
    public final Object g(String str, Continuation continuation) {
        return this.f8982a.k(RecentsSpecialEntityStatus.NONE, str, continuation);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getStopRecentsForCity$$inlined$map$1] */
    @Override // app.chalo.recent.localsource.recent.RecentStopLocalDataStore
    public final RecentStopLocalDataStoreImpl$getStopRecentsForCity$$inlined$map$1 h(String str) {
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1H = this.f8982a.h(str);
        return new Flow<List<? extends RecentStopAppModel>>() { // from class: app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getStopRecentsForCity$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getStopRecentsForCity$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8988a;

                /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getStopRecentsForCity$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl$getStopRecentsForCity$$inlined$map$1$2", f = "RecentStopLocalDataStoreImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f8988a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.collections.EmptyList] */
                /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object arrayList;
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
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(ConvertToAppModelKt.h((RecentStopEntity) it.next()));
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f8988a.emit(arrayList, anonymousClass1) == obj3) {
                            return obj3;
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
                Object objCollect = flowQuery$mapToList$$inlined$map$1H.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.recent.localsource.recent.RecentStopLocalDataStore
    public final Object i(String str, String str2, ContinuationImpl continuationImpl) {
        Object objJ = this.f8982a.j(str, str2, continuationImpl);
        return objJ == CoroutineSingletons.COROUTINE_SUSPENDED ? objJ : Unit.f17538a;
    }

    @Override // app.chalo.recent.localsource.recent.RecentStopLocalDataStore
    public final Object j(String str, String str2, SuspendLambda suspendLambda) {
        Object objC = this.f8982a.c(RecentsSpecialEntityStatus.NONE, str, str2, suspendLambda);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.localsource.recent.RecentStopLocalDataStore
    public final Serializable k(int i, String str, ContinuationImpl continuationImpl) {
        RecentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1 recentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1;
        if (continuationImpl instanceof RecentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1) {
            recentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1 = (RecentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1) continuationImpl;
            int i2 = recentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1.label = i2 - Integer.MIN_VALUE;
            } else {
                recentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1 = new RecentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1(this, continuationImpl);
            }
        } else {
            recentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1 = new RecentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1(this, continuationImpl);
        }
        Object objI = recentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = recentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1.label;
        if (i3 == 0) {
            ResultKt.b(objI);
            RecentsSpecialEntityStatus recentsSpecialEntityStatus = RecentsSpecialEntityStatus.NONE;
            recentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1.label = 1;
            objI = this.f8982a.i(i, recentsSpecialEntityStatus, str, recentStopLocalDataStoreImpl$getOldestRecentStopsWithoutSpecialStatusForCity$1);
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objI);
        }
        List list = (List) objI;
        if (list == null) {
            return EmptyList.f17557a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ConvertToAppModelKt.h((RecentStopEntity) it.next()));
        }
        return arrayList;
    }
}
