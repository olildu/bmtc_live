package app.chalo.premiumbus.prebookedtickets.domain;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTripAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTripAppModelKt;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$flatMapLatest$1", f = "GetActivePremiumReserveTicketBetweenGivenTimeUseCase.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
public final class GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends PremiumReserveTicketAppModel>>, List<? extends PremiumReserveTicketAppModel>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cityId$inlined;
    final /* synthetic */ boolean $includeUsedTicketsTillTripEndTime$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GetActivePremiumReserveTicketBetweenGivenTimeUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$flatMapLatest$1(Continuation continuation, GetActivePremiumReserveTicketBetweenGivenTimeUseCase getActivePremiumReserveTicketBetweenGivenTimeUseCase, String str, boolean z) {
        super(3, continuation);
        this.this$0 = getActivePremiumReserveTicketBetweenGivenTimeUseCase;
        this.$cityId$inlined = str;
        this.$includeUsedTicketsTillTripEndTime$inlined = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$flatMapLatest$1 getActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$flatMapLatest$1 = new GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$cityId$inlined, this.$includeUsedTicketsTillTripEndTime$inlined);
        getActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        getActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$flatMapLatest$1.L$1 = obj2;
        return getActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final List list = (List) this.L$1;
            List list2 = list;
            final ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((PremiumReserveTicketAppModel) it.next()).f7113a.f7114a);
            }
            String message = "ticketsBookingIds: " + arrayList;
            Intrinsics.i(message, "message");
            final Flow flowM = FlowKt.m(this.this$0.f7305a.k(this.$cityId$inlined, arrayList));
            final GetActivePremiumReserveTicketBetweenGivenTimeUseCase getActivePremiumReserveTicketBetweenGivenTimeUseCase = this.this$0;
            final boolean z = this.$includeUsedTicketsTillTripEndTime$inlined;
            final String str = this.$cityId$inlined;
            Flow<List<? extends PremiumReserveTicketAppModel>> flow = new Flow<List<? extends PremiumReserveTicketAppModel>>() { // from class: app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$lambda$1$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$lambda$1$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f7309a;
                    public final /* synthetic */ ArrayList b;
                    public final /* synthetic */ GetActivePremiumReserveTicketBetweenGivenTimeUseCase c;
                    public final /* synthetic */ boolean d;
                    public final /* synthetic */ List e;
                    public final /* synthetic */ String f;

                    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$lambda$1$$inlined$map$1$2", f = "GetActivePremiumReserveTicketBetweenGivenTimeUseCase.kt", l = {50}, m = "emit", v = 1)
                    public final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, ArrayList arrayList, GetActivePremiumReserveTicketBetweenGivenTimeUseCase getActivePremiumReserveTicketBetweenGivenTimeUseCase, boolean z, List list, String str) {
                        this.f7309a = flowCollector;
                        this.b = arrayList;
                        this.c = getActivePremiumReserveTicketBetweenGivenTimeUseCase;
                        this.d = z;
                        this.e = list;
                        this.f = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        ArrayList arrayList;
                        T next;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.b(obj2);
                            List list = (List) obj;
                            List list2 = list;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((PremiumReserveTripAppModel) it.next()).b);
                            }
                            String message = "cachedTripIds: " + arrayList2;
                            Intrinsics.i(message, "message");
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = this.b;
                            int size = arrayList4.size();
                            int i3 = 0;
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj3 = arrayList4.get(i4);
                                i4++;
                                if (!arrayList2.contains((String) obj3)) {
                                    arrayList3.add(obj3);
                                }
                            }
                            String message2 = "bookingIdsToFetch: " + arrayList2;
                            Intrinsics.i(message2, "message");
                            GetActivePremiumReserveTicketBetweenGivenTimeUseCase getActivePremiumReserveTicketBetweenGivenTimeUseCase = this.c;
                            BuildersKt.d(getActivePremiumReserveTicketBetweenGivenTimeUseCase.g, null, null, new GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$3$1$1(getActivePremiumReserveTicketBetweenGivenTimeUseCase, this.f, arrayList3, null), 3);
                            boolean z = this.d;
                            List list3 = this.e;
                            if (z) {
                                arrayList = new ArrayList();
                                for (T t : list3) {
                                    if (((PremiumReserveTicketAppModel) t).b(getActivePremiumReserveTicketBetweenGivenTimeUseCase.c.j())) {
                                        arrayList.add(t);
                                    }
                                }
                            } else {
                                ArrayList arrayList5 = new ArrayList();
                                for (T t2 : list3) {
                                    PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = ((PremiumReserveTicketAppModel) t2).f7113a;
                                    if (premiumReserveTicketBookingPropertiesAppModel.h == PremiumReserveTicketStatus.ACTIVE) {
                                        String str = premiumReserveTicketBookingPropertiesAppModel.f7114a;
                                        Intrinsics.i(list, "<this>");
                                        Iterator<T> it2 = list.iterator();
                                        do {
                                            if (!it2.hasNext()) {
                                                next = (T) null;
                                                break;
                                            }
                                            next = it2.next();
                                        } while (!Intrinsics.d(((PremiumReserveTripAppModel) next).b, str));
                                        PremiumReserveTripAppModel premiumReserveTripAppModel = next;
                                        if (premiumReserveTripAppModel != null) {
                                            int i5 = PremiumReserveTripAppModelKt.WhenMappings.f7120a[premiumReserveTripAppModel.d.ordinal()];
                                            if (i5 != 1 && i5 != 2 && i5 != 3) {
                                                if (i5 != 4) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            } else if (!premiumReserveTripAppModel.e) {
                                                arrayList5.add(t2);
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                arrayList = arrayList5;
                            }
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList6 = new ArrayList();
                            int size2 = arrayList.size();
                            while (i3 < size2) {
                                Object obj4 = arrayList.get(i3);
                                i3++;
                                if (hashSet.add(((PremiumReserveTicketAppModel) obj4).f7113a.f7114a)) {
                                    arrayList6.add(obj4);
                                }
                            }
                            List listV0 = CollectionsKt.v0(new GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$lambda$1$1$$inlined$sortedBy$1(), arrayList6);
                            anonymousClass1.label = 1;
                            if (this.f7309a.emit(listV0, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj2);
                        }
                        return Unit.f17538a;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                    Object objCollect = flowM.collect(new AnonymousClass2(flowCollector2, arrayList, getActivePremiumReserveTicketBetweenGivenTimeUseCase, z, list, str), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            this.label = 1;
            if (FlowKt.r(flowCollector, flow, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
