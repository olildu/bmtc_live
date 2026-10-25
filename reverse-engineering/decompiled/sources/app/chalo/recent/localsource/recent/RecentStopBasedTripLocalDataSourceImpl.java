package app.chalo.recent.localsource.recent;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.dao.recent.RecentStopBasedTripCityItineraryDao;
import app.chalo.recent.database.entities.RecentStopBasedTripEntity;
import app.chalo.recent.model.ConvertToAppModelKt;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/localsource/recent/RecentStopBasedTripLocalDataSourceImpl;", "Lapp/chalo/recent/localsource/recent/RecentStopBasedTripLocalDataSource;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentStopBasedTripLocalDataSourceImpl implements RecentStopBasedTripLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentStopBasedTripCityItineraryDao f8977a;
    public final BasicInfoContract b;

    public RecentStopBasedTripLocalDataSourceImpl(RecentStopBasedTripCityItineraryDao recentStopBasedTripCityItineraryDao, BasicInfoContract basicInfoContract) {
        this.f8977a = recentStopBasedTripCityItineraryDao;
        this.b = basicInfoContract;
    }

    @Override // app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSource
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = this.f8977a.a(str, str2, j, continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSource
    public final Object b(String str, String str2, Continuation continuation) {
        Object objB = this.f8977a.b(str, str2, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSource
    public final Object c(RecentStopBasedTripAppModel recentStopBasedTripAppModel, boolean z, ContinuationImpl continuationImpl) {
        RecentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1 recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1;
        boolean z2;
        long jLongValue;
        int i;
        RecentStopBasedTripAppModel recentStopBasedTripAppModel2;
        int i2;
        RecentStopBasedTripEntity recentStopBasedTripEntityB;
        RecentStopBasedTripAppModel recentStopBasedTripAppModel3 = recentStopBasedTripAppModel;
        if (continuationImpl instanceof RecentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1) {
            recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1 = (RecentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1) continuationImpl;
            int i3 = recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.label = i3 - Integer.MIN_VALUE;
            } else {
                recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1 = new RecentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1(this, continuationImpl);
            }
        } else {
            recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1 = new RecentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1(this, continuationImpl);
        }
        Object objG = recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.label;
        Unit unit = Unit.f17538a;
        RecentStopBasedTripCityItineraryDao recentStopBasedTripCityItineraryDao = this.f8977a;
        if (i4 == 0) {
            ResultKt.b(objG);
            String str = recentStopBasedTripAppModel3.e;
            String str2 = recentStopBasedTripAppModel3.f;
            recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.L$0 = recentStopBasedTripAppModel3;
            z2 = z;
            recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.Z$0 = z2;
            recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.label = 1;
            objG = recentStopBasedTripCityItineraryDao.g(str, str2, recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1);
            if (objG != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            boolean z3 = recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.Z$0;
            RecentStopBasedTripAppModel recentStopBasedTripAppModel4 = (RecentStopBasedTripAppModel) recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.L$0;
            ResultKt.b(objG);
            z2 = z3;
            recentStopBasedTripAppModel3 = recentStopBasedTripAppModel4;
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    ResultKt.b(objG);
                    return unit;
                }
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objG);
                return unit;
            }
            i2 = recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.I$0;
            recentStopBasedTripAppModel2 = (RecentStopBasedTripAppModel) recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.L$0;
            ResultKt.b(objG);
        }
        jLongValue = ((Number) objG).longValue();
        i = i2;
        recentStopBasedTripAppModel3 = recentStopBasedTripAppModel2;
        long j = jLongValue;
        String stopBasedTripId = recentStopBasedTripAppModel3.e;
        String cityId = recentStopBasedTripAppModel3.f;
        StopAppModel originStop = recentStopBasedTripAppModel3.g;
        StopAppModel destinationStop = recentStopBasedTripAppModel3.h;
        ChaloTransitMode transitMode = recentStopBasedTripAppModel3.i;
        int i5 = RecentStopBasedTripAppModel.l;
        Intrinsics.i(stopBasedTripId, "stopBasedTripId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(originStop, "originStop");
        Intrinsics.i(destinationStop, "destinationStop");
        Intrinsics.i(transitMode, "transitMode");
        recentStopBasedTripEntityB = new RecentStopBasedTripAppModel(stopBasedTripId, cityId, originStop, destinationStop, transitMode, j, i).b();
        recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.L$0 = null;
        recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.label = 3;
        if (recentStopBasedTripCityItineraryDao.d(recentStopBasedTripEntityB, recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
        RecentStopBasedTripEntity recentStopBasedTripEntity = (RecentStopBasedTripEntity) objG;
        if (recentStopBasedTripEntity != null) {
            int i6 = recentStopBasedTripEntity.g;
            if (z2) {
                i6++;
            }
            if (z2) {
                recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.L$0 = recentStopBasedTripAppModel3;
                recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.I$0 = i6;
                recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.label = 2;
                objG = this.b.c(recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1);
                if (objG != coroutineSingletons) {
                    int i7 = i6;
                    recentStopBasedTripAppModel2 = recentStopBasedTripAppModel3;
                    i2 = i7;
                    jLongValue = ((Number) objG).longValue();
                    i = i2;
                    recentStopBasedTripAppModel3 = recentStopBasedTripAppModel2;
                    long j2 = jLongValue;
                    String stopBasedTripId2 = recentStopBasedTripAppModel3.e;
                    String cityId2 = recentStopBasedTripAppModel3.f;
                    StopAppModel originStop2 = recentStopBasedTripAppModel3.g;
                    StopAppModel destinationStop2 = recentStopBasedTripAppModel3.h;
                    ChaloTransitMode transitMode2 = recentStopBasedTripAppModel3.i;
                    int i8 = RecentStopBasedTripAppModel.l;
                    Intrinsics.i(stopBasedTripId2, "stopBasedTripId");
                    Intrinsics.i(cityId2, "cityId");
                    Intrinsics.i(originStop2, "originStop");
                    Intrinsics.i(destinationStop2, "destinationStop");
                    Intrinsics.i(transitMode2, "transitMode");
                    recentStopBasedTripEntityB = new RecentStopBasedTripAppModel(stopBasedTripId2, cityId2, originStop2, destinationStop2, transitMode2, j2, i).b();
                    recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.L$0 = null;
                    recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.label = 3;
                    if (recentStopBasedTripCityItineraryDao.d(recentStopBasedTripEntityB, recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1) == coroutineSingletons) {
                        return unit;
                    }
                }
            } else {
                jLongValue = recentStopBasedTripEntity.f;
                i = i6;
                long j3 = jLongValue;
                String stopBasedTripId3 = recentStopBasedTripAppModel3.e;
                String cityId3 = recentStopBasedTripAppModel3.f;
                StopAppModel originStop3 = recentStopBasedTripAppModel3.g;
                StopAppModel destinationStop3 = recentStopBasedTripAppModel3.h;
                ChaloTransitMode transitMode3 = recentStopBasedTripAppModel3.i;
                int i9 = RecentStopBasedTripAppModel.l;
                Intrinsics.i(stopBasedTripId3, "stopBasedTripId");
                Intrinsics.i(cityId3, "cityId");
                Intrinsics.i(originStop3, "originStop");
                Intrinsics.i(destinationStop3, "destinationStop");
                Intrinsics.i(transitMode3, "transitMode");
                recentStopBasedTripEntityB = new RecentStopBasedTripAppModel(stopBasedTripId3, cityId3, originStop3, destinationStop3, transitMode3, j3, i).b();
                recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.L$0 = null;
                recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.label = 3;
                if (recentStopBasedTripCityItineraryDao.d(recentStopBasedTripEntityB, recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1) == coroutineSingletons) {
                    return unit;
                }
            }
        } else {
            RecentStopBasedTripEntity recentStopBasedTripEntityB2 = recentStopBasedTripAppModel3.b();
            recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.L$0 = null;
            recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1.label = 4;
            if (recentStopBasedTripCityItineraryDao.d(recentStopBasedTripEntityB2, recentStopBasedTripLocalDataSourceImpl$insertOrUpdateStopBasedTripRecent$1) != coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSource
    public final Flow d(String str, Set set) {
        if (set.isEmpty()) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
        }
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1E = this.f8977a.e(str, CollectionsKt.D0(set));
        return new Flow<List<? extends RecentStopBasedTripAppModel>>() { // from class: app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSourceImpl$getLimitedStopBasedTripRecentForCityAndMode$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSourceImpl$getLimitedStopBasedTripRecentForCityAndMode$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8981a;

                /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSourceImpl$getLimitedStopBasedTripRecentForCityAndMode$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSourceImpl$getLimitedStopBasedTripRecentForCityAndMode$$inlined$map$1$2", f = "RecentStopBasedTripLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f8981a = flowCollector;
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
                                arrayList.add(ConvertToAppModelKt.g((RecentStopBasedTripEntity) it.next()));
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f8981a.emit(arrayList, anonymousClass1) == obj3) {
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
                Object objCollect = flowQuery$mapToList$$inlined$map$1E.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSource
    public final Serializable e(String str, ContinuationImpl continuationImpl) {
        RecentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1 recentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1;
        if (continuationImpl instanceof RecentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1) {
            recentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1 = (RecentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1) continuationImpl;
            int i = recentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1.label = i - Integer.MIN_VALUE;
            } else {
                recentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1 = new RecentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1(this, continuationImpl);
            }
        } else {
            recentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1 = new RecentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1(this, continuationImpl);
        }
        Object objH = recentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            recentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1.label = 1;
            objH = this.f8977a.h(str, recentStopBasedTripLocalDataSourceImpl$getAllStopBasedTripRecentForCity$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        List list = (List) objH;
        if (list == null) {
            return EmptyList.f17557a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ConvertToAppModelKt.g((RecentStopBasedTripEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSourceImpl$getLimitedStopBasedTripRecentForCity$$inlined$map$1] */
    @Override // app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSource
    public final RecentStopBasedTripLocalDataSourceImpl$getLimitedStopBasedTripRecentForCity$$inlined$map$1 f(int i, String str, boolean z) {
        RecentStopBasedTripCityItineraryDao recentStopBasedTripCityItineraryDao = this.f8977a;
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1F = z ? recentStopBasedTripCityItineraryDao.f(i, str) : recentStopBasedTripCityItineraryDao.c(i, str);
        return new Flow<List<? extends RecentStopBasedTripAppModel>>() { // from class: app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSourceImpl$getLimitedStopBasedTripRecentForCity$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSourceImpl$getLimitedStopBasedTripRecentForCity$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8979a;

                /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSourceImpl$getLimitedStopBasedTripRecentForCity$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSourceImpl$getLimitedStopBasedTripRecentForCity$$inlined$map$1$2", f = "RecentStopBasedTripLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f8979a = flowCollector;
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
                                arrayList.add(ConvertToAppModelKt.g((RecentStopBasedTripEntity) it.next()));
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f8979a.emit(arrayList, anonymousClass1) == obj3) {
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
                Object objCollect = flowQuery$mapToList$$inlined$map$1F.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }
}
