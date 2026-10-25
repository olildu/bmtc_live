package app.chalo.home.ui.home;

import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement$$inlined$map$1;
import app.chalo.premiumbus.prebookedtickets.domain.GetPremiumReserveTicketsWithPendingAckUseCase;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import defpackage.e40;
import defpackage.u60;
import java.util.List;
import java.util.Locale;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3", f = "HomeScreenComponent.kt", l = {1243}, m = "invokeSuspend", v = 1)
final class HomeScreenComponent$updatePremiumReserveTicketsList$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $todayStartTimestamp;
    int label;
    final /* synthetic */ HomeScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenComponent$updatePremiumReserveTicketsList$3(HomeScreenComponent homeScreenComponent, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeScreenComponent;
        this.$todayStartTimestamp = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeScreenComponent$updatePremiumReserveTicketsList$3(this.this$0, this.$todayStartTimestamp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeScreenComponent$updatePremiumReserveTicketsList$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        final Flow<List<? extends PremiumReserveTicketAppModel>> flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final GetPremiumReserveTicketsWithPendingAckUseCase getPremiumReserveTicketsWithPendingAckUseCase = this.this$0.v;
            long j = this.$todayStartTimestamp;
            if (getPremiumReserveTicketsWithPendingAckUseCase.d.a()) {
                PremiumBusRepository premiumBusRepository = getPremiumReserveTicketsWithPendingAckUseCase.f7312a;
                CityAppModel cityAppModel = (CityAppModel) getPremiumReserveTicketsWithPendingAckUseCase.b.getE().getValue();
                if (cityAppModel == null || (str = cityAppModel.f8854a) == null) {
                    lowerCase = "";
                } else {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                }
                String strM = getPremiumReserveTicketsWithPendingAckUseCase.c.m();
                final PremiumBusRepositoryImpl$getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement$$inlined$map$1 premiumBusRepositoryImpl$getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement$$inlined$map$1A = premiumBusRepository.a(j, lowerCase, strM != null ? strM : "");
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<List<? extends PremiumReserveTicketAppModel>>() { // from class: app.chalo.premiumbus.prebookedtickets.domain.GetPremiumReserveTicketsWithPendingAckUseCase$invoke$$inlined$map$1

                    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.domain.GetPremiumReserveTicketsWithPendingAckUseCase$invoke$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f7314a;
                        public final /* synthetic */ GetPremiumReserveTicketsWithPendingAckUseCase b;

                        /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.domain.GetPremiumReserveTicketsWithPendingAckUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.domain.GetPremiumReserveTicketsWithPendingAckUseCase$invoke$$inlined$map$1$2", f = "GetPremiumReserveTicketsWithPendingAckUseCase.kt", l = {66, 50}, m = "emit", v = 1)
                        public final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
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

                        public AnonymousClass2(FlowCollector flowCollector, GetPremiumReserveTicketsWithPendingAckUseCase getPremiumReserveTicketsWithPendingAckUseCase) {
                            this.f7314a = flowCollector;
                            this.b = getPremiumReserveTicketsWithPendingAckUseCase;
                        }

                        /* JADX WARN: Code duplicated, block: B:25:0x0095  */
                        /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
                        /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
                        /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b2 -> B:30:0x00b5). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                            /*
                                Method dump skipped, instruction units count: 233
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.domain.GetPremiumReserveTicketsWithPendingAckUseCase$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = premiumBusRepositoryImpl$getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement$$inlined$map$1A.collect(new AnonymousClass2(flowCollector, getPremiumReserveTicketsWithPendingAckUseCase), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                    }
                };
            } else {
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
            }
            final Flow flowM = FlowKt.m(new Flow<PremiumReserveTicketAppModel>() { // from class: app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f3549a;

                    /* JADX INFO: renamed from: app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$1$2", f = "HomeScreenComponent.kt", l = {50}, m = "emit", v = 1)
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
                        this.f3549a = flowCollector;
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
                            Object objH = CollectionsKt.H((List) obj);
                            anonymousClass1.label = 1;
                            if (this.f3549a.emit(objH, anonymousClass1) == coroutineSingletons) {
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
                    Object objCollect = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            });
            final HomeScreenComponent homeScreenComponent = this.this$0;
            Flow<PremiumBusInAppCommunicationBottomSheetData> flow = new Flow<PremiumBusInAppCommunicationBottomSheetData>() { // from class: app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$2

                /* JADX INFO: renamed from: app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f3551a;
                    public final /* synthetic */ HomeScreenComponent b;

                    /* JADX INFO: renamed from: app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$2$2", f = "HomeScreenComponent.kt", l = {52, 50}, m = "emit", v = 1)
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

                    public AnonymousClass2(FlowCollector flowCollector, HomeScreenComponent homeScreenComponent) {
                        this.f3551a = flowCollector;
                        this.b = homeScreenComponent;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
                    
                        if (r9.emit(r8, r0) == r1) goto L26;
                     */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                        /*
                            r7 = this;
                            boolean r0 = r9 instanceof app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r9
                            app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$2$2$1 r0 = (app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$2$2$1 r0 = new app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$2$2$1
                            r0.<init>(r9)
                        L18:
                            java.lang.Object r9 = r0.result
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r2 = r0.label
                            r3 = 0
                            r4 = 2
                            r5 = 1
                            if (r2 == 0) goto L3b
                            if (r2 == r5) goto L33
                            if (r2 != r4) goto L2b
                            kotlin.ResultKt.b(r9)
                            goto L68
                        L2b:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r9)
                            throw r8
                        L33:
                            java.lang.Object r8 = r0.L$0
                            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                            kotlin.ResultKt.b(r9)
                            goto L56
                        L3b:
                            kotlin.ResultKt.b(r9)
                            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r8 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r8
                            kotlinx.coroutines.flow.FlowCollector r9 = r7.f3551a
                            if (r8 == 0) goto L5c
                            app.chalo.home.ui.home.HomeScreenComponent r2 = r7.b
                            app.chalo.premiumbus.prebookedtickets.domain.PremiumBusInAppCommunicationBottomSheetDataUseCase r2 = r2.t
                            r0.L$0 = r9
                            r0.label = r5
                            java.lang.Object r8 = r2.a(r8, r0)
                            if (r8 != r1) goto L53
                            goto L67
                        L53:
                            r6 = r9
                            r9 = r8
                            r8 = r6
                        L56:
                            app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData r9 = (app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData) r9
                            r6 = r9
                            r9 = r8
                            r8 = r6
                            goto L5d
                        L5c:
                            r8 = r3
                        L5d:
                            r0.L$0 = r3
                            r0.label = r4
                            java.lang.Object r8 = r9.emit(r8, r0)
                            if (r8 != r1) goto L68
                        L67:
                            return r1
                        L68:
                            kotlin.Unit r8 = kotlin.Unit.f17538a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3$invokeSuspend$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flowM.collect(new AnonymousClass2(flowCollector, homeScreenComponent), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$3.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData = (PremiumBusInAppCommunicationBottomSheetData) obj2;
                    HomeScreenComponent homeScreenComponent2 = homeScreenComponent;
                    if (premiumBusInAppCommunicationBottomSheetData == null) {
                        homeScreenComponent2.E0(new u60(19));
                        homeScreenComponent2.r0(HomeScreenSideEffect.HideBottomSheet.f3555a);
                    } else {
                        homeScreenComponent2.getClass();
                        homeScreenComponent2.E0(new e40(premiumBusInAppCommunicationBottomSheetData, 13));
                        homeScreenComponent2.r0(HomeScreenSideEffect.ShowBottomSheet.f3556a);
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
