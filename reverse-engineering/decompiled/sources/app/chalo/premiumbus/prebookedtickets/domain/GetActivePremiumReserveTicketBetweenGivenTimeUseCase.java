package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/GetActivePremiumReserveTicketBetweenGivenTimeUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetActivePremiumReserveTicketBetweenGivenTimeUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7305a;
    public final CityProvider b;
    public final BasicInfoContract c;
    public final UserProfileDetailsProvider d;
    public final CheckIsUserLoggedInUseCase e;
    public final AddPremiumBusTripDetailsIfNotDoneUseCase f;
    public final ContextScope g;

    public GetActivePremiumReserveTicketBetweenGivenTimeUseCase(PremiumBusRepository premiumBusRepository, CityProvider cityProvider, BasicInfoContract basicInfoContract, UserProfileDetailsProvider userProfileDetailsProvider, CheckIsUserLoggedInUseCase checkIsUserLoggedInUseCase, AddPremiumBusTripDetailsIfNotDoneUseCase addPremiumBusTripDetailsIfNotDoneUseCase, CoroutineContextProvider coroutineContextProvider) {
        this.f7305a = premiumBusRepository;
        this.b = cityProvider;
        this.c = basicInfoContract;
        this.d = userProfileDetailsProvider;
        this.e = checkIsUserLoggedInUseCase;
        this.f = addPremiumBusTripDetailsIfNotDoneUseCase;
        this.g = CoroutineScopeKt.a(coroutineContextProvider.b());
    }

    public final Flow a(long j, long j2, final boolean z) {
        String str;
        String str2;
        if (!this.e.a()) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
        }
        CityAppModel cityAppModel = (CityAppModel) this.b.getE().getValue();
        if (cityAppModel == null || (str2 = cityAppModel.f8854a) == null) {
            str = "";
        } else {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            str = lowerCase;
        }
        String strM = this.d.m();
        final Flow flowM = FlowKt.m(this.f7305a.s(j, j2, str, strM == null ? "" : strM));
        return FlowKt.H(new Flow<List<? extends PremiumReserveTicketAppModel>>() { // from class: app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f7307a;
                public final /* synthetic */ GetActivePremiumReserveTicketBetweenGivenTimeUseCase b;
                public final /* synthetic */ boolean c;

                /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$map$1$2", f = "GetActivePremiumReserveTicketBetweenGivenTimeUseCase.kt", l = {51, 50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(FlowCollector flowCollector, GetActivePremiumReserveTicketBetweenGivenTimeUseCase getActivePremiumReserveTicketBetweenGivenTimeUseCase, boolean z) {
                    this.f7307a = flowCollector;
                    this.b = getActivePremiumReserveTicketBetweenGivenTimeUseCase;
                    this.c = z;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
                
                    if (r2.emit(r11, r0) == r1) goto L30;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$map$1$2$1 r0 = (app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$map$1$2$1 r0 = new app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$map$1$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3f
                        if (r2 == r4) goto L33
                        if (r2 != r3) goto L2b
                        kotlin.ResultKt.b(r11)
                        goto Laa
                    L2b:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L33:
                        java.lang.Object r10 = r0.L$1
                        java.util.List r10 = (java.util.List) r10
                        java.lang.Object r2 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                        kotlin.ResultKt.b(r11)
                        goto L57
                    L3f:
                        kotlin.ResultKt.b(r11)
                        java.util.List r10 = (java.util.List) r10
                        app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase r11 = r9.b
                        app.chalo.contract.BasicInfoContract r11 = r11.c
                        kotlinx.coroutines.flow.FlowCollector r2 = r9.f7307a
                        r0.L$0 = r2
                        r0.L$1 = r10
                        r0.label = r4
                        java.lang.Object r11 = r11.c(r0)
                        if (r11 != r1) goto L57
                        goto La9
                    L57:
                        java.lang.Number r11 = (java.lang.Number) r11
                        long r4 = r11.longValue()
                        java.lang.StringBuilder r11 = new java.lang.StringBuilder
                        java.lang.String r6 = "ticketsList: "
                        r11.<init>(r6)
                        r11.append(r10)
                        java.lang.String r11 = r11.toString()
                        java.lang.String r6 = "message"
                        kotlin.jvm.internal.Intrinsics.i(r11, r6)
                        java.lang.Iterable r10 = (java.lang.Iterable) r10
                        java.util.ArrayList r11 = new java.util.ArrayList
                        r11.<init>()
                        java.util.Iterator r10 = r10.iterator()
                    L7c:
                        boolean r6 = r10.hasNext()
                        if (r6 == 0) goto L9c
                        java.lang.Object r6 = r10.next()
                        r7 = r6
                        app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r7 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r7
                        boolean r8 = r9.c
                        if (r8 == 0) goto L92
                        boolean r7 = r7.b(r4)
                        goto L96
                    L92:
                        boolean r7 = r7.a(r4)
                    L96:
                        if (r7 == 0) goto L7c
                        r11.add(r6)
                        goto L7c
                    L9c:
                        r10 = 0
                        r0.L$0 = r10
                        r0.L$1 = r10
                        r0.label = r3
                        java.lang.Object r10 = r2.emit(r11, r0)
                        if (r10 != r1) goto Laa
                    La9:
                        return r1
                    Laa:
                        kotlin.Unit r10 = kotlin.Unit.f17538a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowM.collect(new AnonymousClass2(flowCollector, this, z), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, new GetActivePremiumReserveTicketBetweenGivenTimeUseCase$invoke$$inlined$flatMapLatest$1(null, this, str, z));
    }
}
