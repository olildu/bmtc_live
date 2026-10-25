package app.chalo.recent.localsource.recent;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.contract.BasicInfoContract;
import app.chalo.location.LatLng;
import app.chalo.recent.database.dao.recent.RecentPlacesCityItineraryDao;
import app.chalo.recent.database.entities.RecentCityItineraryEntitiesKt;
import app.chalo.recent.database.entities.RecentPlaceEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.recent.model.ConvertToAppModelKt;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentsAppModelKt;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/localsource/recent/RecentPlaceLocalDataSourceImpl;", "Lapp/chalo/recent/localsource/recent/RecentPlaceLocalDataSource;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentPlaceLocalDataSourceImpl implements RecentPlaceLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentPlacesCityItineraryDao f8965a;
    public final BasicInfoContract b;

    public RecentPlaceLocalDataSourceImpl(RecentPlacesCityItineraryDao recentPlacesCityItineraryDao, BasicInfoContract basicInfoContract) {
        this.f8965a = recentPlacesCityItineraryDao;
        this.b = basicInfoContract;
    }

    @Override // app.chalo.recent.localsource.recent.RecentPlaceLocalDataSource
    public final Object b(String str, String str2, String str3, Continuation continuation) {
        Object objB = this.f8965a.b(str, str2, str3, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.localsource.recent.RecentPlaceLocalDataSource
    public final Object c(RecentsSpecialStatus recentsSpecialStatus, String str, String str2, ContinuationImpl continuationImpl) {
        RecentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1 recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1;
        if (continuationImpl instanceof RecentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1) {
            recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1 = (RecentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1) continuationImpl;
            int i = recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1 = new RecentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1(this, continuationImpl);
            }
        } else {
            recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1 = new RecentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1(this, continuationImpl);
        }
        Object objI = recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.label;
        Unit unit = Unit.f17538a;
        RecentPlacesCityItineraryDao recentPlacesCityItineraryDao = this.f8965a;
        if (i2 == 0) {
            ResultKt.b(objI);
            recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.L$0 = recentsSpecialStatus;
            recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.L$1 = str;
            recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.L$2 = str2;
            recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.label = 1;
            objI = recentPlacesCityItineraryDao.i(str, str2, recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1);
            if (objI != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objI);
            return unit;
        }
        str2 = (String) recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.L$2;
        str = (String) recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.L$1;
        recentsSpecialStatus = (RecentsSpecialStatus) recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.L$0;
        ResultKt.b(objI);
        RecentPlaceEntity recentPlaceEntity = (RecentPlaceEntity) objI;
        if (recentPlaceEntity != null) {
            RecentsAppModelKt.b(RecentCityItineraryEntitiesKt.a(recentPlaceEntity.g), recentsSpecialStatus);
            RecentsSpecialEntityStatus recentsSpecialEntityStatusD = RecentsAppModelKt.d(recentsSpecialStatus);
            recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.L$0 = null;
            recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.L$1 = null;
            recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.L$2 = null;
            recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1.label = 2;
            if (recentPlacesCityItineraryDao.c(recentsSpecialEntityStatusD, str, str2, recentPlaceLocalDataSourceImpl$updateSpecialStatusIfRequired$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }

    @Override // app.chalo.recent.localsource.recent.RecentPlaceLocalDataSource
    public final Flow d(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str) {
        return this.f8965a.d(recentsSpecialEntityStatus, str);
    }

    @Override // app.chalo.recent.localsource.recent.RecentPlaceLocalDataSource
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        Object objF = this.f8965a.f(str, str2, continuationImpl);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    @Override // app.chalo.recent.localsource.recent.RecentPlaceLocalDataSource
    public final Object f(String str, String str2, SuspendLambda suspendLambda) {
        Object objC = this.f8965a.c(RecentsSpecialEntityStatus.NONE, str, str2, suspendLambda);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.localsource.recent.RecentPlaceLocalDataSource
    public final Object g(String str, ContinuationImpl continuationImpl) {
        RecentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1 recentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1;
        if (continuationImpl instanceof RecentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1) {
            recentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1 = (RecentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1) continuationImpl;
            int i = recentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1.label = i - Integer.MIN_VALUE;
            } else {
                recentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1 = new RecentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1(this, continuationImpl);
            }
        } else {
            recentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1 = new RecentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1(this, continuationImpl);
        }
        Object objE = recentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            RecentsSpecialEntityStatus recentsSpecialEntityStatus = RecentsSpecialEntityStatus.NONE;
            recentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1.label = 1;
            objE = this.f8965a.e(recentsSpecialEntityStatus, str, recentPlaceLocalDataSourceImpl$getRecentPlacesWithoutSpecialStatusCount$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        Integer num = (Integer) objE;
        return new Integer(num != null ? num.intValue() : 0);
    }

    @Override // app.chalo.recent.localsource.recent.RecentPlaceLocalDataSource
    public final Object h(int i, String str, Continuation continuation) {
        return this.f8965a.g(i, RecentsSpecialEntityStatus.NONE, str, continuation);
    }

    @Override // app.chalo.recent.localsource.recent.RecentPlaceLocalDataSource
    public final Object i(String str, String str2, long j, Continuation continuation) {
        Object objA = this.f8965a.a(str, str2, j, continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.recent.localsource.recent.RecentPlaceLocalDataSource
    public final Object j(RecentPlaceAppModel recentPlaceAppModel, boolean z, ContinuationImpl continuationImpl) {
        RecentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1 recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1;
        boolean z2;
        RecentPlaceEntity recentPlaceEntity;
        long jLongValue;
        int i;
        RecentPlaceAppModel recentPlaceAppModel2;
        int i2;
        RecentPlaceEntity recentPlaceEntityB;
        RecentPlaceAppModel recentPlaceAppModel3 = recentPlaceAppModel;
        if (continuationImpl instanceof RecentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1) {
            recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1 = (RecentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1) continuationImpl;
            int i3 = recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.label = i3 - Integer.MIN_VALUE;
            } else {
                recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1 = new RecentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1(this, continuationImpl);
            }
        } else {
            recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1 = new RecentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1(this, continuationImpl);
        }
        Object objI = recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.label;
        Unit unit = Unit.f17538a;
        RecentPlacesCityItineraryDao recentPlacesCityItineraryDao = this.f8965a;
        if (i4 == 0) {
            ResultKt.b(objI);
            String str = recentPlaceAppModel3.e;
            String str2 = recentPlaceAppModel3.h;
            recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$0 = recentPlaceAppModel3;
            z2 = z;
            recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.Z$0 = z2;
            recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.label = 1;
            objI = recentPlacesCityItineraryDao.i(str, str2, recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1);
            if (objI != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            boolean z3 = recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.Z$0;
            RecentPlaceAppModel recentPlaceAppModel4 = (RecentPlaceAppModel) recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$0;
            ResultKt.b(objI);
            z2 = z3;
            recentPlaceAppModel3 = recentPlaceAppModel4;
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    ResultKt.b(objI);
                    return unit;
                }
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objI);
                return unit;
            }
            i2 = recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.I$0;
            recentPlaceEntity = (RecentPlaceEntity) recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$1;
            recentPlaceAppModel2 = (RecentPlaceAppModel) recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$0;
            ResultKt.b(objI);
        }
        jLongValue = ((Number) objI).longValue();
        i = i2;
        recentPlaceAppModel3 = recentPlaceAppModel2;
        long j = jLongValue;
        RecentsSpecialStatus recentsSpecialStatusA = RecentCityItineraryEntitiesKt.a(recentPlaceEntity.g);
        RecentsSpecialStatus recentsSpecialStatus = recentPlaceAppModel3.k;
        RecentsAppModelKt.b(recentsSpecialStatusA, recentsSpecialStatus);
        String placeId = recentPlaceAppModel3.e;
        String searchPartner = recentPlaceAppModel3.f;
        String locationTitle = recentPlaceAppModel3.g;
        String cityId = recentPlaceAppModel3.h;
        String str3 = recentPlaceAppModel3.i;
        LatLng latLng = recentPlaceAppModel3.j;
        String str4 = recentPlaceAppModel3.n;
        Intrinsics.i(placeId, "placeId");
        Intrinsics.i(searchPartner, "searchPartner");
        Intrinsics.i(locationTitle, "locationTitle");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(latLng, "latLng");
        recentPlaceEntityB = new RecentPlaceAppModel(placeId, searchPartner, locationTitle, cityId, str3, latLng, recentsSpecialStatus, j, i, str4).b();
        recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$0 = null;
        recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$1 = null;
        recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.label = 3;
        if (recentPlacesCityItineraryDao.h(recentPlaceEntityB, recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
        recentPlaceEntity = (RecentPlaceEntity) objI;
        if (recentPlaceEntity != null) {
            int i5 = recentPlaceEntity.i;
            if (z2) {
                i5++;
            }
            if (z2) {
                recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$0 = recentPlaceAppModel3;
                recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$1 = recentPlaceEntity;
                recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.I$0 = i5;
                recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.label = 2;
                Object objC = this.b.c(recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1);
                if (objC != coroutineSingletons) {
                    recentPlaceAppModel2 = recentPlaceAppModel3;
                    i2 = i5;
                    objI = objC;
                    jLongValue = ((Number) objI).longValue();
                    i = i2;
                    recentPlaceAppModel3 = recentPlaceAppModel2;
                    long j2 = jLongValue;
                    RecentsSpecialStatus recentsSpecialStatusA2 = RecentCityItineraryEntitiesKt.a(recentPlaceEntity.g);
                    RecentsSpecialStatus recentsSpecialStatus2 = recentPlaceAppModel3.k;
                    RecentsAppModelKt.b(recentsSpecialStatusA2, recentsSpecialStatus2);
                    String placeId2 = recentPlaceAppModel3.e;
                    String searchPartner2 = recentPlaceAppModel3.f;
                    String locationTitle2 = recentPlaceAppModel3.g;
                    String cityId2 = recentPlaceAppModel3.h;
                    String str5 = recentPlaceAppModel3.i;
                    LatLng latLng2 = recentPlaceAppModel3.j;
                    String str6 = recentPlaceAppModel3.n;
                    Intrinsics.i(placeId2, "placeId");
                    Intrinsics.i(searchPartner2, "searchPartner");
                    Intrinsics.i(locationTitle2, "locationTitle");
                    Intrinsics.i(cityId2, "cityId");
                    Intrinsics.i(latLng2, "latLng");
                    recentPlaceEntityB = new RecentPlaceAppModel(placeId2, searchPartner2, locationTitle2, cityId2, str5, latLng2, recentsSpecialStatus2, j2, i, str6).b();
                    recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$0 = null;
                    recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$1 = null;
                    recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.label = 3;
                    if (recentPlacesCityItineraryDao.h(recentPlaceEntityB, recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1) == coroutineSingletons) {
                        return unit;
                    }
                }
            } else {
                jLongValue = recentPlaceEntity.h;
                i = i5;
                long j3 = jLongValue;
                RecentsSpecialStatus recentsSpecialStatusA3 = RecentCityItineraryEntitiesKt.a(recentPlaceEntity.g);
                RecentsSpecialStatus recentsSpecialStatus3 = recentPlaceAppModel3.k;
                RecentsAppModelKt.b(recentsSpecialStatusA3, recentsSpecialStatus3);
                String placeId3 = recentPlaceAppModel3.e;
                String searchPartner3 = recentPlaceAppModel3.f;
                String locationTitle3 = recentPlaceAppModel3.g;
                String cityId3 = recentPlaceAppModel3.h;
                String str7 = recentPlaceAppModel3.i;
                LatLng latLng3 = recentPlaceAppModel3.j;
                String str8 = recentPlaceAppModel3.n;
                Intrinsics.i(placeId3, "placeId");
                Intrinsics.i(searchPartner3, "searchPartner");
                Intrinsics.i(locationTitle3, "locationTitle");
                Intrinsics.i(cityId3, "cityId");
                Intrinsics.i(latLng3, "latLng");
                recentPlaceEntityB = new RecentPlaceAppModel(placeId3, searchPartner3, locationTitle3, cityId3, str7, latLng3, recentsSpecialStatus3, j3, i, str8).b();
                recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$0 = null;
                recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$1 = null;
                recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.label = 3;
                if (recentPlacesCityItineraryDao.h(recentPlaceEntityB, recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1) == coroutineSingletons) {
                    return unit;
                }
            }
        } else {
            RecentPlaceEntity recentPlaceEntityB2 = recentPlaceAppModel3.b();
            recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.L$0 = null;
            recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1.label = 4;
            if (recentPlacesCityItineraryDao.h(recentPlaceEntityB2, recentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1) != coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [app.chalo.recent.localsource.recent.RecentPlaceLocalDataSourceImpl$getAllPlacesRecentForCity$$inlined$map$1] */
    @Override // app.chalo.recent.localsource.recent.RecentPlaceLocalDataSource
    public final RecentPlaceLocalDataSourceImpl$getAllPlacesRecentForCity$$inlined$map$1 k(String str) {
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1J = this.f8965a.j(str);
        return new Flow<List<? extends RecentPlaceAppModel>>() { // from class: app.chalo.recent.localsource.recent.RecentPlaceLocalDataSourceImpl$getAllPlacesRecentForCity$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentPlaceLocalDataSourceImpl$getAllPlacesRecentForCity$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8967a;

                /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentPlaceLocalDataSourceImpl$getAllPlacesRecentForCity$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentPlaceLocalDataSourceImpl$getAllPlacesRecentForCity$$inlined$map$1$2", f = "RecentPlaceLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f8967a = flowCollector;
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
                                arrayList.add(ConvertToAppModelKt.d((RecentPlaceEntity) it.next()));
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f8967a.emit(arrayList, anonymousClass1) == obj3) {
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
                Object objCollect = flowQuery$mapToList$$inlined$map$1J.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }
}
