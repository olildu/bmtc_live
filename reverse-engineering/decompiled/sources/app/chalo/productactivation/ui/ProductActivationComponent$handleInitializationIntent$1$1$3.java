package app.chalo.productactivation.ui;

import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketEntityKt;
import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.metro.repository.MetroRepositoryImpl$getMetroTicketAsFlow$$inlined$map$1;
import app.chalo.models.mticketing.MTicket;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.ondc.repository.OndcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1;
import app.chalo.ondc.repository.OndcRepositoryImpl$getOndcTicketAsFlow$$inlined$map$1;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1;
import app.chalo.productactivation.data.ActivationProductData;
import app.chalo.productactivation.domain.GetActivationProductDataUseCase;
import app.chalo.superpass.data.dao.SuperPassDao;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getQuickPaysForOrderIdAsFlow$$inlined$map$1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productactivation.ui.ProductActivationComponent$handleInitializationIntent$1$1$3", f = "ProductActivationComponent.kt", l = {263}, m = "invokeSuspend", v = 1)
final class ProductActivationComponent$handleInitializationIntent$1$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductActivationIntent.InitializationIntent $this_with;
    int label;
    final /* synthetic */ ProductActivationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActivationComponent$handleInitializationIntent$1$1$3(ProductActivationComponent productActivationComponent, ProductActivationIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = productActivationComponent;
        this.$this_with = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductActivationComponent$handleInitializationIntent$1$1$3(this.this$0, this.$this_with, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductActivationComponent$handleInitializationIntent$1$1$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
        Flow flow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        ProductActivationComponent productActivationComponent = this.this$0;
        ProductActivationIntent.InitializationIntent initializationIntent = this.$this_with;
        final String id = initializationIntent.f8036a;
        String type = initializationIntent.b;
        String subType = initializationIntent.c;
        this.label = 1;
        final GetActivationProductDataUseCase getActivationProductDataUseCase = productActivationComponent.k;
        SuperPassDao superPassDao = getActivationProductDataUseCase.f8002a.b;
        OndcRepository ondcRepository = getActivationProductDataUseCase.e;
        Intrinsics.i(id, "id");
        Intrinsics.i(type, "type");
        Intrinsics.i(subType, "subType");
        switch (type.hashCode()) {
            case -1066391653:
                if (!type.equals("quickpay")) {
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(null);
                } else {
                    final QuickPayRepositoryImpl$getQuickPaysForOrderIdAsFlow$$inlined$map$1 quickPayRepositoryImpl$getQuickPaysForOrderIdAsFlow$$inlined$map$1D = getActivationProductDataUseCase.b.d(id);
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<ActivationProductData.QuickPayActivation>() { // from class: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$3

                        /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$3$2, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ FlowCollector f8010a;

                            /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$3$2$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$3$2", f = "GetActivationProductDataUseCase.kt", l = {50}, m = "emit", v = 1)
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
                                this.f8010a = flowCollector;
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
                                    QuickPayAppModel quickPayAppModel = (QuickPayAppModel) CollectionsKt.H((List) obj);
                                    ActivationProductData.QuickPayActivation quickPayActivation = quickPayAppModel != null ? new ActivationProductData.QuickPayActivation(quickPayAppModel) : null;
                                    anonymousClass1.label = 1;
                                    if (this.f8010a.emit(quickPayActivation, anonymousClass1) == coroutineSingletons) {
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
                            Object objCollect = quickPayRepositoryImpl$getQuickPaysForOrderIdAsFlow$$inlined$map$1D.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                        }
                    };
                }
                break;
            case -677570684:
                if (!type.equals("singleJourneyTicket")) {
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(null);
                } else {
                    final Flow flowK = getActivationProductDataUseCase.d.k();
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<ActivationProductData.MobileTicketActivation>() { // from class: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$10

                        /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$10$2, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ FlowCollector f8006a;
                            public final /* synthetic */ String b;

                            /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$10$2$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$10$2", f = "GetActivationProductDataUseCase.kt", l = {50}, m = "emit", v = 1)
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

                            public AnonymousClass2(FlowCollector flowCollector, String str) {
                                this.f8006a = flowCollector;
                                this.b = str;
                            }

                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                T next;
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
                                    ActivationProductData.MobileTicketActivation mobileTicketActivation = null;
                                    if (list != null) {
                                        Iterator<T> it = list.iterator();
                                        do {
                                            if (!it.hasNext()) {
                                                next = (T) null;
                                                break;
                                            }
                                            next = it.next();
                                        } while (!Intrinsics.d(((MTicket) next).f5615a, this.b));
                                        MTicket mTicket = next;
                                        if (mTicket != null) {
                                            mobileTicketActivation = new ActivationProductData.MobileTicketActivation(mTicket);
                                        }
                                    }
                                    anonymousClass1.label = 1;
                                    if (this.f8006a.emit(mobileTicketActivation, anonymousClass1) == coroutineSingletons) {
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
                            Object objCollect = flowK.collect(new AnonymousClass2(flowCollector, id), continuation);
                            return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                        }
                    };
                }
                break;
            case -332983764:
                if (!type.equals("superPass")) {
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(null);
                } else {
                    if (subType.equals("rideBasedPass")) {
                        final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(superPassDao.I(id));
                        flow = new Flow<ActivationProductData.PassActivation.RideBased>() { // from class: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$1

                            /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$1$2, reason: invalid class name */
                            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            public final class AnonymousClass2<T> implements FlowCollector {

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ FlowCollector f8004a;
                                public final /* synthetic */ GetActivationProductDataUseCase b;

                                /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
                                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                @DebugMetadata(c = "app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$1$2", f = "GetActivationProductDataUseCase.kt", l = {53, 50}, m = "emit", v = 1)
                                public final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    Object L$1;
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

                                public AnonymousClass2(FlowCollector flowCollector, GetActivationProductDataUseCase getActivationProductDataUseCase) {
                                    this.f8004a = flowCollector;
                                    this.b = getActivationProductDataUseCase;
                                }

                                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
                                
                                    if (r2.emit(r4, r0) == r1) goto L21;
                                 */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                    /*
                                        r5 = this;
                                        boolean r0 = r7 instanceof app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                        if (r0 == 0) goto L13
                                        r0 = r7
                                        app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$1$2$1 r0 = (app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                        int r1 = r0.label
                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r3 = r1 & r2
                                        if (r3 == 0) goto L13
                                        int r1 = r1 - r2
                                        r0.label = r1
                                        goto L18
                                    L13:
                                        app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$1$2$1 r0 = new app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$1$2$1
                                        r0.<init>(r7)
                                    L18:
                                        java.lang.Object r7 = r0.result
                                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                                        int r2 = r0.label
                                        r3 = 2
                                        r4 = 1
                                        if (r2 == 0) goto L3e
                                        if (r2 == r4) goto L32
                                        if (r2 != r3) goto L2a
                                        kotlin.ResultKt.b(r7)
                                        goto L6f
                                    L2a:
                                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                        r6.<init>(r7)
                                        throw r6
                                    L32:
                                        java.lang.Object r6 = r0.L$1
                                        app.chalo.superpass.data.models.entities.RideBasedSuperPass r6 = (app.chalo.superpass.data.models.entities.RideBasedSuperPass) r6
                                        java.lang.Object r2 = r0.L$0
                                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                                        kotlin.ResultKt.b(r7)
                                        goto L56
                                    L3e:
                                        kotlin.ResultKt.b(r7)
                                        app.chalo.superpass.data.models.entities.RideBasedSuperPass r6 = (app.chalo.superpass.data.models.entities.RideBasedSuperPass) r6
                                        kotlinx.coroutines.flow.FlowCollector r2 = r5.f8004a
                                        r0.L$0 = r2
                                        r0.L$1 = r6
                                        r0.label = r4
                                        app.chalo.productactivation.domain.GetActivationProductDataUseCase r7 = r5.b
                                        app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase r7 = r7.i
                                        java.lang.Object r7 = r7.a(r6, r0)
                                        if (r7 != r1) goto L56
                                        goto L6e
                                    L56:
                                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                                        boolean r7 = r7.booleanValue()
                                        app.chalo.productactivation.data.ActivationProductData$PassActivation$RideBased r4 = new app.chalo.productactivation.data.ActivationProductData$PassActivation$RideBased
                                        r4.<init>(r6, r7)
                                        r6 = 0
                                        r0.L$0 = r6
                                        r0.L$1 = r6
                                        r0.label = r3
                                        java.lang.Object r6 = r2.emit(r4, r0)
                                        if (r6 != r1) goto L6f
                                    L6e:
                                        return r1
                                    L6f:
                                        kotlin.Unit r6 = kotlin.Unit.f17538a
                                        return r6
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                                Object objCollect = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.collect(new AnonymousClass2(flowCollector, getActivationProductDataUseCase), continuation);
                                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                            }
                        };
                    } else if (!subType.equals("magicPass")) {
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(null);
                    } else {
                        final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$2 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(superPassDao.D(id));
                        flow = new Flow<ActivationProductData.PassActivation.Magic>() { // from class: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$2

                            /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$2$2, reason: invalid class name */
                            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            public final class AnonymousClass2<T> implements FlowCollector {

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ FlowCollector f8008a;
                                public final /* synthetic */ GetActivationProductDataUseCase b;

                                /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$2$2$1, reason: invalid class name */
                                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                @DebugMetadata(c = "app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$2$2", f = "GetActivationProductDataUseCase.kt", l = {53, 50}, m = "emit", v = 1)
                                public final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    Object L$1;
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

                                public AnonymousClass2(FlowCollector flowCollector, GetActivationProductDataUseCase getActivationProductDataUseCase) {
                                    this.f8008a = flowCollector;
                                    this.b = getActivationProductDataUseCase;
                                }

                                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
                                
                                    if (r2.emit(r4, r0) == r1) goto L21;
                                 */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                    /*
                                        r5 = this;
                                        boolean r0 = r7 instanceof app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$2.AnonymousClass2.AnonymousClass1
                                        if (r0 == 0) goto L13
                                        r0 = r7
                                        app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$2$2$1 r0 = (app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                                        int r1 = r0.label
                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r3 = r1 & r2
                                        if (r3 == 0) goto L13
                                        int r1 = r1 - r2
                                        r0.label = r1
                                        goto L18
                                    L13:
                                        app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$2$2$1 r0 = new app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$2$2$1
                                        r0.<init>(r7)
                                    L18:
                                        java.lang.Object r7 = r0.result
                                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                                        int r2 = r0.label
                                        r3 = 2
                                        r4 = 1
                                        if (r2 == 0) goto L3e
                                        if (r2 == r4) goto L32
                                        if (r2 != r3) goto L2a
                                        kotlin.ResultKt.b(r7)
                                        goto L6f
                                    L2a:
                                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                        r6.<init>(r7)
                                        throw r6
                                    L32:
                                        java.lang.Object r6 = r0.L$1
                                        app.chalo.superpass.data.models.entities.MagicSuperPass r6 = (app.chalo.superpass.data.models.entities.MagicSuperPass) r6
                                        java.lang.Object r2 = r0.L$0
                                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                                        kotlin.ResultKt.b(r7)
                                        goto L56
                                    L3e:
                                        kotlin.ResultKt.b(r7)
                                        app.chalo.superpass.data.models.entities.MagicSuperPass r6 = (app.chalo.superpass.data.models.entities.MagicSuperPass) r6
                                        kotlinx.coroutines.flow.FlowCollector r2 = r5.f8008a
                                        r0.L$0 = r2
                                        r0.L$1 = r6
                                        r0.label = r4
                                        app.chalo.productactivation.domain.GetActivationProductDataUseCase r7 = r5.b
                                        app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase r7 = r7.i
                                        java.lang.Object r7 = r7.a(r6, r0)
                                        if (r7 != r1) goto L56
                                        goto L6e
                                    L56:
                                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                                        boolean r7 = r7.booleanValue()
                                        app.chalo.productactivation.data.ActivationProductData$PassActivation$Magic r4 = new app.chalo.productactivation.data.ActivationProductData$PassActivation$Magic
                                        r4.<init>(r6, r7)
                                        r6 = 0
                                        r0.L$0 = r6
                                        r0.L$1 = r6
                                        r0.label = r3
                                        java.lang.Object r6 = r2.emit(r4, r0)
                                        if (r6 != r1) goto L6f
                                    L6e:
                                        return r1
                                    L6f:
                                        kotlin.Unit r6 = kotlin.Unit.f17538a
                                        return r6
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                                Object objCollect = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$2.collect(new AnonymousClass2(flowCollector, getActivationProductDataUseCase), continuation);
                                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                            }
                        };
                    }
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = flow;
                }
                break;
            case 1897752142:
                if (type.equals("mobileTicket")) {
                    switch (subType) {
                        case "multiModalTicket":
                            final ChannelFlowTransformLatest channelFlowTransformLatestC = getActivationProductDataUseCase.h.c(id);
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<ActivationProductData.MultiModalGroupTicketActivation>() { // from class: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$9

                                /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$9$2, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                public final class AnonymousClass2<T> implements FlowCollector {

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ FlowCollector f8022a;

                                    /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$9$2$1, reason: invalid class name */
                                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                    @DebugMetadata(c = "app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$9$2", f = "GetActivationProductDataUseCase.kt", l = {50}, m = "emit", v = 1)
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
                                        this.f8022a = flowCollector;
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
                                            MultiModalGroupTicketAppModel multiModalGroupTicketAppModel = (MultiModalGroupTicketAppModel) obj;
                                            ActivationProductData.MultiModalGroupTicketActivation multiModalGroupTicketActivation = multiModalGroupTicketAppModel != null ? new ActivationProductData.MultiModalGroupTicketActivation(multiModalGroupTicketAppModel) : null;
                                            anonymousClass1.label = 1;
                                            if (this.f8022a.emit(multiModalGroupTicketActivation, anonymousClass1) == coroutineSingletons) {
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
                                    Object objCollect = channelFlowTransformLatestC.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                                }
                            };
                            break;
                        case "premiumReserveTicket":
                            final PremiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1 premiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1I = getActivationProductDataUseCase.g.i(id);
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<ActivationProductData.PremiumTicketActivation>() { // from class: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$5

                                /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$5$2, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                public final class AnonymousClass2<T> implements FlowCollector {

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ FlowCollector f8014a;

                                    /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$5$2$1, reason: invalid class name */
                                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                    @DebugMetadata(c = "app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$5$2", f = "GetActivationProductDataUseCase.kt", l = {50}, m = "emit", v = 1)
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
                                        this.f8014a = flowCollector;
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
                                            PremiumReserveTicketAppModel premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) obj;
                                            ActivationProductData.PremiumTicketActivation premiumTicketActivation = premiumReserveTicketAppModel != null ? new ActivationProductData.PremiumTicketActivation(premiumReserveTicketAppModel) : null;
                                            anonymousClass1.label = 1;
                                            if (this.f8014a.emit(premiumTicketActivation, anonymousClass1) == coroutineSingletons) {
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
                                    Object objCollect = premiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1I.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                                }
                            };
                            break;
                        case "metroTicket":
                            final MetroRepositoryImpl$getMetroTicketAsFlow$$inlined$map$1 metroRepositoryImpl$getMetroTicketAsFlow$$inlined$map$1D = getActivationProductDataUseCase.f.d(id);
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<ActivationProductData.MetroTicketActivation>() { // from class: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$8

                                /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$8$2, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                public final class AnonymousClass2<T> implements FlowCollector {

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ FlowCollector f8020a;

                                    /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$8$2$1, reason: invalid class name */
                                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                    @DebugMetadata(c = "app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$8$2", f = "GetActivationProductDataUseCase.kt", l = {50}, m = "emit", v = 1)
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
                                        this.f8020a = flowCollector;
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
                                            MetroTicketAppModel metroTicketAppModel = (MetroTicketAppModel) obj;
                                            ActivationProductData.MetroTicketActivation metroTicketActivation = metroTicketAppModel != null ? new ActivationProductData.MetroTicketActivation(metroTicketAppModel) : null;
                                            anonymousClass1.label = 1;
                                            if (this.f8020a.emit(metroTicketActivation, anonymousClass1) == coroutineSingletons) {
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
                                    Object objCollect = metroRepositoryImpl$getMetroTicketAsFlow$$inlined$map$1D.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                                }
                            };
                            break;
                        case "instantTicket":
                            final Flow flowH = getActivationProductDataUseCase.c.h(id);
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<ActivationProductData.InstantTicketActivation>() { // from class: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$4

                                /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$4$2, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                public final class AnonymousClass2<T> implements FlowCollector {

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ FlowCollector f8012a;

                                    /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$4$2$1, reason: invalid class name */
                                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                    @DebugMetadata(c = "app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$4$2", f = "GetActivationProductDataUseCase.kt", l = {50}, m = "emit", v = 1)
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
                                        this.f8012a = flowCollector;
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
                                            InstantTicketEntity instantTicketEntity = (InstantTicketEntity) obj;
                                            ActivationProductData.InstantTicketActivation instantTicketActivation = instantTicketEntity != null ? new ActivationProductData.InstantTicketActivation(InstantTicketEntityKt.a(instantTicketEntity)) : null;
                                            anonymousClass1.label = 1;
                                            if (this.f8012a.emit(instantTicketActivation, anonymousClass1) == coroutineSingletons) {
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
                                    Object objCollect = flowH.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                                }
                            };
                            break;
                        case "ondcTicket":
                            final OndcRepositoryImpl$getOndcTicketAsFlow$$inlined$map$1 ondcRepositoryImpl$getOndcTicketAsFlow$$inlined$map$1X = ondcRepository.x(id);
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<ActivationProductData.ONDCTicketActivation>() { // from class: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$6

                                /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$6$2, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                public final class AnonymousClass2<T> implements FlowCollector {

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ FlowCollector f8016a;

                                    /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$6$2$1, reason: invalid class name */
                                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                    @DebugMetadata(c = "app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$6$2", f = "GetActivationProductDataUseCase.kt", l = {50}, m = "emit", v = 1)
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
                                        this.f8016a = flowCollector;
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
                                            OndcTicketAppModel ondcTicketAppModel = (OndcTicketAppModel) obj;
                                            ActivationProductData.ONDCTicketActivation oNDCTicketActivation = ondcTicketAppModel != null ? new ActivationProductData.ONDCTicketActivation(ondcTicketAppModel) : null;
                                            anonymousClass1.label = 1;
                                            if (this.f8016a.emit(oNDCTicketActivation, anonymousClass1) == coroutineSingletons) {
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
                                    Object objCollect = ondcRepositoryImpl$getOndcTicketAsFlow$$inlined$map$1X.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                                }
                            };
                            break;
                        case "ondcMetroTicket":
                            final OndcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1 ondcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1M = ondcRepository.m(id);
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<ActivationProductData.ONDCMetroTicketActivation>() { // from class: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$7

                                /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$7$2, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                public final class AnonymousClass2<T> implements FlowCollector {

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ FlowCollector f8018a;

                                    /* JADX INFO: renamed from: app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$7$2$1, reason: invalid class name */
                                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                    @DebugMetadata(c = "app.chalo.productactivation.domain.GetActivationProductDataUseCase$invoke$$inlined$map$7$2", f = "GetActivationProductDataUseCase.kt", l = {50}, m = "emit", v = 1)
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
                                        this.f8018a = flowCollector;
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
                                            OndcMetroTicketAppModel ondcMetroTicketAppModel = (OndcMetroTicketAppModel) obj;
                                            ActivationProductData.ONDCMetroTicketActivation oNDCMetroTicketActivation = ondcMetroTicketAppModel != null ? new ActivationProductData.ONDCMetroTicketActivation(ondcMetroTicketAppModel) : null;
                                            anonymousClass1.label = 1;
                                            if (this.f8018a.emit(oNDCMetroTicketActivation, anonymousClass1) == coroutineSingletons) {
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
                                    Object objCollect = ondcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1M.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                                }
                            };
                            break;
                        default:
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(null);
                            break;
                    }
                } else {
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(null);
                    break;
                }
                break;
            default:
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(null);
                break;
        }
        Object objCollect = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2.collect(new ProductActivationComponent$startCollectingProductData$2(productActivationComponent), this);
        if (objCollect != coroutineSingletons) {
            objCollect = unit;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : unit;
    }
}
