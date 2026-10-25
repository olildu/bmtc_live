package app.chalo.home.ui.savedplacesandrides;

import app.chalo.usercommutepreference.domain.GetCommutePreferenceSavedRidesUseCase;
import defpackage.l11;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent$handleInitializationIntent$2", f = "SavedPlacesAndRidesComponent.kt", l = {379}, m = "invokeSuspend", v = 1)
final class SavedPlacesAndRidesComponent$handleInitializationIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SavedPlacesAndRidesComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedPlacesAndRidesComponent$handleInitializationIntent$2(SavedPlacesAndRidesComponent savedPlacesAndRidesComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = savedPlacesAndRidesComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavedPlacesAndRidesComponent$handleInitializationIntent$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SavedPlacesAndRidesComponent$handleInitializationIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strH;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            GetCommutePreferenceSavedRidesUseCase getCommutePreferenceSavedRidesUseCase = this.this$0.m;
            String strM = getCommutePreferenceSavedRidesUseCase.b.m();
            Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = (strM == null || (strH = getCommutePreferenceSavedRidesUseCase.c.h()) == null) ? new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a) : getCommutePreferenceSavedRidesUseCase.f10291a.a(strM, strH);
            final SavedPlacesAndRidesComponent savedPlacesAndRidesComponent = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent$handleInitializationIntent$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    savedPlacesAndRidesComponent.E0(new l11((List) obj2, 5));
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2.collect(flowCollector, this) == coroutineSingletons) {
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
