package app.chalo.premiumbus.ui.stopdetails;

import app.chalo.citydata.data.model.app.response.StopDetailsAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.do0;
import defpackage.o3;
import java.util.Iterator;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.stopdetails.PBStopDetailsComponent$processStopDetails$1", f = "PBStopDetailsComponent.kt", l = {242, 243}, m = "invokeSuspend", v = 1)
final class PBStopDetailsComponent$processStopDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $dropStopId;
    final /* synthetic */ String $pickupStopId;
    final /* synthetic */ List<StopDetailsAppModel> $stopDetailsList;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PBStopDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PBStopDetailsComponent$processStopDetails$1(List list, PBStopDetailsComponent pBStopDetailsComponent, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$stopDetailsList = list;
        this.this$0 = pBStopDetailsComponent;
        this.$pickupStopId = str;
        this.$dropStopId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PBStopDetailsComponent$processStopDetails$1(this.$stopDetailsList, this.this$0, this.$pickupStopId, this.$dropStopId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PBStopDetailsComponent$processStopDetails$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object next;
        StopDetailsAppModel stopDetailsAppModel;
        StopDetailsAppModel stopDetailsAppModel2;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                stopDetailsAppModel2 = (StopDetailsAppModel) this.L$1;
                stopDetailsAppModel = (StopDetailsAppModel) this.L$0;
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) this.L$2;
                stopDetailsAppModel2 = (StopDetailsAppModel) this.L$1;
                StopDetailsAppModel stopDetailsAppModel3 = (StopDetailsAppModel) this.L$0;
                ResultKt.b(obj);
                str = str2;
                stopDetailsAppModel = stopDetailsAppModel3;
            }
            StopDetailsAppModel stopDetailsAppModel4 = stopDetailsAppModel2;
            PBStopDetailsComponent pBStopDetailsComponent = this.this$0;
            pBStopDetailsComponent.E0(new o3(stopDetailsAppModel, stopDetailsAppModel4, str, pBStopDetailsComponent, (String) obj, 6));
            return unit;
        }
        ResultKt.b(obj);
        List<StopDetailsAppModel> list = this.$stopDetailsList;
        String str3 = this.$pickupStopId;
        Iterator<T> it = list.iterator();
        do {
            obj2 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((StopDetailsAppModel) next).f1745a, str3));
        StopDetailsAppModel stopDetailsAppModel5 = (StopDetailsAppModel) next;
        List<StopDetailsAppModel> list2 = this.$stopDetailsList;
        String str4 = this.$dropStopId;
        for (Object obj3 : list2) {
            if (Intrinsics.d(((StopDetailsAppModel) obj3).f1745a, str4)) {
                obj2 = obj3;
                break;
            }
        }
        StopDetailsAppModel stopDetailsAppModel6 = (StopDetailsAppModel) obj2;
        if (stopDetailsAppModel5 == null && stopDetailsAppModel6 == null) {
            this.this$0.E0(new do0(6));
            return unit;
        }
        this.L$0 = stopDetailsAppModel5;
        this.L$1 = stopDetailsAppModel6;
        this.label = 1;
        obj = this.this$0.n.b(StringEnum.PICKUP, new Object[0], this);
        if (obj != coroutineSingletons) {
            stopDetailsAppModel = stopDetailsAppModel5;
            stopDetailsAppModel2 = stopDetailsAppModel6;
        }
        return coroutineSingletons;
        String str5 = (String) obj;
        this.L$0 = stopDetailsAppModel;
        this.L$1 = stopDetailsAppModel2;
        this.L$2 = str5;
        this.label = 2;
        Object objB = this.this$0.n.b(StringEnum.DROP, new Object[0], this);
        if (objB != coroutineSingletons) {
            str = str5;
            obj = objB;
            StopDetailsAppModel stopDetailsAppModel7 = stopDetailsAppModel2;
            PBStopDetailsComponent pBStopDetailsComponent2 = this.this$0;
            pBStopDetailsComponent2.E0(new o3(stopDetailsAppModel, stopDetailsAppModel7, str, pBStopDetailsComponent2, (String) obj, 6));
            return unit;
        }
        return coroutineSingletons;
    }
}
