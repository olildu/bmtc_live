package app.chalo.home.ui.history;

import app.chalo.home.domain.ChaloUserBookingType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "list", "", "Lapp/chalo/home/domain/ChaloUserBookingType;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$checkForStatus$1", f = "MyTicketsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$checkForStatus$1 extends SuspendLambda implements Function2<List<? extends ChaloUserBookingType>, Continuation<? super Unit>, Object> {
    final /* synthetic */ TicketsPassesTabType $selectedTabType;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3395a;

        static {
            int[] iArr = new int[TicketsPassesTabType.values().length];
            try {
                iArr[TicketsPassesTabType.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TicketsPassesTabType.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3395a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$checkForStatus$1(TicketsPassesTabType ticketsPassesTabType, MyTicketsComponent myTicketsComponent, Continuation continuation) {
        super(2, continuation);
        this.$selectedTabType = ticketsPassesTabType;
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MyTicketsComponent$checkForStatus$1 myTicketsComponent$checkForStatus$1 = new MyTicketsComponent$checkForStatus$1(this.$selectedTabType, this.this$0, continuation);
        myTicketsComponent$checkForStatus$1.L$0 = obj;
        return myTicketsComponent$checkForStatus$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MyTicketsComponent$checkForStatus$1 myTicketsComponent$checkForStatus$1 = (MyTicketsComponent$checkForStatus$1) create((List) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        myTicketsComponent$checkForStatus$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List list = (List) this.L$0;
        int i = WhenMappings.f3395a[this.$selectedTabType.ordinal()];
        if (i == 1) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                MyTicketsComponent myTicketsComponent = this.this$0;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    arrayList2.add(((ChaloUserBookingType.TicketBooking.MetroTicketBooking) obj3).d.f5431a);
                }
                BuildersKt.d(myTicketsComponent.j, null, null, new MyTicketsComponent$makeFetchAndStoreMetroLiveBookingStatusCall$1(myTicketsComponent, arrayList2, null), 3);
            }
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f17538a;
    }
}
