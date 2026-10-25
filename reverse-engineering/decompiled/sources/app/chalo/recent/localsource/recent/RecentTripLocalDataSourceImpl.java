package app.chalo.recent.localsource.recent;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.dao.recent.RecentTripCityItineraryDao;
import app.chalo.recent.database.entities.RecentTripEntity;
import app.chalo.recent.model.ConvertToAppModelKt;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/localsource/recent/RecentTripLocalDataSourceImpl;", "Lapp/chalo/recent/localsource/recent/RecentTripLocalDataSource;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentTripLocalDataSourceImpl implements RecentTripLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentTripCityItineraryDao f8989a;
    public final BasicInfoContract b;

    public RecentTripLocalDataSourceImpl(RecentTripCityItineraryDao recentTripCityItineraryDao, BasicInfoContract basicInfoContract) {
        this.f8989a = recentTripCityItineraryDao;
        this.b = basicInfoContract;
    }

    @Override // app.chalo.recent.localsource.recent.RecentTripLocalDataSource
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = this.f8989a.a(str, str2, j, continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.recent.localsource.recent.RecentTripLocalDataSource
    public final Object b(RecentTripAppModel recentTripAppModel, boolean z, ContinuationImpl continuationImpl) {
        RecentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1 recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1;
        boolean z2;
        long jLongValue;
        int i;
        RecentTripAppModel recentTripAppModel2;
        int i2;
        RecentTripEntity recentTripEntityB;
        RecentTripAppModel recentTripAppModel3 = recentTripAppModel;
        if (continuationImpl instanceof RecentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1) {
            recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1 = (RecentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1) continuationImpl;
            int i3 = recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.label = i3 - Integer.MIN_VALUE;
            } else {
                recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1 = new RecentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1(this, continuationImpl);
            }
        } else {
            recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1 = new RecentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1(this, continuationImpl);
        }
        Object objH = recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.label;
        RecentTripCityItineraryDao recentTripCityItineraryDao = this.f8989a;
        Unit unit = Unit.f17538a;
        if (i4 == 0) {
            ResultKt.b(objH);
            String str = recentTripAppModel3.e;
            String str2 = recentTripAppModel3.f;
            recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.L$0 = recentTripAppModel3;
            z2 = z;
            recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.Z$0 = z2;
            recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.label = 1;
            objH = recentTripCityItineraryDao.h(str, str2, recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1);
            if (objH != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            boolean z3 = recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.Z$0;
            RecentTripAppModel recentTripAppModel4 = (RecentTripAppModel) recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.L$0;
            ResultKt.b(objH);
            z2 = z3;
            recentTripAppModel3 = recentTripAppModel4;
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    ResultKt.b(objH);
                    return unit;
                }
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objH);
                return unit;
            }
            i2 = recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.I$0;
            recentTripAppModel2 = (RecentTripAppModel) recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.L$0;
            ResultKt.b(objH);
        }
        jLongValue = ((Number) objH).longValue();
        i = i2;
        recentTripAppModel3 = recentTripAppModel2;
        long j = jLongValue;
        String tripId = recentTripAppModel3.e;
        String cityId = recentTripAppModel3.f;
        UniversalSearchDescriptiveLocationAppModel fromLocation = recentTripAppModel3.g;
        UniversalSearchDescriptiveLocationAppModel toLocation = recentTripAppModel3.h;
        ChaloTransitMode chaloTransitMode = recentTripAppModel3.i;
        RecentTripAppModel.Companion companion = RecentTripAppModel.INSTANCE;
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(fromLocation, "fromLocation");
        Intrinsics.i(toLocation, "toLocation");
        recentTripEntityB = new RecentTripAppModel(tripId, cityId, fromLocation, toLocation, chaloTransitMode, j, i).b();
        if (recentTripEntityB != null) {
            recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.L$0 = null;
            recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.label = 3;
            if (recentTripCityItineraryDao.i(recentTripEntityB, recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
        RecentTripEntity recentTripEntity = (RecentTripEntity) objH;
        if (recentTripEntity == null) {
            RecentTripEntity recentTripEntityB2 = recentTripAppModel3.b();
            if (recentTripEntityB2 != null) {
                recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.L$0 = null;
                recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.label = 4;
                if (recentTripCityItineraryDao.i(recentTripEntityB2, recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1) == coroutineSingletons) {
                }
            }
            return unit;
        }
        int i5 = recentTripEntity.g;
        if (z2) {
            i5++;
        }
        if (!z2) {
            jLongValue = recentTripEntity.f;
            i = i5;
            long j2 = jLongValue;
            String tripId2 = recentTripAppModel3.e;
            String cityId2 = recentTripAppModel3.f;
            UniversalSearchDescriptiveLocationAppModel fromLocation2 = recentTripAppModel3.g;
            UniversalSearchDescriptiveLocationAppModel toLocation2 = recentTripAppModel3.h;
            ChaloTransitMode chaloTransitMode2 = recentTripAppModel3.i;
            RecentTripAppModel.Companion companion2 = RecentTripAppModel.INSTANCE;
            Intrinsics.i(tripId2, "tripId");
            Intrinsics.i(cityId2, "cityId");
            Intrinsics.i(fromLocation2, "fromLocation");
            Intrinsics.i(toLocation2, "toLocation");
            recentTripEntityB = new RecentTripAppModel(tripId2, cityId2, fromLocation2, toLocation2, chaloTransitMode2, j2, i).b();
            if (recentTripEntityB != null) {
                recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.L$0 = null;
                recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.label = 3;
                if (recentTripCityItineraryDao.i(recentTripEntityB, recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1) == coroutineSingletons) {
                }
            }
            return unit;
        }
        recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.L$0 = recentTripAppModel3;
        recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.I$0 = i5;
        recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.label = 2;
        objH = this.b.c(recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1);
        if (objH != coroutineSingletons) {
            int i6 = i5;
            recentTripAppModel2 = recentTripAppModel3;
            i2 = i6;
            jLongValue = ((Number) objH).longValue();
            i = i2;
            recentTripAppModel3 = recentTripAppModel2;
            long j3 = jLongValue;
            String tripId3 = recentTripAppModel3.e;
            String cityId3 = recentTripAppModel3.f;
            UniversalSearchDescriptiveLocationAppModel fromLocation3 = recentTripAppModel3.g;
            UniversalSearchDescriptiveLocationAppModel toLocation3 = recentTripAppModel3.h;
            ChaloTransitMode chaloTransitMode3 = recentTripAppModel3.i;
            RecentTripAppModel.Companion companion3 = RecentTripAppModel.INSTANCE;
            Intrinsics.i(tripId3, "tripId");
            Intrinsics.i(cityId3, "cityId");
            Intrinsics.i(fromLocation3, "fromLocation");
            Intrinsics.i(toLocation3, "toLocation");
            recentTripEntityB = new RecentTripAppModel(tripId3, cityId3, fromLocation3, toLocation3, chaloTransitMode3, j3, i).b();
            if (recentTripEntityB != null) {
                recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.L$0 = null;
                recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1.label = 3;
                if (recentTripCityItineraryDao.i(recentTripEntityB, recentTripLocalDataSourceImpl$insertOrUpdateTripRecent$1) == coroutineSingletons) {
                }
            }
            return unit;
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.recent.localsource.recent.RecentTripLocalDataSource
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        Object objC = this.f8989a.c(str, str2, continuationImpl);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.recent.localsource.recent.RecentTripLocalDataSource
    public final Flow d(String str, Set set) {
        if (set.isEmpty()) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
        }
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1G = this.f8989a.g(str, CollectionsKt.D0(set));
        return new Flow<List<? extends RecentTripAppModel>>() { // from class: app.chalo.recent.localsource.recent.RecentTripLocalDataSourceImpl$getTripRecentsFilteredByTransitModesForCity$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentTripLocalDataSourceImpl$getTripRecentsFilteredByTransitModesForCity$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8991a;

                /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentTripLocalDataSourceImpl$getTripRecentsFilteredByTransitModesForCity$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentTripLocalDataSourceImpl$getTripRecentsFilteredByTransitModesForCity$$inlined$map$1$2", f = "RecentTripLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f8991a = flowCollector;
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
                                arrayList.add(ConvertToAppModelKt.i((RecentTripEntity) it.next()));
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f8991a.emit(arrayList, anonymousClass1) == obj3) {
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
                Object objCollect = flowQuery$mapToList$$inlined$map$1G.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [app.chalo.recent.localsource.recent.RecentTripLocalDataSourceImpl$getTripRecentsForCity$$inlined$map$1] */
    @Override // app.chalo.recent.localsource.recent.RecentTripLocalDataSource
    public final RecentTripLocalDataSourceImpl$getTripRecentsForCity$$inlined$map$1 e(int i, String str, boolean z) {
        RecentTripCityItineraryDao recentTripCityItineraryDao = this.f8989a;
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1D = z ? recentTripCityItineraryDao.d(i, str) : recentTripCityItineraryDao.e(i, str);
        return new Flow<List<? extends RecentTripAppModel>>() { // from class: app.chalo.recent.localsource.recent.RecentTripLocalDataSourceImpl$getTripRecentsForCity$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentTripLocalDataSourceImpl$getTripRecentsForCity$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8993a;

                /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentTripLocalDataSourceImpl$getTripRecentsForCity$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentTripLocalDataSourceImpl$getTripRecentsForCity$$inlined$map$1$2", f = "RecentTripLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f8993a = flowCollector;
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
                                arrayList.add(ConvertToAppModelKt.i((RecentTripEntity) it.next()));
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f8993a.emit(arrayList, anonymousClass1) == obj3) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.localsource.recent.RecentTripLocalDataSource
    public final Serializable f(String str, ContinuationImpl continuationImpl) {
        RecentTripLocalDataSourceImpl$getAllTripRecentForCity$1 recentTripLocalDataSourceImpl$getAllTripRecentForCity$1;
        if (continuationImpl instanceof RecentTripLocalDataSourceImpl$getAllTripRecentForCity$1) {
            recentTripLocalDataSourceImpl$getAllTripRecentForCity$1 = (RecentTripLocalDataSourceImpl$getAllTripRecentForCity$1) continuationImpl;
            int i = recentTripLocalDataSourceImpl$getAllTripRecentForCity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recentTripLocalDataSourceImpl$getAllTripRecentForCity$1.label = i - Integer.MIN_VALUE;
            } else {
                recentTripLocalDataSourceImpl$getAllTripRecentForCity$1 = new RecentTripLocalDataSourceImpl$getAllTripRecentForCity$1(this, continuationImpl);
            }
        } else {
            recentTripLocalDataSourceImpl$getAllTripRecentForCity$1 = new RecentTripLocalDataSourceImpl$getAllTripRecentForCity$1(this, continuationImpl);
        }
        Object objF = recentTripLocalDataSourceImpl$getAllTripRecentForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentTripLocalDataSourceImpl$getAllTripRecentForCity$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            recentTripLocalDataSourceImpl$getAllTripRecentForCity$1.label = 1;
            objF = this.f8989a.f(str, recentTripLocalDataSourceImpl$getAllTripRecentForCity$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        Iterable iterable = (Iterable) objF;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(ConvertToAppModelKt.i((RecentTripEntity) it.next()));
        }
        return arrayList;
    }
}
