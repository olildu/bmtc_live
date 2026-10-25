package app.chalo.metro.ui.landing;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.dd0;
import defpackage.t60;
import defpackage.xg0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleInitialisationIntent$1", f = "MetroLandingScreenComponent.kt", l = {626}, m = "invokeSuspend", v = 1)
final class MetroLandingScreenComponent$handleInitialisationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MetroLandingScreenViewIntent.InitialisationIntent $intent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MetroLandingScreenComponent this$0;

    /* JADX INFO: renamed from: app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleInitialisationIntent$1$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleInitialisationIntent$1$4", f = "MetroLandingScreenComponent.kt", l = {665}, m = "invokeSuspend", v = 1)
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ MetroLandingScreenComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(MetroLandingScreenComponent metroLandingScreenComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = metroLandingScreenComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                MetroLandingScreenComponent metroLandingScreenComponent = this.this$0;
                this.label = 1;
                if (metroLandingScreenComponent.L0(this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleInitialisationIntent$1$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleInitialisationIntent$1$5", f = "MetroLandingScreenComponent.kt", l = {670}, m = "invokeSuspend", v = 1)
    final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ MetroLandingScreenComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MetroLandingScreenComponent metroLandingScreenComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = metroLandingScreenComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objE;
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
            MetroLandingScreenComponent metroLandingScreenComponent = this.this$0;
            this.label = 1;
            MetroLandingScreenHelper metroLandingScreenHelper = metroLandingScreenComponent.C;
            if (metroLandingScreenHelper == null || (objE = metroLandingScreenHelper.e(this)) != coroutineSingletons) {
                objE = unit;
            }
            return objE == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    /* JADX INFO: renamed from: app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleInitialisationIntent$1$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleInitialisationIntent$1$6", f = "MetroLandingScreenComponent.kt", l = {674}, m = "invokeSuspend", v = 1)
    final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MetroLandingScreenHelper $metroLandingScreenHelperObj;
        int label;
        final /* synthetic */ MetroLandingScreenComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(MetroLandingScreenHelper metroLandingScreenHelper, MetroLandingScreenComponent metroLandingScreenComponent, Continuation continuation) {
            super(2, continuation);
            this.$metroLandingScreenHelperObj = metroLandingScreenHelper;
            this.this$0 = metroLandingScreenComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass6(this.$metroLandingScreenHelperObj, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow state = this.$metroLandingScreenHelperObj.getState();
                final MetroLandingScreenComponent metroLandingScreenComponent = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.metro.ui.landing.MetroLandingScreenComponent.handleInitialisationIntent.1.6.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        metroLandingScreenComponent.E0(new dd0((MetroLandingScreenHelperState) obj2, 28));
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (state.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleInitialisationIntent$1$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleInitialisationIntent$1$7", f = "MetroLandingScreenComponent.kt", l = {685}, m = "invokeSuspend", v = 1)
    final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MetroLandingScreenHelper $metroLandingScreenHelperObj;
        int label;
        final /* synthetic */ MetroLandingScreenComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(MetroLandingScreenHelper metroLandingScreenHelper, MetroLandingScreenComponent metroLandingScreenComponent, Continuation continuation) {
            super(2, continuation);
            this.$metroLandingScreenHelperObj = metroLandingScreenHelper;
            this.this$0 = metroLandingScreenComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass7(this.$metroLandingScreenHelperObj, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                Flow flowB = this.$metroLandingScreenHelperObj.b();
                final MetroLandingScreenComponent metroLandingScreenComponent = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.metro.ui.landing.MetroLandingScreenComponent.handleInitialisationIntent.1.7.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        MetroLandingScreenHelperSideEffect metroLandingScreenHelperSideEffect = (MetroLandingScreenHelperSideEffect) obj2;
                        boolean z = metroLandingScreenHelperSideEffect instanceof MetroLandingScreenHelperSideEffect.TriggerLoadingDialog;
                        MetroLandingScreenComponent metroLandingScreenComponent2 = metroLandingScreenComponent;
                        if (z) {
                            metroLandingScreenComponent2.E0(new dd0(metroLandingScreenHelperSideEffect, 29));
                        } else {
                            if (!(metroLandingScreenHelperSideEffect instanceof MetroLandingScreenHelperSideEffect.ShowToastMessage)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            MetroLandingScreenComponent.Q0(metroLandingScreenComponent2, ((MetroLandingScreenHelperSideEffect.ShowToastMessage) metroLandingScreenHelperSideEffect).f5490a);
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (flowB.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroLandingScreenComponent$handleInitialisationIntent$1(MetroLandingScreenComponent metroLandingScreenComponent, MetroLandingScreenViewIntent.InitialisationIntent initialisationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = metroLandingScreenComponent;
        this.$intent = initialisationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MetroLandingScreenComponent$handleInitialisationIntent$1 metroLandingScreenComponent$handleInitialisationIntent$1 = new MetroLandingScreenComponent$handleInitialisationIntent$1(this.this$0, this.$intent, continuation);
        metroLandingScreenComponent$handleInitialisationIntent$1.L$0 = obj;
        return metroLandingScreenComponent$handleInitialisationIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MetroLandingScreenComponent$handleInitialisationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        MetroLandingScreenViewIntent.InitialisationIntent initialisationIntent;
        StopAppModel stopAppModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            this.this$0.E0(new xg0(26));
            MetroLandingScreenHelperFactory metroLandingScreenHelperFactory = this.this$0.t;
            MetroLandingScreenRestoredState metroLandingScreenRestoredState = this.$intent.f5496a;
            Boolean bool = metroLandingScreenRestoredState != null ? metroLandingScreenRestoredState.c : null;
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object objA = metroLandingScreenHelperFactory.a(bool, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        }
        MetroLandingScreenHelper metroLandingScreenHelper = (MetroLandingScreenHelper) obj;
        CoroutineScopeKt.d(coroutineScope);
        final MetroLandingScreenComponent metroLandingScreenComponent = this.this$0;
        metroLandingScreenComponent.C = metroLandingScreenHelper;
        boolean zC = metroLandingScreenHelper.c();
        ContextScope contextScope = metroLandingScreenComponent.j;
        ComponentContext componentContext = metroLandingScreenComponent.f5983a;
        if (zC) {
            RouteSearchResultStateManager routeSearchResultStateManager = metroLandingScreenComponent.o;
            StateKeeper b = componentContext.getB();
            ResultStateKeeperMeta.Companion companion = ResultStateKeeperMeta.INSTANCE;
            KSerializer<ResultStateKeeperMeta> kSerializerSerializer = companion.serializer();
            KSerializer<ResultStateKeeperMeta> kSerializerSerializer2 = companion.serializer();
            final int i2 = 0;
            ResultStateRecoveredData resultStateRecoveredDataA = routeSearchResultStateManager.a("metro_landing_screen_search_result_sm", b, kSerializerSerializer, kSerializerSerializer2, new Function0() { // from class: ni0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            String str = metroLandingScreenComponent.z;
                            if (str != null) {
                                return new ResultStateKeeperMeta(str);
                            }
                            return null;
                        default:
                            String str2 = metroLandingScreenComponent.z;
                            if (str2 != null) {
                                return new ResultStateKeeperMeta(str2);
                            }
                            return null;
                    }
                }
            });
            if (resultStateRecoveredDataA != null) {
                metroLandingScreenComponent.y = BuildersKt.d(contextScope, null, null, new MetroLandingScreenComponent$recoverResultFromSearchStateManager$1$1(metroLandingScreenComponent, resultStateRecoveredDataA, null), 3);
            }
        } else {
            if (zC) {
                throw new NoWhenBranchMatchedException();
            }
            UniversalSearchResultStateManager universalSearchResultStateManager = metroLandingScreenComponent.p;
            StateKeeper b2 = componentContext.getB();
            ResultStateKeeperMeta.Companion companion2 = ResultStateKeeperMeta.INSTANCE;
            KSerializer<ResultStateKeeperMeta> kSerializerSerializer3 = companion2.serializer();
            KSerializer<ResultStateKeeperMeta> kSerializerSerializer4 = companion2.serializer();
            final int i3 = 1;
            ResultStateRecoveredData resultStateRecoveredDataA2 = universalSearchResultStateManager.a("metro_landing_screen_search_result_sm", b2, kSerializerSerializer3, kSerializerSerializer4, new Function0() { // from class: ni0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            String str = metroLandingScreenComponent.z;
                            if (str != null) {
                                return new ResultStateKeeperMeta(str);
                            }
                            return null;
                        default:
                            String str2 = metroLandingScreenComponent.z;
                            if (str2 != null) {
                                return new ResultStateKeeperMeta(str2);
                            }
                            return null;
                    }
                }
            });
            if (resultStateRecoveredDataA2 != null) {
                metroLandingScreenComponent.y = BuildersKt.d(contextScope, null, null, new MetroLandingScreenComponent$recoverResultFromSearchStateManager$2$1(metroLandingScreenComponent, resultStateRecoveredDataA2, null), 3);
            }
        }
        this.this$0.E0(new dd0(metroLandingScreenHelper, 27));
        if (metroLandingScreenHelper.c() || (stopAppModel = (initialisationIntent = this.$intent).b) == null || initialisationIntent.c == null) {
            MetroLandingScreenComponent metroLandingScreenComponent2 = this.this$0;
            BuildersKt.d(metroLandingScreenComponent2.j, null, null, new AnonymousClass4(metroLandingScreenComponent2, null), 3);
        } else {
            StopAppModel stopAppModelA = MetroLandingScreenComponentKt.a(stopAppModel);
            StopAppModel stopAppModelA2 = MetroLandingScreenComponentKt.a(this.$intent.c);
            if (stopAppModelA == null || stopAppModelA2 == null || Intrinsics.d(stopAppModelA.f1727a, stopAppModelA2.f1727a)) {
                MetroLandingScreenComponent metroLandingScreenComponent3 = this.this$0;
                BuildersKt.d(metroLandingScreenComponent3.j, null, null, new AnonymousClass4(metroLandingScreenComponent3, null), 3);
            } else {
                this.this$0.E0(new t60(25, stopAppModelA, stopAppModelA2));
                this.this$0.N0();
            }
        }
        MetroLandingScreenComponent metroLandingScreenComponent4 = this.this$0;
        BuildersKt.d(metroLandingScreenComponent4.j, null, null, new AnonymousClass5(metroLandingScreenComponent4, null), 3);
        MetroLandingScreenComponent metroLandingScreenComponent5 = this.this$0;
        BuildersKt.d(metroLandingScreenComponent5.j, null, null, new AnonymousClass6(metroLandingScreenHelper, metroLandingScreenComponent5, null), 3);
        MetroLandingScreenComponent metroLandingScreenComponent6 = this.this$0;
        BuildersKt.d(metroLandingScreenComponent6.j, null, null, new AnonymousClass7(metroLandingScreenHelper, metroLandingScreenComponent6, null), 3);
        return Unit.f17538a;
    }
}
