package app.chalo.home.ui.history;

import app.chalo.constants.Source;
import app.chalo.domain.DoesUserHaveProductsOnMultipleDeviceUseCase;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.homescreen.data.model.app.TicketsPassesSectionWidgetAppModel;
import app.chalo.providers.cityprovider.CityProviderKt;
import defpackage.rk0;
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
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$renderReclaimCardOrEmptyDataScreenWithoutTabs$1", f = "MyTicketsComponent.kt", l = {640}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$renderReclaimCardOrEmptyDataScreenWithoutTabs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$renderReclaimCardOrEmptyDataScreenWithoutTabs$1(MyTicketsComponent myTicketsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$renderReclaimCardOrEmptyDataScreenWithoutTabs$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$renderReclaimCardOrEmptyDataScreenWithoutTabs$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MyTicketsComponent myTicketsComponent = this.this$0;
            DoesUserHaveProductsOnMultipleDeviceUseCase doesUserHaveProductsOnMultipleDeviceUseCase = myTicketsComponent.v;
            String strB = CityProviderKt.b(myTicketsComponent.m);
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
        if (((Boolean) obj).booleanValue()) {
            this.this$0.y1();
        } else {
            MyTicketsComponent myTicketsComponent2 = this.this$0;
            HomeScreenAnalyticsHelper.DefaultImpls.a(myTicketsComponent2.E, "empty tickets page rendered", null, Source.MY_TICKETS_SCREEN_TAB, 14);
            TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel = ((MyTicketsDataState) myTicketsComponent2.f.getValue()).h;
            if (ticketsPassesSectionWidgetAppModel != null) {
                myTicketsComponent2.r1(ticketsPassesSectionWidgetAppModel);
                myTicketsComponent2.E0(new rk0(myTicketsComponent2, 0));
            }
        }
        return Unit.f17538a;
    }
}
