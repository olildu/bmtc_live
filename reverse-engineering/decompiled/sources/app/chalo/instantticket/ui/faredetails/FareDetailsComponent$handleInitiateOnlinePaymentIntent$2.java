package app.chalo.instantticket.ui.faredetails;

import app.chalo.extensions.StringExtsKt;
import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.instantticket.config.models.InstantTicketConfiguration;
import app.chalo.instantticket.data.model.app.InstantTicketTripDetails;
import app.chalo.instantticket.data.model.app.request.InstantTicketOrderFarePassengerDetail;
import app.chalo.instantticket.domain.CreateInstantTicketOrderUseCase;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.data.models.app.FareDetailsRouteData;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.hq0;
import defpackage.p10;
import defpackage.z20;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.FareDetailsComponent$handleInitiateOnlinePaymentIntent$2", f = "FareDetailsComponent.kt", l = {1194, 1201, 1203, 1238}, m = "invokeSuspend", v = 1)
final class FareDetailsComponent$handleInitiateOnlinePaymentIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FareDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FareDetailsComponent$handleInitiateOnlinePaymentIntent$2(FareDetailsComponent fareDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fareDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FareDetailsComponent$handleInitiateOnlinePaymentIntent$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FareDetailsComponent$handleInitiateOnlinePaymentIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac A[LOOP:0: B:30:0x00a6->B:32:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00fd A[PHI: r0 r11
      0x00fd: PHI (r0v15 java.lang.Object) = (r0v14 java.lang.Object), (r0v36 java.lang.Object) binds: [B:34:0x00fa, B:11:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v2 java.lang.String) binds: [B:34:0x00fa, B:11:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0105  */
    /* JADX WARN: Code duplicated, block: B:40:0x010f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0119  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0149  */
    /* JADX WARN: Code duplicated, block: B:48:0x0154  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objO0;
        Object objA;
        InstantTicketConfiguration instantTicketConfiguration;
        String str;
        ArrayList arrayList;
        Object objA2;
        ChaloUseCaseResult chaloUseCaseResult;
        FareDetailsComponent fareDetailsComponent;
        KotlinToastManager kotlinToastManager;
        String str2;
        Object objB;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            FareDetailsComponent fareDetailsComponent2 = this.this$0;
            this.label = 1;
            objO0 = FareDetailsComponent.O0(fareDetailsComponent2, this);
            if (objO0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
            objO0 = obj;
        } else {
            if (i == 2) {
                ResultKt.b(obj);
                objA = obj;
                instantTicketConfiguration = (InstantTicketConfiguration) objA;
                if (instantTicketConfiguration != null && (str = instantTicketConfiguration.d) != null) {
                    FareDetailsComponent fareDetailsComponent3 = this.this$0;
                    CreateInstantTicketOrderUseCase createInstantTicketOrderUseCase = fareDetailsComponent3.p;
                    long jI0 = FareDetailsComponent.I0(fareDetailsComponent3);
                    Map mapU0 = FareDetailsComponent.U0(this.this$0);
                    arrayList = new ArrayList(mapU0.size());
                    for (Map.Entry entry : mapU0.entrySet()) {
                        arrayList.add(new InstantTicketOrderFarePassengerDetail(((Number) entry.getValue()).intValue(), (String) entry.getKey()));
                    }
                    FareDetailsData fareDetailsData = this.this$0.M;
                    ProductBookingStopDetails productBookingStopDetails = fareDetailsData.b;
                    String str3 = productBookingStopDetails.f8199a;
                    ProductBookingStopDetails productBookingStopDetails2 = fareDetailsData.c;
                    String str4 = productBookingStopDetails2.f8199a;
                    FareDetailsRouteData fareDetailsRouteData = fareDetailsData.f8185a;
                    InstantTicketTripDetails instantTicketTripDetails = new InstantTicketTripDetails(str3, str4, fareDetailsRouteData.b, fareDetailsRouteData.f8187a, productBookingStopDetails.b, productBookingStopDetails2.b);
                    this.L$0 = str;
                    this.label = 3;
                    objA2 = createInstantTicketOrderUseCase.a(jI0, arrayList, instantTicketTripDetails, this);
                    if (objA2 != coroutineSingletons) {
                        chaloUseCaseResult = (ChaloUseCaseResult) objA2;
                        fareDetailsComponent = this.this$0;
                        if (!fareDetailsComponent.S) {
                            fareDetailsComponent.R = true;
                            fareDetailsComponent.T = false;
                            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                                FareDetailsComponent.K0(fareDetailsComponent, (CreateOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a, str);
                            } else {
                                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ProductBookingDataSourceError productBookingDataSourceError = (ProductBookingDataSourceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                                kotlinToastManager = fareDetailsComponent.z;
                                str2 = productBookingDataSourceError.f8097a;
                                StringProvider stringProvider = fareDetailsComponent.m;
                                StringEnum stringEnum = StringEnum.GENERIC_ERROR_WITH_CODE;
                                Object[] objArr = {new Integer(productBookingDataSourceError.a())};
                                this.L$0 = kotlinToastManager;
                                this.L$1 = str2;
                                this.label = 4;
                                objB = stringProvider.b(stringEnum, objArr, this);
                                if (objB != coroutineSingletons) {
                                    kotlinToastManager2 = kotlinToastManager;
                                }
                            }
                        }
                        this.this$0.E0(new z20(0));
                    }
                    return coroutineSingletons;
                }
                return unit;
            }
            if (i == 3) {
                String str5 = (String) this.L$0;
                ResultKt.b(obj);
                str = str5;
                objA2 = obj;
                chaloUseCaseResult = (ChaloUseCaseResult) objA2;
                fareDetailsComponent = this.this$0;
                if (!fareDetailsComponent.S) {
                    fareDetailsComponent.R = true;
                    fareDetailsComponent.T = false;
                    if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ProductBookingDataSourceError productBookingDataSourceError2 = (ProductBookingDataSourceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                        kotlinToastManager = fareDetailsComponent.z;
                        str2 = productBookingDataSourceError2.f8097a;
                        StringProvider stringProvider2 = fareDetailsComponent.m;
                        StringEnum stringEnum2 = StringEnum.GENERIC_ERROR_WITH_CODE;
                        Object[] objArr2 = {new Integer(productBookingDataSourceError2.a())};
                        this.L$0 = kotlinToastManager;
                        this.L$1 = str2;
                        this.label = 4;
                        objB = stringProvider2.b(stringEnum2, objArr2, this);
                        if (objB != coroutineSingletons) {
                            kotlinToastManager2 = kotlinToastManager;
                        }
                        return coroutineSingletons;
                    }
                    FareDetailsComponent.K0(fareDetailsComponent, (CreateOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a, str);
                }
                this.this$0.E0(new z20(0));
                return unit;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str6 = (String) this.L$1;
            kotlinToastManager2 = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            str2 = str6;
            objB = obj;
        }
        hq0.s(kotlinToastManager2, StringExtsKt.b(str2, (String) objB));
        this.this$0.E0(new z20(0));
        return unit;
        if (!((Boolean) objO0).booleanValue()) {
            FareDetailsComponent fareDetailsComponent4 = this.this$0;
            fareDetailsComponent4.T = false;
            fareDetailsComponent4.E0(new p10(29));
            return unit;
        }
        ProductBookingDataStore productBookingDataStore = this.this$0.o;
        this.label = 2;
        objA = productBookingDataStore.a(this);
        if (objA != coroutineSingletons) {
            instantTicketConfiguration = (InstantTicketConfiguration) objA;
            if (instantTicketConfiguration != null) {
                FareDetailsComponent fareDetailsComponent5 = this.this$0;
                CreateInstantTicketOrderUseCase createInstantTicketOrderUseCase2 = fareDetailsComponent5.p;
                long jI1 = FareDetailsComponent.I0(fareDetailsComponent5);
                Map mapU1 = FareDetailsComponent.U0(this.this$0);
                arrayList = new ArrayList(mapU1.size());
                while (r2.hasNext()) {
                    arrayList.add(new InstantTicketOrderFarePassengerDetail(((Number) entry.getValue()).intValue(), (String) entry.getKey()));
                }
                FareDetailsData fareDetailsData2 = this.this$0.M;
                ProductBookingStopDetails productBookingStopDetails3 = fareDetailsData2.b;
                String str7 = productBookingStopDetails3.f8199a;
                ProductBookingStopDetails productBookingStopDetails4 = fareDetailsData2.c;
                String str8 = productBookingStopDetails4.f8199a;
                FareDetailsRouteData fareDetailsRouteData2 = fareDetailsData2.f8185a;
                InstantTicketTripDetails instantTicketTripDetails2 = new InstantTicketTripDetails(str7, str8, fareDetailsRouteData2.b, fareDetailsRouteData2.f8187a, productBookingStopDetails3.b, productBookingStopDetails4.b);
                this.L$0 = str;
                this.label = 3;
                objA2 = createInstantTicketOrderUseCase2.a(jI1, arrayList, instantTicketTripDetails2, this);
                if (objA2 != coroutineSingletons) {
                    chaloUseCaseResult = (ChaloUseCaseResult) objA2;
                    fareDetailsComponent = this.this$0;
                    if (!fareDetailsComponent.S) {
                        fareDetailsComponent.R = true;
                        fareDetailsComponent.T = false;
                        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                            FareDetailsComponent.K0(fareDetailsComponent, (CreateOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a, str);
                        } else {
                            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ProductBookingDataSourceError productBookingDataSourceError3 = (ProductBookingDataSourceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                            kotlinToastManager = fareDetailsComponent.z;
                            str2 = productBookingDataSourceError3.f8097a;
                            StringProvider stringProvider3 = fareDetailsComponent.m;
                            StringEnum stringEnum3 = StringEnum.GENERIC_ERROR_WITH_CODE;
                            Object[] objArr3 = {new Integer(productBookingDataSourceError3.a())};
                            this.L$0 = kotlinToastManager;
                            this.L$1 = str2;
                            this.label = 4;
                            objB = stringProvider3.b(stringEnum3, objArr3, this);
                            if (objB != coroutineSingletons) {
                                kotlinToastManager2 = kotlinToastManager;
                                hq0.s(kotlinToastManager2, StringExtsKt.b(str2, (String) objB));
                            }
                        }
                    }
                    this.this$0.E0(new z20(0));
                }
            }
            return unit;
        }
        return coroutineSingletons;
    }
}
