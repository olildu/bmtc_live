package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModelKt;
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
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$selectInitialStopAndFetchEta$1", f = "RouteDetailsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$selectInitialStopAndFetchEta$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$selectInitialStopAndFetchEta$1(RouteDetailsComponent routeDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$selectInitialStopAndFetchEta$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RouteDetailsComponent$selectInitialStopAndFetchEta$1 routeDetailsComponent$selectInitialStopAndFetchEta$1 = (RouteDetailsComponent$selectInitialStopAndFetchEta$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        routeDetailsComponent$selectInitialStopAndFetchEta$1.invokeSuspend(unit);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RouteDetailsIntentModel routeDetailsIntentModel;
        int i;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        RouteDetailsComponent routeDetailsComponent = this.this$0;
        RouteAppModel routeAppModel = routeDetailsComponent.Y;
        Unit unit = Unit.f17538a;
        if (routeAppModel == null || (routeDetailsIntentModel = routeDetailsComponent.X) == null) {
            return unit;
        }
        boolean zA = RouteDetailsIntentModelKt.a(routeDetailsIntentModel);
        List routeStopList = routeAppModel.e;
        String str = routeDetailsIntentModel.b;
        String str2 = routeDetailsIntentModel.c;
        RouteDetailsComponent routeDetailsComponent2 = this.this$0;
        int i3 = routeDetailsComponent2.s0;
        int i4 = routeDetailsComponent2.h0;
        String str3 = routeDetailsIntentModel.d;
        Intrinsics.i(routeStopList, "routeStopList");
        if (zA) {
            if (str == null) {
                i = -1;
                break;
            }
            Iterator it = routeStopList.iterator();
            i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.d(((StopAppModel) it.next()).f1727a, str)) {
                    break;
                }
                i++;
            }
            if (str2 == null) {
                i2 = -1;
                break;
            }
            Iterator it2 = routeStopList.iterator();
            i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Intrinsics.d(((StopAppModel) it2.next()).f1727a, str2)) {
                    break;
                }
                i2++;
            }
            if (i != -1 && i2 != -1 && i < i2) {
                i3 = i;
            } else if (i3 != -1) {
                if (str3 == null) {
                    if (str != null) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                    }
                } else if (str != null) {
                    i3 = 0;
                } else {
                    i3 = 0;
                }
            } else if (str3 == null) {
                if (str != null) {
                    i3 = 0;
                } else {
                    i3 = 0;
                }
            } else if (str != null) {
                i3 = 0;
            } else {
                i3 = 0;
            }
        } else if (i3 != -1 || i3 >= i4) {
            if (str3 == null && str3.length() != 0) {
                Iterator it3 = routeStopList.iterator();
                int i5 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (Intrinsics.d(((StopAppModel) it3.next()).f1727a, str3)) {
                        i3 = i5;
                        break;
                    }
                    i5++;
                }
                if (i3 == -1 || i3 >= i4) {
                    if (str != null) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                    }
                }
            } else if (str != null || str.length() == 0) {
                i3 = 0;
            } else {
                Iterator it4 = routeStopList.iterator();
                int i6 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (Intrinsics.d(((StopAppModel) it4.next()).f1727a, str)) {
                        i3 = i6;
                        break;
                    }
                    i6++;
                }
                if (i3 == -1 || i3 >= i4) {
                    i3 = 0;
                }
            }
        }
        this.this$0.l1(i3, false);
        return unit;
    }
}
