package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.home.data.model.app.response.CorridorAppModel;
import app.chalo.home.data.model.app.response.ScheduleBlockKey;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.n3;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent$applyScheduleBlockSelection$1", f = "ChaloBusRouteInfoComponent.kt", l = {540}, m = "invokeSuspend", v = 1)
final class ChaloBusRouteInfoComponent$applyScheduleBlockSelection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $filterName;
    final /* synthetic */ ScheduleBlockKey $tabId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ChaloBusRouteInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusRouteInfoComponent$applyScheduleBlockSelection$1(ChaloBusRouteInfoComponent chaloBusRouteInfoComponent, ScheduleBlockKey scheduleBlockKey, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusRouteInfoComponent;
        this.$tabId = scheduleBlockKey;
        this.$filterName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloBusRouteInfoComponent$applyScheduleBlockSelection$1 chaloBusRouteInfoComponent$applyScheduleBlockSelection$1 = new ChaloBusRouteInfoComponent$applyScheduleBlockSelection$1(this.this$0, this.$tabId, this.$filterName, continuation);
        chaloBusRouteInfoComponent$applyScheduleBlockSelection$1.L$0 = obj;
        return chaloBusRouteInfoComponent$applyScheduleBlockSelection$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusRouteInfoComponent$applyScheduleBlockSelection$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00f2 A[LOOP:6: B:27:0x00f0->B:28:0x00f2, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        ArrayList arrayList;
        int size;
        int i;
        ChaloBusRouteInfoErrorType.ResetFilter resetFilter;
        Object obj2;
        boolean z;
        CoroutineScope coroutineScope2;
        List list;
        List list2;
        List list3;
        List list4;
        Object obj3;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            ArrayList arrayListI0 = this.this$0.I0(this.$tabId);
            this.this$0.getClass();
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayListI0.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj4 = arrayListI0.get(i3);
                i3++;
                CorridorAppModel corridorAppModel = (CorridorAppModel) obj4;
                CollectionsKt.i(CollectionsKt.S(corridorAppModel.b, corridorAppModel.c), arrayList2);
            }
            List listU0 = CollectionsKt.u0(CollectionsKt.z(arrayList2));
            ArrayList arrayList3 = new ArrayList(CollectionsKt.v(listU0, 10));
            Iterator it = listU0.iterator();
            while (it.hasNext()) {
                arrayList3.add(new Filters((String) it.next(), false));
            }
            String str2 = "All";
            ArrayList arrayListC0 = CollectionsKt.c0(arrayList3, CollectionsKt.R(new Filters("All", false)));
            String str3 = this.$filterName;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.v(arrayListC0, 10));
            int size3 = arrayListC0.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj5 = arrayListC0.get(i4);
                i4++;
                Filters filters = (Filters) obj5;
                arrayList4.add(Filters.a(filters, Intrinsics.d(filters.f3366a, str3)));
            }
            if (arrayList4.isEmpty()) {
                arrayList = new ArrayList(CollectionsKt.v(arrayListC0, 10));
                size = arrayListC0.size();
                i = 0;
                while (i < size) {
                    Object obj6 = arrayListC0.get(i);
                    i++;
                    Filters filters2 = (Filters) obj6;
                    arrayList.add(Filters.a(filters2, Intrinsics.d(filters2.f3366a, "All")));
                }
            } else {
                int size4 = arrayList4.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size4) {
                        Object obj7 = arrayList4.get(i5);
                        i5++;
                        if (((Filters) obj7).b) {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = new ArrayList(CollectionsKt.v(arrayListC0, 10));
                        size = arrayListC0.size();
                        i = 0;
                        while (i < size) {
                            Object obj8 = arrayListC0.get(i);
                            i++;
                            Filters filters3 = (Filters) obj8;
                            arrayList.add(Filters.a(filters3, Intrinsics.d(filters3.f3366a, "All")));
                        }
                    }
                }
            }
            int size5 = arrayList.size();
            int i6 = 0;
            do {
                resetFilter = null;
                if (i6 >= size5) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i6);
                i6++;
            } while (!((Filters) obj2).b);
            Filters filters4 = (Filters) obj2;
            if (filters4 != null && (str = filters4.f3366a) != null) {
                str2 = str;
            }
            this.this$0.getClass();
            ArrayList arrayListL0 = ChaloBusRouteInfoComponent.L0(str2, arrayListI0);
            String str4 = this.$filterName;
            if (!arrayList.isEmpty()) {
                int size6 = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        z = false;
                        break;
                    }
                    Object obj9 = arrayList.get(i7);
                    i7++;
                    if (Intrinsics.d(((Filters) obj9).f3366a, str4)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (arrayListL0.isEmpty()) {
                if (arrayListI0.isEmpty()) {
                    this.L$0 = coroutineScope;
                    this.L$1 = arrayList;
                    this.L$2 = arrayListL0;
                    this.label = 1;
                    Object objB = this.this$0.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    coroutineScope2 = coroutineScope;
                    obj = objB;
                    list = arrayListL0;
                    list2 = arrayList;
                } else if (!z) {
                    resetFilter = ChaloBusRouteInfoErrorType.ResetFilter.f3319a;
                }
            }
            list3 = arrayListL0;
            list4 = arrayList;
            obj3 = resetFilter;
            CoroutineScopeKt.d(coroutineScope);
            ChaloBusRouteInfoComponent chaloBusRouteInfoComponent = this.this$0;
            chaloBusRouteInfoComponent.E0(new n3(list3, list4, obj3, chaloBusRouteInfoComponent, 1));
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (List) this.L$2;
        list2 = (List) this.L$1;
        coroutineScope2 = (CoroutineScope) this.L$0;
        ResultKt.b(obj);
        ChaloBusRouteInfoErrorType.ApiError apiError = new ChaloBusRouteInfoErrorType.ApiError((String) obj);
        coroutineScope = coroutineScope2;
        obj3 = apiError;
        list4 = list2;
        list3 = list;
        CoroutineScopeKt.d(coroutineScope);
        ChaloBusRouteInfoComponent chaloBusRouteInfoComponent2 = this.this$0;
        chaloBusRouteInfoComponent2.E0(new n3(list3, list4, obj3, chaloBusRouteInfoComponent2, 1));
        return Unit.f17538a;
    }
}
