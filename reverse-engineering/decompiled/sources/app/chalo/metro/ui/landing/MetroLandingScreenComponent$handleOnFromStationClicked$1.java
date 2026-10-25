package app.chalo.metro.ui.landing;

import app.chalo.citydata.data.model.app.StopAppModel;
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
@DebugMetadata(c = "app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleOnFromStationClicked$1", f = "MetroLandingScreenComponent.kt", l = {709, 718}, m = "invokeSuspend", v = 1)
final class MetroLandingScreenComponent$handleOnFromStationClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MetroLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroLandingScreenComponent$handleOnFromStationClicked$1(MetroLandingScreenComponent metroLandingScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = metroLandingScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MetroLandingScreenComponent$handleOnFromStationClicked$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MetroLandingScreenComponent$handleOnFromStationClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            MetroLandingScreenComponent metroLandingScreenComponent = this.this$0;
            this.label = 1;
            obj = MetroLandingScreenComponent.G0(metroLandingScreenComponent, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        if (((Boolean) obj).booleanValue()) {
            List listB = ((MetroLandingScreenDataState) this.this$0.f.getValue()).b();
            StopAppModel stopAppModel = ((MetroLandingScreenDataState) this.this$0.f.getValue()).l;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listB) {
                if (!Intrinsics.d(((StopAppModel) obj2).f1727a, stopAppModel != null ? stopAppModel.f1727a : null)) {
                    arrayList.add(obj2);
                }
            }
            MetroLandingScreenComponent metroLandingScreenComponent2 = this.this$0;
            PickStopRequestType pickStopRequestType = PickStopRequestType.FROM;
            this.label = 2;
            if (MetroLandingScreenComponent.F0(metroLandingScreenComponent2, arrayList, pickStopRequestType, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
