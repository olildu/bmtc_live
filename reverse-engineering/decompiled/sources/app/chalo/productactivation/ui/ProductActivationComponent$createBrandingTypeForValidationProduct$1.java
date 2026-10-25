package app.chalo.productactivation.ui;

import app.chalo.data.ProductBookingBranding;
import app.chalo.helper.ProductBookingBrandingResolversKt;
import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.instantticket.config.models.InstantTicketConfiguration;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import defpackage.x20;
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
@DebugMetadata(c = "app.chalo.productactivation.ui.ProductActivationComponent$createBrandingTypeForValidationProduct$1", f = "ProductActivationComponent.kt", l = {357}, m = "invokeSuspend", v = 1)
final class ProductActivationComponent$createBrandingTypeForValidationProduct$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ValidationProduct $validationProduct;
    int label;
    final /* synthetic */ ProductActivationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActivationComponent$createBrandingTypeForValidationProduct$1(ValidationProduct validationProduct, ProductActivationComponent productActivationComponent, Continuation continuation) {
        super(2, continuation);
        this.$validationProduct = validationProduct;
        this.this$0 = productActivationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductActivationComponent$createBrandingTypeForValidationProduct$1(this.$validationProduct, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductActivationComponent$createBrandingTypeForValidationProduct$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
            ValidationProduct validationProduct = this.$validationProduct;
            if (validationProduct instanceof ValidationProduct.MobileTicketProduct) {
                ValidationProduct.MobileTicketProduct mobileTicketProduct = (ValidationProduct.MobileTicketProduct) validationProduct;
                if ((mobileTicketProduct instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) || (mobileTicketProduct instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation)) {
                    ondc = new ProductBookingBranding.Ondc();
                } else if (mobileTicketProduct instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) {
                    InstantTicketConfigHelper instantTicketConfigHelper = this.this$0.C;
                    this.label = 1;
                    obj = instantTicketConfigHelper.b(false, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    ondc = ProductBookingBranding.None.INSTANCE;
                }
            } else {
                ondc = ProductBookingBranding.None.INSTANCE;
            }
            this.this$0.E0(new x20(ondc, 1));
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
        this.this$0.E0(new x20(ondc, 1));
        return Unit.f17538a;
    }
}
