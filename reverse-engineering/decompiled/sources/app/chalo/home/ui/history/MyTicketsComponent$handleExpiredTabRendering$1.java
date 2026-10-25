package app.chalo.home.ui.history;

import app.chalo.constants.Source;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.domain.ChaloUserBookingType;
import defpackage.ej0;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$handleExpiredTabRendering$1", f = "MyTicketsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$handleExpiredTabRendering$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<ChaloUserBookingType> $bookingItemList;
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$handleExpiredTabRendering$1(MyTicketsComponent myTicketsComponent, List list, Continuation continuation) {
        super(2, continuation);
        this.$bookingItemList = list;
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$handleExpiredTabRendering$1(this.this$0, this.$bookingItemList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MyTicketsComponent$handleExpiredTabRendering$1 myTicketsComponent$handleExpiredTabRendering$1 = (MyTicketsComponent$handleExpiredTabRendering$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        myTicketsComponent$handleExpiredTabRendering$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List<ChaloUserBookingType> list = this.$bookingItemList;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            arrayList2.add(((ChaloUserBookingType.TicketBooking.PremiumBusBooking) obj3).d.f7113a.f7114a);
        }
        String message = "expired pb booking item ids = " + arrayList2;
        Intrinsics.i(message, "message");
        if (this.$bookingItemList.isEmpty()) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.E, "empty expired tickets page rendered", null, Source.MY_TICKETS_SCREEN_TAB, 14);
            MyTicketsComponent myTicketsComponent = this.this$0;
            myTicketsComponent.r1(((MyTicketsDataState) myTicketsComponent.f.getValue()).h);
        } else {
            MyTicketsComponent myTicketsComponent2 = this.this$0;
            HomeScreenAnalyticsHelper.DefaultImpls.a(myTicketsComponent2.E, "expired tickets page rendered", MyTicketsComponent.J0(myTicketsComponent2, this.$bookingItemList), Source.MY_TICKETS_SCREEN_TAB, 12);
        }
        MyTicketsComponent myTicketsComponent3 = this.this$0;
        myTicketsComponent3.E0(new ej0(8, myTicketsComponent3, this.$bookingItemList));
        return Unit.f17538a;
    }
}
