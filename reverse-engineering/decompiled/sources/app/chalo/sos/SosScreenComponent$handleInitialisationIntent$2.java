package app.chalo.sos;

import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.sos.feature.SosContactsFeatureImpl$getAllSosContact$$inlined$map$1;
import app.chalo.sos.feature.SosContactsFeatureImpl$getSosMessage$$inlined$map$1;
import app.chalo.sos.official.GetOfficialSosContactsUseCase;
import defpackage.f31;
import defpackage.l11;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2", f = "SosScreenComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class SosScreenComponent$handleInitialisationIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SosScreenComponent this$0;

    /* JADX INFO: renamed from: app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2$1", f = "SosScreenComponent.kt", l = {83}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SosScreenComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SosScreenComponent sosScreenComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = sosScreenComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                SosContactsFeatureImpl$getAllSosContact$$inlined$map$1 sosContactsFeatureImpl$getAllSosContact$$inlined$map$1C = this.this$0.k.c();
                final SosScreenComponent sosScreenComponent = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.sos.SosScreenComponent.handleInitialisationIntent.2.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        sosScreenComponent.E0(new l11((List) obj2, 7));
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (sosContactsFeatureImpl$getAllSosContact$$inlined$map$1C.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2$2", f = "SosScreenComponent.kt", l = {93}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SosScreenComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SosScreenComponent sosScreenComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = sosScreenComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                SosContactsFeatureImpl$getSosMessage$$inlined$map$1 sosContactsFeatureImpl$getSosMessage$$inlined$map$1H = this.this$0.k.h();
                final SosScreenComponent sosScreenComponent = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.sos.SosScreenComponent.handleInitialisationIntent.2.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        sosScreenComponent.E0(new f31((String) obj2, 6));
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (sosContactsFeatureImpl$getSosMessage$$inlined$map$1H.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2$3", f = "SosScreenComponent.kt", l = {106}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SosScreenComponent this$0;

        /* JADX INFO: renamed from: app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2$3$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "cityId", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2$3$2", f = "SosScreenComponent.kt", l = {107}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SosScreenComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SosScreenComponent sosScreenComponent, Continuation continuation) {
                super(2, continuation);
                this.this$0 = sosScreenComponent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    String str = (String) this.L$0;
                    GetOfficialSosContactsUseCase getOfficialSosContactsUseCase = this.this$0.v;
                    this.label = 1;
                    obj = getOfficialSosContactsUseCase.c(str, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                this.this$0.E0(new l11((List) obj, 8));
                return Unit.f17538a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SosScreenComponent sosScreenComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = sosScreenComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                final StateFlow e = this.this$0.u.getE();
                Flow flowM = FlowKt.m(new Flow<String>() { // from class: app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2$3$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f9405a;

                        /* JADX INFO: renamed from: app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.sos.SosScreenComponent$handleInitialisationIntent$2$3$invokeSuspend$$inlined$map$1$2", f = "SosScreenComponent.kt", l = {50}, m = "emit", v = 1)
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
                            this.f9405a = flowCollector;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            String lowerCase;
                            String str;
                            String string;
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
                                CityAppModel cityAppModel = (CityAppModel) obj;
                                if (cityAppModel == null || (str = cityAppModel.f8854a) == null || (string = StringsKt.u0(str).toString()) == null) {
                                    lowerCase = null;
                                } else {
                                    lowerCase = string.toLowerCase(Locale.ROOT);
                                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                                }
                                if (lowerCase == null) {
                                    lowerCase = "";
                                }
                                anonymousClass1.label = 1;
                                if (this.f9405a.emit(lowerCase, anonymousClass1) == coroutineSingletons) {
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
                        Object objCollect = e.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.j(flowM, anonymousClass2, this) == coroutineSingletons) {
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
    public SosScreenComponent$handleInitialisationIntent$2(SosScreenComponent sosScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sosScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SosScreenComponent$handleInitialisationIntent$2 sosScreenComponent$handleInitialisationIntent$2 = new SosScreenComponent$handleInitialisationIntent$2(this.this$0, continuation);
        sosScreenComponent$handleInitialisationIntent$2.L$0 = obj;
        return sosScreenComponent$handleInitialisationIntent$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SosScreenComponent$handleInitialisationIntent$2 sosScreenComponent$handleInitialisationIntent$2 = (SosScreenComponent$handleInitialisationIntent$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        sosScreenComponent$handleInitialisationIntent$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        SosScreenComponent sosScreenComponent = this.this$0;
        sosScreenComponent.w = BuildersKt.d(coroutineScope, null, null, new AnonymousClass1(sosScreenComponent, null), 3);
        SosScreenComponent sosScreenComponent2 = this.this$0;
        sosScreenComponent2.x = BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(sosScreenComponent2, null), 3);
        SosScreenComponent sosScreenComponent3 = this.this$0;
        sosScreenComponent3.y = BuildersKt.d(coroutineScope, null, null, new AnonymousClass3(sosScreenComponent3, null), 3);
        return Unit.f17538a;
    }
}
