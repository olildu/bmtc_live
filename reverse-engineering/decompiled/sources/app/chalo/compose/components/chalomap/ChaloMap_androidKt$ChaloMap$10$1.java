package app.chalo.compose.components.chalomap;

import com.google.maps.android.compose.CameraPositionState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.compose.components.chalomap.ChaloMap_androidKt$ChaloMap$10$1", f = "ChaloMap.android.kt", l = {215}, m = "invokeSuspend", v = 1)
final class ChaloMap_androidKt$ChaloMap$10$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CameraPositionState $cameraPositionState;
    final /* synthetic */ MapCameraViewState $mapCameraViewState;
    final /* synthetic */ Function1<MapCameraUpdate, Unit> $onMapCameraUpdateLoaded;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloMap_androidKt$ChaloMap$10$1(CameraPositionState cameraPositionState, MapCameraViewState mapCameraViewState, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$cameraPositionState = cameraPositionState;
        this.$mapCameraViewState = mapCameraViewState;
        this.$onMapCameraUpdateLoaded = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloMap_androidKt$ChaloMap$10$1(this.$cameraPositionState, this.$mapCameraViewState, this.$onMapCameraUpdateLoaded, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloMap_androidKt$ChaloMap$10$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CameraPositionState cameraPositionState = this.$cameraPositionState;
            MapCameraViewState mapCameraViewState = this.$mapCameraViewState;
            Function1<MapCameraUpdate, Unit> function1 = this.$onMapCameraUpdateLoaded;
            this.label = 1;
            if (ChaloMap_androidKt.h(cameraPositionState, mapCameraViewState, function1, this) == coroutineSingletons) {
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
