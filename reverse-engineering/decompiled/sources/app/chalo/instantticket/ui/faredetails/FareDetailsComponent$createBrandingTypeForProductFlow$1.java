package app.chalo.instantticket.ui.faredetails;

import app.chalo.data.ProductBookingBranding;
import app.chalo.helper.ProductBookingBrandingResolversKt;
import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.instantticket.config.models.InstantTicketConfiguration;
import app.chalo.premiumbus.ProductBookingNavigation;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import defpackage.x20;
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
@DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.FareDetailsComponent$createBrandingTypeForProductFlow$1", f = "FareDetailsComponent.kt", l = {731}, m = "invokeSuspend", v = 1)
final class FareDetailsComponent$createBrandingTypeForProductFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductBookingNavigation $productBookingFlowType;
    int label;
    final /* synthetic */ FareDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FareDetailsComponent$createBrandingTypeForProductFlow$1(ProductBookingNavigation productBookingNavigation, FareDetailsComponent fareDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.$productBookingFlowType = productBookingNavigation;
        this.this$0 = fareDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FareDetailsComponent$createBrandingTypeForProductFlow$1(this.$productBookingFlowType, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FareDetailsComponent$createBrandingTypeForProductFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductBookingBranding ondc;
        BrandingDetails brandingDetails;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = false;
        if (i == 0) {
            ResultKt.b(obj);
            ProductBookingNavigation productBookingNavigation = this.$productBookingFlowType;
            if (productBookingNavigation instanceof ProductBookingNavigation.InstantTicket) {
                InstantTicketConfigHelper instantTicketConfigHelper = this.this$0.B;
                this.label = 1;
                obj = instantTicketConfigHelper.b(false, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (productBookingNavigation instanceof ProductBookingNavigation.StopBasedPassFreshPurchase) {
                ondc = ProductBookingBranding.None.INSTANCE;
            } else {
                if (!(productBookingNavigation instanceof ProductBookingNavigation.OndcMetroBooking) && !(productBookingNavigation instanceof ProductBookingNavigation.ONDCTicket)) {
                    throw new NoWhenBranchMatchedException();
                }
                ondc = new ProductBookingBranding.Ondc();
            }
            this.this$0.E0(new x20(ondc, 0));
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        InstantTicketConfiguration instantTicketConfiguration = (InstantTicketConfiguration) obj;
        if (instantTicketConfiguration != null && (brandingDetails = instantTicketConfiguration.f) != null && brandingDetails.f3827a) {
            z = true;
        }
        String strA = instantTicketConfiguration != null ? instantTicketConfiguration.a() : null;
        if (z) {
            String str = instantTicketConfiguration != null ? instantTicketConfiguration.c : null;
            if (str == null) {
                str = "";
            }
            String str2 = instantTicketConfiguration != null ? instantTicketConfiguration.d : null;
            ondc = ProductBookingBrandingResolversKt.a(strA, str, str2 != null ? str2 : "");
        } else {
            ondc = ProductBookingBranding.None.INSTANCE;
        }
        this.this$0.E0(new x20(ondc, 0));
        return Unit.f17538a;
    }
}
