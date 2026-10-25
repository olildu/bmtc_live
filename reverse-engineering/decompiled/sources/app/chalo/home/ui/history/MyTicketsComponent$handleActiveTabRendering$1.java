package app.chalo.home.ui.history;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.constants.Source;
import app.chalo.domain.DoesUserHaveProductsOnMultipleDeviceUseCase;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.providers.cityprovider.CityProviderKt;
import defpackage.qi;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$handleActiveTabRendering$1", f = "MyTicketsComponent.kt", l = {TypedValues.Custom.TYPE_STRING}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$handleActiveTabRendering$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<ChaloUserBookingType> $bookingItemList;
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$handleActiveTabRendering$1(MyTicketsComponent myTicketsComponent, List list, Continuation continuation) {
        super(2, continuation);
        this.$bookingItemList = list;
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$handleActiveTabRendering$1(this.this$0, this.$bookingItemList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$handleActiveTabRendering$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.$bookingItemList.isEmpty()) {
                HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.E, "empty active tickets page rendered", null, Source.MY_TICKETS_SCREEN_TAB, 14);
                MyTicketsComponent myTicketsComponent = this.this$0;
                myTicketsComponent.r1(((MyTicketsDataState) myTicketsComponent.f.getValue()).h);
            } else {
                MyTicketsComponent myTicketsComponent2 = this.this$0;
                HomeScreenAnalyticsHelper.DefaultImpls.a(myTicketsComponent2.E, "active tickets page rendered", MyTicketsComponent.J0(myTicketsComponent2, this.$bookingItemList), Source.MY_TICKETS_SCREEN_TAB, 12);
            }
            MyTicketsComponent myTicketsComponent3 = this.this$0;
            DoesUserHaveProductsOnMultipleDeviceUseCase doesUserHaveProductsOnMultipleDeviceUseCase = myTicketsComponent3.v;
            String strB = CityProviderKt.b(myTicketsComponent3.m);
            if (strB == null) {
                strB = "";
            }
            this.label = 1;
            obj = doesUserHaveProductsOnMultipleDeviceUseCase.a(strB, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            MyTicketsComponent myTicketsComponent4 = this.this$0;
            HomeScreenAnalyticsHelper.DefaultImpls.a(myTicketsComponent4.E, "reclaim card shown", MyTicketsComponent.J0(myTicketsComponent4, this.$bookingItemList), Source.MY_TICKETS_SCREEN_TAB, 12);
        }
        MyTicketsComponent myTicketsComponent5 = this.this$0;
        myTicketsComponent5.E0(new qi(myTicketsComponent5, this.$bookingItemList, zBooleanValue, 5));
        return Unit.f17538a;
    }
}
