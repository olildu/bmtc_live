package app.chalo.metro.ui.regular;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.metro.ui.landing.PickStopRequestType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$handleOnFromStationClicked$1", f = "StopBasedMetroLandingScreenComponent.kt", l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m = "invokeSuspend", v = 1)
final class StopBasedMetroLandingScreenComponent$handleOnFromStationClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StopBasedMetroLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedMetroLandingScreenComponent$handleOnFromStationClicked$1(StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopBasedMetroLandingScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBasedMetroLandingScreenComponent$handleOnFromStationClicked$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBasedMetroLandingScreenComponent$handleOnFromStationClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent = this.this$0;
            this.label = 1;
            if (StopBasedMetroLandingScreenComponent.G0(stopBasedMetroLandingScreenComponent, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        List list = ((StopBasedMetroLandingScreenDataState) this.this$0.f.getValue()).g;
        StopAppModel stopAppModel = ((StopBasedMetroLandingScreenDataState) this.this$0.f.getValue()).j;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.d(((StopAppModel) obj2).f1727a, stopAppModel != null ? stopAppModel.f1727a : null)) {
                arrayList.add(obj2);
            }
        }
        StopBasedMetroLandingScreenComponent.F0(this.this$0, arrayList, PickStopRequestType.FROM);
        return Unit.f17538a;
    }
}
