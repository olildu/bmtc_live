package app.chalo.home.ui.regularbus;

import app.chalo.data.ClusterConfig;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.home.domain.GetRecentSearchListUseCase;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.recent.database.migration.RecentsStoreMigrationHelper;
import app.chalo.recent.database.repository.recent.RouteRecentRepository;
import app.chalo.recent.model.app.RecentLocationPairAppModel;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import app.chalo.recent.model.app.RecentTripAppModel;
import defpackage.l11;
import defpackage.ud;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$4", f = "RegularBusComponent.kt", l = {1522, 1523, 1525, 1529}, m = "invokeSuspend", v = 1)
final class RegularBusComponent$startRequiredCollections$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final /* synthetic */ RegularBusComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$4$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "recentSearchList", "", "Lapp/chalo/recent/model/app/RecentRouteAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$4$1", f = "RegularBusComponent.kt", l = {1532, 1535, 1545, 1547, 1551, 1561, 1565}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends RecentRouteAppModel>, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isKRCTCCluster;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RegularBusComponent this$0;

        /* JADX INFO: renamed from: app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$4$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "recentTrips", "", "Lapp/chalo/recent/model/app/RecentLocationPairAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$4$1$1", f = "RegularBusComponent.kt", l = {1536}, m = "invokeSuspend", v = 1)
        final class C01121 extends SuspendLambda implements Function2<List<? extends RecentLocationPairAppModel>, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<RecentRouteAppModel> $recentSearchList;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RegularBusComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01121(RegularBusComponent regularBusComponent, List list, Continuation continuation) {
                super(2, continuation);
                this.this$0 = regularBusComponent;
                this.$recentSearchList = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C01121 c01121 = new C01121(this.this$0, this.$recentSearchList, continuation);
                c01121.L$0 = obj;
                return c01121;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C01121) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    List list = (List) this.L$0;
                    GetRecentSearchListUseCase getRecentSearchListUseCase = this.this$0.z;
                    List<RecentRouteAppModel> list2 = this.$recentSearchList;
                    this.label = 1;
                    obj = getRecentSearchListUseCase.c(list2, list, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.this$0.E0(new ud((List) obj, 29));
                return Unit.f17538a;
            }
        }

        /* JADX INFO: renamed from: app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$4$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "stopBasedTripRecents", "", "Lapp/chalo/recent/model/app/RecentStopBasedTripAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$4$1$2", f = "RegularBusComponent.kt", l = {1552}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends RecentStopBasedTripAppModel>, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<RecentRouteAppModel> $recentSearchList;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RegularBusComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RegularBusComponent regularBusComponent, List list, Continuation continuation) {
                super(2, continuation);
                this.this$0 = regularBusComponent;
                this.$recentSearchList = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$recentSearchList, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    List list = (List) this.L$0;
                    GetRecentSearchListUseCase getRecentSearchListUseCase = this.this$0.z;
                    List<RecentRouteAppModel> list2 = this.$recentSearchList;
                    this.label = 1;
                    obj = getRecentSearchListUseCase.c(list2, list, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.this$0.E0(new l11((List) obj, 0));
                return Unit.f17538a;
            }
        }

        /* JADX INFO: renamed from: app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$4$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "tripRecentList", "", "Lapp/chalo/recent/model/app/RecentTripAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$4$1$3", f = "RegularBusComponent.kt", l = {1566}, m = "invokeSuspend", v = 1)
        final class AnonymousClass3 extends SuspendLambda implements Function2<List<? extends RecentTripAppModel>, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<RecentRouteAppModel> $recentSearchList;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RegularBusComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(RegularBusComponent regularBusComponent, List list, Continuation continuation) {
                super(2, continuation);
                this.this$0 = regularBusComponent;
                this.$recentSearchList = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$recentSearchList, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass3) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    List list = (List) this.L$0;
                    GetRecentSearchListUseCase getRecentSearchListUseCase = this.this$0.z;
                    List<RecentRouteAppModel> list2 = this.$recentSearchList;
                    this.label = 1;
                    obj = getRecentSearchListUseCase.c(list2, list, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.this$0.E0(new l11((List) obj, 1));
                return Unit.f17538a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RegularBusComponent regularBusComponent, Continuation continuation, boolean z) {
            super(2, continuation);
            this.$isKRCTCCluster = z;
            this.this$0 = regularBusComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation, this.$isKRCTCCluster);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0095  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:35:0x00b5 A[PHI: r1 r7
          0x00b5: PHI (r1v9 java.util.List) = (r1v6 java.util.List), (r1v12 java.util.List) binds: [B:33:0x00b2, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x00b5: PHI (r7v24 java.lang.Object) = (r7v23 java.lang.Object), (r7v0 java.lang.Object) binds: [B:33:0x00b2, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ea A[PHI: r1 r7
          0x00ea: PHI (r1v13 java.util.List) = (r1v6 java.util.List), (r1v16 java.util.List) binds: [B:43:0x00e7, B:6:0x0014] A[DONT_GENERATE, DONT_INLINE]
          0x00ea: PHI (r7v28 java.lang.Object) = (r7v19 java.lang.Object), (r7v0 java.lang.Object) binds: [B:43:0x00e7, B:6:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.j((kotlinx.coroutines.flow.Flow) r7, r3, r6) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.j((kotlinx.coroutines.flow.Flow) r7, r2, r6) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00fc, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.j((kotlinx.coroutines.flow.Flow) r7, r2, r6) == r0) goto L47;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent$startRequiredCollections$4(RegularBusComponent regularBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = regularBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusComponent$startRequiredCollections$4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RegularBusComponent$startRequiredCollections$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[PHI: r1 r9
      0x0079: PHI (r1v3 boolean) = (r1v2 boolean), (r1v4 boolean) binds: [B:28:0x0076, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r9v15 java.lang.Object) = (r9v14 java.lang.Object), (r9v0 java.lang.Object) binds: [B:28:0x0076, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AnonymousClass1 anonymousClass1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            RecentsStoreMigrationHelper recentsStoreMigrationHelper = this.this$0.x;
            this.label = 1;
            recentsStoreMigrationHelper.getClass();
            if (unit != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                ResultKt.b(obj);
                z = ((ClusterConfig) obj).c;
                RouteRecentRepository f8954a = this.this$0.y.getF8954a();
                String strB = CityProviderKt.b(this.this$0.t);
                String str = strB != null ? strB : "";
                this.Z$0 = z;
                this.label = 3;
                obj = f8954a.d(str, this);
                if (obj != coroutineSingletons) {
                    anonymousClass1 = new AnonymousClass1(this.this$0, null, z);
                    this.label = 4;
                    if (FlowKt.j((Flow) obj, anonymousClass1, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                z = this.Z$0;
                ResultKt.b(obj);
                anonymousClass1 = new AnonymousClass1(this.this$0, null, z);
                this.label = 4;
                if (FlowKt.j((Flow) obj, anonymousClass1, this) != coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        }
        return unit;
        RegularBusComponent regularBusComponent = this.this$0;
        GetClusterConfigForCityUseCase getClusterConfigForCityUseCase = regularBusComponent.U;
        String strH = regularBusComponent.t.h();
        if (strH == null) {
            strH = "";
        }
        this.label = 2;
        obj = getClusterConfigForCityUseCase.a(strH, this);
        if (obj != coroutineSingletons) {
            z = ((ClusterConfig) obj).c;
            RouteRecentRepository f8954a2 = this.this$0.y.getF8954a();
            String strB2 = CityProviderKt.b(this.this$0.t);
            if (strB2 != null) {
            }
            this.Z$0 = z;
            this.label = 3;
            obj = f8954a2.d(str, this);
            if (obj != coroutineSingletons) {
                anonymousClass1 = new AnonymousClass1(this.this$0, null, z);
                this.label = 4;
                if (FlowKt.j((Flow) obj, anonymousClass1, this) != coroutineSingletons) {
                    return unit;
                }
            }
        }
        return coroutineSingletons;
    }
}
