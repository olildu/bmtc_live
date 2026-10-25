package app.chalo.compose.components.chalomap;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.SnapshotStateKt;
import app.chalo.utils.ChaloUseCaseResult;
import com.google.maps.android.compose.CameraPositionState;
import defpackage.fi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.compose.components.chalomap.ChaloMap_androidKt$ChaloMap$8$1", f = "ChaloMap.android.kt", l = {195}, m = "invokeSuspend", v = 1)
final class ChaloMap_androidKt$ChaloMap$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CameraPositionState $cameraPositionState;
    final /* synthetic */ MutableFloatState $mapOverlayRadius$delegate;
    final /* synthetic */ Function1<ChaloMapCameraPositionStateData, Unit> $onCameraPositionStateChange;
    final /* synthetic */ ChaloMapOverlayConfig $overlayConfig;
    final /* synthetic */ ProjectionUtilsAndroid $projectionUtils;
    int label;

    /* JADX INFO: renamed from: app.chalo.compose.components.chalomap.ChaloMap_androidKt$ChaloMap$8$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/compose/components/chalomap/ChaloMapCameraPositionStateData;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.compose.components.chalomap.ChaloMap_androidKt$ChaloMap$8$1$2", f = "ChaloMap.android.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<ChaloMapCameraPositionStateData, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableFloatState $mapOverlayRadius$delegate;
        final /* synthetic */ ChaloMapOverlayConfig $overlayConfig;
        final /* synthetic */ ProjectionUtilsAndroid $projectionUtils;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChaloMapOverlayConfig chaloMapOverlayConfig, ProjectionUtilsAndroid projectionUtilsAndroid, MutableFloatState mutableFloatState, Continuation continuation) {
            super(2, continuation);
            this.$overlayConfig = chaloMapOverlayConfig;
            this.$projectionUtils = projectionUtilsAndroid;
            this.$mapOverlayRadius$delegate = mutableFloatState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$overlayConfig, this.$projectionUtils, this.$mapOverlayRadius$delegate, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((ChaloMapCameraPositionStateData) obj, (Continuation) obj2);
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
            ChaloMapCameraPositionStateData chaloMapCameraPositionStateData = (ChaloMapCameraPositionStateData) this.L$0;
            ChaloMapOverlayConfig chaloMapOverlayConfig = this.$overlayConfig;
            if (chaloMapOverlayConfig instanceof ChaloMapOverlayConfig.AdaptiveRadius) {
                MapProjection mapProjection = chaloMapCameraPositionStateData.c;
                if (mapProjection != null) {
                    ProjectionUtilsAndroid projectionUtilsAndroid = this.$projectionUtils;
                    MutableFloatState mutableFloatState = this.$mapOverlayRadius$delegate;
                    float f = ((ChaloMapOverlayConfig.AdaptiveRadius) chaloMapOverlayConfig).d;
                    projectionUtilsAndroid.getClass();
                    ProjectionUtilsAndroid.c(mapProjection, f);
                    ChaloUseCaseResult chaloUseCaseResultC = ProjectionUtilsAndroid.c(mapProjection, f);
                    if (!(chaloUseCaseResultC instanceof ChaloUseCaseResult.Failure)) {
                        if (!(chaloUseCaseResultC instanceof ChaloUseCaseResult.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mutableFloatState.setFloatValue(((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResultC).f10419a).intValue());
                    }
                }
            } else if (!(chaloMapOverlayConfig instanceof ChaloMapOverlayConfig.FixedRadius) && chaloMapOverlayConfig != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloMap_androidKt$ChaloMap$8$1(Function1 function1, ChaloMapOverlayConfig chaloMapOverlayConfig, CameraPositionState cameraPositionState, ProjectionUtilsAndroid projectionUtilsAndroid, MutableFloatState mutableFloatState, Continuation continuation) {
        super(2, continuation);
        this.$onCameraPositionStateChange = function1;
        this.$overlayConfig = chaloMapOverlayConfig;
        this.$cameraPositionState = cameraPositionState;
        this.$projectionUtils = projectionUtilsAndroid;
        this.$mapOverlayRadius$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloMap_androidKt$ChaloMap$8$1(this.$onCameraPositionStateChange, this.$overlayConfig, this.$cameraPositionState, this.$projectionUtils, this.$mapOverlayRadius$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloMap_androidKt$ChaloMap$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.$onCameraPositionStateChange != null || (this.$overlayConfig instanceof ChaloMapOverlayConfig.AdaptiveRadius)) {
                Flow flowL = FlowKt.l(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(FlowKt.m(SnapshotStateKt.snapshotFlow(new fi(this.$cameraPositionState, 7))), new AnonymousClass2(this.$overlayConfig, this.$projectionUtils, this.$mapOverlayRadius$delegate, null)), 100L);
                final Function1<ChaloMapCameraPositionStateData, Unit> function1 = this.$onCameraPositionStateChange;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.compose.components.chalomap.ChaloMap_androidKt$ChaloMap$8$1.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        ChaloMapCameraPositionStateData chaloMapCameraPositionStateData = (ChaloMapCameraPositionStateData) obj2;
                        Function1 function2 = function1;
                        if (function2 != null) {
                            function2.invoke(chaloMapCameraPositionStateData);
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (flowL.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
