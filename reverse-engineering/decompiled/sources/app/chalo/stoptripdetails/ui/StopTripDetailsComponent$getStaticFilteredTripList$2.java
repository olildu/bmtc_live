package app.chalo.stoptripdetails.ui;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel;
import app.chalo.stoptripdetails.data.model.app.StopTripDetailsResponseAppModel;
import app.chalo.utils.StopTripDetailsUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/stoptripdetails/data/model/app/StopTripDetailsAppModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.stoptripdetails.ui.StopTripDetailsComponent$getStaticFilteredTripList$2", f = "StopTripDetailsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class StopTripDetailsComponent$getStaticFilteredTripList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends StopTripDetailsAppModel>>, Object> {
    final /* synthetic */ ChaloTransitMode $transitMode;
    final /* synthetic */ List<StopTripDetailsResponseAppModel> $tripItems;
    int label;
    final /* synthetic */ StopTripDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTripDetailsComponent$getStaticFilteredTripList$2(List list, ChaloTransitMode chaloTransitMode, StopTripDetailsComponent stopTripDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.$tripItems = list;
        this.$transitMode = chaloTransitMode;
        this.this$0 = stopTripDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopTripDetailsComponent$getStaticFilteredTripList$2(this.$tripItems, this.$transitMode, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopTripDetailsComponent$getStaticFilteredTripList$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List<StopTripDetailsResponseAppModel> list = this.$tripItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((StopTripDetailsResponseAppModel) it.next()).b);
        }
        return StopTripDetailsUtils.a(arrayList, this.$transitMode, this.this$0.p);
    }
}
