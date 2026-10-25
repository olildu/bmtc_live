package app.chalo.tripreceipt.domain;

import app.chalo.features.productsync.model.app.RideType;
import app.chalo.models.products.SuperPassRideBookingAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.superpass.data.models.entities.SuperPassTripReceipt;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/tripreceipt/domain/SuperPassTripHistoryAppModel;", "tripReceipts", "Lapp/chalo/superpass/data/models/entities/SuperPassTripReceipt;", "bookedRides", "Lapp/chalo/models/products/SuperPassRideBookingAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.tripreceipt.domain.FetchSuperPassTripHistoryDataUseCase$invoke$2", f = "FetchSuperPassTripHistoryDataUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
final class FetchSuperPassTripHistoryDataUseCase$invoke$2 extends SuspendLambda implements Function3<List<? extends SuperPassTripReceipt>, List<? extends SuperPassRideBookingAppModel>, Continuation<? super List<? extends SuperPassTripHistoryAppModel>>, Object> {
    final /* synthetic */ long $activeDuration;
    final /* synthetic */ long $lastRideActivationTime;
    final /* synthetic */ String $passId;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchSuperPassTripHistoryDataUseCase$invoke$2(long j, String str, long j2, Continuation continuation) {
        super(3, continuation);
        this.$lastRideActivationTime = j;
        this.$passId = str;
        this.$activeDuration = j2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FetchSuperPassTripHistoryDataUseCase$invoke$2 fetchSuperPassTripHistoryDataUseCase$invoke$2 = new FetchSuperPassTripHistoryDataUseCase$invoke$2(this.$lastRideActivationTime, this.$passId, this.$activeDuration, (Continuation) obj3);
        fetchSuperPassTripHistoryDataUseCase$invoke$2.L$0 = (List) obj;
        fetchSuperPassTripHistoryDataUseCase$invoke$2.L$1 = (List) obj2;
        return fetchSuperPassTripHistoryDataUseCase$invoke$2.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        ArrayList arrayList = new ArrayList();
        List list3 = list;
        int i = 1000;
        if (list3 == null || list3.isEmpty()) {
            j = 0;
            String str = this.$passId;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (Intrinsics.d(((SuperPassRideBookingAppModel) obj3).f5681a, str)) {
                    arrayList2.add(obj3);
                }
            }
            long j2 = this.$activeDuration;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj4 = arrayList2.get(i2);
                i2++;
                arrayList3.add(FetchSuperPassTripHistoryDataUseCaseKt.a((SuperPassRideBookingAppModel) obj4, j2));
            }
            arrayList.addAll(arrayList3);
        } else {
            List list4 = list;
            long j3 = this.$activeDuration;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                SuperPassTripReceipt superPassTripReceipt = (SuperPassTripReceipt) it.next();
                Intrinsics.i(superPassTripReceipt, "<this>");
                long j4 = j3;
                arrayList4.add(new SuperPassTripHistoryAppModel(superPassTripReceipt.f9577a, RideType.SUPER_PASS_RIDE, superPassTripReceipt.d / ((long) i), superPassTripReceipt.e, superPassTripReceipt.h, j4, superPassTripReceipt.i, superPassTripReceipt.j, superPassTripReceipt.f, superPassTripReceipt.g, superPassTripReceipt.k, superPassTripReceipt.l, superPassTripReceipt.m));
                j3 = j4;
                it = it;
                i = 1000;
            }
            j = 0;
            ArrayList arrayList5 = new ArrayList();
            int size2 = arrayList4.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj5 = arrayList4.get(i3);
                i3++;
                if (((SuperPassTripHistoryAppModel) obj5).d < 0) {
                    arrayList5.add(obj5);
                }
            }
            String str2 = this.$passId;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj6 : list2) {
                if (Intrinsics.d(((SuperPassRideBookingAppModel) obj6).f5681a, str2)) {
                    arrayList6.add(obj6);
                }
            }
            long j5 = this.$activeDuration;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.v(arrayList6, 10));
            int size3 = arrayList6.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj7 = arrayList6.get(i4);
                i4++;
                arrayList7.add(FetchSuperPassTripHistoryDataUseCaseKt.a((SuperPassRideBookingAppModel) obj7, j5));
            }
            arrayList.addAll(CollectionsKt.c0(arrayList5, arrayList7));
        }
        long j6 = this.$lastRideActivationTime;
        int size4 = arrayList.size();
        int i5 = 0;
        do {
            if (i5 >= size4) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i5);
            i5++;
        } while (((SuperPassTripHistoryAppModel) obj2).c != j6 / ((long) 1000));
        if (obj2 == null) {
            long j7 = this.$lastRideActivationTime;
            if (j7 > j) {
                arrayList.add(new SuperPassTripHistoryAppModel(this.$passId, RideType.SUPER_PASS_RIDE, j7 / ((long) 1000), -1L, null, this.$activeDuration, null, null, null, null, null, null, RouteNamingSchemeType.DEFAULT));
            }
        }
        return CollectionsKt.v0(new FetchSuperPassTripHistoryDataUseCase$invoke$2$invokeSuspend$$inlined$sortedByDescending$1(), arrayList);
    }
}
