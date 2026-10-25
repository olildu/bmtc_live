package app.chalo.home.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/home/domain/ChaloUserBookingType;", "bookings", "groupedChildKeys", "", "Lapp/chalo/home/domain/BookedProductKey;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$invoke$resultFlow$1", f = "GetAllRequestedBookedProductsUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
final class GetAllRequestedBookedProductsUseCase$invoke$resultFlow$1 extends SuspendLambda implements Function3<List<? extends ChaloUserBookingType>, Set<? extends BookedProductKey>, Continuation<? super List<? extends ChaloUserBookingType>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetAllRequestedBookedProductsUseCase$invoke$resultFlow$1 getAllRequestedBookedProductsUseCase$invoke$resultFlow$1 = new GetAllRequestedBookedProductsUseCase$invoke$resultFlow$1(3, (Continuation) obj3);
        getAllRequestedBookedProductsUseCase$invoke$resultFlow$1.L$0 = (List) obj;
        getAllRequestedBookedProductsUseCase$invoke$resultFlow$1.L$1 = (Set) obj2;
        return getAllRequestedBookedProductsUseCase$invoke$resultFlow$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List list = (List) this.L$0;
        Set set = (Set) this.L$1;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            ChaloUserBookingType chaloUserBookingType = (ChaloUserBookingType) obj2;
            if (!set.contains(new BookedProductKey(chaloUserBookingType.f2987a, chaloUserBookingType.b, chaloUserBookingType.c))) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
