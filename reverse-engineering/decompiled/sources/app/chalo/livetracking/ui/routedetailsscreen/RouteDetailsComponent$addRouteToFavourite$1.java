package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.livetracking.routedetails.data.local.datastore.RouteDetailsLocalDataStore;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.recent.model.app.RecentsSpecialStatus;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$addRouteToFavourite$1", f = "RouteDetailsComponent.kt", l = {1437, 1443, 1445}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$addRouteToFavourite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$addRouteToFavourite$1(RouteDetailsComponent routeDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$addRouteToFavourite$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsComponent$addRouteToFavourite$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RouteDetailsComponent routeDetailsComponent;
        RouteAppModel routeAppModel;
        KotlinToastManager kotlinToastManager;
        Object objB;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            RouteDetailsComponent routeDetailsComponent2 = this.this$0;
            RouteAppModel routeAppModel2 = routeDetailsComponent2.Y;
            if (routeAppModel2 != null) {
                RouteDetailsLocalDataStore routeDetailsLocalDataStore = routeDetailsComponent2.E;
                String str = routeAppModel2.b;
                if (str == null) {
                    str = "";
                }
                RecentsSpecialStatus recentsSpecialStatus = RecentsSpecialStatus.FAVOURITE;
                this.L$0 = routeDetailsComponent2;
                this.L$1 = routeAppModel2;
                this.label = 1;
                Object objC = routeDetailsLocalDataStore.c(str, recentsSpecialStatus, this);
                if (objC != coroutineSingletons) {
                    routeDetailsComponent = routeDetailsComponent2;
                    obj = objC;
                    routeAppModel = routeAppModel2;
                }
                return coroutineSingletons;
            }
            return Unit.f17538a;
        }
        if (i == 1) {
            RouteAppModel routeAppModel3 = (RouteAppModel) this.L$1;
            RouteDetailsComponent routeDetailsComponent3 = (RouteDetailsComponent) this.L$0;
            ResultKt.b(obj);
            routeAppModel = routeAppModel3;
            routeDetailsComponent = routeDetailsComponent3;
        } else {
            if (i == 2) {
                routeDetailsComponent = (RouteDetailsComponent) this.L$0;
                ResultKt.b(obj);
                routeDetailsComponent.n1();
                kotlinToastManager = routeDetailsComponent.U;
                this.L$0 = kotlinToastManager;
                this.label = 3;
                objB = routeDetailsComponent.Q.b(RouteDetailsDataStateKt.a(RouteFavouriteActionType.ADDITION_SUCCESS), new Object[0], this);
                if (objB != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager;
                    obj = objB;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager2 = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
        }
        KotlinToastManagerKt.a(kotlinToastManager2, (String) obj, ToastLength.LONG);
        return Unit.f17538a;
        if (!((Boolean) obj).booleanValue()) {
            RouteDetailsLocalDataStore routeDetailsLocalDataStore2 = routeDetailsComponent.E;
            this.L$0 = routeDetailsComponent;
            this.L$1 = null;
            this.label = 2;
            if (routeDetailsLocalDataStore2.b(routeAppModel, this) != coroutineSingletons) {
                routeDetailsComponent.n1();
                kotlinToastManager = routeDetailsComponent.U;
                this.L$0 = kotlinToastManager;
                this.label = 3;
                objB = routeDetailsComponent.Q.b(RouteDetailsDataStateKt.a(RouteFavouriteActionType.ADDITION_SUCCESS), new Object[0], this);
                if (objB != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager;
                    obj = objB;
                    KotlinToastManagerKt.a(kotlinToastManager2, (String) obj, ToastLength.LONG);
                }
            }
            return coroutineSingletons;
        }
        return Unit.f17538a;
    }
}
