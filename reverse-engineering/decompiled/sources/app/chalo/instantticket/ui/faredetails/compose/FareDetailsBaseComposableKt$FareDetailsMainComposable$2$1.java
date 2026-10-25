package app.chalo.instantticket.ui.faredetails.compose;

import androidx.compose.material3.SheetState;
import app.chalo.instantticket.ui.faredetails.FareDetailsComponent;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsSideEffect;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.compose.FareDetailsBaseComposableKt$FareDetailsMainComposable$2$1", f = "FareDetailsBaseComposable.kt", l = {162}, m = "invokeSuspend", v = 1)
final class FareDetailsBaseComposableKt$FareDetailsMainComposable$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ SheetState $modalBottomSheetState;
    final /* synthetic */ FareDetailsComponent $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FareDetailsBaseComposableKt$FareDetailsMainComposable$2$1(FareDetailsComponent fareDetailsComponent, CoroutineScope coroutineScope, SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.$vm = fareDetailsComponent;
        this.$coroutineScope = coroutineScope;
        this.$modalBottomSheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FareDetailsBaseComposableKt$FareDetailsMainComposable$2$1(this.$vm, this.$coroutineScope, this.$modalBottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FareDetailsBaseComposableKt$FareDetailsMainComposable$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$vm.s0();
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final SheetState sheetState = this.$modalBottomSheetState;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.instantticket.ui.faredetails.compose.FareDetailsBaseComposableKt$FareDetailsMainComposable$2$1.1

                /* JADX INFO: renamed from: app.chalo.instantticket.ui.faredetails.compose.FareDetailsBaseComposableKt$FareDetailsMainComposable$2$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.compose.FareDetailsBaseComposableKt$FareDetailsMainComposable$2$1$1$1", f = "FareDetailsBaseComposable.kt", l = {166}, m = "invokeSuspend", v = 1)
                final class C01131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ SheetState $modalBottomSheetState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01131(SheetState sheetState, Continuation continuation) {
                        super(2, continuation);
                        this.$modalBottomSheetState = sheetState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C01131(this.$modalBottomSheetState, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C01131) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.b(obj);
                            SheetState sheetState = this.$modalBottomSheetState;
                            this.label = 1;
                            if (sheetState.hide(this) == coroutineSingletons) {
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

                /* JADX INFO: renamed from: app.chalo.instantticket.ui.faredetails.compose.FareDetailsBaseComposableKt$FareDetailsMainComposable$2$1$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.compose.FareDetailsBaseComposableKt$FareDetailsMainComposable$2$1$1$2", f = "FareDetailsBaseComposable.kt", l = {171}, m = "invokeSuspend", v = 1)
                final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ SheetState $modalBottomSheetState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(SheetState sheetState, Continuation continuation) {
                        super(2, continuation);
                        this.$modalBottomSheetState = sheetState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass2(this.$modalBottomSheetState, continuation);
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
                            SheetState sheetState = this.$modalBottomSheetState;
                            this.label = 1;
                            if (sheetState.show(this) == coroutineSingletons) {
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

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    FareDetailsSideEffect fareDetailsSideEffect = (FareDetailsSideEffect) obj2;
                    boolean zD = Intrinsics.d(fareDetailsSideEffect, FareDetailsSideEffect.HideBottomSheet.f3948a);
                    CoroutineScope coroutineScope2 = coroutineScope;
                    SheetState sheetState2 = sheetState;
                    if (zD) {
                        BuildersKt.d(coroutineScope2, null, null, new C01131(sheetState2, null), 3);
                    } else {
                        if (!Intrinsics.d(fareDetailsSideEffect, FareDetailsSideEffect.ShowBottomSheet.f3949a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BuildersKt.d(coroutineScope2, null, null, new AnonymousClass2(sheetState2, null), 3);
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowS0.collect(flowCollector, this) == coroutineSingletons) {
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
