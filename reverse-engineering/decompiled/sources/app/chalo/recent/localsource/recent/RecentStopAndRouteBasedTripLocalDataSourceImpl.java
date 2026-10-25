package app.chalo.recent.localsource.recent;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.dao.recent.RecentStopAndRouteBasedTripDao;
import app.chalo.recent.database.entities.RecentStopAndRouteBasedTripEntity;
import app.chalo.recent.model.ConvertToAppModelKt;
import app.chalo.recent.model.app.RecentAdditionalRouteInfoModel;
import app.chalo.recent.model.app.RecentStopAndRouteBasedAppModel;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/localsource/recent/RecentStopAndRouteBasedTripLocalDataSourceImpl;", "Lapp/chalo/recent/localsource/recent/RecentStopAndRouteBasedLocalDataSource;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentStopAndRouteBasedTripLocalDataSourceImpl implements RecentStopAndRouteBasedLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentStopAndRouteBasedTripDao f8974a;
    public final BasicInfoContract b;

    public RecentStopAndRouteBasedTripLocalDataSourceImpl(RecentStopAndRouteBasedTripDao recentStopAndRouteBasedTripDao, BasicInfoContract basicInfoContract) {
        this.f8974a = recentStopAndRouteBasedTripDao;
        this.b = basicInfoContract;
    }

    @Override // app.chalo.recent.localsource.recent.RecentStopAndRouteBasedLocalDataSource
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = this.f8974a.a(str, str2, j, continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.localsource.recent.RecentStopAndRouteBasedLocalDataSource
    public final Object b(String str, Continuation continuation) {
        Object objB = this.f8974a.b(str, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.recent.localsource.recent.RecentStopAndRouteBasedLocalDataSource
    public final Flow c(String str, Set set) {
        if (set.isEmpty()) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
        }
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1C = this.f8974a.c(str, CollectionsKt.D0(set));
        return new Flow<List<? extends RecentStopAndRouteBasedAppModel>>() { // from class: app.chalo.recent.localsource.recent.RecentStopAndRouteBasedTripLocalDataSourceImpl$getLimitedStopAndRouteBasedTripRecentFilteredByTransitModesForCity$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentStopAndRouteBasedTripLocalDataSourceImpl$getLimitedStopAndRouteBasedTripRecentFilteredByTransitModesForCity$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8976a;

                /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentStopAndRouteBasedTripLocalDataSourceImpl$getLimitedStopAndRouteBasedTripRecentFilteredByTransitModesForCity$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentStopAndRouteBasedTripLocalDataSourceImpl$getLimitedStopAndRouteBasedTripRecentFilteredByTransitModesForCity$$inlined$map$1$2", f = "RecentStopAndRouteBasedTripLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f8976a = flowCollector;
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
                                arrayList.add(ConvertToAppModelKt.c((RecentStopAndRouteBasedTripEntity) it.next()));
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f8976a.emit(arrayList, anonymousClass1) == obj3) {
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
                Object objCollect = flowQuery$mapToList$$inlined$map$1C.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:44:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.recent.localsource.recent.RecentStopAndRouteBasedLocalDataSource
    public final Object d(RecentStopAndRouteBasedAppModel recentStopAndRouteBasedAppModel, boolean z, ContinuationImpl continuationImpl) {
        RecentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1 recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1;
        boolean z2;
        long jLongValue;
        int i;
        RecentStopAndRouteBasedAppModel recentStopAndRouteBasedAppModel2;
        int i2;
        RecentStopAndRouteBasedTripEntity recentStopAndRouteBasedTripEntityA;
        RecentStopAndRouteBasedAppModel recentStopAndRouteBasedAppModel3 = recentStopAndRouteBasedAppModel;
        if (continuationImpl instanceof RecentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1) {
            recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1 = (RecentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1) continuationImpl;
            int i3 = recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.label = i3 - Integer.MIN_VALUE;
            } else {
                recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1 = new RecentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1(this, continuationImpl);
            }
        } else {
            recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1 = new RecentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1(this, continuationImpl);
        }
        Object objE = recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.label;
        Unit unit = Unit.f17538a;
        RecentStopAndRouteBasedTripDao recentStopAndRouteBasedTripDao = this.f8974a;
        if (i4 == 0) {
            ResultKt.b(objE);
            String str = recentStopAndRouteBasedAppModel3.f9003a;
            String str2 = recentStopAndRouteBasedAppModel3.b;
            recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.L$0 = recentStopAndRouteBasedAppModel3;
            z2 = z;
            recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.Z$0 = z2;
            recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.label = 1;
            objE = recentStopAndRouteBasedTripDao.e(str, str2, recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1);
            if (objE != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            boolean z3 = recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.Z$0;
            RecentStopAndRouteBasedAppModel recentStopAndRouteBasedAppModel4 = (RecentStopAndRouteBasedAppModel) recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.L$0;
            ResultKt.b(objE);
            z2 = z3;
            recentStopAndRouteBasedAppModel3 = recentStopAndRouteBasedAppModel4;
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    ResultKt.b(objE);
                    return unit;
                }
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objE);
                return unit;
            }
            i2 = recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.I$0;
            recentStopAndRouteBasedAppModel2 = (RecentStopAndRouteBasedAppModel) recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.L$0;
            ResultKt.b(objE);
        }
        jLongValue = ((Number) objE).longValue();
        i = i2;
        recentStopAndRouteBasedAppModel3 = recentStopAndRouteBasedAppModel2;
        long j = jLongValue;
        String id = recentStopAndRouteBasedAppModel3.f9003a;
        String cityId = recentStopAndRouteBasedAppModel3.b;
        String routeId = recentStopAndRouteBasedAppModel3.c;
        String routeName = recentStopAndRouteBasedAppModel3.d;
        RecentAdditionalRouteInfoModel additionRouteInfo = recentStopAndRouteBasedAppModel3.e;
        StopAppModel originStop = recentStopAndRouteBasedAppModel3.f;
        StopAppModel destinationStop = recentStopAndRouteBasedAppModel3.g;
        ChaloTransitMode transitMode = recentStopAndRouteBasedAppModel3.h;
        Intrinsics.i(id, "id");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(additionRouteInfo, "additionRouteInfo");
        Intrinsics.i(originStop, "originStop");
        Intrinsics.i(destinationStop, "destinationStop");
        Intrinsics.i(transitMode, "transitMode");
        recentStopAndRouteBasedTripEntityA = new RecentStopAndRouteBasedAppModel(id, cityId, routeId, routeName, additionRouteInfo, originStop, destinationStop, transitMode, j, i).a();
        recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.L$0 = null;
        recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.label = 3;
        if (recentStopAndRouteBasedTripDao.f(recentStopAndRouteBasedTripEntityA, recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
        RecentStopAndRouteBasedTripEntity recentStopAndRouteBasedTripEntity = (RecentStopAndRouteBasedTripEntity) objE;
        if (recentStopAndRouteBasedTripEntity != null) {
            int i5 = recentStopAndRouteBasedTripEntity.j;
            if (z2) {
                i5++;
            }
            if (z2) {
                recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.L$0 = recentStopAndRouteBasedAppModel3;
                recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.I$0 = i5;
                recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.label = 2;
                objE = this.b.c(recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1);
                if (objE != coroutineSingletons) {
                    int i6 = i5;
                    recentStopAndRouteBasedAppModel2 = recentStopAndRouteBasedAppModel3;
                    i2 = i6;
                    jLongValue = ((Number) objE).longValue();
                    i = i2;
                    recentStopAndRouteBasedAppModel3 = recentStopAndRouteBasedAppModel2;
                    long j2 = jLongValue;
                    String id2 = recentStopAndRouteBasedAppModel3.f9003a;
                    String cityId2 = recentStopAndRouteBasedAppModel3.b;
                    String routeId2 = recentStopAndRouteBasedAppModel3.c;
                    String routeName2 = recentStopAndRouteBasedAppModel3.d;
                    RecentAdditionalRouteInfoModel additionRouteInfo2 = recentStopAndRouteBasedAppModel3.e;
                    StopAppModel originStop2 = recentStopAndRouteBasedAppModel3.f;
                    StopAppModel destinationStop2 = recentStopAndRouteBasedAppModel3.g;
                    ChaloTransitMode transitMode2 = recentStopAndRouteBasedAppModel3.h;
                    Intrinsics.i(id2, "id");
                    Intrinsics.i(cityId2, "cityId");
                    Intrinsics.i(routeId2, "routeId");
                    Intrinsics.i(routeName2, "routeName");
                    Intrinsics.i(additionRouteInfo2, "additionRouteInfo");
                    Intrinsics.i(originStop2, "originStop");
                    Intrinsics.i(destinationStop2, "destinationStop");
                    Intrinsics.i(transitMode2, "transitMode");
                    recentStopAndRouteBasedTripEntityA = new RecentStopAndRouteBasedAppModel(id2, cityId2, routeId2, routeName2, additionRouteInfo2, originStop2, destinationStop2, transitMode2, j2, i).a();
                    recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.L$0 = null;
                    recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.label = 3;
                    if (recentStopAndRouteBasedTripDao.f(recentStopAndRouteBasedTripEntityA, recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1) == coroutineSingletons) {
                        return unit;
                    }
                }
            } else {
                jLongValue = recentStopAndRouteBasedTripEntity.i;
                i = i5;
                long j3 = jLongValue;
                String id3 = recentStopAndRouteBasedAppModel3.f9003a;
                String cityId3 = recentStopAndRouteBasedAppModel3.b;
                String routeId3 = recentStopAndRouteBasedAppModel3.c;
                String routeName3 = recentStopAndRouteBasedAppModel3.d;
                RecentAdditionalRouteInfoModel additionRouteInfo3 = recentStopAndRouteBasedAppModel3.e;
                StopAppModel originStop3 = recentStopAndRouteBasedAppModel3.f;
                StopAppModel destinationStop3 = recentStopAndRouteBasedAppModel3.g;
                ChaloTransitMode transitMode3 = recentStopAndRouteBasedAppModel3.h;
                Intrinsics.i(id3, "id");
                Intrinsics.i(cityId3, "cityId");
                Intrinsics.i(routeId3, "routeId");
                Intrinsics.i(routeName3, "routeName");
                Intrinsics.i(additionRouteInfo3, "additionRouteInfo");
                Intrinsics.i(originStop3, "originStop");
                Intrinsics.i(destinationStop3, "destinationStop");
                Intrinsics.i(transitMode3, "transitMode");
                recentStopAndRouteBasedTripEntityA = new RecentStopAndRouteBasedAppModel(id3, cityId3, routeId3, routeName3, additionRouteInfo3, originStop3, destinationStop3, transitMode3, j3, i).a();
                recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.L$0 = null;
                recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.label = 3;
                if (recentStopAndRouteBasedTripDao.f(recentStopAndRouteBasedTripEntityA, recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1) == coroutineSingletons) {
                    return unit;
                }
            }
        } else {
            RecentStopAndRouteBasedTripEntity recentStopAndRouteBasedTripEntityA2 = recentStopAndRouteBasedAppModel3.a();
            recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.L$0 = null;
            recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1.label = 4;
            if (recentStopAndRouteBasedTripDao.f(recentStopAndRouteBasedTripEntityA2, recentStopAndRouteBasedTripLocalDataSourceImpl$insertOrUpdateStopAndRouteBasedTripRecent$1) != coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
