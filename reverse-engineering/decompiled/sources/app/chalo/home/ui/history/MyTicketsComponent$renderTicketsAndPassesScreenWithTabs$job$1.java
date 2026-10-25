package app.chalo.home.ui.history;

import app.chalo.home.domain.ChaloUserBookingType;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1", f = "MyTicketsComponent.kt", l = {690}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "currentlySelectedTab", "Lapp/chalo/home/ui/history/TicketsPassesTabType;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1$1", f = "MyTicketsComponent.kt", l = {697, 714}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<TicketsPassesTabType, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MyTicketsComponent this$0;

        /* JADX INFO: renamed from: app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "list", "", "Lapp/chalo/home/domain/ChaloUserBookingType;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1$1$2", f = "MyTicketsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends ChaloUserBookingType>, Continuation<? super Unit>, Object> {
            final /* synthetic */ TicketsPassesTabType $currentlySelectedTab;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MyTicketsComponent this$0;

            /* JADX INFO: renamed from: app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1$1$2$WhenMappings */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f3402a;

                static {
                    int[] iArr = new int[TicketsPassesTabType.values().length];
                    try {
                        iArr[TicketsPassesTabType.ACTIVE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TicketsPassesTabType.EXPIRED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f3402a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TicketsPassesTabType ticketsPassesTabType, MyTicketsComponent myTicketsComponent, Continuation continuation) {
                super(2, continuation);
                this.$currentlySelectedTab = ticketsPassesTabType;
                this.this$0 = myTicketsComponent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentlySelectedTab, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((List) obj, (Continuation) obj2);
                Unit unit = Unit.f17538a;
                anonymousClass2.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                List list = (List) this.L$0;
                int i = WhenMappings.f3402a[this.$currentlySelectedTab.ordinal()];
                if (i == 1) {
                    MyTicketsComponent myTicketsComponent = this.this$0;
                    myTicketsComponent.getClass();
                    myTicketsComponent.w0(new MyTicketsComponent$handleActiveTabRendering$1(myTicketsComponent, list, null));
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MyTicketsComponent myTicketsComponent2 = this.this$0;
                    myTicketsComponent2.getClass();
                    myTicketsComponent2.w0(new MyTicketsComponent$handleExpiredTabRendering$1(myTicketsComponent2, list, null));
                }
                return Unit.f17538a;
            }
        }

        /* JADX INFO: renamed from: app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3403a;

            static {
                int[] iArr = new int[TicketsPassesTabType.values().length];
                try {
                    iArr[TicketsPassesTabType.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TicketsPassesTabType.EXPIRED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f3403a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MyTicketsComponent myTicketsComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = myTicketsComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((TicketsPassesTabType) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.j(r4, r3, r6) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                kotlin.ResultKt.b(r7)
                goto L98
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                java.lang.Object r1 = r6.L$0
                app.chalo.home.ui.history.TicketsPassesTabType r1 = (app.chalo.home.ui.history.TicketsPassesTabType) r1
                kotlin.ResultKt.b(r7)
                goto L54
            L21:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                app.chalo.home.ui.history.TicketsPassesTabType r1 = (app.chalo.home.ui.history.TicketsPassesTabType) r1
                int[] r7 = app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1.AnonymousClass1.WhenMappings.f3403a
                int r4 = r1.ordinal()
                r7 = r7[r4]
                if (r7 == r3) goto L3e
                if (r7 != r2) goto L38
                app.chalo.models.UserBookingsStatusType r7 = app.chalo.models.UserBookingsStatusType.EXPIRED
                goto L40
            L38:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            L3e:
                app.chalo.models.UserBookingsStatusType r7 = app.chalo.models.UserBookingsStatusType.ACTIVE
            L40:
                app.chalo.home.ui.history.MyTicketsComponent r4 = r6.this$0
                app.chalo.home.domain.GetAllRequestedBookedProductsUseCase r4 = r4.l
                java.util.Set r5 = app.chalo.home.ui.history.MyTicketsComponent.g1(r3)
                r6.L$0 = r1
                r6.label = r3
                r3 = 4
                java.lang.Object r7 = app.chalo.home.domain.GetAllRequestedBookedProductsUseCase.l(r4, r5, r7, r6, r3)
                if (r7 != r0) goto L54
                goto L97
            L54:
                app.chalo.utils.ChaloUseCaseResult r7 = (app.chalo.utils.ChaloUseCaseResult) r7
                app.chalo.home.ui.history.MyTicketsComponent r3 = r6.this$0
                boolean r4 = r7 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
                if (r4 == 0) goto L64
                kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.f17557a
                kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 r4 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
                r4.<init>(r7)
                goto L6f
            L64:
                boolean r4 = r7 instanceof app.chalo.utils.ChaloUseCaseResult.Success
                if (r4 == 0) goto L9b
                app.chalo.utils.ChaloUseCaseResult$Success r7 = (app.chalo.utils.ChaloUseCaseResult.Success) r7
                java.lang.Object r7 = r7.f10419a
                r4 = r7
                kotlinx.coroutines.flow.Flow r4 = (kotlinx.coroutines.flow.Flow) r4
            L6f:
                kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.m(r4)
                r3.getClass()
                app.chalo.home.ui.history.MyTicketsComponent$checkForStatus$1 r4 = new app.chalo.home.ui.history.MyTicketsComponent$checkForStatus$1
                r5 = 0
                r4.<init>(r1, r3, r5)
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r3 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
                r3.<init>(r7, r4)
                app.chalo.home.ui.history.MyTicketsComponent r7 = r6.this$0
                app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1$1$invokeSuspend$$inlined$map$1 r4 = new app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1$1$invokeSuspend$$inlined$map$1
                r4.<init>()
                app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1$1$2 r3 = new app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1$1$2
                r3.<init>(r1, r7, r5)
                r6.L$0 = r5
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.j(r4, r3, r6)
                if (r7 != r0) goto L98
            L97:
                return r0
            L98:
                kotlin.Unit r7 = kotlin.Unit.f17538a
                return r7
            L9b:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1(MyTicketsComponent myTicketsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MyTicketsComponent myTicketsComponent = this.this$0;
            StateFlow stateFlow = myTicketsComponent.e0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(myTicketsComponent, null);
            this.label = 1;
            if (FlowKt.j(stateFlow, anonymousClass1, this) == coroutineSingletons) {
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
